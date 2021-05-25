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

import it.vmt.gh.sb.model.Cart;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Cart in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CartCacheModel implements CacheModel<Cart>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CartCacheModel)) {
			return false;
		}

		CartCacheModel cartCacheModel = (CartCacheModel)object;

		if (cartId == cartCacheModel.cartId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cartId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", cartId=");
		sb.append(cartId);
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
		sb.append(", displayDate=");
		sb.append(displayDate);
		sb.append(", total=");
		sb.append(total);
		sb.append(", invoiceDiscount=");
		sb.append(invoiceDiscount);
		sb.append(", vat=");
		sb.append(vat);
		sb.append(", totalWithVat=");
		sb.append(totalWithVat);
		sb.append(", discountedTotal=");
		sb.append(discountedTotal);
		sb.append(", offerId=");
		sb.append(offerId);
		sb.append(", invoiceId=");
		sb.append(invoiceId);
		sb.append(", installation=");
		sb.append(installation);
		sb.append(", installationTotal=");
		sb.append(installationTotal);
		sb.append(", delivery=");
		sb.append(delivery);
		sb.append(", deliveryTotal=");
		sb.append(deliveryTotal);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Cart toEntityModel() {
		CartImpl cartImpl = new CartImpl();

		if (uuid == null) {
			cartImpl.setUuid("");
		}
		else {
			cartImpl.setUuid(uuid);
		}

		cartImpl.setCartId(cartId);
		cartImpl.setGroupId(groupId);
		cartImpl.setCompanyId(companyId);
		cartImpl.setUserId(userId);

		if (userName == null) {
			cartImpl.setUserName("");
		}
		else {
			cartImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cartImpl.setCreateDate(null);
		}
		else {
			cartImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cartImpl.setModifiedDate(null);
		}
		else {
			cartImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (displayDate == Long.MIN_VALUE) {
			cartImpl.setDisplayDate(null);
		}
		else {
			cartImpl.setDisplayDate(new Date(displayDate));
		}

		cartImpl.setTotal(total);
		cartImpl.setInvoiceDiscount(invoiceDiscount);
		cartImpl.setVat(vat);
		cartImpl.setTotalWithVat(totalWithVat);
		cartImpl.setDiscountedTotal(discountedTotal);
		cartImpl.setOfferId(offerId);
		cartImpl.setInvoiceId(invoiceId);
		cartImpl.setInstallation(installation);
		cartImpl.setInstallationTotal(installationTotal);
		cartImpl.setDelivery(delivery);
		cartImpl.setDeliveryTotal(deliveryTotal);
		cartImpl.setStatus(status);

		cartImpl.resetOriginalValues();

		return cartImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		cartId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		displayDate = objectInput.readLong();

		total = objectInput.readDouble();

		invoiceDiscount = objectInput.readBoolean();

		vat = objectInput.readDouble();

		totalWithVat = objectInput.readDouble();

		discountedTotal = objectInput.readDouble();

		offerId = objectInput.readLong();

		invoiceId = objectInput.readLong();

		installation = objectInput.readBoolean();

		installationTotal = objectInput.readDouble();

		delivery = objectInput.readBoolean();

		deliveryTotal = objectInput.readDouble();

		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(cartId);

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
		objectOutput.writeLong(displayDate);

		objectOutput.writeDouble(total);

		objectOutput.writeBoolean(invoiceDiscount);

		objectOutput.writeDouble(vat);

		objectOutput.writeDouble(totalWithVat);

		objectOutput.writeDouble(discountedTotal);

		objectOutput.writeLong(offerId);

		objectOutput.writeLong(invoiceId);

		objectOutput.writeBoolean(installation);

		objectOutput.writeDouble(installationTotal);

		objectOutput.writeBoolean(delivery);

		objectOutput.writeDouble(deliveryTotal);

		objectOutput.writeInt(status);
	}

	public String uuid;
	public long cartId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long displayDate;
	public double total;
	public boolean invoiceDiscount;
	public double vat;
	public double totalWithVat;
	public double discountedTotal;
	public long offerId;
	public long invoiceId;
	public boolean installation;
	public double installationTotal;
	public boolean delivery;
	public double deliveryTotal;
	public int status;

}