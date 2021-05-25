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
 * This class is a wrapper for {@link Color}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Color
 * @generated
 */
public class ColorWrapper
	extends BaseModelWrapper<Color> implements Color, ModelWrapper<Color> {

	public ColorWrapper(Color color) {
		super(color);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("colorId", getColorId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("code", getCode());
		attributes.put("img", getImg());
		attributes.put("charge", getCharge());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long colorId = (Long)attributes.get("colorId");

		if (colorId != null) {
			setColorId(colorId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String img = (String)attributes.get("img");

		if (img != null) {
			setImg(img);
		}

		Integer charge = (Integer)attributes.get("charge");

		if (charge != null) {
			setCharge(charge);
		}
	}

	/**
	 * Returns the charge of this color.
	 *
	 * @return the charge of this color
	 */
	@Override
	public int getCharge() {
		return model.getCharge();
	}

	/**
	 * Returns the code of this color.
	 *
	 * @return the code of this color
	 */
	@Override
	public String getCode() {
		return model.getCode();
	}

	/**
	 * Returns the color ID of this color.
	 *
	 * @return the color ID of this color
	 */
	@Override
	public long getColorId() {
		return model.getColorId();
	}

	/**
	 * Returns the company ID of this color.
	 *
	 * @return the company ID of this color
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this color.
	 *
	 * @return the create date of this color
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this color.
	 *
	 * @return the group ID of this color
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the img of this color.
	 *
	 * @return the img of this color
	 */
	@Override
	public String getImg() {
		return model.getImg();
	}

	/**
	 * Returns the modified date of this color.
	 *
	 * @return the modified date of this color
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this color.
	 *
	 * @return the name of this color
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this color.
	 *
	 * @return the primary key of this color
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this color.
	 *
	 * @return the user ID of this color
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this color.
	 *
	 * @return the user name of this color
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this color.
	 *
	 * @return the user uuid of this color
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this color.
	 *
	 * @return the uuid of this color
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
	 * Sets the charge of this color.
	 *
	 * @param charge the charge of this color
	 */
	@Override
	public void setCharge(int charge) {
		model.setCharge(charge);
	}

	/**
	 * Sets the code of this color.
	 *
	 * @param code the code of this color
	 */
	@Override
	public void setCode(String code) {
		model.setCode(code);
	}

	/**
	 * Sets the color ID of this color.
	 *
	 * @param colorId the color ID of this color
	 */
	@Override
	public void setColorId(long colorId) {
		model.setColorId(colorId);
	}

	/**
	 * Sets the company ID of this color.
	 *
	 * @param companyId the company ID of this color
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this color.
	 *
	 * @param createDate the create date of this color
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this color.
	 *
	 * @param groupId the group ID of this color
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the img of this color.
	 *
	 * @param img the img of this color
	 */
	@Override
	public void setImg(String img) {
		model.setImg(img);
	}

	/**
	 * Sets the modified date of this color.
	 *
	 * @param modifiedDate the modified date of this color
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this color.
	 *
	 * @param name the name of this color
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this color.
	 *
	 * @param primaryKey the primary key of this color
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this color.
	 *
	 * @param userId the user ID of this color
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this color.
	 *
	 * @param userName the user name of this color
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this color.
	 *
	 * @param userUuid the user uuid of this color
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this color.
	 *
	 * @param uuid the uuid of this color
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
	protected ColorWrapper wrap(Color color) {
		return new ColorWrapper(color);
	}

}