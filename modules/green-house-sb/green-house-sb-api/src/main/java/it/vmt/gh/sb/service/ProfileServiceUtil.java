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
 * Provides the remote service utility for Profile. This utility wraps
 * <code>it.vmt.gh.sb.service.impl.ProfileServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ProfileService
 * @generated
 */
public class ProfileServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>it.vmt.gh.sb.service.impl.ProfileServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static it.vmt.gh.sb.model.Profile deleteProfile(long profileId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteProfile(profileId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static String getProfileImages(long groupId, String name) {
		return getService().getProfileImages(groupId, name);
	}

	public static java.util.List<it.vmt.gh.sb.model.Profile> getProfiles(
		int start, int end) {

		return getService().getProfiles(start, end);
	}

	public static it.vmt.gh.sb.model.Profile updateProfile(
		long profileId, long groupId, long userId, String code, String name,
		double price, String img) {

		return getService().updateProfile(
			profileId, groupId, userId, code, name, price, img);
	}

	public static ProfileService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProfileService, ProfileService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ProfileService.class);

		ServiceTracker<ProfileService, ProfileService> serviceTracker =
			new ServiceTracker<ProfileService, ProfileService>(
				bundle.getBundleContext(), ProfileService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}