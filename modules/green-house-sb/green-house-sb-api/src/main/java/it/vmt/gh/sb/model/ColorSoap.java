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
 * This class is used by SOAP remote services, specifically {@link it.vmt.gh.sb.service.http.ColorServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ColorSoap implements Serializable {

	public static ColorSoap toSoapModel(Color model) {
		ColorSoap soapModel = new ColorSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setColorId(model.getColorId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setCode(model.getCode());
		soapModel.setImg(model.getImg());
		soapModel.setCharge(model.getCharge());

		return soapModel;
	}

	public static ColorSoap[] toSoapModels(Color[] models) {
		ColorSoap[] soapModels = new ColorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ColorSoap[][] toSoapModels(Color[][] models) {
		ColorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ColorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ColorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ColorSoap[] toSoapModels(List<Color> models) {
		List<ColorSoap> soapModels = new ArrayList<ColorSoap>(models.size());

		for (Color model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ColorSoap[soapModels.size()]);
	}

	public ColorSoap() {
	}

	public long getPrimaryKey() {
		return _colorId;
	}

	public void setPrimaryKey(long pk) {
		setColorId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getColorId() {
		return _colorId;
	}

	public void setColorId(long colorId) {
		_colorId = colorId;
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getImg() {
		return _img;
	}

	public void setImg(String img) {
		_img = img;
	}

	public int getCharge() {
		return _charge;
	}

	public void setCharge(int charge) {
		_charge = charge;
	}

	private String _uuid;
	private long _colorId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _code;
	private String _img;
	private int _charge;

}