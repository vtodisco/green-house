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
 * Provides a wrapper for {@link Profile_CarpentryService}.
 *
 * @author Brian Wing Shun Chan
 * @see Profile_CarpentryService
 * @generated
 */
public class Profile_CarpentryServiceWrapper
	implements Profile_CarpentryService,
			   ServiceWrapper<Profile_CarpentryService> {

	public Profile_CarpentryServiceWrapper(
		Profile_CarpentryService profile_CarpentryService) {

		_profile_CarpentryService = profile_CarpentryService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _profile_CarpentryService.getOSGiServiceIdentifier();
	}

	@Override
	public Profile_CarpentryService getWrappedService() {
		return _profile_CarpentryService;
	}

	@Override
	public void setWrappedService(
		Profile_CarpentryService profile_CarpentryService) {

		_profile_CarpentryService = profile_CarpentryService;
	}

	private Profile_CarpentryService _profile_CarpentryService;

}