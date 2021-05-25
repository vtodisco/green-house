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

import it.vmt.gh.sb.model.Profile;
import it.vmt.gh.sb.service.base.ProfileServiceBaseImpl;

/**
 * The implementation of the profile remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>it.vmt.gh.sb.service.ProfileService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProfileServiceBaseImpl
 */
@Component(property = { "json.web.service.context.name=gh",
		"json.web.service.context.path=Profile" }, service = AopService.class)
public class ProfileServiceImpl extends ProfileServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use
	 * <code>it.vmt.gh.sb.service.ProfileServiceUtil</code> to access the profile
	 * remote service.
	 */
	public String getProfileImages(long groupId, String name) {
		return profileLocalService.getProfileImages(groupId, name);
	}

	public List<Profile> getProfiles(int start, int end) {
		return profileLocalService.getProfiles(start, end);
	}

	public Profile deleteProfile(long profileId) throws PortalException {
		return profileLocalService.deleteProfile(profileId);
	}
	public Profile updateProfile(long profileId, long groupId, long userId, String code, String name, double price, String img) {
		return profileLocalService.updateProfile(profileId, groupId, userId, code, name, price, img);
	}
}