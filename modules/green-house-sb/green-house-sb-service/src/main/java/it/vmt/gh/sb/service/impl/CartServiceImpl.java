/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package it.vmt.gh.sb.service.impl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;

import it.vmt.gh.sb.model.Cart;
import it.vmt.gh.sb.service.base.CartServiceBaseImpl;

/**
 * The implementation of the cart remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.vmt.gh.sb.service.CartService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CartServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=gh", "json.web.service.context.path=Cart"
	},
	service = AopService.class
)
public class CartServiceImpl extends CartServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>it.vmt.gh.sb.service.CartServiceUtil</code> to access the cart remote service.
	 */
	
	public Address addAddress(long userId, String street, String number, String city, String zip, String countryA3, String regionCode) throws PortalException{
		return cartLocalService.addAddress(userId, street, number, city, zip, countryA3, regionCode);
	}
	
	public String addItemToCart(
			long groupId, 
			long userId,
			long itemId,
			long cartId,
			long environmentId,
			long profileId, 
			long carpentryId, 
			long handleId, 
			long colorId,
			int price, 
			int qty,
			double width,
			double height,
			String color) throws JSONException, ConfigurationException {
		return cartLocalService.addItemToCart(
				groupId, 
				userId, 
				itemId, 
				cartId,
				environmentId,
				profileId, 
				carpentryId, 
				handleId, 
				colorId,
				price, 
				qty,
				width,
				height,
				color);
	}
	
	public Phone addPhone(long userId, String number) throws PortalException {
		return cartLocalService.addPhone(userId, number);
	}

	public String approveUserCart(
			long cartId, 
			long userId,
			long groupId,
			String firstName,
			String lastName,
			String emailAddress,
			String phone,
			boolean invoiceDiscount,
			boolean installation,
			boolean delivery) throws PortalException {
		return cartLocalService.approveUserCart(cartId, userId, groupId, firstName, lastName, emailAddress, phone, invoiceDiscount, installation, delivery);
	}

	public String recalculateUserCart(
			long cartId, 
			long userId,
			long groupId,
			long carpentryId,
			long handleId, 
			long colorId, 
			int itemHeight,
			int itemWidth,
			String firstName,
			String lastName,
			String emailAddress,
			String phone,
			boolean invoiceDiscount,
			boolean installation,
			boolean delivery) throws PortalException {
		return cartLocalService.recalculateUserCart(
				cartId, 
				userId, 
				groupId, 
				carpentryId,
				handleId, 
				colorId, 
				itemHeight,
				itemWidth,
				firstName, 
				lastName, 
				emailAddress, 
				phone, 
				invoiceDiscount, 
				installation, 
				delivery);
	}
public Cart updateCart(
			long groupId, 
			long userId,
			long cartId,
			double total,
			boolean invoiceDiscount) {
		return cartLocalService.updateCart(groupId, userId, cartId, total, invoiceDiscount);
	}
	
	public String deleteItemFromCart(long itemId) throws JSONException {
		return cartLocalService.deleteItemFromCart(itemId);
	}
	
	public Cart emptyCart(long cartId) {
		return cartLocalService.emptyCart(cartId);
	}
	
	public String findByCartId(long cartId) throws JSONException {
		return cartLocalService.findByCartId(cartId).toString();
	}
	
	public List<Cart> findByUserId(long userId) {
		return cartLocalService.findByUserId(userId);
	}
}