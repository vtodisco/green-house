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
 * This class is a wrapper for {@link Carpentry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Carpentry
 * @generated
 */
public class CarpentryWrapper
	extends BaseModelWrapper<Carpentry>
	implements Carpentry, ModelWrapper<Carpentry> {

	public CarpentryWrapper(Carpentry carpentry) {
		super(carpentry);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("carpentryId", getCarpentryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("code", getCode());
		attributes.put("name", getName());
		attributes.put("img", getImg());
		attributes.put("price", getPrice());
		attributes.put("shutters", getShutters());
		attributes.put("specificationId", getSpecificationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long carpentryId = (Long)attributes.get("carpentryId");

		if (carpentryId != null) {
			setCarpentryId(carpentryId);
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

		String img = (String)attributes.get("img");

		if (img != null) {
			setImg(img);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Integer shutters = (Integer)attributes.get("shutters");

		if (shutters != null) {
			setShutters(shutters);
		}

		Long specificationId = (Long)attributes.get("specificationId");

		if (specificationId != null) {
			setSpecificationId(specificationId);
		}
	}

	/**
	 * Returns the carpentry ID of this carpentry.
	 *
	 * @return the carpentry ID of this carpentry
	 */
	@Override
	public long getCarpentryId() {
		return model.getCarpentryId();
	}

	/**
	 * Returns the code of this carpentry.
	 *
	 * @return the code of this carpentry
	 */
	@Override
	public String getCode() {
		return model.getCode();
	}

	/**
	 * Returns the company ID of this carpentry.
	 *
	 * @return the company ID of this carpentry
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this carpentry.
	 *
	 * @return the create date of this carpentry
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this carpentry.
	 *
	 * @return the group ID of this carpentry
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the img of this carpentry.
	 *
	 * @return the img of this carpentry
	 */
	@Override
	public String getImg() {
		return model.getImg();
	}

	/**
	 * Returns the modified date of this carpentry.
	 *
	 * @return the modified date of this carpentry
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this carpentry.
	 *
	 * @return the name of this carpentry
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the price of this carpentry.
	 *
	 * @return the price of this carpentry
	 */
	@Override
	public double getPrice() {
		return model.getPrice();
	}

	/**
	 * Returns the primary key of this carpentry.
	 *
	 * @return the primary key of this carpentry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the shutters of this carpentry.
	 *
	 * @return the shutters of this carpentry
	 */
	@Override
	public int getShutters() {
		return model.getShutters();
	}

	/**
	 * Returns the specification ID of this carpentry.
	 *
	 * @return the specification ID of this carpentry
	 */
	@Override
	public long getSpecificationId() {
		return model.getSpecificationId();
	}

	/**
	 * Returns the user ID of this carpentry.
	 *
	 * @return the user ID of this carpentry
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this carpentry.
	 *
	 * @return the user name of this carpentry
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this carpentry.
	 *
	 * @return the user uuid of this carpentry
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this carpentry.
	 *
	 * @return the uuid of this carpentry
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
	 * Sets the carpentry ID of this carpentry.
	 *
	 * @param carpentryId the carpentry ID of this carpentry
	 */
	@Override
	public void setCarpentryId(long carpentryId) {
		model.setCarpentryId(carpentryId);
	}

	/**
	 * Sets the code of this carpentry.
	 *
	 * @param code the code of this carpentry
	 */
	@Override
	public void setCode(String code) {
		model.setCode(code);
	}

	/**
	 * Sets the company ID of this carpentry.
	 *
	 * @param companyId the company ID of this carpentry
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this carpentry.
	 *
	 * @param createDate the create date of this carpentry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this carpentry.
	 *
	 * @param groupId the group ID of this carpentry
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the img of this carpentry.
	 *
	 * @param img the img of this carpentry
	 */
	@Override
	public void setImg(String img) {
		model.setImg(img);
	}

	/**
	 * Sets the modified date of this carpentry.
	 *
	 * @param modifiedDate the modified date of this carpentry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this carpentry.
	 *
	 * @param name the name of this carpentry
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the price of this carpentry.
	 *
	 * @param price the price of this carpentry
	 */
	@Override
	public void setPrice(double price) {
		model.setPrice(price);
	}

	/**
	 * Sets the primary key of this carpentry.
	 *
	 * @param primaryKey the primary key of this carpentry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the shutters of this carpentry.
	 *
	 * @param shutters the shutters of this carpentry
	 */
	@Override
	public void setShutters(int shutters) {
		model.setShutters(shutters);
	}

	/**
	 * Sets the specification ID of this carpentry.
	 *
	 * @param specificationId the specification ID of this carpentry
	 */
	@Override
	public void setSpecificationId(long specificationId) {
		model.setSpecificationId(specificationId);
	}

	/**
	 * Sets the user ID of this carpentry.
	 *
	 * @param userId the user ID of this carpentry
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this carpentry.
	 *
	 * @param userName the user name of this carpentry
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this carpentry.
	 *
	 * @param userUuid the user uuid of this carpentry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this carpentry.
	 *
	 * @param uuid the uuid of this carpentry
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
	protected CarpentryWrapper wrap(Carpentry carpentry) {
		return new CarpentryWrapper(carpentry);
	}

}