/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.vmt.gh.web.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.asset.kernel.service.AssetEntryLocalService;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import it.vmt.gh.sb.model.Cart;
import it.vmt.gh.sb.service.CartLocalService;
import it.vmt.gh.sb.service.CartService;
import it.vmt.gh.web.portlet.constants.GreenHouseManagerPortletKeys;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.green-house",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.name=" + GreenHouseManagerPortletKeys.CARTLIST,
		"javax.portlet.display-name=Cart list",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/cartlistportlet/view.jsp"
	},
	service = Portlet.class
)
public class CartListPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		List<Cart> carts = new ArrayList<>();
		UserGroup customer = UserGroupLocalServiceUtil.fetchUserGroup(PortalUtil.getDefaultCompanyId(), "GH-CUSTOMER");
		UserGroup admin = UserGroupLocalServiceUtil.fetchUserGroup(PortalUtil.getDefaultCompanyId(), "GH-ADMIN");
		String baseConfiguratorUrl = null;
		if(Validator.isNotNull(admin) && UserGroupLocalServiceUtil.hasUserUserGroup(themeDisplay.getUserId(), admin.getUserGroupId())) {
			carts = _cartLocalService.getCarts(-1, -1);
			baseConfiguratorUrl = "/configurator";
		}else {
			carts = _cartService.findByUserId(themeDisplay.getUserId());
			baseConfiguratorUrl = "/user" + themeDisplay.getScopeGroup().getFriendlyURL() + "/~/" + customer.getUserGroupId() + "/configurator";
		}
		renderRequest.setAttribute("carts", carts);
		renderRequest.setAttribute("baseConfiguratorUrl", baseConfiguratorUrl);
		super.doView(renderRequest, renderResponse);
	}
	
	@Reference
	private AssetEntryLocalService _assetEntryLocalService;
	@Reference
	private CartService _cartService;
	@Reference
	private CartLocalService _cartLocalService;
	
}