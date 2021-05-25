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
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;

import it.vmt.gh.sb.exception.NoSuchEnvironmentException;
import it.vmt.gh.sb.model.Environment;
import it.vmt.gh.sb.service.base.EnvironmentLocalServiceBaseImpl;

/**
 * The implementation of the environment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.vmt.gh.sb.service.EnvironmentLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EnvironmentLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=it.vmt.gh.sb.model.Environment",
	service = AopService.class
)
public class EnvironmentLocalServiceImpl
	extends EnvironmentLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>it.vmt.gh.sb.service.EnvironmentLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>it.vmt.gh.sb.service.EnvironmentLocalServiceUtil</code>.
	 */
	
	public String getEnvironments() {
		JSONArray list = JSONFactoryUtil.createJSONArray();
		List<Environment> envs = environmentPersistence.findAll();
		for(Environment env : envs) {
			JSONObject obj = JSONFactoryUtil.createJSONObject();
			obj.put("environmentId", env.getPrimaryKey());
			obj.put("name", env.getName());
			obj.put("groupId", env.getGroupId());
			obj.put("userId", env.getUserId());
			list.put(obj);
		}
		return list.toJSONString();
	}
	
	public Environment updateEnvironment(
			long environmentId,
			long groupId,
			long userId,
			String name) {
		Environment environment = null;
		User user = _userLocalService.fetchUser(userId);
	
		if(environmentId > 0) {
			environment = environmentPersistence.fetchByPrimaryKey(environmentId);
		}else {
			environment = environmentPersistence.fetchByName(name);
			if(Validator.isNull(environment)) {
				environment = environmentPersistence.create(_counterLocalService.increment());
				environment.setCompanyId(PortalUtil.getDefaultCompanyId());
				environment.setCreateDate(Calendar.getInstance().getTime());
				environment.setGroupId(groupId);
				environment.setUserId(userId);
			}
			environment.setName(name);
			environmentPersistence.update(environment);
		}
		return environment;
	}
	
	public JSONObject fillEnvironmentJson(Environment environment) {
		JSONObject obj = JSONFactoryUtil.createJSONObject();
		obj.put("environmentId", environment.getPrimaryKey());
		obj.put("name", environment.getName());
		obj.put("groupId", environment.getGroupId());
		obj.put("userId", environment.getUserId());
		return obj;
	}
	
	@Reference
	private CounterLocalService _counterLocalService;
	@Reference
	private UserLocalService _userLocalService;
}