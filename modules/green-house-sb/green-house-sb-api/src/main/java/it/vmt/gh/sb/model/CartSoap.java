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
 * This class is used by SOAP remote services, specifically {@link it.vmt.gh.sb.service.http.CartServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class CartSoap implements Serializable {

	public static CartSoap toSoapModel(Cart model) {
		CartSoap soapModel = new CartSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCartId(model.getCartId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDisplayDate(model.getDisplayDate());
		soapModel.setTotal(model.getTotal());
		soapModel.setInvoiceDiscount(model.isInvoiceDiscount());
		soapModel.setVat(model.getVat());
		soapModel.setTotalWithVat(model.getTotalWithVat());
		soapModel.setDiscountedTotal(model.getDiscountedTotal());
		soapModel.setOfferId(model.getOfferId());
		soapModel.setInvoiceId(model.getInvoiceId());
		soapModel.setInstallation(model.isInstallation());
		soapModel.setInstallationTotal(model.getInstallationTotal());
		soapModel.setDelivery(model.isDelivery());
		soapModel.setDeliveryTotal(model.getDeliveryTotal());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static CartSoap[] toSoapModels(Cart[] models) {
		CartSoap[] soapModels = new CartSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CartSoap[][] toSoapModels(Cart[][] models) {
		CartSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CartSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CartSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CartSoap[] toSoapModels(List<Cart> models) {
		List<CartSoap> soapModels = new ArrayList<CartSoap>(models.size());

		for (Cart model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CartSoap[soapModels.size()]);
	}

	public CartSoap() {
	}

	public long getPrimaryKey() {
		return _cartId;
	}

	public void setPrimaryKey(long pk) {
		setCartId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCartId() {
		return _cartId;
	}

	public void setCartId(long cartId) {
		_cartId = cartId;
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

	public Date getDisplayDate() {
		return _displayDate;
	}

	public void setDisplayDate(Date displayDate) {
		_displayDate = displayDate;
	}

	public double getTotal() {
		return _total;
	}

	public void setTotal(double total) {
		_total = total;
	}

	public boolean getInvoiceDiscount() {
		return _invoiceDiscount;
	}

	public boolean isInvoiceDiscount() {
		return _invoiceDiscount;
	}

	public void setInvoiceDiscount(boolean invoiceDiscount) {
		_invoiceDiscount = invoiceDiscount;
	}

	public double getVat() {
		return _vat;
	}

	public void setVat(double vat) {
		_vat = vat;
	}

	public double getTotalWithVat() {
		return _totalWithVat;
	}

	public void setTotalWithVat(double totalWithVat) {
		_totalWithVat = totalWithVat;
	}

	public double getDiscountedTotal() {
		return _discountedTotal;
	}

	public void setDiscountedTotal(double discountedTotal) {
		_discountedTotal = discountedTotal;
	}

	public long getOfferId() {
		return _offerId;
	}

	public void setOfferId(long offerId) {
		_offerId = offerId;
	}

	public long getInvoiceId() {
		return _invoiceId;
	}

	public void setInvoiceId(long invoiceId) {
		_invoiceId = invoiceId;
	}

	public boolean getInstallation() {
		return _installation;
	}

	public boolean isInstallation() {
		return _installation;
	}

	public void setInstallation(boolean installation) {
		_installation = installation;
	}

	public double getInstallationTotal() {
		return _installationTotal;
	}

	public void setInstallationTotal(double installationTotal) {
		_installationTotal = installationTotal;
	}

	public boolean getDelivery() {
		return _delivery;
	}

	public boolean isDelivery() {
		return _delivery;
	}

	public void setDelivery(boolean delivery) {
		_delivery = delivery;
	}

	public double getDeliveryTotal() {
		return _deliveryTotal;
	}

	public void setDeliveryTotal(double deliveryTotal) {
		_deliveryTotal = deliveryTotal;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private String _uuid;
	private long _cartId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private Date _displayDate;
	private double _total;
	private boolean _invoiceDiscount;
	private double _vat;
	private double _totalWithVat;
	private double _discountedTotal;
	private long _offerId;
	private long _invoiceId;
	private boolean _installation;
	private double _installationTotal;
	private boolean _delivery;
	private double _deliveryTotal;
	private int _status;

}