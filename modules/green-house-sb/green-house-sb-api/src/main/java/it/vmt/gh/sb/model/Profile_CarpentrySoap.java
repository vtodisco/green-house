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

import it.vmt.gh.sb.service.persistence.Profile_CarpentryPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link it.vmt.gh.sb.service.http.Profile_CarpentryServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class Profile_CarpentrySoap implements Serializable {

	public static Profile_CarpentrySoap toSoapModel(Profile_Carpentry model) {
		Profile_CarpentrySoap soapModel = new Profile_CarpentrySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setProfileId(model.getProfileId());
		soapModel.setCarpentryId(model.getCarpentryId());

		return soapModel;
	}

	public static Profile_CarpentrySoap[] toSoapModels(
		Profile_Carpentry[] models) {

		Profile_CarpentrySoap[] soapModels =
			new Profile_CarpentrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Profile_CarpentrySoap[][] toSoapModels(
		Profile_Carpentry[][] models) {

		Profile_CarpentrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new Profile_CarpentrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new Profile_CarpentrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Profile_CarpentrySoap[] toSoapModels(
		List<Profile_Carpentry> models) {

		List<Profile_CarpentrySoap> soapModels =
			new ArrayList<Profile_CarpentrySoap>(models.size());

		for (Profile_Carpentry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Profile_CarpentrySoap[soapModels.size()]);
	}

	public Profile_CarpentrySoap() {
	}

	public Profile_CarpentryPK getPrimaryKey() {
		return new Profile_CarpentryPK(_profileId, _carpentryId);
	}

	public void setPrimaryKey(Profile_CarpentryPK pk) {
		setProfileId(pk.profileId);
		setCarpentryId(pk.carpentryId);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
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

	private String _uuid;
	private long _profileId;
	private long _carpentryId;

}