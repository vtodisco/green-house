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
 * Provides a wrapper for {@link ProfileService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProfileService
 * @generated
 */
public class ProfileServiceWrapper
	implements ProfileService, ServiceWrapper<ProfileService> {

	public ProfileServiceWrapper(ProfileService profileService) {
		_profileService = profileService;
	}

	@Override
	public it.vmt.gh.sb.model.Profile deleteProfile(long profileId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _profileService.deleteProfile(profileId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _profileService.getOSGiServiceIdentifier();
	}

	@Override
	public String getProfileImages(long groupId, String name) {
		return _profileService.getProfileImages(groupId, name);
	}

	@Override
	public java.util.List<it.vmt.gh.sb.model.Profile> getProfiles(
		int start, int end) {

		return _profileService.getProfiles(start, end);
	}

	@Override
	public it.vmt.gh.sb.model.Profile updateProfile(
		long profileId, long groupId, long userId, String code, String name,
		double price, String img) {

		return _profileService.updateProfile(
			profileId, groupId, userId, code, name, price, img);
	}

	@Override
	public ProfileService getWrappedService() {
		return _profileService;
	}

	@Override
	public void setWrappedService(ProfileService profileService) {
		_profileService = profileService;
	}

	private ProfileService _profileService;

}