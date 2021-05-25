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
package it.vmt.gh.command;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;

import it.vmt.gh.sb.model.Cart;
import it.vmt.gh.sb.service.CartLocalService;

@Component(
	immediate = true,
	property = {
		"osgi.command.scope=gh",
		"osgi.command.function=sanitizeCartSite"
	},
	service = Object.class
)
public class SanitizeCartSite {

	public void cleanEnvironment() {
		Group ghGroup = _groupLocalService.fetchFriendlyURLGroup(PortalUtil.getDefaultCompanyId(), "/green-house");
		if(Validator.isNotNull(ghGroup)) {
			List<Cart> carts = _cartLocalService.getCarts(-1, -1);
			_log.info("# OF CARTS TO BE SANITIZED: " + carts.size());
			
			int count = 0;
			for(Cart cart: carts) {
				try {
					_cartLocalService.updateCart(
							ghGroup.getGroupId(), 
							cart.getUserId(), 
							cart.getCartId(), 
							cart.getTotal(), 
							cart.getInvoiceDiscount());
					count++;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				_log.info(count + " - CART " + cart.getCartId() + " DELETED");
			}
			_log.info(count + " CARTS SANITIZED");
		}else {
			_log.warn("GREEN HOUSE GROUP NOT FOUND ");
		}
	}

	@Reference
	private CartLocalService _cartLocalService;
	@Reference
	private GroupLocalService _groupLocalService;
	
	private static final Log _log = LogFactoryUtil.getLog(SanitizeCartSite.class.getName());
}