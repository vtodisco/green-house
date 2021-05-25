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

import it.vmt.gh.sb.model.Carpentry;
import it.vmt.gh.sb.service.base.CarpentryServiceBaseImpl;

/**
 * The implementation of the carpentry remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.vmt.gh.sb.service.CarpentryService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CarpentryServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=gh",
		"json.web.service.context.path=Carpentry"
	},
	service = AopService.class
)
public class CarpentryServiceImpl extends CarpentryServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>it.vmt.gh.sb.service.CarpentryServiceUtil</code> to access the carpentry remote service.
	 */
	public String getCarpentryImages(long groupId, String name) {
		return carpentryLocalService.getCarpentryImages(groupId, name);
	}

	public List<Carpentry> getCarpentries(int start, int end){
		return carpentryLocalService.getCarpentries(start, end);
	}
	
	public Carpentry deleteCarpentry(long carpentryId) throws PortalException {
		return carpentryLocalService.deleteCarpentry(carpentryId);
	}

	public Carpentry updateCarpentry(
			long carpentryId,
			long groupId,
			long userId,
			String code,
			String name,
			String img,
			double price,
			int shutters
			) {
		return carpentryLocalService.updateCarpentry(carpentryId, groupId, userId, code, name, img, price, shutters);
	}
}