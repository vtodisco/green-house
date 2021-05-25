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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import it.vmt.gh.sb.exception.NoSuchItemException;
import it.vmt.gh.sb.model.Item;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ItemUtil
 * @generated
 */
@ProviderType
public interface ItemPersistence extends BasePersistence<Item> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ItemUtil} to access the item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the items where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching items
	 */
	public java.util.List<Item> findByUuid(String uuid);

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
	public java.util.List<Item> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Item> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

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
	public java.util.List<Item> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Returns the first item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

	/**
	 * Returns the last item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Returns the last item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

	/**
	 * Returns the items before and after the current item in the ordered set where uuid = &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public Item[] findByUuid_PrevAndNext(
			long itemId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Removes all the items where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of items where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching items
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the item where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchItemException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByUUID_G(String uuid, long groupId)
		throws NoSuchItemException;

	/**
	 * Returns the item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the item where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the item that was removed
	 */
	public Item removeByUUID_G(String uuid, long groupId)
		throws NoSuchItemException;

	/**
	 * Returns the number of items where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching items
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the items where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching items
	 */
	public java.util.List<Item> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Item> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Item> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

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
	public java.util.List<Item> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Returns the first item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

	/**
	 * Returns the last item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Returns the last item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

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
	public Item[] findByUuid_C_PrevAndNext(
			long itemId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Removes all the items where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of items where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching items
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the items where cartId = &#63;.
	 *
	 * @param cartId the cart ID
	 * @return the matching items
	 */
	public java.util.List<Item> findByCart(long cartId);

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
	public java.util.List<Item> findByCart(long cartId, int start, int end);

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
	public java.util.List<Item> findByCart(
		long cartId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

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
	public java.util.List<Item> findByCart(
		long cartId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first item in the ordered set where cartId = &#63;.
	 *
	 * @param cartId the cart ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByCart_First(
			long cartId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Returns the first item in the ordered set where cartId = &#63;.
	 *
	 * @param cartId the cart ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByCart_First(
		long cartId,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

	/**
	 * Returns the last item in the ordered set where cartId = &#63;.
	 *
	 * @param cartId the cart ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByCart_Last(
			long cartId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Returns the last item in the ordered set where cartId = &#63;.
	 *
	 * @param cartId the cart ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByCart_Last(
		long cartId,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

	/**
	 * Returns the items before and after the current item in the ordered set where cartId = &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param cartId the cart ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public Item[] findByCart_PrevAndNext(
			long itemId, long cartId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Removes all the items where cartId = &#63; from the database.
	 *
	 * @param cartId the cart ID
	 */
	public void removeByCart(long cartId);

	/**
	 * Returns the number of items where cartId = &#63;.
	 *
	 * @param cartId the cart ID
	 * @return the number of matching items
	 */
	public int countByCart(long cartId);

	/**
	 * Returns all the items where environmentId = &#63;.
	 *
	 * @param environmentId the environment ID
	 * @return the matching items
	 */
	public java.util.List<Item> findByEnvironment(long environmentId);

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
	public java.util.List<Item> findByEnvironment(
		long environmentId, int start, int end);

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
	public java.util.List<Item> findByEnvironment(
		long environmentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

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
	public java.util.List<Item> findByEnvironment(
		long environmentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first item in the ordered set where environmentId = &#63;.
	 *
	 * @param environmentId the environment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByEnvironment_First(
			long environmentId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Returns the first item in the ordered set where environmentId = &#63;.
	 *
	 * @param environmentId the environment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByEnvironment_First(
		long environmentId,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

	/**
	 * Returns the last item in the ordered set where environmentId = &#63;.
	 *
	 * @param environmentId the environment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByEnvironment_Last(
			long environmentId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Returns the last item in the ordered set where environmentId = &#63;.
	 *
	 * @param environmentId the environment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByEnvironment_Last(
		long environmentId,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

	/**
	 * Returns the items before and after the current item in the ordered set where environmentId = &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param environmentId the environment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public Item[] findByEnvironment_PrevAndNext(
			long itemId, long environmentId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Removes all the items where environmentId = &#63; from the database.
	 *
	 * @param environmentId the environment ID
	 */
	public void removeByEnvironment(long environmentId);

	/**
	 * Returns the number of items where environmentId = &#63;.
	 *
	 * @param environmentId the environment ID
	 * @return the number of matching items
	 */
	public int countByEnvironment(long environmentId);

	/**
	 * Returns all the items where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @return the matching items
	 */
	public java.util.List<Item> findByProfile(long profileId);

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
	public java.util.List<Item> findByProfile(
		long profileId, int start, int end);

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
	public java.util.List<Item> findByProfile(
		long profileId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

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
	public java.util.List<Item> findByProfile(
		long profileId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first item in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByProfile_First(
			long profileId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Returns the first item in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByProfile_First(
		long profileId,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

	/**
	 * Returns the last item in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByProfile_Last(
			long profileId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Returns the last item in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByProfile_Last(
		long profileId,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

	/**
	 * Returns the items before and after the current item in the ordered set where profileId = &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public Item[] findByProfile_PrevAndNext(
			long itemId, long profileId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Removes all the items where profileId = &#63; from the database.
	 *
	 * @param profileId the profile ID
	 */
	public void removeByProfile(long profileId);

	/**
	 * Returns the number of items where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @return the number of matching items
	 */
	public int countByProfile(long profileId);

	/**
	 * Returns all the items where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @return the matching items
	 */
	public java.util.List<Item> findByCarpentry(long carpentryId);

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
	public java.util.List<Item> findByCarpentry(
		long carpentryId, int start, int end);

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
	public java.util.List<Item> findByCarpentry(
		long carpentryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

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
	public java.util.List<Item> findByCarpentry(
		long carpentryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first item in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByCarpentry_First(
			long carpentryId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Returns the first item in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByCarpentry_First(
		long carpentryId,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

	/**
	 * Returns the last item in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByCarpentry_Last(
			long carpentryId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Returns the last item in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByCarpentry_Last(
		long carpentryId,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

	/**
	 * Returns the items before and after the current item in the ordered set where carpentryId = &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public Item[] findByCarpentry_PrevAndNext(
			long itemId, long carpentryId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Removes all the items where carpentryId = &#63; from the database.
	 *
	 * @param carpentryId the carpentry ID
	 */
	public void removeByCarpentry(long carpentryId);

	/**
	 * Returns the number of items where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @return the number of matching items
	 */
	public int countByCarpentry(long carpentryId);

	/**
	 * Returns all the items where handleId = &#63;.
	 *
	 * @param handleId the handle ID
	 * @return the matching items
	 */
	public java.util.List<Item> findByHandle(long handleId);

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
	public java.util.List<Item> findByHandle(long handleId, int start, int end);

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
	public java.util.List<Item> findByHandle(
		long handleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

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
	public java.util.List<Item> findByHandle(
		long handleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first item in the ordered set where handleId = &#63;.
	 *
	 * @param handleId the handle ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByHandle_First(
			long handleId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Returns the first item in the ordered set where handleId = &#63;.
	 *
	 * @param handleId the handle ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByHandle_First(
		long handleId,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

	/**
	 * Returns the last item in the ordered set where handleId = &#63;.
	 *
	 * @param handleId the handle ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public Item findByHandle_Last(
			long handleId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Returns the last item in the ordered set where handleId = &#63;.
	 *
	 * @param handleId the handle ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public Item fetchByHandle_Last(
		long handleId,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

	/**
	 * Returns the items before and after the current item in the ordered set where handleId = &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param handleId the handle ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public Item[] findByHandle_PrevAndNext(
			long itemId, long handleId,
			com.liferay.portal.kernel.util.OrderByComparator<Item>
				orderByComparator)
		throws NoSuchItemException;

	/**
	 * Removes all the items where handleId = &#63; from the database.
	 *
	 * @param handleId the handle ID
	 */
	public void removeByHandle(long handleId);

	/**
	 * Returns the number of items where handleId = &#63;.
	 *
	 * @param handleId the handle ID
	 * @return the number of matching items
	 */
	public int countByHandle(long handleId);

	/**
	 * Caches the item in the entity cache if it is enabled.
	 *
	 * @param item the item
	 */
	public void cacheResult(Item item);

	/**
	 * Caches the items in the entity cache if it is enabled.
	 *
	 * @param items the items
	 */
	public void cacheResult(java.util.List<Item> items);

	/**
	 * Creates a new item with the primary key. Does not add the item to the database.
	 *
	 * @param itemId the primary key for the new item
	 * @return the new item
	 */
	public Item create(long itemId);

	/**
	 * Removes the item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemId the primary key of the item
	 * @return the item that was removed
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public Item remove(long itemId) throws NoSuchItemException;

	public Item updateImpl(Item item);

	/**
	 * Returns the item with the primary key or throws a <code>NoSuchItemException</code> if it could not be found.
	 *
	 * @param itemId the primary key of the item
	 * @return the item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public Item findByPrimaryKey(long itemId) throws NoSuchItemException;

	/**
	 * Returns the item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemId the primary key of the item
	 * @return the item, or <code>null</code> if a item with the primary key could not be found
	 */
	public Item fetchByPrimaryKey(long itemId);

	/**
	 * Returns all the items.
	 *
	 * @return the items
	 */
	public java.util.List<Item> findAll();

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
	public java.util.List<Item> findAll(int start, int end);

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
	public java.util.List<Item> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator);

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
	public java.util.List<Item> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Item>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the items from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of items.
	 *
	 * @return the number of items
	 */
	public int countAll();

}