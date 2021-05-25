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

package it.vmt.gh.sb.service.persistence;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Profile_CarpentryPK
	implements Comparable<Profile_CarpentryPK>, Serializable {

	public long profileId;
	public long carpentryId;

	public Profile_CarpentryPK() {
	}

	public Profile_CarpentryPK(long profileId, long carpentryId) {
		this.profileId = profileId;
		this.carpentryId = carpentryId;
	}

	public long getProfileId() {
		return profileId;
	}

	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}

	public long getCarpentryId() {
		return carpentryId;
	}

	public void setCarpentryId(long carpentryId) {
		this.carpentryId = carpentryId;
	}

	@Override
	public int compareTo(Profile_CarpentryPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (profileId < pk.profileId) {
			value = -1;
		}
		else if (profileId > pk.profileId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (carpentryId < pk.carpentryId) {
			value = -1;
		}
		else if (carpentryId > pk.carpentryId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Profile_CarpentryPK)) {
			return false;
		}

		Profile_CarpentryPK pk = (Profile_CarpentryPK)object;

		if ((profileId == pk.profileId) && (carpentryId == pk.carpentryId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, profileId);
		hashCode = HashUtil.hash(hashCode, carpentryId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("profileId=");

		sb.append(profileId);
		sb.append(", carpentryId=");

		sb.append(carpentryId);

		sb.append("}");

		return sb.toString();
	}

}