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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Profile_Carpentry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Profile_Carpentry
 * @generated
 */
public class Profile_CarpentryWrapper
	extends BaseModelWrapper<Profile_Carpentry>
	implements ModelWrapper<Profile_Carpentry>, Profile_Carpentry {

	public Profile_CarpentryWrapper(Profile_Carpentry profile_Carpentry) {
		super(profile_Carpentry);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("profileId", getProfileId());
		attributes.put("carpentryId", getCarpentryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long profileId = (Long)attributes.get("profileId");

		if (profileId != null) {
			setProfileId(profileId);
		}

		Long carpentryId = (Long)attributes.get("carpentryId");

		if (carpentryId != null) {
			setCarpentryId(carpentryId);
		}
	}

	/**
	 * Returns the carpentry ID of this profile_ carpentry.
	 *
	 * @return the carpentry ID of this profile_ carpentry
	 */
	@Override
	public long getCarpentryId() {
		return model.getCarpentryId();
	}

	/**
	 * Returns the primary key of this profile_ carpentry.
	 *
	 * @return the primary key of this profile_ carpentry
	 */
	@Override
	public it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
		getPrimaryKey() {

		return model.getPrimaryKey();
	}

	/**
	 * Returns the profile ID of this profile_ carpentry.
	 *
	 * @return the profile ID of this profile_ carpentry
	 */
	@Override
	public long getProfileId() {
		return model.getProfileId();
	}

	/**
	 * Returns the uuid of this profile_ carpentry.
	 *
	 * @return the uuid of this profile_ carpentry
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the carpentry ID of this profile_ carpentry.
	 *
	 * @param carpentryId the carpentry ID of this profile_ carpentry
	 */
	@Override
	public void setCarpentryId(long carpentryId) {
		model.setCarpentryId(carpentryId);
	}

	/**
	 * Sets the primary key of this profile_ carpentry.
	 *
	 * @param primaryKey the primary key of this profile_ carpentry
	 */
	@Override
	public void setPrimaryKey(
		it.vmt.gh.sb.service.persistence.Profile_CarpentryPK primaryKey) {

		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the profile ID of this profile_ carpentry.
	 *
	 * @param profileId the profile ID of this profile_ carpentry
	 */
	@Override
	public void setProfileId(long profileId) {
		model.setProfileId(profileId);
	}

	/**
	 * Sets the uuid of this profile_ carpentry.
	 *
	 * @param uuid the uuid of this profile_ carpentry
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected Profile_CarpentryWrapper wrap(
		Profile_Carpentry profile_Carpentry) {

		return new Profile_CarpentryWrapper(profile_Carpentry);
	}

}