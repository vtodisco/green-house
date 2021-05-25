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

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.Validator;

import it.vmt.gh.sb.service.ItemLocalServiceUtil;

/**
 * The extended model implementation for the Cart service. Represents a row in the &quot;gh_Cart&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.vmt.gh.sb.model.Cart</code> interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
public class CartImpl extends CartBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a cart model instance should use the {@link it.vmt.gh.sb.model.Cart} interface instead.
	 */
	public CartImpl() {
	}
	
	public String getOfferUrl() {
		DLFileEntry offer = DLFileEntryLocalServiceUtil.fetchDLFileEntry(this.getOfferId());
		String baseUrl = "/documents"; 
		String url = "";
		if(Validator.isNotNull(offer)) {
			url = "/"+offer.getRepositoryId()+"/"+offer.getFolderId()+"/"+offer.getTitle();
		}
		return baseUrl + url;
	}

	public User getCartUser() {
		return UserLocalServiceUtil.fetchUser(this.getUserId());
	}
}