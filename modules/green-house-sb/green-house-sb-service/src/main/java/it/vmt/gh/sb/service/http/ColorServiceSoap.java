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

import it.vmt.gh.sb.service.ColorServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>ColorServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>it.vmt.gh.sb.model.ColorSoap</code>. If the method in the
 * service utility returns a
 * <code>it.vmt.gh.sb.model.Color</code>, that is translated to a
 * <code>it.vmt.gh.sb.model.ColorSoap</code>. Methods that SOAP
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
 * @see ColorServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ColorServiceSoap {

	public static String getColorImages(long groupId, String name)
		throws RemoteException {

		try {
			String returnValue = ColorServiceUtil.getColorImages(groupId, name);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static it.vmt.gh.sb.model.ColorSoap[] getColors(int start, int end)
		throws RemoteException {

		try {
			java.util.List<it.vmt.gh.sb.model.Color> returnValue =
				ColorServiceUtil.getColors(start, end);

			return it.vmt.gh.sb.model.ColorSoap.toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static it.vmt.gh.sb.model.ColorSoap deleteColor(long colorId)
		throws RemoteException {

		try {
			it.vmt.gh.sb.model.Color returnValue = ColorServiceUtil.deleteColor(
				colorId);

			return it.vmt.gh.sb.model.ColorSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static it.vmt.gh.sb.model.ColorSoap updateColor(
			long colorId, long groupId, long userId, String code, String name,
			String img, int charge)
		throws RemoteException {

		try {
			it.vmt.gh.sb.model.Color returnValue = ColorServiceUtil.updateColor(
				colorId, groupId, userId, code, name, img, charge);

			return it.vmt.gh.sb.model.ColorSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ColorServiceSoap.class);

}