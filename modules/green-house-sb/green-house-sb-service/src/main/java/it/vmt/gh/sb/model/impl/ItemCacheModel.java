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

package it.vmt.gh.sb.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import it.vmt.gh.sb.model.Item;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Item in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ItemCacheModel implements CacheModel<Item>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ItemCacheModel)) {
			return false;
		}

		ItemCacheModel itemCacheModel = (ItemCacheModel)object;

		if (itemId == itemCacheModel.itemId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, itemId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", itemId=");
		sb.append(itemId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", displayDate=");
		sb.append(displayDate);
		sb.append(", environmentId=");
		sb.append(environmentId);
		sb.append(", profileId=");
		sb.append(profileId);
		sb.append(", carpentryId=");
		sb.append(carpentryId);
		sb.append(", handleId=");
		sb.append(handleId);
		sb.append(", colorId=");
		sb.append(colorId);
		sb.append(", cartId=");
		sb.append(cartId);
		sb.append(", qty=");
		sb.append(qty);
		sb.append(", price=");
		sb.append(price);
		sb.append(", width=");
		sb.append(width);
		sb.append(", height=");
		sb.append(height);
		sb.append(", color=");
		sb.append(color);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Item toEntityModel() {
		ItemImpl itemImpl = new ItemImpl();

		if (uuid == null) {
			itemImpl.setUuid("");
		}
		else {
			itemImpl.setUuid(uuid);
		}

		itemImpl.setItemId(itemId);
		itemImpl.setGroupId(groupId);
		itemImpl.setCompanyId(companyId);
		itemImpl.setUserId(userId);

		if (userName == null) {
			itemImpl.setUserName("");
		}
		else {
			itemImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			itemImpl.setCreateDate(null);
		}
		else {
			itemImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			itemImpl.setModifiedDate(null);
		}
		else {
			itemImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (displayDate == Long.MIN_VALUE) {
			itemImpl.setDisplayDate(null);
		}
		else {
			itemImpl.setDisplayDate(new Date(displayDate));
		}

		itemImpl.setEnvironmentId(environmentId);
		itemImpl.setProfileId(profileId);
		itemImpl.setCarpentryId(carpentryId);
		itemImpl.setHandleId(handleId);
		itemImpl.setColorId(colorId);
		itemImpl.setCartId(cartId);
		itemImpl.setQty(qty);
		itemImpl.setPrice(price);
		itemImpl.setWidth(width);
		itemImpl.setHeight(height);

		if (color == null) {
			itemImpl.setColor("");
		}
		else {
			itemImpl.setColor(color);
		}

		itemImpl.resetOriginalValues();

		return itemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		itemId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		displayDate = objectInput.readLong();

		environmentId = objectInput.readLong();

		profileId = objectInput.readLong();

		carpentryId = objectInput.readLong();

		handleId = objectInput.readLong();

		colorId = objectInput.readLong();

		cartId = objectInput.readLong();

		qty = objectInput.readInt();

		price = objectInput.readDouble();

		width = objectInput.readDouble();

		height = objectInput.readDouble();
		color = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(itemId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(displayDate);

		objectOutput.writeLong(environmentId);

		objectOutput.writeLong(profileId);

		objectOutput.writeLong(carpentryId);

		objectOutput.writeLong(handleId);

		objectOutput.writeLong(colorId);

		objectOutput.writeLong(cartId);

		objectOutput.writeInt(qty);

		objectOutput.writeDouble(price);

		objectOutput.writeDouble(width);

		objectOutput.writeDouble(height);

		if (color == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(color);
		}
	}

	public String uuid;
	public long itemId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long displayDate;
	public long environmentId;
	public long profileId;
	public long carpentryId;
	public long handleId;
	public long colorId;
	public long cartId;
	public int qty;
	public double price;
	public double width;
	public double height;
	public String color;

}