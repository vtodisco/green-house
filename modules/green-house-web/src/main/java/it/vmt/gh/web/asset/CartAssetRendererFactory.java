package it.vmt.gh.web.asset;

import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ResourceBundleLoader;
import com.liferay.portal.kernel.util.Validator;

import it.vmt.gh.sb.model.Cart;
import it.vmt.gh.sb.service.CartLocalService;
import it.vmt.gh.web.portlet.constants.GreenHouseManagerPortletKeys;

@Component(
		immediate = true, 
		property = {"javax.portlet.name=" + GreenHouseManagerPortletKeys.GREENHOUSEMANAGER},
		service = AssetRendererFactory.class
)
public class CartAssetRendererFactory extends BaseAssetRendererFactory<Cart>{

	public static final String TYPE = "cart";
	public static final String CLASS_NAME = Cart.class.getName();

	@Override
	public AssetRenderer<Cart> getAssetRenderer(long classPK, int type) throws PortalException {
		Cart entry = _cartLocalService.fetchCart(classPK);
		if (Validator.isNull(entry)) {
			return null;
		}
		CartAssetRenderer cartAssetRenderer = new CartAssetRenderer(entry);
		cartAssetRenderer.setAssetRendererType(type);
		cartAssetRenderer.setServletContext(_servletContext);

		return cartAssetRenderer;
	}

	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	public String getType() {
		return TYPE;
	}

	@Reference(target = "(osgi.web.symbolicname=it.vmt.gh.web.portlet)", unbind = "-")
	public void setServletContext(ServletContext servletContext) {
	    _servletContext = servletContext;
		_log.info("SERVLET CONTEXT: " + _servletContext.getContextPath());
	}

	public CartAssetRendererFactory() {
		_log.info(CartAssetRendererFactory.class.getName() + " constructor");
		setClassName(CLASS_NAME);
		setLinkable(true);
		setPortletId(GreenHouseManagerPortletKeys.GREENHOUSEMANAGER);
		setSearchable(true);
	}

	@Reference(target = "(bundle.symbolic.name=it.vmt.gh.web.portlet)", unbind = "-")
	public void setResourceBundleLoader(ResourceBundleLoader resourceBundleLoader) {
	    _resourceBundleLoader = resourceBundleLoader;
	}

	private ResourceBundleLoader _resourceBundleLoader;	

	private ServletContext _servletContext;

	@Reference
	private CartLocalService _cartLocalService;

	private static final Log _log = LogFactoryUtil.getLog(CartAssetRendererFactory.class.getName());
}
