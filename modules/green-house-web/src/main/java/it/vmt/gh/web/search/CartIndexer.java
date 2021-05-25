package it.vmt.gh.web.search;

import java.util.Date;
import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.IndexWriterHelper;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.util.GetterUtil;

import it.vmt.gh.sb.model.Cart;
import it.vmt.gh.sb.service.CartLocalService;

@Component(immediate = true, service = Indexer.class)
public class CartIndexer extends BaseIndexer<Cart> {

	private static final String CLASS_NAME = Cart.class.getName();

	@Override
	public boolean hasPermission(
			PermissionChecker permissionChecker, String entryClassName,
			long entryClassPK, String actionId)
		throws Exception {
		Cart cart = _cartLocalService.fetchCart(entryClassPK);
		return permissionChecker.hasPermission(cart.getGroupId(), entryClassName, entryClassPK, actionId);
	}

	@Override
	public boolean isFilterSearch() {
		return Boolean.TRUE;
	}

	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	protected void doDelete(Cart object) throws Exception {
		deleteDocument(object.getCompanyId(), object.getPrimaryKey());		
	}

	@Override
	protected Document doGetDocument(Cart object) throws Exception {
		Document document = getBaseModelDocument(CLASS_NAME, object);
		document.addText(
			Field.CONTENT, object.getUserName() + " (" + object.getCreateDate() + ")"
		);
		document.addText(Field.DESCRIPTION, object.getUserName() + " (" + object.getCreateDate() + ")");
		document.addDate(Field.MODIFIED_DATE, object.getModifiedDate());
		document.addText(Field.SUBTITLE, object.getUserName() + " (" + object.getCreateDate() + ")");
		document.addText(Field.TITLE, object.getUserName() + " (" + object.getCreateDate() + ")");
		return document;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locale, String snippet, PortletRequest portletRequest,
			PortletResponse portletResponse) throws Exception {
		Summary summary = createSummary(document);

		summary.setMaxContentLength(300);

		return summary;
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		Cart item = _cartLocalService.getCart(classPK);
		doReindex(item);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		long companyId = GetterUtil.getLong(ids[0]);
		reindexEntries(companyId);
	}

	@Override
	protected void doReindex(Cart object) throws Exception {
		Document document = getDocument(object);
		_indexWriterHelper.updateDocument(
				getSearchEngineId(), object.getCompanyId(), document,
				isCommitImmediately());
	}

	protected void reindexEntries(long companyId) throws PortalException {
		final IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			_cartLocalService.getIndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					Property displayDateProperty = PropertyFactoryUtil.forName(
						"displayDate");

					dynamicQuery.add(displayDateProperty.lt(new Date()));

				}

			});
		indexableActionableDynamicQuery.setCompanyId(companyId);
		indexableActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Cart>() {

				@Override
				public void performAction(Cart entry) {
					try {
						Document document = getDocument(entry);

						indexableActionableDynamicQuery.addDocuments(document);
					}
					catch (PortalException pe) {
						if (_log.isWarnEnabled()) {
							_log.warn(
								"Unable to index Cart " +
									entry.getPrimaryKey(),
								pe);
						}
					}
				}

			});
		indexableActionableDynamicQuery.setSearchEngineId(getSearchEngineId());

		indexableActionableDynamicQuery.performActions();
	}

	@Reference
	private CartLocalService _cartLocalService;
	@Reference
	protected IndexWriterHelper _indexWriterHelper;

	private static final Log _log = LogFactoryUtil.getLog(CartIndexer.class.getName());
	
}
