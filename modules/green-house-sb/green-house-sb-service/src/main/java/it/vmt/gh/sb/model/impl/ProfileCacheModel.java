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

import it.vmt.gh.sb.model.Profile;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Profile in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ProfileCacheModel implements CacheModel<Profile>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProfileCacheModel)) {
			return false;
		}

		ProfileCacheModel profileCacheModel = (ProfileCacheModel)object;

		if (profileId == profileCacheModel.profileId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, profileId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", profileId=");
		sb.append(profileId);
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
	public Profile toEntityModel() {
		ProfileImpl profileImpl = new ProfileImpl();

		if (uuid == null) {
			profileImpl.setUuid("");
		}
		else {
			profileImpl.setUuid(uuid);
		}

		profileImpl.setProfileId(profileId);
		profileImpl.setGroupId(groupId);
		profileImpl.setCompanyId(companyId);
		profileImpl.setUserId(userId);

		if (userName == null) {
			profileImpl.setUserName("");
		}
		else {
			profileImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			profileImpl.setCreateDate(null);
		}
		else {
			profileImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			profileImpl.setModifiedDate(null);
		}
		else {
			profileImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (code == null) {
			profileImpl.setCode("");
		}
		else {
			profileImpl.setCode(code);
		}

		if (name == null) {
			profileImpl.setName("");
		}
		else {
			profileImpl.setName(name);
		}

		profileImpl.setPrice(price);

		if (img == null) {
			profileImpl.setImg("");
		}
		else {
			profileImpl.setImg(img);
		}

		profileImpl.resetOriginalValues();

		return profileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		profileId = objectInput.readLong();

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

		objectOutput.writeLong(profileId);

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
	public long profileId;
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