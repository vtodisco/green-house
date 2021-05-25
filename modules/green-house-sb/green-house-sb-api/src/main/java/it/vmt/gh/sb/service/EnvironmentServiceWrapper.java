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
 * Provides a wrapper for {@link EnvironmentService}.
 *
 * @author Brian Wing Shun Chan
 * @see EnvironmentService
 * @generated
 */
public class EnvironmentServiceWrapper
	implements EnvironmentService, ServiceWrapper<EnvironmentService> {

	public EnvironmentServiceWrapper(EnvironmentService environmentService) {
		_environmentService = environmentService;
	}

	@Override
	public it.vmt.gh.sb.model.Environment deleteEnvironment(long environmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _environmentService.deleteEnvironment(environmentId);
	}

	@Override
	public String getEnvironments() {
		return _environmentService.getEnvironments();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _environmentService.getOSGiServiceIdentifier();
	}

	@Override
	public it.vmt.gh.sb.model.Environment updateEnvironment(
		long environmentId, long groupId, long userId, String name) {

		return _environmentService.updateEnvironment(
			environmentId, groupId, userId, name);
	}

	@Override
	public EnvironmentService getWrappedService() {
		return _environmentService;
	}

	@Override
	public void setWrappedService(EnvironmentService environmentService) {
		_environmentService = environmentService;
	}

	private EnvironmentService _environmentService;

}