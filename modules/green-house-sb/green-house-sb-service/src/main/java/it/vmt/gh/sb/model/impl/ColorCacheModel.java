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

import it.vmt.gh.sb.model.Color;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Color in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ColorCacheModel implements CacheModel<Color>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ColorCacheModel)) {
			return false;
		}

		ColorCacheModel colorCacheModel = (ColorCacheModel)object;

		if (colorId == colorCacheModel.colorId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, colorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", colorId=");
		sb.append(colorId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", code=");
		sb.append(code);
		sb.append(", img=");
		sb.append(img);
		sb.append(", charge=");
		sb.append(charge);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Color toEntityModel() {
		ColorImpl colorImpl = new ColorImpl();

		if (uuid == null) {
			colorImpl.setUuid("");
		}
		else {
			colorImpl.setUuid(uuid);
		}

		colorImpl.setColorId(colorId);
		colorImpl.setGroupId(groupId);
		colorImpl.setCompanyId(companyId);
		colorImpl.setUserId(userId);

		if (userName == null) {
			colorImpl.setUserName("");
		}
		else {
			colorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			colorImpl.setCreateDate(null);
		}
		else {
			colorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			colorImpl.setModifiedDate(null);
		}
		else {
			colorImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			colorImpl.setName("");
		}
		else {
			colorImpl.setName(name);
		}

		if (code == null) {
			colorImpl.setCode("");
		}
		else {
			colorImpl.setCode(code);
		}

		if (img == null) {
			colorImpl.setImg("");
		}
		else {
			colorImpl.setImg(img);
		}

		colorImpl.setCharge(charge);

		colorImpl.resetOriginalValues();

		return colorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		colorId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		code = objectInput.readUTF();
		img = objectInput.readUTF();

		charge = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(colorId);

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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (code == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (img == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(img);
		}

		objectOutput.writeInt(charge);
	}

	public String uuid;
	public long colorId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String code;
	public String img;
	public int charge;

}