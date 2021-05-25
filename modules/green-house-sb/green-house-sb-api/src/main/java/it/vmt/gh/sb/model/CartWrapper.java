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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Cart}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Cart
 * @generated
 */
public class CartWrapper
	extends BaseModelWrapper<Cart> implements Cart, ModelWrapper<Cart> {

	public CartWrapper(Cart cart) {
		super(cart);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("cartId", getCartId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("displayDate", getDisplayDate());
		attributes.put("total", getTotal());
		attributes.put("invoiceDiscount", isInvoiceDiscount());
		attributes.put("vat", getVat());
		attributes.put("totalWithVat", getTotalWithVat());
		attributes.put("discountedTotal", getDiscountedTotal());
		attributes.put("offerId", getOfferId());
		attributes.put("invoiceId", getInvoiceId());
		attributes.put("installation", isInstallation());
		attributes.put("installationTotal", getInstallationTotal());
		attributes.put("delivery", isDelivery());
		attributes.put("deliveryTotal", getDeliveryTotal());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long cartId = (Long)attributes.get("cartId");

		if (cartId != null) {
			setCartId(cartId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date displayDate = (Date)attributes.get("displayDate");

		if (displayDate != null) {
			setDisplayDate(displayDate);
		}

		Double total = (Double)attributes.get("total");

		if (total != null) {
			setTotal(total);
		}

		Boolean invoiceDiscount = (Boolean)attributes.get("invoiceDiscount");

		if (invoiceDiscount != null) {
			setInvoiceDiscount(invoiceDiscount);
		}

		Double vat = (Double)attributes.get("vat");

		if (vat != null) {
			setVat(vat);
		}

		Double totalWithVat = (Double)attributes.get("totalWithVat");

		if (totalWithVat != null) {
			setTotalWithVat(totalWithVat);
		}

		Double discountedTotal = (Double)attributes.get("discountedTotal");

		if (discountedTotal != null) {
			setDiscountedTotal(discountedTotal);
		}

		Long offerId = (Long)attributes.get("offerId");

		if (offerId != null) {
			setOfferId(offerId);
		}

		Long invoiceId = (Long)attributes.get("invoiceId");

		if (invoiceId != null) {
			setInvoiceId(invoiceId);
		}

		Boolean installation = (Boolean)attributes.get("installation");

		if (installation != null) {
			setInstallation(installation);
		}

		Double installationTotal = (Double)attributes.get("installationTotal");

		if (installationTotal != null) {
			setInstallationTotal(installationTotal);
		}

		Boolean delivery = (Boolean)attributes.get("delivery");

		if (delivery != null) {
			setDelivery(delivery);
		}

		Double deliveryTotal = (Double)attributes.get("deliveryTotal");

		if (deliveryTotal != null) {
			setDeliveryTotal(deliveryTotal);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	 * Returns the cart ID of this cart.
	 *
	 * @return the cart ID of this cart
	 */
	@Override
	public long getCartId() {
		return model.getCartId();
	}

	@Override
	public com.liferay.portal.kernel.model.User getCartUser() {
		return model.getCartUser();
	}

	/**
	 * Returns the company ID of this cart.
	 *
	 * @return the company ID of this cart
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this cart.
	 *
	 * @return the create date of this cart
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the delivery of this cart.
	 *
	 * @return the delivery of this cart
	 */
	@Override
	public boolean getDelivery() {
		return model.getDelivery();
	}

	/**
	 * Returns the delivery total of this cart.
	 *
	 * @return the delivery total of this cart
	 */
	@Override
	public double getDeliveryTotal() {
		return model.getDeliveryTotal();
	}

	/**
	 * Returns the discounted total of this cart.
	 *
	 * @return the discounted total of this cart
	 */
	@Override
	public double getDiscountedTotal() {
		return model.getDiscountedTotal();
	}

	/**
	 * Returns the display date of this cart.
	 *
	 * @return the display date of this cart
	 */
	@Override
	public Date getDisplayDate() {
		return model.getDisplayDate();
	}

	/**
	 * Returns the group ID of this cart.
	 *
	 * @return the group ID of this cart
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the installation of this cart.
	 *
	 * @return the installation of this cart
	 */
	@Override
	public boolean getInstallation() {
		return model.getInstallation();
	}

	/**
	 * Returns the installation total of this cart.
	 *
	 * @return the installation total of this cart
	 */
	@Override
	public double getInstallationTotal() {
		return model.getInstallationTotal();
	}

	/**
	 * Returns the invoice discount of this cart.
	 *
	 * @return the invoice discount of this cart
	 */
	@Override
	public boolean getInvoiceDiscount() {
		return model.getInvoiceDiscount();
	}

	/**
	 * Returns the invoice ID of this cart.
	 *
	 * @return the invoice ID of this cart
	 */
	@Override
	public long getInvoiceId() {
		return model.getInvoiceId();
	}

	/**
	 * Returns the modified date of this cart.
	 *
	 * @return the modified date of this cart
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the offer ID of this cart.
	 *
	 * @return the offer ID of this cart
	 */
	@Override
	public long getOfferId() {
		return model.getOfferId();
	}

	@Override
	public String getOfferUrl() {
		return model.getOfferUrl();
	}

	/**
	 * Returns the primary key of this cart.
	 *
	 * @return the primary key of this cart
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this cart.
	 *
	 * @return the status of this cart
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the total of this cart.
	 *
	 * @return the total of this cart
	 */
	@Override
	public double getTotal() {
		return model.getTotal();
	}

	/**
	 * Returns the total with vat of this cart.
	 *
	 * @return the total with vat of this cart
	 */
	@Override
	public double getTotalWithVat() {
		return model.getTotalWithVat();
	}

	/**
	 * Returns the user ID of this cart.
	 *
	 * @return the user ID of this cart
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cart.
	 *
	 * @return the user name of this cart
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cart.
	 *
	 * @return the user uuid of this cart
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this cart.
	 *
	 * @return the uuid of this cart
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the vat of this cart.
	 *
	 * @return the vat of this cart
	 */
	@Override
	public double getVat() {
		return model.getVat();
	}

	/**
	 * Returns <code>true</code> if this cart is delivery.
	 *
	 * @return <code>true</code> if this cart is delivery; <code>false</code> otherwise
	 */
	@Override
	public boolean isDelivery() {
		return model.isDelivery();
	}

	/**
	 * Returns <code>true</code> if this cart is installation.
	 *
	 * @return <code>true</code> if this cart is installation; <code>false</code> otherwise
	 */
	@Override
	public boolean isInstallation() {
		return model.isInstallation();
	}

	/**
	 * Returns <code>true</code> if this cart is invoice discount.
	 *
	 * @return <code>true</code> if this cart is invoice discount; <code>false</code> otherwise
	 */
	@Override
	public boolean isInvoiceDiscount() {
		return model.isInvoiceDiscount();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the cart ID of this cart.
	 *
	 * @param cartId the cart ID of this cart
	 */
	@Override
	public void setCartId(long cartId) {
		model.setCartId(cartId);
	}

	/**
	 * Sets the company ID of this cart.
	 *
	 * @param companyId the company ID of this cart
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this cart.
	 *
	 * @param createDate the create date of this cart
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets whether this cart is delivery.
	 *
	 * @param delivery the delivery of this cart
	 */
	@Override
	public void setDelivery(boolean delivery) {
		model.setDelivery(delivery);
	}

	/**
	 * Sets the delivery total of this cart.
	 *
	 * @param deliveryTotal the delivery total of this cart
	 */
	@Override
	public void setDeliveryTotal(double deliveryTotal) {
		model.setDeliveryTotal(deliveryTotal);
	}

	/**
	 * Sets the discounted total of this cart.
	 *
	 * @param discountedTotal the discounted total of this cart
	 */
	@Override
	public void setDiscountedTotal(double discountedTotal) {
		model.setDiscountedTotal(discountedTotal);
	}

	/**
	 * Sets the display date of this cart.
	 *
	 * @param displayDate the display date of this cart
	 */
	@Override
	public void setDisplayDate(Date displayDate) {
		model.setDisplayDate(displayDate);
	}

	/**
	 * Sets the group ID of this cart.
	 *
	 * @param groupId the group ID of this cart
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets whether this cart is installation.
	 *
	 * @param installation the installation of this cart
	 */
	@Override
	public void setInstallation(boolean installation) {
		model.setInstallation(installation);
	}

	/**
	 * Sets the installation total of this cart.
	 *
	 * @param installationTotal the installation total of this cart
	 */
	@Override
	public void setInstallationTotal(double installationTotal) {
		model.setInstallationTotal(installationTotal);
	}

	/**
	 * Sets whether this cart is invoice discount.
	 *
	 * @param invoiceDiscount the invoice discount of this cart
	 */
	@Override
	public void setInvoiceDiscount(boolean invoiceDiscount) {
		model.setInvoiceDiscount(invoiceDiscount);
	}

	/**
	 * Sets the invoice ID of this cart.
	 *
	 * @param invoiceId the invoice ID of this cart
	 */
	@Override
	public void setInvoiceId(long invoiceId) {
		model.setInvoiceId(invoiceId);
	}

	/**
	 * Sets the modified date of this cart.
	 *
	 * @param modifiedDate the modified date of this cart
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the offer ID of this cart.
	 *
	 * @param offerId the offer ID of this cart
	 */
	@Override
	public void setOfferId(long offerId) {
		model.setOfferId(offerId);
	}

	/**
	 * Sets the primary key of this cart.
	 *
	 * @param primaryKey the primary key of this cart
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this cart.
	 *
	 * @param status the status of this cart
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the total of this cart.
	 *
	 * @param total the total of this cart
	 */
	@Override
	public void setTotal(double total) {
		model.setTotal(total);
	}

	/**
	 * Sets the total with vat of this cart.
	 *
	 * @param totalWithVat the total with vat of this cart
	 */
	@Override
	public void setTotalWithVat(double totalWithVat) {
		model.setTotalWithVat(totalWithVat);
	}

	/**
	 * Sets the user ID of this cart.
	 *
	 * @param userId the user ID of this cart
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cart.
	 *
	 * @param userName the user name of this cart
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cart.
	 *
	 * @param userUuid the user uuid of this cart
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this cart.
	 *
	 * @param uuid the uuid of this cart
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the vat of this cart.
	 *
	 * @param vat the vat of this cart
	 */
	@Override
	public void setVat(double vat) {
		model.setVat(vat);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected CartWrapper wrap(Cart cart) {
		return new CartWrapper(cart);
	}

}