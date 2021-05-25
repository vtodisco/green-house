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

package it.vmt.gh.sb.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import it.vmt.gh.sb.service.CartServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>CartServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>it.vmt.gh.sb.model.CartSoap</code>. If the method in the
 * service utility returns a
 * <code>it.vmt.gh.sb.model.Cart</code>, that is translated to a
 * <code>it.vmt.gh.sb.model.CartSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CartServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class CartServiceSoap {

	public static com.liferay.portal.kernel.model.Address addAddress(
			long userId, String street, String number, String city, String zip,
			String countryA3, String regionCode)
		throws RemoteException {

		try {
			com.liferay.portal.kernel.model.Address returnValue =
				CartServiceUtil.addAddress(
					userId, street, number, city, zip, countryA3, regionCode);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static String addItemToCart(
			long groupId, long userId, long itemId, long cartId,
			long environmentId, long profileId, long carpentryId, long handleId,
			long colorId, int price, int qty, double width, double height,
			String color)
		throws RemoteException {

		try {
			String returnValue = CartServiceUtil.addItemToCart(
				groupId, userId, itemId, cartId, environmentId, profileId,
				carpentryId, handleId, colorId, price, qty, width, height,
				color);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Phone addPhone(
			long userId, String number)
		throws RemoteException {

		try {
			com.liferay.portal.kernel.model.Phone returnValue =
				CartServiceUtil.addPhone(userId, number);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static String approveUserCart(
			long cartId, long userId, long groupId, String firstName,
			String lastName, String emailAddress, String phone,
			boolean invoiceDiscount, boolean installation, boolean delivery)
		throws RemoteException {

		try {
			String returnValue = CartServiceUtil.approveUserCart(
				cartId, userId, groupId, firstName, lastName, emailAddress,
				phone, invoiceDiscount, installation, delivery);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static String recalculateUserCart(
			long cartId, long userId, long groupId, long carpentryId,
			long handleId, long colorId, int itemHeight, int itemWidth,
			String firstName, String lastName, String emailAddress,
			String phone, boolean invoiceDiscount, boolean installation,
			boolean delivery)
		throws RemoteException {

		try {
			String returnValue = CartServiceUtil.recalculateUserCart(
				cartId, userId, groupId, carpentryId, handleId, colorId,
				itemHeight, itemWidth, firstName, lastName, emailAddress, phone,
				invoiceDiscount, installation, delivery);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static it.vmt.gh.sb.model.CartSoap updateCart(
			long groupId, long userId, long cartId, double total,
			boolean invoiceDiscount)
		throws RemoteException {

		try {
			it.vmt.gh.sb.model.Cart returnValue = CartServiceUtil.updateCart(
				groupId, userId, cartId, total, invoiceDiscount);

			return it.vmt.gh.sb.model.CartSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static String deleteItemFromCart(long itemId)
		throws RemoteException {

		try {
			String returnValue = CartServiceUtil.deleteItemFromCart(itemId);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static it.vmt.gh.sb.model.CartSoap emptyCart(long cartId)
		throws RemoteException {

		try {
			it.vmt.gh.sb.model.Cart returnValue = CartServiceUtil.emptyCart(
				cartId);

			return it.vmt.gh.sb.model.CartSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static String findByCartId(long cartId) throws RemoteException {
		try {
			String returnValue = CartServiceUtil.findByCartId(cartId);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static it.vmt.gh.sb.model.CartSoap[] findByUserId(long userId)
		throws RemoteException {

		try {
			java.util.List<it.vmt.gh.sb.model.Cart> returnValue =
				CartServiceUtil.findByUserId(userId);

			return it.vmt.gh.sb.model.CartSoap.toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CartServiceSoap.class);

}