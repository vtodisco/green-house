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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link it.vmt.gh.sb.service.http.ItemServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ItemSoap implements Serializable {

	public static ItemSoap toSoapModel(Item model) {
		ItemSoap soapModel = new ItemSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setItemId(model.getItemId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDisplayDate(model.getDisplayDate());
		soapModel.setEnvironmentId(model.getEnvironmentId());
		soapModel.setProfileId(model.getProfileId());
		soapModel.setCarpentryId(model.getCarpentryId());
		soapModel.setHandleId(model.getHandleId());
		soapModel.setColorId(model.getColorId());
		soapModel.setCartId(model.getCartId());
		soapModel.setQty(model.getQty());
		soapModel.setPrice(model.getPrice());
		soapModel.setWidth(model.getWidth());
		soapModel.setHeight(model.getHeight());
		soapModel.setColor(model.getColor());

		return soapModel;
	}

	public static ItemSoap[] toSoapModels(Item[] models) {
		ItemSoap[] soapModels = new ItemSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ItemSoap[][] toSoapModels(Item[][] models) {
		ItemSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ItemSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ItemSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ItemSoap[] toSoapModels(List<Item> models) {
		List<ItemSoap> soapModels = new ArrayList<ItemSoap>(models.size());

		for (Item model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ItemSoap[soapModels.size()]);
	}

	public ItemSoap() {
	}

	public long getPrimaryKey() {
		return _itemId;
	}

	public void setPrimaryKey(long pk) {
		setItemId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getItemId() {
		return _itemId;
	}

	public void setItemId(long itemId) {
		_itemId = itemId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public Date getDisplayDate() {
		return _displayDate;
	}

	public void setDisplayDate(Date displayDate) {
		_displayDate = displayDate;
	}

	public long getEnvironmentId() {
		return _environmentId;
	}

	public void setEnvironmentId(long environmentId) {
		_environmentId = environmentId;
	}

	public long getProfileId() {
		return _profileId;
	}

	public void setProfileId(long profileId) {
		_profileId = profileId;
	}

	public long getCarpentryId() {
		return _carpentryId;
	}

	public void setCarpentryId(long carpentryId) {
		_carpentryId = carpentryId;
	}

	public long getHandleId() {
		return _handleId;
	}

	public void setHandleId(long handleId) {
		_handleId = handleId;
	}

	public long getColorId() {
		return _colorId;
	}

	public void setColorId(long colorId) {
		_colorId = colorId;
	}

	public long getCartId() {
		return _cartId;
	}

	public void setCartId(long cartId) {
		_cartId = cartId;
	}

	public int getQty() {
		return _qty;
	}

	public void setQty(int qty) {
		_qty = qty;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}

	public double getWidth() {
		return _width;
	}

	public void setWidth(double width) {
		_width = width;
	}

	public double getHeight() {
		return _height;
	}

	public void setHeight(double height) {
		_height = height;
	}

	public String getColor() {
		return _color;
	}

	public void setColor(String color) {
		_color = color;
	}

	private String _uuid;
	private long _itemId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private Date _displayDate;
	private long _environmentId;
	private long _profileId;
	private long _carpentryId;
	private long _handleId;
	private long _colorId;
	private long _cartId;
	private int _qty;
	private double _price;
	private double _width;
	private double _height;
	private String _color;

}