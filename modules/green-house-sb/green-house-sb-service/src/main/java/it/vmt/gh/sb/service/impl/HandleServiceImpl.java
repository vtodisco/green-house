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

package it.vmt.gh.sb.service.impl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;

import it.vmt.gh.sb.model.Handle;
import it.vmt.gh.sb.service.base.HandleServiceBaseImpl;

/**
 * The implementation of the handle remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.vmt.gh.sb.service.HandleService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HandleServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=gh",
		"json.web.service.context.path=Handle"
	},
	service = AopService.class
)
public class HandleServiceImpl extends HandleServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>it.vmt.gh.sb.service.HandleServiceUtil</code> to access the handle remote service.
	 */
	public String getHandleImages(long groupId, String name) {
		return handleLocalService.getHandleImages(groupId, name);
	}

	public List<Handle> getHandles(int start, int end){
		return handleLocalService.getHandles(start, end);
	}

	public Handle deleteHandle(long handleId) throws PortalException {
		return handleLocalService.deleteHandle(handleId);
	}
	
	public Handle updateHandle(
			long handleId,
			long groupId,
			long userId,
			String code,
			String name,
			String img,
			double price
			) {
		return handleLocalService.updateHandle(handleId, groupId, userId, code, name, img, price);
	}
}