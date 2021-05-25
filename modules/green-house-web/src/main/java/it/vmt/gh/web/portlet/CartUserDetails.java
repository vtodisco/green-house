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

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import it.vmt.gh.sb.model.Cart;
import it.vmt.gh.sb.service.CartLocalService;
import it.vmt.gh.web.portlet.constants.GreenHouseManagerPortletKeys;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.green-house",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.name=" + GreenHouseManagerPortletKeys.CARTUSERDETAILS,
		"javax.portlet.display-name=Cart user details",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/cartuserdetails/view.jsp"
	},
	service = Portlet.class
)
public class CartUserDetails extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		long cartId = ParamUtil.getLong(renderRequest, "cartId", -1);
		Cart cart = _cartLocalService.fetchCart(cartId);
		if(Validator.isNotNull(cart)) {
			User user = _userLocalService.fetchUser(cart.getUserId());
			if(user.getPhones().size() > 0) {
				renderRequest.setAttribute("phone", user.getPhones().get(0));
			}
			if(user.getAddresses().size() > 0) {
				renderRequest.setAttribute("address", user.getAddresses().get(0));
			}
			renderRequest.setAttribute("cart", cart);
			renderRequest.setAttribute("user", user);
		}
		super.doView(renderRequest, renderResponse);
	}
	
	@Reference
	private CartLocalService _cartLocalService;
	@Reference
	private UserLocalService _userLocalService;
	
}