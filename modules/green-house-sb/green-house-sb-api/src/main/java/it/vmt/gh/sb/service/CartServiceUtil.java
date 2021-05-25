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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Cart. This utility wraps
 * <code>it.vmt.gh.sb.service.impl.CartServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CartService
 * @generated
 */
public class CartServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>it.vmt.gh.sb.service.impl.CartServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.model.Address addAddress(
			long userId, String street, String number, String city, String zip,
			String countryA3, String regionCode)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addAddress(
			userId, street, number, city, zip, countryA3, regionCode);
	}

	public static String addItemToCart(
			long groupId, long userId, long itemId, long cartId,
			long environmentId, long profileId, long carpentryId, long handleId,
			long colorId, int price, int qty, double width, double height,
			String color)
		throws com.liferay.portal.kernel.json.JSONException,
			   com.liferay.portal.kernel.module.configuration.
				   ConfigurationException {

		return getService().addItemToCart(
			groupId, userId, itemId, cartId, environmentId, profileId,
			carpentryId, handleId, colorId, price, qty, width, height, color);
	}

	public static com.liferay.portal.kernel.model.Phone addPhone(
			long userId, String number)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addPhone(userId, number);
	}

	public static String approveUserCart(
			long cartId, long userId, long groupId, String firstName,
			String lastName, String emailAddress, String phone,
			boolean invoiceDiscount, boolean installation, boolean delivery)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().approveUserCart(
			cartId, userId, groupId, firstName, lastName, emailAddress, phone,
			invoiceDiscount, installation, delivery);
	}

	public static String deleteItemFromCart(long itemId)
		throws com.liferay.portal.kernel.json.JSONException {

		return getService().deleteItemFromCart(itemId);
	}

	public static it.vmt.gh.sb.model.Cart emptyCart(long cartId) {
		return getService().emptyCart(cartId);
	}

	public static String findByCartId(long cartId)
		throws com.liferay.portal.kernel.json.JSONException {

		return getService().findByCartId(cartId);
	}

	public static java.util.List<it.vmt.gh.sb.model.Cart> findByUserId(
		long userId) {

		return getService().findByUserId(userId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static String recalculateUserCart(
			long cartId, long userId, long groupId, long carpentryId,
			long handleId, long colorId, int itemHeight, int itemWidth,
			String firstName, String lastName, String emailAddress,
			String phone, boolean invoiceDiscount, boolean installation,
			boolean delivery)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().recalculateUserCart(
			cartId, userId, groupId, carpentryId, handleId, colorId, itemHeight,
			itemWidth, firstName, lastName, emailAddress, phone,
			invoiceDiscount, installation, delivery);
	}

	public static it.vmt.gh.sb.model.Cart updateCart(
		long groupId, long userId, long cartId, double total,
		boolean invoiceDiscount) {

		return getService().updateCart(
			groupId, userId, cartId, total, invoiceDiscount);
	}

	public static CartService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CartService, CartService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CartService.class);

		ServiceTracker<CartService, CartService> serviceTracker =
			new ServiceTracker<CartService, CartService>(
				bundle.getBundleContext(), CartService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}