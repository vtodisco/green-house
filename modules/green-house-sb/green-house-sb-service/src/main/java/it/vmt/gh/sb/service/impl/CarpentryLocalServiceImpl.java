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

import java.util.Calendar;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.document.library.kernel.service.DLFolderLocalService;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;

import it.vmt.gh.sb.model.Carpentry;
import it.vmt.gh.sb.service.base.CarpentryLocalServiceBaseImpl;

/**
 * The implementation of the carpentry local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.vmt.gh.sb.service.CarpentryLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CarpentryLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=it.vmt.gh.sb.model.Carpentry",
	service = AopService.class
)
public class CarpentryLocalServiceImpl extends CarpentryLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>it.vmt.gh.sb.service.CarpentryLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>it.vmt.gh.sb.service.CarpentryLocalServiceUtil</code>.
	 */

	public String getCarpentryImages(long groupId, String name) {
		String result = null;
		JSONArray filesJson = JSONFactoryUtil.createJSONArray();
		DLFolder folder = _dlFolderLocalService.fetchFolder(groupId, 0, name);
		if(Validator.isNotNull(folder)) {
			List<DLFileEntry> files = _dlFileEntryLocalService.getFileEntries(groupId, folder.getFolderId());
			for(DLFileEntry file : files) {
				JSONObject fileJson = JSONFactoryUtil.createJSONObject();
				fileJson.put("name", file.getName());
				fileJson.put("url", "/documents/" + file.getRepositoryId() + "/" + file.getFolderId() + "/" + file.getTitle() + "/" + file.getUuid());
				filesJson.put(fileJson);
			}
		}
		result = filesJson.toString();
		return result;
	}

	public List<Carpentry> getCarpentries(int start, int end){
		return carpentryPersistence.findAll(start, end);
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
		Carpentry carpentry = null;
		User user = _userLocalService.fetchUser(userId);
		if(carpentryId > 0) {
			carpentry = carpentryPersistence.fetchByPrimaryKey(carpentryId);
		}else {
			carpentry = carpentryPersistence.create(_counterLocalService.increment());
			carpentry.setCompanyId(PortalUtil.getDefaultCompanyId());
			carpentry.setCreateDate(Calendar.getInstance().getTime());
			carpentry.setGroupId(groupId);
		}
		carpentry.setCode(code);
		carpentry.setName(name);
		carpentry.setImg(img);
		carpentry.setPrice(price);
		carpentry.setShutters(shutters);
		carpentry.setModifiedDate(Calendar.getInstance().getTime());
		carpentry.setUserId(user.getUserId());
		carpentry.setUserName(user.getFullName());
		carpentry.setUserUuid(user.getUuid());
		carpentryPersistence.update(carpentry);
		return carpentry;
	}
	
	public JSONObject fillCarpentryJson(Carpentry carpentry) {
		JSONObject obj = JSONFactoryUtil.createJSONObject();
		obj.put("carpentryId", carpentry.getPrimaryKey());
		obj.put("name", carpentry.getName());
		obj.put("groupId", carpentry.getGroupId());
		obj.put("userId", carpentry.getUserId());
		obj.put("code", carpentry.getCode());
		obj.put("price", carpentry.getPrice());
		obj.put("shutters", carpentry.getShutters());
		obj.put("img", carpentry.getImg());
		return obj;
	}
	
	@Reference
	private DLFileEntryLocalService _dlFileEntryLocalService;
	@Reference
	private DLFolderLocalService _dlFolderLocalService;
	@Reference
	private CounterLocalService _counterLocalService;
	@Reference
	private UserLocalService _userLocalService;
}