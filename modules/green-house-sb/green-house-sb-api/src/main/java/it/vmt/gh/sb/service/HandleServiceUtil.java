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
 * Provides the remote service utility for Handle. This utility wraps
 * <code>it.vmt.gh.sb.service.impl.HandleServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see HandleService
 * @generated
 */
public class HandleServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>it.vmt.gh.sb.service.impl.HandleServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static it.vmt.gh.sb.model.Handle deleteHandle(long handleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteHandle(handleId);
	}

	public static String getHandleImages(long groupId, String name) {
		return getService().getHandleImages(groupId, name);
	}

	public static java.util.List<it.vmt.gh.sb.model.Handle> getHandles(
		int start, int end) {

		return getService().getHandles(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static it.vmt.gh.sb.model.Handle updateHandle(
		long handleId, long groupId, long userId, String code, String name,
		String img, double price) {

		return getService().updateHandle(
			handleId, groupId, userId, code, name, img, price);
	}

	public static HandleService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HandleService, HandleService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(HandleService.class);

		ServiceTracker<HandleService, HandleService> serviceTracker =
			new ServiceTracker<HandleService, HandleService>(
				bundle.getBundleContext(), HandleService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}