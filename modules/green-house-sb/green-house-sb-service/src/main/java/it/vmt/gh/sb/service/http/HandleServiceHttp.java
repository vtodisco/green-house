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

import it.vmt.gh.sb.service.HandleServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>HandleServiceUtil</code> service
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
 * @see HandleServiceSoap
 * @generated
 */
public class HandleServiceHttp {

	public static String getHandleImages(
		HttpPrincipal httpPrincipal, long groupId, String name) {

		try {
			MethodKey methodKey = new MethodKey(
				HandleServiceUtil.class, "getHandleImages",
				_getHandleImagesParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, name);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
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

	public static java.util.List<it.vmt.gh.sb.model.Handle> getHandles(
		HttpPrincipal httpPrincipal, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				HandleServiceUtil.class, "getHandles",
				_getHandlesParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<it.vmt.gh.sb.model.Handle>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static it.vmt.gh.sb.model.Handle deleteHandle(
			HttpPrincipal httpPrincipal, long handleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				HandleServiceUtil.class, "deleteHandle",
				_deleteHandleParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, handleId);

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

			return (it.vmt.gh.sb.model.Handle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static it.vmt.gh.sb.model.Handle updateHandle(
		HttpPrincipal httpPrincipal, long handleId, long groupId, long userId,
		String code, String name, String img, double price) {

		try {
			MethodKey methodKey = new MethodKey(
				HandleServiceUtil.class, "updateHandle",
				_updateHandleParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, handleId, groupId, userId, code, name, img, price);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (it.vmt.gh.sb.model.Handle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(HandleServiceHttp.class);

	private static final Class<?>[] _getHandleImagesParameterTypes0 =
		new Class[] {long.class, String.class};
	private static final Class<?>[] _getHandlesParameterTypes1 = new Class[] {
		int.class, int.class
	};
	private static final Class<?>[] _deleteHandleParameterTypes2 = new Class[] {
		long.class
	};
	private static final Class<?>[] _updateHandleParameterTypes3 = new Class[] {
		long.class, long.class, long.class, String.class, String.class,
		String.class, double.class
	};

}