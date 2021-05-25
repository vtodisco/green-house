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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Item. This utility wraps
 * <code>it.vmt.gh.sb.service.impl.ItemServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ItemService
 * @generated
 */
public class ItemServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>it.vmt.gh.sb.service.impl.ItemServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static String findByCartId(long cartId)
		throws com.liferay.portal.kernel.json.JSONException {

		return getService().findByCartId(cartId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static it.vmt.gh.sb.model.Item updateItem(
		long groupId, long userId, long itemId, long cartId, long environmentId,
		long profileId, long carpentryId, long handleId, long colorId,
		int price, int qty, double width, double height, String color) {

		return getService().updateItem(
			groupId, userId, itemId, cartId, environmentId, profileId,
			carpentryId, handleId, colorId, price, qty, width, height, color);
	}

	public static ItemService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ItemService, ItemService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ItemService.class);

		ServiceTracker<ItemService, ItemService> serviceTracker =
			new ServiceTracker<ItemService, ItemService>(
				bundle.getBundleContext(), ItemService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}