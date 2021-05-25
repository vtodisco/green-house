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
 * This class is used by SOAP remote services, specifically {@link it.vmt.gh.sb.service.http.CarpentryServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class CarpentrySoap implements Serializable {

	public static CarpentrySoap toSoapModel(Carpentry model) {
		CarpentrySoap soapModel = new CarpentrySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCarpentryId(model.getCarpentryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCode(model.getCode());
		soapModel.setName(model.getName());
		soapModel.setImg(model.getImg());
		soapModel.setPrice(model.getPrice());
		soapModel.setShutters(model.getShutters());
		soapModel.setSpecificationId(model.getSpecificationId());

		return soapModel;
	}

	public static CarpentrySoap[] toSoapModels(Carpentry[] models) {
		CarpentrySoap[] soapModels = new CarpentrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CarpentrySoap[][] toSoapModels(Carpentry[][] models) {
		CarpentrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CarpentrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new CarpentrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CarpentrySoap[] toSoapModels(List<Carpentry> models) {
		List<CarpentrySoap> soapModels = new ArrayList<CarpentrySoap>(
			models.size());

		for (Carpentry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CarpentrySoap[soapModels.size()]);
	}

	public CarpentrySoap() {
	}

	public long getPrimaryKey() {
		return _carpentryId;
	}

	public void setPrimaryKey(long pk) {
		setCarpentryId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCarpentryId() {
		return _carpentryId;
	}

	public void setCarpentryId(long carpentryId) {
		_carpentryId = carpentryId;
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

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getImg() {
		return _img;
	}

	public void setImg(String img) {
		_img = img;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}

	public int getShutters() {
		return _shutters;
	}

	public void setShutters(int shutters) {
		_shutters = shutters;
	}

	public long getSpecificationId() {
		return _specificationId;
	}

	public void setSpecificationId(long specificationId) {
		_specificationId = specificationId;
	}

	private String _uuid;
	private long _carpentryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _code;
	private String _name;
	private String _img;
	private double _price;
	private int _shutters;
	private long _specificationId;

}