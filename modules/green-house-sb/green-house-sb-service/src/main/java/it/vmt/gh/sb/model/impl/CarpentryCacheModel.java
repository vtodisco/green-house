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

import it.vmt.gh.sb.model.Carpentry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Carpentry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CarpentryCacheModel
	implements CacheModel<Carpentry>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CarpentryCacheModel)) {
			return false;
		}

		CarpentryCacheModel carpentryCacheModel = (CarpentryCacheModel)object;

		if (carpentryId == carpentryCacheModel.carpentryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, carpentryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", carpentryId=");
		sb.append(carpentryId);
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
		sb.append(", img=");
		sb.append(img);
		sb.append(", price=");
		sb.append(price);
		sb.append(", shutters=");
		sb.append(shutters);
		sb.append(", specificationId=");
		sb.append(specificationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Carpentry toEntityModel() {
		CarpentryImpl carpentryImpl = new CarpentryImpl();

		if (uuid == null) {
			carpentryImpl.setUuid("");
		}
		else {
			carpentryImpl.setUuid(uuid);
		}

		carpentryImpl.setCarpentryId(carpentryId);
		carpentryImpl.setGroupId(groupId);
		carpentryImpl.setCompanyId(companyId);
		carpentryImpl.setUserId(userId);

		if (userName == null) {
			carpentryImpl.setUserName("");
		}
		else {
			carpentryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			carpentryImpl.setCreateDate(null);
		}
		else {
			carpentryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			carpentryImpl.setModifiedDate(null);
		}
		else {
			carpentryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (code == null) {
			carpentryImpl.setCode("");
		}
		else {
			carpentryImpl.setCode(code);
		}

		if (name == null) {
			carpentryImpl.setName("");
		}
		else {
			carpentryImpl.setName(name);
		}

		if (img == null) {
			carpentryImpl.setImg("");
		}
		else {
			carpentryImpl.setImg(img);
		}

		carpentryImpl.setPrice(price);
		carpentryImpl.setShutters(shutters);
		carpentryImpl.setSpecificationId(specificationId);

		carpentryImpl.resetOriginalValues();

		return carpentryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		carpentryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		code = objectInput.readUTF();
		name = objectInput.readUTF();
		img = objectInput.readUTF();

		price = objectInput.readDouble();

		shutters = objectInput.readInt();

		specificationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(carpentryId);

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

		if (img == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(img);
		}

		objectOutput.writeDouble(price);

		objectOutput.writeInt(shutters);

		objectOutput.writeLong(specificationId);
	}

	public String uuid;
	public long carpentryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String code;
	public String name;
	public String img;
	public double price;
	public int shutters;
	public long specificationId;

}