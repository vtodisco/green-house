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

import it.vmt.gh.sb.model.Profile_Carpentry;
import it.vmt.gh.sb.service.persistence.Profile_CarpentryPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Profile_Carpentry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Profile_CarpentryCacheModel
	implements CacheModel<Profile_Carpentry>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Profile_CarpentryCacheModel)) {
			return false;
		}

		Profile_CarpentryCacheModel profile_CarpentryCacheModel =
			(Profile_CarpentryCacheModel)object;

		if (profile_CarpentryPK.equals(
				profile_CarpentryCacheModel.profile_CarpentryPK)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, profile_CarpentryPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", profileId=");
		sb.append(profileId);
		sb.append(", carpentryId=");
		sb.append(carpentryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Profile_Carpentry toEntityModel() {
		Profile_CarpentryImpl profile_CarpentryImpl =
			new Profile_CarpentryImpl();

		if (uuid == null) {
			profile_CarpentryImpl.setUuid("");
		}
		else {
			profile_CarpentryImpl.setUuid(uuid);
		}

		profile_CarpentryImpl.setProfileId(profileId);
		profile_CarpentryImpl.setCarpentryId(carpentryId);

		profile_CarpentryImpl.resetOriginalValues();

		return profile_CarpentryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		profileId = objectInput.readLong();

		carpentryId = objectInput.readLong();

		profile_CarpentryPK = new Profile_CarpentryPK(profileId, carpentryId);
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

		objectOutput.writeLong(carpentryId);
	}

	public String uuid;
	public long profileId;
	public long carpentryId;
	public transient Profile_CarpentryPK profile_CarpentryPK;

}