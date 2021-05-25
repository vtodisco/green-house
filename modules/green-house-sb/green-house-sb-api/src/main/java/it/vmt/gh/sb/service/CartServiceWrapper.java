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

package it.vmt.gh.sb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CartService}.
 *
 * @author Brian Wing Shun Chan
 * @see CartService
 * @generated
 */
public class CartServiceWrapper
	implements CartService, ServiceWrapper<CartService> {

	public CartServiceWrapper(CartService cartService) {
		_cartService = cartService;
	}

	@Override
	public com.liferay.portal.kernel.model.Address addAddress(
			long userId, String street, String number, String city, String zip,
			String countryA3, String regionCode)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartService.addAddress(
			userId, street, number, city, zip, countryA3, regionCode);
	}

	@Override
	public String addItemToCart(
			long groupId, long userId, long itemId, long cartId,
			long environmentId, long profileId, long carpentryId, long handleId,
			long colorId, int price, int qty, double width, double height,
			String color)
		throws com.liferay.portal.kernel.json.JSONException,
			   com.liferay.portal.kernel.module.configuration.
				   ConfigurationException {

		return _cartService.addItemToCart(
			groupId, userId, itemId, cartId, environmentId, profileId,
			carpentryId, handleId, colorId, price, qty, width, height, color);
	}

	@Override
	public com.liferay.portal.kernel.model.Phone addPhone(
			long userId, String number)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartService.addPhone(userId, number);
	}

	@Override
	public String approveUserCart(
			long cartId, long userId, long groupId, String firstName,
			String lastName, String emailAddress, String phone,
			boolean invoiceDiscount, boolean installation, boolean delivery)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartService.approveUserCart(
			cartId, userId, groupId, firstName, lastName, emailAddress, phone,
			invoiceDiscount, installation, delivery);
	}

	@Override
	public String deleteItemFromCart(long itemId)
		throws com.liferay.portal.kernel.json.JSONException {

		return _cartService.deleteItemFromCart(itemId);
	}

	@Override
	public it.vmt.gh.sb.model.Cart emptyCart(long cartId) {
		return _cartService.emptyCart(cartId);
	}

	@Override
	public String findByCartId(long cartId)
		throws com.liferay.portal.kernel.json.JSONException {

		return _cartService.findByCartId(cartId);
	}

	@Override
	public java.util.List<it.vmt.gh.sb.model.Cart> findByUserId(long userId) {
		return _cartService.findByUserId(userId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cartService.getOSGiServiceIdentifier();
	}

	@Override
	public String recalculateUserCart(
			long cartId, long userId, long groupId, long carpentryId,
			long handleId, long colorId, int itemHeight, int itemWidth,
			String firstName, String lastName, String emailAddress,
			String phone, boolean invoiceDiscount, boolean installation,
			boolean delivery)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartService.recalculateUserCart(
			cartId, userId, groupId, carpentryId, handleId, colorId, itemHeight,
			itemWidth, firstName, lastName, emailAddress, phone,
			invoiceDiscount, installation, delivery);
	}

	@Override
	public it.vmt.gh.sb.model.Cart updateCart(
		long groupId, long userId, long cartId, double total,
		boolean invoiceDiscount) {

		return _cartService.updateCart(
			groupId, userId, cartId, total, invoiceDiscount);
	}

	@Override
	public CartService getWrappedService() {
		return _cartService;
	}

	@Override
	public void setWrappedService(CartService cartService) {
		_cartService = cartService;
	}

	private CartService _cartService;

}