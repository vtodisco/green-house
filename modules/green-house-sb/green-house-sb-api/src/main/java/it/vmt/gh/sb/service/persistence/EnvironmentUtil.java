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

import it.vmt.gh.sb.model.Environment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the environment service. This utility wraps <code>it.vmt.gh.sb.service.persistence.impl.EnvironmentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EnvironmentPersistence
 * @generated
 */
public class EnvironmentUtil {

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
	public static void clearCache(Environment environment) {
		getPersistence().clearCache(environment);
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
	public static Map<Serializable, Environment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Environment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Environment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Environment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Environment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Environment update(Environment environment) {
		return getPersistence().update(environment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Environment update(
		Environment environment, ServiceContext serviceContext) {

		return getPersistence().update(environment, serviceContext);
	}

	/**
	 * Returns all the environments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching environments
	 */
	public static List<Environment> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the environments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnvironmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of environments
	 * @param end the upper bound of the range of environments (not inclusive)
	 * @return the range of matching environments
	 */
	public static List<Environment> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the environments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnvironmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of environments
	 * @param end the upper bound of the range of environments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching environments
	 */
	public static List<Environment> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Environment> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the environments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnvironmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of environments
	 * @param end the upper bound of the range of environments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching environments
	 */
	public static List<Environment> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Environment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first environment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching environment
	 * @throws NoSuchEnvironmentException if a matching environment could not be found
	 */
	public static Environment findByUuid_First(
			String uuid, OrderByComparator<Environment> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchEnvironmentException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first environment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public static Environment fetchByUuid_First(
		String uuid, OrderByComparator<Environment> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last environment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching environment
	 * @throws NoSuchEnvironmentException if a matching environment could not be found
	 */
	public static Environment findByUuid_Last(
			String uuid, OrderByComparator<Environment> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchEnvironmentException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last environment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public static Environment fetchByUuid_Last(
		String uuid, OrderByComparator<Environment> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the environments before and after the current environment in the ordered set where uuid = &#63;.
	 *
	 * @param environmentId the primary key of the current environment
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next environment
	 * @throws NoSuchEnvironmentException if a environment with the primary key could not be found
	 */
	public static Environment[] findByUuid_PrevAndNext(
			long environmentId, String uuid,
			OrderByComparator<Environment> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchEnvironmentException {

		return getPersistence().findByUuid_PrevAndNext(
			environmentId, uuid, orderByComparator);
	}

	/**
	 * Removes all the environments where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of environments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching environments
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the environment where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEnvironmentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching environment
	 * @throws NoSuchEnvironmentException if a matching environment could not be found
	 */
	public static Environment findByUUID_G(String uuid, long groupId)
		throws it.vmt.gh.sb.exception.NoSuchEnvironmentException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the environment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public static Environment fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the environment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public static Environment fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the environment where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the environment that was removed
	 */
	public static Environment removeByUUID_G(String uuid, long groupId)
		throws it.vmt.gh.sb.exception.NoSuchEnvironmentException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of environments where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching environments
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the environments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching environments
	 */
	public static List<Environment> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the environments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnvironmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of environments
	 * @param end the upper bound of the range of environments (not inclusive)
	 * @return the range of matching environments
	 */
	public static List<Environment> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the environments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnvironmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of environments
	 * @param end the upper bound of the range of environments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching environments
	 */
	public static List<Environment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Environment> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the environments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnvironmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of environments
	 * @param end the upper bound of the range of environments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching environments
	 */
	public static List<Environment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Environment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first environment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching environment
	 * @throws NoSuchEnvironmentException if a matching environment could not be found
	 */
	public static Environment findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Environment> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchEnvironmentException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first environment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public static Environment fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Environment> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last environment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching environment
	 * @throws NoSuchEnvironmentException if a matching environment could not be found
	 */
	public static Environment findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Environment> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchEnvironmentException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last environment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public static Environment fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Environment> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the environments before and after the current environment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param environmentId the primary key of the current environment
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next environment
	 * @throws NoSuchEnvironmentException if a environment with the primary key could not be found
	 */
	public static Environment[] findByUuid_C_PrevAndNext(
			long environmentId, String uuid, long companyId,
			OrderByComparator<Environment> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchEnvironmentException {

		return getPersistence().findByUuid_C_PrevAndNext(
			environmentId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the environments where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of environments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching environments
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the environment where name = &#63; or throws a <code>NoSuchEnvironmentException</code> if it could not be found.
	 *
	 * @param name the name
	 * @return the matching environment
	 * @throws NoSuchEnvironmentException if a matching environment could not be found
	 */
	public static Environment findByName(String name)
		throws it.vmt.gh.sb.exception.NoSuchEnvironmentException {

		return getPersistence().findByName(name);
	}

	/**
	 * Returns the environment where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public static Environment fetchByName(String name) {
		return getPersistence().fetchByName(name);
	}

	/**
	 * Returns the environment where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public static Environment fetchByName(String name, boolean useFinderCache) {
		return getPersistence().fetchByName(name, useFinderCache);
	}

	/**
	 * Removes the environment where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the environment that was removed
	 */
	public static Environment removeByName(String name)
		throws it.vmt.gh.sb.exception.NoSuchEnvironmentException {

		return getPersistence().removeByName(name);
	}

	/**
	 * Returns the number of environments where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching environments
	 */
	public static int countByName(String name) {
		return getPersistence().countByName(name);
	}

	/**
	 * Caches the environment in the entity cache if it is enabled.
	 *
	 * @param environment the environment
	 */
	public static void cacheResult(Environment environment) {
		getPersistence().cacheResult(environment);
	}

	/**
	 * Caches the environments in the entity cache if it is enabled.
	 *
	 * @param environments the environments
	 */
	public static void cacheResult(List<Environment> environments) {
		getPersistence().cacheResult(environments);
	}

	/**
	 * Creates a new environment with the primary key. Does not add the environment to the database.
	 *
	 * @param environmentId the primary key for the new environment
	 * @return the new environment
	 */
	public static Environment create(long environmentId) {
		return getPersistence().create(environmentId);
	}

	/**
	 * Removes the environment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param environmentId the primary key of the environment
	 * @return the environment that was removed
	 * @throws NoSuchEnvironmentException if a environment with the primary key could not be found
	 */
	public static Environment remove(long environmentId)
		throws it.vmt.gh.sb.exception.NoSuchEnvironmentException {

		return getPersistence().remove(environmentId);
	}

	public static Environment updateImpl(Environment environment) {
		return getPersistence().updateImpl(environment);
	}

	/**
	 * Returns the environment with the primary key or throws a <code>NoSuchEnvironmentException</code> if it could not be found.
	 *
	 * @param environmentId the primary key of the environment
	 * @return the environment
	 * @throws NoSuchEnvironmentException if a environment with the primary key could not be found
	 */
	public static Environment findByPrimaryKey(long environmentId)
		throws it.vmt.gh.sb.exception.NoSuchEnvironmentException {

		return getPersistence().findByPrimaryKey(environmentId);
	}

	/**
	 * Returns the environment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param environmentId the primary key of the environment
	 * @return the environment, or <code>null</code> if a environment with the primary key could not be found
	 */
	public static Environment fetchByPrimaryKey(long environmentId) {
		return getPersistence().fetchByPrimaryKey(environmentId);
	}

	/**
	 * Returns all the environments.
	 *
	 * @return the environments
	 */
	public static List<Environment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the environments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnvironmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of environments
	 * @param end the upper bound of the range of environments (not inclusive)
	 * @return the range of environments
	 */
	public static List<Environment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the environments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnvironmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of environments
	 * @param end the upper bound of the range of environments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of environments
	 */
	public static List<Environment> findAll(
		int start, int end, OrderByComparator<Environment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the environments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnvironmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of environments
	 * @param end the upper bound of the range of environments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of environments
	 */
	public static List<Environment> findAll(
		int start, int end, OrderByComparator<Environment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the environments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of environments.
	 *
	 * @return the number of environments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EnvironmentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<EnvironmentPersistence, EnvironmentPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EnvironmentPersistence.class);

		ServiceTracker<EnvironmentPersistence, EnvironmentPersistence>
			serviceTracker =
				new ServiceTracker
					<EnvironmentPersistence, EnvironmentPersistence>(
						bundle.getBundleContext(), EnvironmentPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}