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

package it.vmt.gh.sb.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import it.vmt.gh.sb.model.Item;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the item service. This utility wraps <code>it.vmt.gh.sb.service.persistence.impl.ItemPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ItemPersistence
 * @generated
 */
public class ItemUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Item item) {
		getPersistence().clearCache(item);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Item> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Item> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Item> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Item> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Item update(Item item) {
		return getPersistence().update(item);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Item update(Item item, ServiceContext serviceContext) {
		return getPersistence().update(item, serviceContext);
	}

	/**
	 * Returns all the items where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching items
	 */
	public static List<Item> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the items where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of matching items
	 */
	public static List<Item> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the items where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the items where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Item> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByUuid_First(
			String uuid, OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByUuid_First(
		String uuid, OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByUuid_Last(
			String uuid, OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByUuid_Last(
		String uuid, OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the items before and after the current item in the ordered set where uuid = &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item[] findByUuid_PrevAndNext(
			long itemId, String uuid, OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByUuid_PrevAndNext(
			itemId, uuid, orderByComparator);
	}

	/**
	 * Removes all the items where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of items where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching items
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the item where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchItemException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByUUID_G(String uuid, long groupId)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the item where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the item that was removed
	 */
	public static Item removeByUUID_G(String uuid, long groupId)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of items where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching items
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the items where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching items
	 */
	public static List<Item> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the items where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of matching items
	 */
	public static List<Item> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the items where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the items where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Item> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the items before and after the current item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item[] findByUuid_C_PrevAndNext(
			long itemId, String uuid, long companyId,
			OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByUuid_C_PrevAndNext(
			itemId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the items where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of items where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching items
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the items where cartId = &#63;.
	 *
	 * @param cartId the cart ID
	 * @return the matching items
	 */
	public static List<Item> findByCart(long cartId) {
		return getPersistence().findByCart(cartId);
	}

	/**
	 * Returns a range of all the items where cartId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param cartId the cart ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of matching items
	 */
	public static List<Item> findByCart(long cartId, int start, int end) {
		return getPersistence().findByCart(cartId, start, end);
	}

	/**
	 * Returns an ordered range of all the items where cartId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param cartId the cart ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByCart(
		long cartId, int start, int end,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().findByCart(
			cartId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the items where cartId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param cartId the cart ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByCart(
		long cartId, int start, int end,
		OrderByComparator<Item> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByCart(
			cartId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item in the ordered set where cartId = &#63;.
	 *
	 * @param cartId the cart ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByCart_First(
			long cartId, OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByCart_First(cartId, orderByComparator);
	}

	/**
	 * Returns the first item in the ordered set where cartId = &#63;.
	 *
	 * @param cartId the cart ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByCart_First(
		long cartId, OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByCart_First(cartId, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where cartId = &#63;.
	 *
	 * @param cartId the cart ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByCart_Last(
			long cartId, OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByCart_Last(cartId, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where cartId = &#63;.
	 *
	 * @param cartId the cart ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByCart_Last(
		long cartId, OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByCart_Last(cartId, orderByComparator);
	}

	/**
	 * Returns the items before and after the current item in the ordered set where cartId = &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param cartId the cart ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item[] findByCart_PrevAndNext(
			long itemId, long cartId, OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByCart_PrevAndNext(
			itemId, cartId, orderByComparator);
	}

	/**
	 * Removes all the items where cartId = &#63; from the database.
	 *
	 * @param cartId the cart ID
	 */
	public static void removeByCart(long cartId) {
		getPersistence().removeByCart(cartId);
	}

	/**
	 * Returns the number of items where cartId = &#63;.
	 *
	 * @param cartId the cart ID
	 * @return the number of matching items
	 */
	public static int countByCart(long cartId) {
		return getPersistence().countByCart(cartId);
	}

	/**
	 * Returns all the items where environmentId = &#63;.
	 *
	 * @param environmentId the environment ID
	 * @return the matching items
	 */
	public static List<Item> findByEnvironment(long environmentId) {
		return getPersistence().findByEnvironment(environmentId);
	}

	/**
	 * Returns a range of all the items where environmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param environmentId the environment ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of matching items
	 */
	public static List<Item> findByEnvironment(
		long environmentId, int start, int end) {

		return getPersistence().findByEnvironment(environmentId, start, end);
	}

	/**
	 * Returns an ordered range of all the items where environmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param environmentId the environment ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByEnvironment(
		long environmentId, int start, int end,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().findByEnvironment(
			environmentId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the items where environmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param environmentId the environment ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByEnvironment(
		long environmentId, int start, int end,
		OrderByComparator<Item> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByEnvironment(
			environmentId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item in the ordered set where environmentId = &#63;.
	 *
	 * @param environmentId the environment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByEnvironment_First(
			long environmentId, OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByEnvironment_First(
			environmentId, orderByComparator);
	}

	/**
	 * Returns the first item in the ordered set where environmentId = &#63;.
	 *
	 * @param environmentId the environment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByEnvironment_First(
		long environmentId, OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByEnvironment_First(
			environmentId, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where environmentId = &#63;.
	 *
	 * @param environmentId the environment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByEnvironment_Last(
			long environmentId, OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByEnvironment_Last(
			environmentId, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where environmentId = &#63;.
	 *
	 * @param environmentId the environment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByEnvironment_Last(
		long environmentId, OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByEnvironment_Last(
			environmentId, orderByComparator);
	}

	/**
	 * Returns the items before and after the current item in the ordered set where environmentId = &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param environmentId the environment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item[] findByEnvironment_PrevAndNext(
			long itemId, long environmentId,
			OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByEnvironment_PrevAndNext(
			itemId, environmentId, orderByComparator);
	}

	/**
	 * Removes all the items where environmentId = &#63; from the database.
	 *
	 * @param environmentId the environment ID
	 */
	public static void removeByEnvironment(long environmentId) {
		getPersistence().removeByEnvironment(environmentId);
	}

	/**
	 * Returns the number of items where environmentId = &#63;.
	 *
	 * @param environmentId the environment ID
	 * @return the number of matching items
	 */
	public static int countByEnvironment(long environmentId) {
		return getPersistence().countByEnvironment(environmentId);
	}

	/**
	 * Returns all the items where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @return the matching items
	 */
	public static List<Item> findByProfile(long profileId) {
		return getPersistence().findByProfile(profileId);
	}

	/**
	 * Returns a range of all the items where profileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param profileId the profile ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of matching items
	 */
	public static List<Item> findByProfile(long profileId, int start, int end) {
		return getPersistence().findByProfile(profileId, start, end);
	}

	/**
	 * Returns an ordered range of all the items where profileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param profileId the profile ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByProfile(
		long profileId, int start, int end,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().findByProfile(
			profileId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the items where profileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param profileId the profile ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByProfile(
		long profileId, int start, int end,
		OrderByComparator<Item> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByProfile(
			profileId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByProfile_First(
			long profileId, OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByProfile_First(
			profileId, orderByComparator);
	}

	/**
	 * Returns the first item in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByProfile_First(
		long profileId, OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByProfile_First(
			profileId, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByProfile_Last(
			long profileId, OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByProfile_Last(
			profileId, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByProfile_Last(
		long profileId, OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByProfile_Last(
			profileId, orderByComparator);
	}

	/**
	 * Returns the items before and after the current item in the ordered set where profileId = &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item[] findByProfile_PrevAndNext(
			long itemId, long profileId,
			OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByProfile_PrevAndNext(
			itemId, profileId, orderByComparator);
	}

	/**
	 * Removes all the items where profileId = &#63; from the database.
	 *
	 * @param profileId the profile ID
	 */
	public static void removeByProfile(long profileId) {
		getPersistence().removeByProfile(profileId);
	}

	/**
	 * Returns the number of items where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @return the number of matching items
	 */
	public static int countByProfile(long profileId) {
		return getPersistence().countByProfile(profileId);
	}

	/**
	 * Returns all the items where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @return the matching items
	 */
	public static List<Item> findByCarpentry(long carpentryId) {
		return getPersistence().findByCarpentry(carpentryId);
	}

	/**
	 * Returns a range of all the items where carpentryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param carpentryId the carpentry ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of matching items
	 */
	public static List<Item> findByCarpentry(
		long carpentryId, int start, int end) {

		return getPersistence().findByCarpentry(carpentryId, start, end);
	}

	/**
	 * Returns an ordered range of all the items where carpentryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param carpentryId the carpentry ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByCarpentry(
		long carpentryId, int start, int end,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().findByCarpentry(
			carpentryId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the items where carpentryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param carpentryId the carpentry ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByCarpentry(
		long carpentryId, int start, int end,
		OrderByComparator<Item> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByCarpentry(
			carpentryId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByCarpentry_First(
			long carpentryId, OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByCarpentry_First(
			carpentryId, orderByComparator);
	}

	/**
	 * Returns the first item in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByCarpentry_First(
		long carpentryId, OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByCarpentry_First(
			carpentryId, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByCarpentry_Last(
			long carpentryId, OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByCarpentry_Last(
			carpentryId, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByCarpentry_Last(
		long carpentryId, OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByCarpentry_Last(
			carpentryId, orderByComparator);
	}

	/**
	 * Returns the items before and after the current item in the ordered set where carpentryId = &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item[] findByCarpentry_PrevAndNext(
			long itemId, long carpentryId,
			OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByCarpentry_PrevAndNext(
			itemId, carpentryId, orderByComparator);
	}

	/**
	 * Removes all the items where carpentryId = &#63; from the database.
	 *
	 * @param carpentryId the carpentry ID
	 */
	public static void removeByCarpentry(long carpentryId) {
		getPersistence().removeByCarpentry(carpentryId);
	}

	/**
	 * Returns the number of items where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @return the number of matching items
	 */
	public static int countByCarpentry(long carpentryId) {
		return getPersistence().countByCarpentry(carpentryId);
	}

	/**
	 * Returns all the items where handleId = &#63;.
	 *
	 * @param handleId the handle ID
	 * @return the matching items
	 */
	public static List<Item> findByHandle(long handleId) {
		return getPersistence().findByHandle(handleId);
	}

	/**
	 * Returns a range of all the items where handleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param handleId the handle ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of matching items
	 */
	public static List<Item> findByHandle(long handleId, int start, int end) {
		return getPersistence().findByHandle(handleId, start, end);
	}

	/**
	 * Returns an ordered range of all the items where handleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param handleId the handle ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByHandle(
		long handleId, int start, int end,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().findByHandle(
			handleId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the items where handleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param handleId the handle ID
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByHandle(
		long handleId, int start, int end,
		OrderByComparator<Item> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByHandle(
			handleId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item in the ordered set where handleId = &#63;.
	 *
	 * @param handleId the handle ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByHandle_First(
			long handleId, OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByHandle_First(handleId, orderByComparator);
	}

	/**
	 * Returns the first item in the ordered set where handleId = &#63;.
	 *
	 * @param handleId the handle ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByHandle_First(
		long handleId, OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByHandle_First(
			handleId, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where handleId = &#63;.
	 *
	 * @param handleId the handle ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByHandle_Last(
			long handleId, OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByHandle_Last(handleId, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where handleId = &#63;.
	 *
	 * @param handleId the handle ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByHandle_Last(
		long handleId, OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByHandle_Last(handleId, orderByComparator);
	}

	/**
	 * Returns the items before and after the current item in the ordered set where handleId = &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param handleId the handle ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item[] findByHandle_PrevAndNext(
			long itemId, long handleId,
			OrderByComparator<Item> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByHandle_PrevAndNext(
			itemId, handleId, orderByComparator);
	}

	/**
	 * Removes all the items where handleId = &#63; from the database.
	 *
	 * @param handleId the handle ID
	 */
	public static void removeByHandle(long handleId) {
		getPersistence().removeByHandle(handleId);
	}

	/**
	 * Returns the number of items where handleId = &#63;.
	 *
	 * @param handleId the handle ID
	 * @return the number of matching items
	 */
	public static int countByHandle(long handleId) {
		return getPersistence().countByHandle(handleId);
	}

	/**
	 * Caches the item in the entity cache if it is enabled.
	 *
	 * @param item the item
	 */
	public static void cacheResult(Item item) {
		getPersistence().cacheResult(item);
	}

	/**
	 * Caches the items in the entity cache if it is enabled.
	 *
	 * @param items the items
	 */
	public static void cacheResult(List<Item> items) {
		getPersistence().cacheResult(items);
	}

	/**
	 * Creates a new item with the primary key. Does not add the item to the database.
	 *
	 * @param itemId the primary key for the new item
	 * @return the new item
	 */
	public static Item create(long itemId) {
		return getPersistence().create(itemId);
	}

	/**
	 * Removes the item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemId the primary key of the item
	 * @return the item that was removed
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item remove(long itemId)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().remove(itemId);
	}

	public static Item updateImpl(Item item) {
		return getPersistence().updateImpl(item);
	}

	/**
	 * Returns the item with the primary key or throws a <code>NoSuchItemException</code> if it could not be found.
	 *
	 * @param itemId the primary key of the item
	 * @return the item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item findByPrimaryKey(long itemId)
		throws it.vmt.gh.sb.exception.NoSuchItemException {

		return getPersistence().findByPrimaryKey(itemId);
	}

	/**
	 * Returns the item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemId the primary key of the item
	 * @return the item, or <code>null</code> if a item with the primary key could not be found
	 */
	public static Item fetchByPrimaryKey(long itemId) {
		return getPersistence().fetchByPrimaryKey(itemId);
	}

	/**
	 * Returns all the items.
	 *
	 * @return the items
	 */
	public static List<Item> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of items
	 */
	public static List<Item> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of items
	 */
	public static List<Item> findAll(
		int start, int end, OrderByComparator<Item> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of items
	 */
	public static List<Item> findAll(
		int start, int end, OrderByComparator<Item> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the items from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of items.
	 *
	 * @return the number of items
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ItemPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ItemPersistence, ItemPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ItemPersistence.class);

		ServiceTracker<ItemPersistence, ItemPersistence> serviceTracker =
			new ServiceTracker<ItemPersistence, ItemPersistence>(
				bundle.getBundleContext(), ItemPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}