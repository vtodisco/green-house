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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import it.vmt.gh.sb.service.CartServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>CartServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CartServiceSoap
 * @generated
 */
public class CartServiceHttp {

	public static com.liferay.portal.kernel.model.Address addAddress(
			HttpPrincipal httpPrincipal, long userId, String street,
			String number, String city, String zip, String countryA3,
			String regionCode)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CartServiceUtil.class, "addAddress",
				_addAddressParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, street, number, city, zip, countryA3,
				regionCode);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.portal.kernel.model.Address)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static String addItemToCart(
			HttpPrincipal httpPrincipal, long groupId, long userId, long itemId,
			long cartId, long environmentId, long profileId, long carpentryId,
			long handleId, long colorId, int price, int qty, double width,
			double height, String color)
		throws com.liferay.portal.kernel.json.JSONException,
			   com.liferay.portal.kernel.module.configuration.
				   ConfigurationException {

		try {
			MethodKey methodKey = new MethodKey(
				CartServiceUtil.class, "addItemToCart",
				_addItemToCartParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, userId, itemId, cartId, environmentId,
				profileId, carpentryId, handleId, colorId, price, qty, width,
				height, color);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.json.JSONException) {

					throw (com.liferay.portal.kernel.json.JSONException)
						exception;
				}

				if (exception instanceof
						com.liferay.portal.kernel.module.configuration.
							ConfigurationException) {

					throw (com.liferay.portal.kernel.module.configuration.
						ConfigurationException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.portal.kernel.model.Phone addPhone(
			HttpPrincipal httpPrincipal, long userId, String number)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CartServiceUtil.class, "addPhone", _addPhoneParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, number);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.portal.kernel.model.Phone)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static String approveUserCart(
			HttpPrincipal httpPrincipal, long cartId, long userId, long groupId,
			String firstName, String lastName, String emailAddress,
			String phone, boolean invoiceDiscount, boolean installation,
			boolean delivery)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CartServiceUtil.class, "approveUserCart",
				_approveUserCartParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, cartId, userId, groupId, firstName, lastName,
				emailAddress, phone, invoiceDiscount, installation, delivery);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static String recalculateUserCart(
			HttpPrincipal httpPrincipal, long cartId, long userId, long groupId,
			long carpentryId, long handleId, long colorId, int itemHeight,
			int itemWidth, String firstName, String lastName,
			String emailAddress, String phone, boolean invoiceDiscount,
			boolean installation, boolean delivery)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CartServiceUtil.class, "recalculateUserCart",
				_recalculateUserCartParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, cartId, userId, groupId, carpentryId, handleId,
				colorId, itemHeight, itemWidth, firstName, lastName,
				emailAddress, phone, invoiceDiscount, installation, delivery);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static it.vmt.gh.sb.model.Cart updateCart(
		HttpPrincipal httpPrincipal, long groupId, long userId, long cartId,
		double total, boolean invoiceDiscount) {

		try {
			MethodKey methodKey = new MethodKey(
				CartServiceUtil.class, "updateCart",
				_updateCartParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, userId, cartId, total, invoiceDiscount);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (it.vmt.gh.sb.model.Cart)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static String deleteItemFromCart(
			HttpPrincipal httpPrincipal, long itemId)
		throws com.liferay.portal.kernel.json.JSONException {

		try {
			MethodKey methodKey = new MethodKey(
				CartServiceUtil.class, "deleteItemFromCart",
				_deleteItemFromCartParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey, itemId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.json.JSONException) {

					throw (com.liferay.portal.kernel.json.JSONException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static it.vmt.gh.sb.model.Cart emptyCart(
		HttpPrincipal httpPrincipal, long cartId) {

		try {
			MethodKey methodKey = new MethodKey(
				CartServiceUtil.class, "emptyCart", _emptyCartParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey, cartId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (it.vmt.gh.sb.model.Cart)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static String findByCartId(HttpPrincipal httpPrincipal, long cartId)
		throws com.liferay.portal.kernel.json.JSONException {

		try {
			MethodKey methodKey = new MethodKey(
				CartServiceUtil.class, "findByCartId",
				_findByCartIdParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey, cartId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.json.JSONException) {

					throw (com.liferay.portal.kernel.json.JSONException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<it.vmt.gh.sb.model.Cart> findByUserId(
		HttpPrincipal httpPrincipal, long userId) {

		try {
			MethodKey methodKey = new MethodKey(
				CartServiceUtil.class, "findByUserId",
				_findByUserIdParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<it.vmt.gh.sb.model.Cart>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CartServiceHttp.class);

	private static final Class<?>[] _addAddressParameterTypes0 = new Class[] {
		long.class, String.class, String.class, String.class, String.class,
		String.class, String.class
	};
	private static final Class<?>[] _addItemToCartParameterTypes1 =
		new Class[] {
			long.class, long.class, long.class, long.class, long.class,
			long.class, long.class, long.class, long.class, int.class,
			int.class, double.class, double.class, String.class
		};
	private static final Class<?>[] _addPhoneParameterTypes2 = new Class[] {
		long.class, String.class
	};
	private static final Class<?>[] _approveUserCartParameterTypes3 =
		new Class[] {
			long.class, long.class, long.class, String.class, String.class,
			String.class, String.class, boolean.class, boolean.class,
			boolean.class
		};
	private static final Class<?>[] _recalculateUserCartParameterTypes4 =
		new Class[] {
			long.class, long.class, long.class, long.class, long.class,
			long.class, int.class, int.class, String.class, String.class,
			String.class, String.class, boolean.class, boolean.class,
			boolean.class
		};
	private static final Class<?>[] _updateCartParameterTypes5 = new Class[] {
		long.class, long.class, long.class, double.class, boolean.class
	};
	private static final Class<?>[] _deleteItemFromCartParameterTypes6 =
		new Class[] {long.class};
	private static final Class<?>[] _emptyCartParameterTypes7 = new Class[] {
		long.class
	};
	private static final Class<?>[] _findByCartIdParameterTypes8 = new Class[] {
		long.class
	};
	private static final Class<?>[] _findByUserIdParameterTypes9 = new Class[] {
		long.class
	};

}