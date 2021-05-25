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

import it.vmt.gh.sb.model.Color;
import it.vmt.gh.sb.service.base.ColorServiceBaseImpl;

/**
 * The implementation of the color remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.vmt.gh.sb.service.ColorService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ColorServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=gh",
		"json.web.service.context.path=Color"
	},
	service = AopService.class
)
public class ColorServiceImpl extends ColorServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>it.vmt.gh.sb.service.ColorServiceUtil</code> to access the color remote service.
	 */
	public String getColorImages(long groupId, String name) {
		return colorLocalService.getColorImages(groupId, name);
	}

	public List<Color> getColors(int start, int end){
		return colorLocalService.getColors(start, end);
	}

	public Color deleteColor(long colorId) throws PortalException {
		return colorLocalService.deleteColor(colorId);
	}
	public Color updateColor(
			long colorId,
			long groupId,
			long userId,
			String code,
			String name,
			String img,
			int charge
			) {
		return colorLocalService.updateColor(colorId, groupId, userId, code, name, img, charge);
	}
}