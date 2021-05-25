package it.vmt.gh.web.asset;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.servlet.http.HttpServletRequest;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.trash.TrashRenderer;

import it.vmt.gh.sb.model.Item;

public class ItemAssetRenderer extends BaseJSPAssetRenderer<Item> implements TrashRenderer {

	private static final String CLASS_NAME = Item.class.getName();
	
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
	public Item getAssetObject() {
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
		String resultPath = "/asset/view_" + template + ".jsp";
		httpServletRequest.setAttribute("item", _entry);
		return resultPath;
	}

	public ItemAssetRenderer(Item _entry) {
		this._entry = _entry;
		this._assetEntry = AssetEntryLocalServiceUtil.fetchEntry(Item.class.getName(), _entry.getPrimaryKey());
	}

	private Item _entry;
	private AssetEntry _assetEntry;

	private static final Log _log = LogFactoryUtil.getLog(ItemAssetRenderer.class.getName());
}
