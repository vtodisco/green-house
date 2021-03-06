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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Carpentry service. Represents a row in the &quot;gh_Carpentry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>it.vmt.gh.sb.model.impl.CarpentryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>it.vmt.gh.sb.model.impl.CarpentryImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Carpentry
 * @generated
 */
@ProviderType
public interface CarpentryModel
	extends BaseModel<Carpentry>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a carpentry model instance should use the {@link Carpentry} interface instead.
	 */

	/**
	 * Returns the primary key of this carpentry.
	 *
	 * @return the primary key of this carpentry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this carpentry.
	 *
	 * @param primaryKey the primary key of this carpentry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this carpentry.
	 *
	 * @return the uuid of this carpentry
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this carpentry.
	 *
	 * @param uuid the uuid of this carpentry
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the carpentry ID of this carpentry.
	 *
	 * @return the carpentry ID of this carpentry
	 */
	public long getCarpentryId();

	/**
	 * Sets the carpentry ID of this carpentry.
	 *
	 * @param carpentryId the carpentry ID of this carpentry
	 */
	public void setCarpentryId(long carpentryId);

	/**
	 * Returns the group ID of this carpentry.
	 *
	 * @return the group ID of this carpentry
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this carpentry.
	 *
	 * @param groupId the group ID of this carpentry
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this carpentry.
	 *
	 * @return the company ID of this carpentry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this carpentry.
	 *
	 * @param companyId the company ID of this carpentry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this carpentry.
	 *
	 * @return the user ID of this carpentry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this carpentry.
	 *
	 * @param userId the user ID of this carpentry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this carpentry.
	 *
	 * @return the user uuid of this carpentry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this carpentry.
	 *
	 * @param userUuid the user uuid of this carpentry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this carpentry.
	 *
	 * @return the user name of this carpentry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this carpentry.
	 *
	 * @param userName the user name of this carpentry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this carpentry.
	 *
	 * @return the create date of this carpentry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this carpentry.
	 *
	 * @param createDate the create date of this carpentry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this carpentry.
	 *
	 * @return the modified date of this carpentry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this carpentry.
	 *
	 * @param modifiedDate the modified date of this carpentry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the code of this carpentry.
	 *
	 * @return the code of this carpentry
	 */
	@AutoEscape
	public String getCode();

	/**
	 * Sets the code of this carpentry.
	 *
	 * @param code the code of this carpentry
	 */
	public void setCode(String code);

	/**
	 * Returns the name of this carpentry.
	 *
	 * @return the name of this carpentry
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this carpentry.
	 *
	 * @param name the name of this carpentry
	 */
	public void setName(String name);

	/**
	 * Returns the img of this carpentry.
	 *
	 * @return the img of this carpentry
	 */
	@AutoEscape
	public String getImg();

	/**
	 * Sets the img of this carpentry.
	 *
	 * @param img the img of this carpentry
	 */
	public void setImg(String img);

	/**
	 * Returns the price of this carpentry.
	 *
	 * @return the price of this carpentry
	 */
	public double getPrice();

	/**
	 * Sets the price of this carpentry.
	 *
	 * @param price the price of this carpentry
	 */
	public void setPrice(double price);

	/**
	 * Returns the shutters of this carpentry.
	 *
	 * @return the shutters of this carpentry
	 */
	public int getShutters();

	/**
	 * Sets the shutters of this carpentry.
	 *
	 * @param shutters the shutters of this carpentry
	 */
	public void setShutters(int shutters);

	/**
	 * Returns the specification ID of this carpentry.
	 *
	 * @return the specification ID of this carpentry
	 */
	public long getSpecificationId();

	/**
	 * Sets the specification ID of this carpentry.
	 *
	 * @param specificationId the specification ID of this carpentry
	 */
	public void setSpecificationId(long specificationId);

}