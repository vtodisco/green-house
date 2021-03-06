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
 * The base model interface for the Item service. Represents a row in the &quot;gh_Item&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>it.vmt.gh.sb.model.impl.ItemModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>it.vmt.gh.sb.model.impl.ItemImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Item
 * @generated
 */
@ProviderType
public interface ItemModel
	extends BaseModel<Item>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a item model instance should use the {@link Item} interface instead.
	 */

	/**
	 * Returns the primary key of this item.
	 *
	 * @return the primary key of this item
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this item.
	 *
	 * @param primaryKey the primary key of this item
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this item.
	 *
	 * @return the uuid of this item
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this item.
	 *
	 * @param uuid the uuid of this item
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the item ID of this item.
	 *
	 * @return the item ID of this item
	 */
	public long getItemId();

	/**
	 * Sets the item ID of this item.
	 *
	 * @param itemId the item ID of this item
	 */
	public void setItemId(long itemId);

	/**
	 * Returns the group ID of this item.
	 *
	 * @return the group ID of this item
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this item.
	 *
	 * @param groupId the group ID of this item
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this item.
	 *
	 * @return the company ID of this item
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this item.
	 *
	 * @param companyId the company ID of this item
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this item.
	 *
	 * @return the user ID of this item
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this item.
	 *
	 * @param userId the user ID of this item
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this item.
	 *
	 * @return the user uuid of this item
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this item.
	 *
	 * @param userUuid the user uuid of this item
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this item.
	 *
	 * @return the user name of this item
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this item.
	 *
	 * @param userName the user name of this item
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this item.
	 *
	 * @return the create date of this item
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this item.
	 *
	 * @param createDate the create date of this item
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this item.
	 *
	 * @return the modified date of this item
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this item.
	 *
	 * @param modifiedDate the modified date of this item
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the display date of this item.
	 *
	 * @return the display date of this item
	 */
	public Date getDisplayDate();

	/**
	 * Sets the display date of this item.
	 *
	 * @param displayDate the display date of this item
	 */
	public void setDisplayDate(Date displayDate);

	/**
	 * Returns the environment ID of this item.
	 *
	 * @return the environment ID of this item
	 */
	public long getEnvironmentId();

	/**
	 * Sets the environment ID of this item.
	 *
	 * @param environmentId the environment ID of this item
	 */
	public void setEnvironmentId(long environmentId);

	/**
	 * Returns the profile ID of this item.
	 *
	 * @return the profile ID of this item
	 */
	public long getProfileId();

	/**
	 * Sets the profile ID of this item.
	 *
	 * @param profileId the profile ID of this item
	 */
	public void setProfileId(long profileId);

	/**
	 * Returns the carpentry ID of this item.
	 *
	 * @return the carpentry ID of this item
	 */
	public long getCarpentryId();

	/**
	 * Sets the carpentry ID of this item.
	 *
	 * @param carpentryId the carpentry ID of this item
	 */
	public void setCarpentryId(long carpentryId);

	/**
	 * Returns the handle ID of this item.
	 *
	 * @return the handle ID of this item
	 */
	public long getHandleId();

	/**
	 * Sets the handle ID of this item.
	 *
	 * @param handleId the handle ID of this item
	 */
	public void setHandleId(long handleId);

	/**
	 * Returns the color ID of this item.
	 *
	 * @return the color ID of this item
	 */
	public long getColorId();

	/**
	 * Sets the color ID of this item.
	 *
	 * @param colorId the color ID of this item
	 */
	public void setColorId(long colorId);

	/**
	 * Returns the cart ID of this item.
	 *
	 * @return the cart ID of this item
	 */
	public long getCartId();

	/**
	 * Sets the cart ID of this item.
	 *
	 * @param cartId the cart ID of this item
	 */
	public void setCartId(long cartId);

	/**
	 * Returns the qty of this item.
	 *
	 * @return the qty of this item
	 */
	public int getQty();

	/**
	 * Sets the qty of this item.
	 *
	 * @param qty the qty of this item
	 */
	public void setQty(int qty);

	/**
	 * Returns the price of this item.
	 *
	 * @return the price of this item
	 */
	public double getPrice();

	/**
	 * Sets the price of this item.
	 *
	 * @param price the price of this item
	 */
	public void setPrice(double price);

	/**
	 * Returns the width of this item.
	 *
	 * @return the width of this item
	 */
	public double getWidth();

	/**
	 * Sets the width of this item.
	 *
	 * @param width the width of this item
	 */
	public void setWidth(double width);

	/**
	 * Returns the height of this item.
	 *
	 * @return the height of this item
	 */
	public double getHeight();

	/**
	 * Sets the height of this item.
	 *
	 * @param height the height of this item
	 */
	public void setHeight(double height);

	/**
	 * Returns the color of this item.
	 *
	 * @return the color of this item
	 */
	@AutoEscape
	public String getColor();

	/**
	 * Sets the color of this item.
	 *
	 * @param color the color of this item
	 */
	public void setColor(String color);

}