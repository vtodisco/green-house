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
 * Provides a wrapper for {@link CarpentryService}.
 *
 * @author Brian Wing Shun Chan
 * @see CarpentryService
 * @generated
 */
public class CarpentryServiceWrapper
	implements CarpentryService, ServiceWrapper<CarpentryService> {

	public CarpentryServiceWrapper(CarpentryService carpentryService) {
		_carpentryService = carpentryService;
	}

	@Override
	public it.vmt.gh.sb.model.Carpentry deleteCarpentry(long carpentryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _carpentryService.deleteCarpentry(carpentryId);
	}

	@Override
	public java.util.List<it.vmt.gh.sb.model.Carpentry> getCarpentries(
		int start, int end) {

		return _carpentryService.getCarpentries(start, end);
	}

	@Override
	public String getCarpentryImages(long groupId, String name) {
		return _carpentryService.getCarpentryImages(groupId, name);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _carpentryService.getOSGiServiceIdentifier();
	}

	@Override
	public it.vmt.gh.sb.model.Carpentry updateCarpentry(
		long carpentryId, long groupId, long userId, String code, String name,
		String img, double price, int shutters) {

		return _carpentryService.updateCarpentry(
			carpentryId, groupId, userId, code, name, img, price, shutters);
	}

	@Override
	public CarpentryService getWrappedService() {
		return _carpentryService;
	}

	@Override
	public void setWrappedService(CarpentryService carpentryService) {
		_carpentryService = carpentryService;
	}

	private CarpentryService _carpentryService;

}