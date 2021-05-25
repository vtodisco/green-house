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

import it.vmt.gh.sb.model.Handle;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the handle service. This utility wraps <code>it.vmt.gh.sb.service.persistence.impl.HandlePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HandlePersistence
 * @generated
 */
public class HandleUtil {

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
	public static void clearCache(Handle handle) {
		getPersistence().clearCache(handle);
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
	public static Map<Serializable, Handle> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Handle> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Handle> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Handle> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Handle> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Handle update(Handle handle) {
		return getPersistence().update(handle);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Handle update(Handle handle, ServiceContext serviceContext) {
		return getPersistence().update(handle, serviceContext);
	}

	/**
	 * Returns all the handles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching handles
	 */
	public static List<Handle> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the handles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @return the range of matching handles
	 */
	public static List<Handle> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the handles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching handles
	 */
	public static List<Handle> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Handle> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the handles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching handles
	 */
	public static List<Handle> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Handle> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first handle in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching handle
	 * @throws NoSuchHandleException if a matching handle could not be found
	 */
	public static Handle findByUuid_First(
			String uuid, OrderByComparator<Handle> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchHandleException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first handle in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public static Handle fetchByUuid_First(
		String uuid, OrderByComparator<Handle> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last handle in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching handle
	 * @throws NoSuchHandleException if a matching handle could not be found
	 */
	public static Handle findByUuid_Last(
			String uuid, OrderByComparator<Handle> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchHandleException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last handle in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public static Handle fetchByUuid_Last(
		String uuid, OrderByComparator<Handle> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the handles before and after the current handle in the ordered set where uuid = &#63;.
	 *
	 * @param handleId the primary key of the current handle
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next handle
	 * @throws NoSuchHandleException if a handle with the primary key could not be found
	 */
	public static Handle[] findByUuid_PrevAndNext(
			long handleId, String uuid,
			OrderByComparator<Handle> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchHandleException {

		return getPersistence().findByUuid_PrevAndNext(
			handleId, uuid, orderByComparator);
	}

	/**
	 * Removes all the handles where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of handles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching handles
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the handle where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHandleException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching handle
	 * @throws NoSuchHandleException if a matching handle could not be found
	 */
	public static Handle findByUUID_G(String uuid, long groupId)
		throws it.vmt.gh.sb.exception.NoSuchHandleException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the handle where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public static Handle fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the handle where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public static Handle fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the handle where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the handle that was removed
	 */
	public static Handle removeByUUID_G(String uuid, long groupId)
		throws it.vmt.gh.sb.exception.NoSuchHandleException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of handles where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching handles
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the handles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching handles
	 */
	public static List<Handle> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the handles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @return the range of matching handles
	 */
	public static List<Handle> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the handles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching handles
	 */
	public static List<Handle> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Handle> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the handles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching handles
	 */
	public static List<Handle> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Handle> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first handle in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching handle
	 * @throws NoSuchHandleException if a matching handle could not be found
	 */
	public static Handle findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Handle> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchHandleException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first handle in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public static Handle fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Handle> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last handle in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching handle
	 * @throws NoSuchHandleException if a matching handle could not be found
	 */
	public static Handle findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Handle> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchHandleException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last handle in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public static Handle fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Handle> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the handles before and after the current handle in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param handleId the primary key of the current handle
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next handle
	 * @throws NoSuchHandleException if a handle with the primary key could not be found
	 */
	public static Handle[] findByUuid_C_PrevAndNext(
			long handleId, String uuid, long companyId,
			OrderByComparator<Handle> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchHandleException {

		return getPersistence().findByUuid_C_PrevAndNext(
			handleId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the handles where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of handles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching handles
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the handle where name = &#63; or throws a <code>NoSuchHandleException</code> if it could not be found.
	 *
	 * @param name the name
	 * @return the matching handle
	 * @throws NoSuchHandleException if a matching handle could not be found
	 */
	public static Handle findByName(String name)
		throws it.vmt.gh.sb.exception.NoSuchHandleException {

		return getPersistence().findByName(name);
	}

	/**
	 * Returns the handle where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public static Handle fetchByName(String name) {
		return getPersistence().fetchByName(name);
	}

	/**
	 * Returns the handle where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public static Handle fetchByName(String name, boolean useFinderCache) {
		return getPersistence().fetchByName(name, useFinderCache);
	}

	/**
	 * Removes the handle where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the handle that was removed
	 */
	public static Handle removeByName(String name)
		throws it.vmt.gh.sb.exception.NoSuchHandleException {

		return getPersistence().removeByName(name);
	}

	/**
	 * Returns the number of handles where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching handles
	 */
	public static int countByName(String name) {
		return getPersistence().countByName(name);
	}

	/**
	 * Returns the handle where name = &#63; or throws a <code>NoSuchHandleException</code> if it could not be found.
	 *
	 * @param name the name
	 * @return the matching handle
	 * @throws NoSuchHandleException if a matching handle could not be found
	 */
	public static Handle findByCode(String name)
		throws it.vmt.gh.sb.exception.NoSuchHandleException {

		return getPersistence().findByCode(name);
	}

	/**
	 * Returns the handle where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public static Handle fetchByCode(String name) {
		return getPersistence().fetchByCode(name);
	}

	/**
	 * Returns the handle where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public static Handle fetchByCode(String name, boolean useFinderCache) {
		return getPersistence().fetchByCode(name, useFinderCache);
	}

	/**
	 * Removes the handle where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the handle that was removed
	 */
	public static Handle removeByCode(String name)
		throws it.vmt.gh.sb.exception.NoSuchHandleException {

		return getPersistence().removeByCode(name);
	}

	/**
	 * Returns the number of handles where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching handles
	 */
	public static int countByCode(String name) {
		return getPersistence().countByCode(name);
	}

	/**
	 * Caches the handle in the entity cache if it is enabled.
	 *
	 * @param handle the handle
	 */
	public static void cacheResult(Handle handle) {
		getPersistence().cacheResult(handle);
	}

	/**
	 * Caches the handles in the entity cache if it is enabled.
	 *
	 * @param handles the handles
	 */
	public static void cacheResult(List<Handle> handles) {
		getPersistence().cacheResult(handles);
	}

	/**
	 * Creates a new handle with the primary key. Does not add the handle to the database.
	 *
	 * @param handleId the primary key for the new handle
	 * @return the new handle
	 */
	public static Handle create(long handleId) {
		return getPersistence().create(handleId);
	}

	/**
	 * Removes the handle with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param handleId the primary key of the handle
	 * @return the handle that was removed
	 * @throws NoSuchHandleException if a handle with the primary key could not be found
	 */
	public static Handle remove(long handleId)
		throws it.vmt.gh.sb.exception.NoSuchHandleException {

		return getPersistence().remove(handleId);
	}

	public static Handle updateImpl(Handle handle) {
		return getPersistence().updateImpl(handle);
	}

	/**
	 * Returns the handle with the primary key or throws a <code>NoSuchHandleException</code> if it could not be found.
	 *
	 * @param handleId the primary key of the handle
	 * @return the handle
	 * @throws NoSuchHandleException if a handle with the primary key could not be found
	 */
	public static Handle findByPrimaryKey(long handleId)
		throws it.vmt.gh.sb.exception.NoSuchHandleException {

		return getPersistence().findByPrimaryKey(handleId);
	}

	/**
	 * Returns the handle with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param handleId the primary key of the handle
	 * @return the handle, or <code>null</code> if a handle with the primary key could not be found
	 */
	public static Handle fetchByPrimaryKey(long handleId) {
		return getPersistence().fetchByPrimaryKey(handleId);
	}

	/**
	 * Returns all the handles.
	 *
	 * @return the handles
	 */
	public static List<Handle> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the handles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @return the range of handles
	 */
	public static List<Handle> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the handles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of handles
	 */
	public static List<Handle> findAll(
		int start, int end, OrderByComparator<Handle> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the handles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of handles
	 */
	public static List<Handle> findAll(
		int start, int end, OrderByComparator<Handle> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the handles from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of handles.
	 *
	 * @return the number of handles
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HandlePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HandlePersistence, HandlePersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(HandlePersistence.class);

		ServiceTracker<HandlePersistence, HandlePersistence> serviceTracker =
			new ServiceTracker<HandlePersistence, HandlePersistence>(
				bundle.getBundleContext(), HandlePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}