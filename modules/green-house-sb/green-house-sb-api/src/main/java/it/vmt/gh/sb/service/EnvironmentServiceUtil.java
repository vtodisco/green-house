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
 * Provides the remote service utility for Environment. This utility wraps
 * <code>it.vmt.gh.sb.service.impl.EnvironmentServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see EnvironmentService
 * @generated
 */
public class EnvironmentServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>it.vmt.gh.sb.service.impl.EnvironmentServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static it.vmt.gh.sb.model.Environment deleteEnvironment(
			long environmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteEnvironment(environmentId);
	}

	public static String getEnvironments() {
		return getService().getEnvironments();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static it.vmt.gh.sb.model.Environment updateEnvironment(
		long environmentId, long groupId, long userId, String name) {

		return getService().updateEnvironment(
			environmentId, groupId, userId, name);
	}

	public static EnvironmentService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EnvironmentService, EnvironmentService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EnvironmentService.class);

		ServiceTracker<EnvironmentService, EnvironmentService> serviceTracker =
			new ServiceTracker<EnvironmentService, EnvironmentService>(
				bundle.getBundleContext(), EnvironmentService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}