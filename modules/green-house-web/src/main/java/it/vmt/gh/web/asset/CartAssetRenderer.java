package it.vmt.gh.web.asset;

import java.util.List;
import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.servlet.http.HttpServletRequest;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.trash.TrashRenderer;
import com.liferay.portal.kernel.util.WebKeys;

import it.vmt.gh.sb.model.Cart;
import it.vmt.gh.sb.model.Item;
import it.vmt.gh.sb.service.ItemLocalServiceUtil;

public class CartAssetRenderer extends BaseJSPAssetRenderer<Cart> implements TrashRenderer {

	private static final String CLASS_NAME = Cart.class.getName();
	
	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	public long getClassPK() {
		return _entry.getPrimaryKey();
	}

	@Override
	public String getSummary(PortletRequest portletRequest, PortletResponse portletResponse) {
		return _assetEntry.getSummaryCurrentValue();
	}

	@Override
	public String getTitle(Locale locale) {
		return _assetEntry.getTitle(locale);
	}

	@Override
	public Cart getAssetObject() {
		return _entry;
	}

	@Override
	public long getGroupId() {
		return _entry.getGroupId();
	}

	@Override
	public long getUserId() {
		return _entry.getUserId();
	}

	@Override
	public String getUserName() {
		return _entry.getUserName();
	}

	@Override
	public String getUuid() {
		return _entry.getUuid();
	}

	@Override
	public String getPortletId() {
		return getAssetRendererFactory().getPortletId();
	}

	@Override
	public String getType() {
		return getAssetRendererFactory().getType();
	}

	@Override
	public String getJspPath(HttpServletRequest httpServletRequest, String template) {
		ThemeDisplay themeDisplay = (ThemeDisplay)httpServletRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String resultPath = "/asset/view_" + template + ".jsp";
		Layout layout = LayoutLocalServiceUtil.fetchLayout(_assetEntry.getLayoutUuid(), _entry.getGroupId(), Boolean.TRUE);
		httpServletRequest.setAttribute("cart", _entry);
		String dashboardUrl = 
				(layout.isPrivateLayout() ? "/group" : "/web") 
				+ themeDisplay.getScopeGroup().getFriendlyURL() 
				+ layout.getFriendlyURL()
				+ "?cartId="+_entry.getPrimaryKey();
		
		switch (template) {
		case "abstract":
			
			break;

		case "full_content":
			List<Item> items = ItemLocalServiceUtil.getItems(_entry.getCartId());
			httpServletRequest.setAttribute("items", items);
			break;

		default:
			break;
		}
		httpServletRequest.setAttribute("cart", _entry);
		httpServletRequest.setAttribute("dashboardUrl", dashboardUrl);
		return resultPath;
	}

	
	@Override
	protected String getURLViewInContext(LiferayPortletRequest liferayPortletRequest, String noSuchEntryRedirect,
			String path, String primaryKeyParameterName, long primaryKeyParameterValue) {
		// TODO Auto-generated method stub
		return super.getURLViewInContext(liferayPortletRequest, noSuchEntryRedirect, path, primaryKeyParameterName,
				primaryKeyParameterValue);
	}

	@Override
	public String getURLView(LiferayPortletResponse liferayPortletResponse, WindowState windowState) throws Exception {
		// TODO Auto-generated method stub
		return super.getURLView(liferayPortletResponse, windowState);
	}

	@Override
	public PortletURL getURLEdit(HttpServletRequest httpServletRequest) throws Exception {
		// TODO Auto-generated method stub
		return super.getURLEdit(httpServletRequest);
	}

	@Override
	public String getUrlTitle() {
		// TODO Auto-generated method stub
		return super.getUrlTitle();
	}

	public CartAssetRenderer(Cart _entry) {
		this._entry = _entry;
		this._assetEntry = AssetEntryLocalServiceUtil.fetchEntry(Cart.class.getName(), _entry.getPrimaryKey());
	}

	private Cart _entry;
	private AssetEntry _assetEntry;

	private static final Log _log = LogFactoryUtil.getLog(CartAssetRenderer.class.getName());
}
