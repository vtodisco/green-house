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

import it.vmt.gh.sb.model.Item;
import it.vmt.gh.sb.model.Profile;
import it.vmt.gh.sb.service.base.ProfileLocalServiceBaseImpl;

/**
 * The implementation of the profile local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.vmt.gh.sb.service.ProfileLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProfileLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=it.vmt.gh.sb.model.Profile",
	service = AopService.class
)
public class ProfileLocalServiceImpl extends ProfileLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>it.vmt.gh.sb.service.ProfileLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>it.vmt.gh.sb.service.ProfileLocalServiceUtil</code>.
	 */
	
	public String getProfileImages(long groupId, String name) {
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
	
	public JSONObject fillProfileJson(Profile profile) {
		JSONObject obj = JSONFactoryUtil.createJSONObject();
		obj.put("profileId", profile.getProfileId());
		obj.put("userId", profile.getUserId());
		obj.put("groupId", profile.getGroupId());
		obj.put("code", profile.getCode());
		obj.put("name", profile.getName());
		obj.put("price", profile.getPrice());
		obj.put("img", profile.getImg());
		return obj;
	}

	public List<Profile> getProfiles(int start, int end){
		return profilePersistence.findAll(start, end);
	}
	
	public Profile updateProfile(
			long profileId,
			long groupId,
			long userId,
			String code,
			String name,
			double price,
			String img
			) {
		Profile profile = null;
		User user = _userLocalService.fetchUser(userId);
		if(profileId > 0) {
			profile = profilePersistence.fetchByPrimaryKey(profileId);
		}else {
			profile = profilePersistence.create(_counterLocalService.increment());
			profile.setCompanyId(PortalUtil.getDefaultCompanyId());
			profile.setCreateDate(Calendar.getInstance().getTime());
			profile.setGroupId(groupId);
		}
		profile.setCode(code);
		profile.setName(name);
		profile.setPrice(price);
		profile.setModifiedDate(Calendar.getInstance().getTime());
		profile.setUserId(user.getUserId());
		profile.setUserName(user.getFullName());
		profile.setUserUuid(user.getUuid());
		profile.setImg(img);
		profilePersistence.update(profile);
		return profile;
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