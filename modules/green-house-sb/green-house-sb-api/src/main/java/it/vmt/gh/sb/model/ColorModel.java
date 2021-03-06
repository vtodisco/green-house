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
 * The base model interface for the Color service. Represents a row in the &quot;gh_Color&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>it.vmt.gh.sb.model.impl.ColorModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>it.vmt.gh.sb.model.impl.ColorImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Color
 * @generated
 */
@ProviderType
public interface ColorModel
	extends BaseModel<Color>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a color model instance should use the {@link Color} interface instead.
	 */

	/**
	 * Returns the primary key of this color.
	 *
	 * @return the primary key of this color
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this color.
	 *
	 * @param primaryKey the primary key of this color
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this color.
	 *
	 * @return the uuid of this color
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this color.
	 *
	 * @param uuid the uuid of this color
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the color ID of this color.
	 *
	 * @return the color ID of this color
	 */
	public long getColorId();

	/**
	 * Sets the color ID of this color.
	 *
	 * @param colorId the color ID of this color
	 */
	public void setColorId(long colorId);

	/**
	 * Returns the group ID of this color.
	 *
	 * @return the group ID of this color
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this color.
	 *
	 * @param groupId the group ID of this color
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this color.
	 *
	 * @return the company ID of this color
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this color.
	 *
	 * @param companyId the company ID of this color
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this color.
	 *
	 * @return the user ID of this color
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this color.
	 *
	 * @param userId the user ID of this color
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this color.
	 *
	 * @return the user uuid of this color
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this color.
	 *
	 * @param userUuid the user uuid of this color
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this color.
	 *
	 * @return the user name of this color
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this color.
	 *
	 * @param userName the user name of this color
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this color.
	 *
	 * @return the create date of this color
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this color.
	 *
	 * @param createDate the create date of this color
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this color.
	 *
	 * @return the modified date of this color
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this color.
	 *
	 * @param modifiedDate the modified date of this color
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this color.
	 *
	 * @return the name of this color
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this color.
	 *
	 * @param name the name of this color
	 */
	public void setName(String name);

	/**
	 * Returns the code of this color.
	 *
	 * @return the code of this color
	 */
	@AutoEscape
	public String getCode();

	/**
	 * Sets the code of this color.
	 *
	 * @param code the code of this color
	 */
	public void setCode(String code);

	/**
	 * Returns the img of this color.
	 *
	 * @return the img of this color
	 */
	@AutoEscape
	public String getImg();

	/**
	 * Sets the img of this color.
	 *
	 * @param img the img of this color
	 */
	public void setImg(String img);

	/**
	 * Returns the charge of this color.
	 *
	 * @return the charge of this color
	 */
	public int getCharge();

	/**
	 * Sets the charge of this color.
	 *
	 * @param charge the charge of this color
	 */
	public void setCharge(int charge);

}