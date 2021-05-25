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

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;

import it.vmt.gh.sb.model.Environment;
import it.vmt.gh.sb.service.base.EnvironmentServiceBaseImpl;

/**
 * The implementation of the environment remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.vmt.gh.sb.service.EnvironmentService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EnvironmentServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=gh",
		"json.web.service.context.path=Environment"
	},
	service = AopService.class
)
public class EnvironmentServiceImpl extends EnvironmentServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>it.vmt.gh.sb.service.EnvironmentServiceUtil</code> to access the environment remote service.
	 */
	public String getEnvironments() {
		return environmentLocalService.getEnvironments();
	}
	
	public Environment deleteEnvironment(long environmentId) throws PortalException {
		return environmentLocalService.deleteEnvironment(environmentId);
	}

	public Environment updateEnvironment(
			long environmentId,
			long groupId,
			long userId,
			String name) {
		return environmentLocalService.updateEnvironment(environmentId, groupId, userId, name);
	}
}