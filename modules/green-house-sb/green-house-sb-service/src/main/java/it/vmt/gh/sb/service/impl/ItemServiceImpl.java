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

package it.vmt.gh.sb.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;

import it.vmt.gh.sb.model.Cart;
import it.vmt.gh.sb.model.Item;
import it.vmt.gh.sb.service.base.ItemServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the item remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.vmt.gh.sb.service.ItemService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ItemServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=gh", "json.web.service.context.path=Item"
	},
	service = AopService.class
)
public class ItemServiceImpl extends ItemServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>it.vmt.gh.sb.service.ItemServiceUtil</code> to access the item remote service.
	 */
	public Item updateItem(
			long groupId, 
			long userId,
			long itemId,
			long cartId,
			long environmentId,
			long profileId, 
			long carpentryId, 
			long handleId, 
			long colorId,
			int price, 
			int qty,
			double width,
			double height,
			String color) {
		return itemLocalService.updateItem(
				groupId, 
				userId, 
				itemId, 
				cartId,
				profileId, 
				environmentId,
				carpentryId, 
				handleId, 
				colorId,
				price, 
				qty,
				width,
				height,
				color);
	}

	public String findByCartId(long cartId) throws JSONException{
		return itemLocalService.findByCartId(cartId);
	}
}