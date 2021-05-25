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
 * Provides a wrapper for {@link HandleService}.
 *
 * @author Brian Wing Shun Chan
 * @see HandleService
 * @generated
 */
public class HandleServiceWrapper
	implements HandleService, ServiceWrapper<HandleService> {

	public HandleServiceWrapper(HandleService handleService) {
		_handleService = handleService;
	}

	@Override
	public it.vmt.gh.sb.model.Handle deleteHandle(long handleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _handleService.deleteHandle(handleId);
	}

	@Override
	public String getHandleImages(long groupId, String name) {
		return _handleService.getHandleImages(groupId, name);
	}

	@Override
	public java.util.List<it.vmt.gh.sb.model.Handle> getHandles(
		int start, int end) {

		return _handleService.getHandles(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _handleService.getOSGiServiceIdentifier();
	}

	@Override
	public it.vmt.gh.sb.model.Handle updateHandle(
		long handleId, long groupId, long userId, String code, String name,
		String img, double price) {

		return _handleService.updateHandle(
			handleId, groupId, userId, code, name, img, price);
	}

	@Override
	public HandleService getWrappedService() {
		return _handleService;
	}

	@Override
	public void setWrappedService(HandleService handleService) {
		_handleService = handleService;
	}

	private HandleService _handleService;

}