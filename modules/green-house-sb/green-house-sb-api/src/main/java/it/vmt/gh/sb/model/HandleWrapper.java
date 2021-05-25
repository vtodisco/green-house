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

package it.vmt.gh.sb.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Handle}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Handle
 * @generated
 */
public class HandleWrapper
	extends BaseModelWrapper<Handle> implements Handle, ModelWrapper<Handle> {

	public HandleWrapper(Handle handle) {
		super(handle);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("handleId", getHandleId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("code", getCode());
		attributes.put("name", getName());
		attributes.put("price", getPrice());
		attributes.put("img", getImg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long handleId = (Long)attributes.get("handleId");

		if (handleId != null) {
			setHandleId(handleId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		String img = (String)attributes.get("img");

		if (img != null) {
			setImg(img);
		}
	}

	/**
	 * Returns the code of this handle.
	 *
	 * @return the code of this handle
	 */
	@Override
	public String getCode() {
		return model.getCode();
	}

	/**
	 * Returns the company ID of this handle.
	 *
	 * @return the company ID of this handle
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this handle.
	 *
	 * @return the create date of this handle
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this handle.
	 *
	 * @return the group ID of this handle
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the handle ID of this handle.
	 *
	 * @return the handle ID of this handle
	 */
	@Override
	public long getHandleId() {
		return model.getHandleId();
	}

	/**
	 * Returns the img of this handle.
	 *
	 * @return the img of this handle
	 */
	@Override
	public String getImg() {
		return model.getImg();
	}

	/**
	 * Returns the modified date of this handle.
	 *
	 * @return the modified date of this handle
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this handle.
	 *
	 * @return the name of this handle
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the price of this handle.
	 *
	 * @return the price of this handle
	 */
	@Override
	public double getPrice() {
		return model.getPrice();
	}

	/**
	 * Returns the primary key of this handle.
	 *
	 * @return the primary key of this handle
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this handle.
	 *
	 * @return the user ID of this handle
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this handle.
	 *
	 * @return the user name of this handle
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this handle.
	 *
	 * @return the user uuid of this handle
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this handle.
	 *
	 * @return the uuid of this handle
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the code of this handle.
	 *
	 * @param code the code of this handle
	 */
	@Override
	public void setCode(String code) {
		model.setCode(code);
	}

	/**
	 * Sets the company ID of this handle.
	 *
	 * @param companyId the company ID of this handle
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this handle.
	 *
	 * @param createDate the create date of this handle
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this handle.
	 *
	 * @param groupId the group ID of this handle
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the handle ID of this handle.
	 *
	 * @param handleId the handle ID of this handle
	 */
	@Override
	public void setHandleId(long handleId) {
		model.setHandleId(handleId);
	}

	/**
	 * Sets the img of this handle.
	 *
	 * @param img the img of this handle
	 */
	@Override
	public void setImg(String img) {
		model.setImg(img);
	}

	/**
	 * Sets the modified date of this handle.
	 *
	 * @param modifiedDate the modified date of this handle
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this handle.
	 *
	 * @param name the name of this handle
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the price of this handle.
	 *
	 * @param price the price of this handle
	 */
	@Override
	public void setPrice(double price) {
		model.setPrice(price);
	}

	/**
	 * Sets the primary key of this handle.
	 *
	 * @param primaryKey the primary key of this handle
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this handle.
	 *
	 * @param userId the user ID of this handle
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this handle.
	 *
	 * @param userName the user name of this handle
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this handle.
	 *
	 * @param userUuid the user uuid of this handle
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this handle.
	 *
	 * @param uuid the uuid of this handle
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected HandleWrapper wrap(Handle handle) {
		return new HandleWrapper(handle);
	}

}