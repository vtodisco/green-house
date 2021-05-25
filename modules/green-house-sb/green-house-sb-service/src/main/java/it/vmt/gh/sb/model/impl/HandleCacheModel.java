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

import it.vmt.gh.sb.model.Handle;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Handle in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HandleCacheModel implements CacheModel<Handle>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HandleCacheModel)) {
			return false;
		}

		HandleCacheModel handleCacheModel = (HandleCacheModel)object;

		if (handleId == handleCacheModel.handleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, handleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", handleId=");
		sb.append(handleId);
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
		sb.append(", code=");
		sb.append(code);
		sb.append(", name=");
		sb.append(name);
		sb.append(", price=");
		sb.append(price);
		sb.append(", img=");
		sb.append(img);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Handle toEntityModel() {
		HandleImpl handleImpl = new HandleImpl();

		if (uuid == null) {
			handleImpl.setUuid("");
		}
		else {
			handleImpl.setUuid(uuid);
		}

		handleImpl.setHandleId(handleId);
		handleImpl.setGroupId(groupId);
		handleImpl.setCompanyId(companyId);
		handleImpl.setUserId(userId);

		if (userName == null) {
			handleImpl.setUserName("");
		}
		else {
			handleImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			handleImpl.setCreateDate(null);
		}
		else {
			handleImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			handleImpl.setModifiedDate(null);
		}
		else {
			handleImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (code == null) {
			handleImpl.setCode("");
		}
		else {
			handleImpl.setCode(code);
		}

		if (name == null) {
			handleImpl.setName("");
		}
		else {
			handleImpl.setName(name);
		}

		handleImpl.setPrice(price);

		if (img == null) {
			handleImpl.setImg("");
		}
		else {
			handleImpl.setImg(img);
		}

		handleImpl.resetOriginalValues();

		return handleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		handleId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		code = objectInput.readUTF();
		name = objectInput.readUTF();

		price = objectInput.readDouble();
		img = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(handleId);

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

		if (code == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeDouble(price);

		if (img == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(img);
		}
	}

	public String uuid;
	public long handleId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String code;
	public String name;
	public double price;
	public String img;

}