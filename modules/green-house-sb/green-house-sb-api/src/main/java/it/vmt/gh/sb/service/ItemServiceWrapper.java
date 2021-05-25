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

package it.vmt.gh.sb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ItemService}.
 *
 * @author Brian Wing Shun Chan
 * @see ItemService
 * @generated
 */
public class ItemServiceWrapper
	implements ItemService, ServiceWrapper<ItemService> {

	public ItemServiceWrapper(ItemService itemService) {
		_itemService = itemService;
	}

	@Override
	public String findByCartId(long cartId)
		throws com.liferay.portal.kernel.json.JSONException {

		return _itemService.findByCartId(cartId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _itemService.getOSGiServiceIdentifier();
	}

	@Override
	public it.vmt.gh.sb.model.Item updateItem(
		long groupId, long userId, long itemId, long cartId, long environmentId,
		long profileId, long carpentryId, long handleId, long colorId,
		int price, int qty, double width, double height, String color) {

		return _itemService.updateItem(
			groupId, userId, itemId, cartId, environmentId, profileId,
			carpentryId, handleId, colorId, price, qty, width, height, color);
	}

	@Override
	public ItemService getWrappedService() {
		return _itemService;
	}

	@Override
	public void setWrappedService(ItemService itemService) {
		_itemService = itemService;
	}

	private ItemService _itemService;

}