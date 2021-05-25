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
 * This class is a wrapper for {@link Item}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Item
 * @generated
 */
public class ItemWrapper
	extends BaseModelWrapper<Item> implements Item, ModelWrapper<Item> {

	public ItemWrapper(Item item) {
		super(item);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("itemId", getItemId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("displayDate", getDisplayDate());
		attributes.put("environmentId", getEnvironmentId());
		attributes.put("profileId", getProfileId());
		attributes.put("carpentryId", getCarpentryId());
		attributes.put("handleId", getHandleId());
		attributes.put("colorId", getColorId());
		attributes.put("cartId", getCartId());
		attributes.put("qty", getQty());
		attributes.put("price", getPrice());
		attributes.put("width", getWidth());
		attributes.put("height", getHeight());
		attributes.put("color", getColor());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long itemId = (Long)attributes.get("itemId");

		if (itemId != null) {
			setItemId(itemId);
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

		Date displayDate = (Date)attributes.get("displayDate");

		if (displayDate != null) {
			setDisplayDate(displayDate);
		}

		Long environmentId = (Long)attributes.get("environmentId");

		if (environmentId != null) {
			setEnvironmentId(environmentId);
		}

		Long profileId = (Long)attributes.get("profileId");

		if (profileId != null) {
			setProfileId(profileId);
		}

		Long carpentryId = (Long)attributes.get("carpentryId");

		if (carpentryId != null) {
			setCarpentryId(carpentryId);
		}

		Long handleId = (Long)attributes.get("handleId");

		if (handleId != null) {
			setHandleId(handleId);
		}

		Long colorId = (Long)attributes.get("colorId");

		if (colorId != null) {
			setColorId(colorId);
		}

		Long cartId = (Long)attributes.get("cartId");

		if (cartId != null) {
			setCartId(cartId);
		}

		Integer qty = (Integer)attributes.get("qty");

		if (qty != null) {
			setQty(qty);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Double width = (Double)attributes.get("width");

		if (width != null) {
			setWidth(width);
		}

		Double height = (Double)attributes.get("height");

		if (height != null) {
			setHeight(height);
		}

		String color = (String)attributes.get("color");

		if (color != null) {
			setColor(color);
		}
	}

	@Override
	public it.vmt.gh.sb.model.Carpentry getCarpentry() {
		return model.getCarpentry();
	}

	/**
	 * Returns the carpentry ID of this item.
	 *
	 * @return the carpentry ID of this item
	 */
	@Override
	public long getCarpentryId() {
		return model.getCarpentryId();
	}

	@Override
	public String getCarpentryImg() {
		return model.getCarpentryImg();
	}

	/**
	 * Returns the cart ID of this item.
	 *
	 * @return the cart ID of this item
	 */
	@Override
	public long getCartId() {
		return model.getCartId();
	}

	/**
	 * Returns the color of this item.
	 *
	 * @return the color of this item
	 */
	@Override
	public String getColor() {
		return model.getColor();
	}

	/**
	 * Returns the color ID of this item.
	 *
	 * @return the color ID of this item
	 */
	@Override
	public long getColorId() {
		return model.getColorId();
	}

	/**
	 * Returns the company ID of this item.
	 *
	 * @return the company ID of this item
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this item.
	 *
	 * @return the create date of this item
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the display date of this item.
	 *
	 * @return the display date of this item
	 */
	@Override
	public Date getDisplayDate() {
		return model.getDisplayDate();
	}

	@Override
	public it.vmt.gh.sb.model.Environment getEnvironment() {
		return model.getEnvironment();
	}

	/**
	 * Returns the environment ID of this item.
	 *
	 * @return the environment ID of this item
	 */
	@Override
	public long getEnvironmentId() {
		return model.getEnvironmentId();
	}

	/**
	 * Returns the group ID of this item.
	 *
	 * @return the group ID of this item
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	@Override
	public it.vmt.gh.sb.model.Handle getHandle() {
		return model.getHandle();
	}

	/**
	 * Returns the handle ID of this item.
	 *
	 * @return the handle ID of this item
	 */
	@Override
	public long getHandleId() {
		return model.getHandleId();
	}

	/**
	 * Returns the height of this item.
	 *
	 * @return the height of this item
	 */
	@Override
	public double getHeight() {
		return model.getHeight();
	}

	@Override
	public it.vmt.gh.sb.model.Color getItemColor() {
		return model.getItemColor();
	}

	/**
	 * Returns the item ID of this item.
	 *
	 * @return the item ID of this item
	 */
	@Override
	public long getItemId() {
		return model.getItemId();
	}

	/**
	 * Returns the modified date of this item.
	 *
	 * @return the modified date of this item
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the price of this item.
	 *
	 * @return the price of this item
	 */
	@Override
	public double getPrice() {
		return model.getPrice();
	}

	/**
	 * Returns the primary key of this item.
	 *
	 * @return the primary key of this item
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public it.vmt.gh.sb.model.Profile getProfile() {
		return model.getProfile();
	}

	/**
	 * Returns the profile ID of this item.
	 *
	 * @return the profile ID of this item
	 */
	@Override
	public long getProfileId() {
		return model.getProfileId();
	}

	/**
	 * Returns the qty of this item.
	 *
	 * @return the qty of this item
	 */
	@Override
	public int getQty() {
		return model.getQty();
	}

	/**
	 * Returns the user ID of this item.
	 *
	 * @return the user ID of this item
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this item.
	 *
	 * @return the user name of this item
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this item.
	 *
	 * @return the user uuid of this item
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this item.
	 *
	 * @return the uuid of this item
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the width of this item.
	 *
	 * @return the width of this item
	 */
	@Override
	public double getWidth() {
		return model.getWidth();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the carpentry ID of this item.
	 *
	 * @param carpentryId the carpentry ID of this item
	 */
	@Override
	public void setCarpentryId(long carpentryId) {
		model.setCarpentryId(carpentryId);
	}

	/**
	 * Sets the cart ID of this item.
	 *
	 * @param cartId the cart ID of this item
	 */
	@Override
	public void setCartId(long cartId) {
		model.setCartId(cartId);
	}

	/**
	 * Sets the color of this item.
	 *
	 * @param color the color of this item
	 */
	@Override
	public void setColor(String color) {
		model.setColor(color);
	}

	/**
	 * Sets the color ID of this item.
	 *
	 * @param colorId the color ID of this item
	 */
	@Override
	public void setColorId(long colorId) {
		model.setColorId(colorId);
	}

	/**
	 * Sets the company ID of this item.
	 *
	 * @param companyId the company ID of this item
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this item.
	 *
	 * @param createDate the create date of this item
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the display date of this item.
	 *
	 * @param displayDate the display date of this item
	 */
	@Override
	public void setDisplayDate(Date displayDate) {
		model.setDisplayDate(displayDate);
	}

	/**
	 * Sets the environment ID of this item.
	 *
	 * @param environmentId the environment ID of this item
	 */
	@Override
	public void setEnvironmentId(long environmentId) {
		model.setEnvironmentId(environmentId);
	}

	/**
	 * Sets the group ID of this item.
	 *
	 * @param groupId the group ID of this item
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the handle ID of this item.
	 *
	 * @param handleId the handle ID of this item
	 */
	@Override
	public void setHandleId(long handleId) {
		model.setHandleId(handleId);
	}

	/**
	 * Sets the height of this item.
	 *
	 * @param height the height of this item
	 */
	@Override
	public void setHeight(double height) {
		model.setHeight(height);
	}

	/**
	 * Sets the item ID of this item.
	 *
	 * @param itemId the item ID of this item
	 */
	@Override
	public void setItemId(long itemId) {
		model.setItemId(itemId);
	}

	/**
	 * Sets the modified date of this item.
	 *
	 * @param modifiedDate the modified date of this item
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the price of this item.
	 *
	 * @param price the price of this item
	 */
	@Override
	public void setPrice(double price) {
		model.setPrice(price);
	}

	/**
	 * Sets the primary key of this item.
	 *
	 * @param primaryKey the primary key of this item
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the profile ID of this item.
	 *
	 * @param profileId the profile ID of this item
	 */
	@Override
	public void setProfileId(long profileId) {
		model.setProfileId(profileId);
	}

	/**
	 * Sets the qty of this item.
	 *
	 * @param qty the qty of this item
	 */
	@Override
	public void setQty(int qty) {
		model.setQty(qty);
	}

	/**
	 * Sets the user ID of this item.
	 *
	 * @param userId the user ID of this item
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this item.
	 *
	 * @param userName the user name of this item
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this item.
	 *
	 * @param userUuid the user uuid of this item
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this item.
	 *
	 * @param uuid the uuid of this item
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the width of this item.
	 *
	 * @param width the width of this item
	 */
	@Override
	public void setWidth(double width) {
		model.setWidth(width);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected ItemWrapper wrap(Item item) {
		return new ItemWrapper(item);
	}

}