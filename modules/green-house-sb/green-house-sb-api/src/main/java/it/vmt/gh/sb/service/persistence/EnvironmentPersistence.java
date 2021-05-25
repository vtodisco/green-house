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

import it.vmt.gh.sb.exception.NoSuchEnvironmentException;
import it.vmt.gh.sb.model.Environment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the environment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EnvironmentUtil
 * @generated
 */
@ProviderType
public interface EnvironmentPersistence extends BasePersistence<Environment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EnvironmentUtil} to access the environment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the environments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching environments
	 */
	public java.util.List<Environment> findByUuid(String uuid);

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
	public java.util.List<Environment> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Environment> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Environment>
			orderByComparator);

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
	public java.util.List<Environment> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Environment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first environment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching environment
	 * @throws NoSuchEnvironmentException if a matching environment could not be found
	 */
	public Environment findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Environment>
				orderByComparator)
		throws NoSuchEnvironmentException;

	/**
	 * Returns the first environment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public Environment fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Environment>
			orderByComparator);

	/**
	 * Returns the last environment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching environment
	 * @throws NoSuchEnvironmentException if a matching environment could not be found
	 */
	public Environment findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Environment>
				orderByComparator)
		throws NoSuchEnvironmentException;

	/**
	 * Returns the last environment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public Environment fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Environment>
			orderByComparator);

	/**
	 * Returns the environments before and after the current environment in the ordered set where uuid = &#63;.
	 *
	 * @param environmentId the primary key of the current environment
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next environment
	 * @throws NoSuchEnvironmentException if a environment with the primary key could not be found
	 */
	public Environment[] findByUuid_PrevAndNext(
			long environmentId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Environment>
				orderByComparator)
		throws NoSuchEnvironmentException;

	/**
	 * Removes all the environments where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of environments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching environments
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the environment where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEnvironmentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching environment
	 * @throws NoSuchEnvironmentException if a matching environment could not be found
	 */
	public Environment findByUUID_G(String uuid, long groupId)
		throws NoSuchEnvironmentException;

	/**
	 * Returns the environment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public Environment fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the environment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public Environment fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the environment where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the environment that was removed
	 */
	public Environment removeByUUID_G(String uuid, long groupId)
		throws NoSuchEnvironmentException;

	/**
	 * Returns the number of environments where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching environments
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the environments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching environments
	 */
	public java.util.List<Environment> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<Environment> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Environment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Environment>
			orderByComparator);

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
	public java.util.List<Environment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Environment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first environment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching environment
	 * @throws NoSuchEnvironmentException if a matching environment could not be found
	 */
	public Environment findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Environment>
				orderByComparator)
		throws NoSuchEnvironmentException;

	/**
	 * Returns the first environment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public Environment fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Environment>
			orderByComparator);

	/**
	 * Returns the last environment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching environment
	 * @throws NoSuchEnvironmentException if a matching environment could not be found
	 */
	public Environment findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Environment>
				orderByComparator)
		throws NoSuchEnvironmentException;

	/**
	 * Returns the last environment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public Environment fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Environment>
			orderByComparator);

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
	public Environment[] findByUuid_C_PrevAndNext(
			long environmentId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Environment>
				orderByComparator)
		throws NoSuchEnvironmentException;

	/**
	 * Removes all the environments where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of environments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching environments
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the environment where name = &#63; or throws a <code>NoSuchEnvironmentException</code> if it could not be found.
	 *
	 * @param name the name
	 * @return the matching environment
	 * @throws NoSuchEnvironmentException if a matching environment could not be found
	 */
	public Environment findByName(String name)
		throws NoSuchEnvironmentException;

	/**
	 * Returns the environment where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public Environment fetchByName(String name);

	/**
	 * Returns the environment where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching environment, or <code>null</code> if a matching environment could not be found
	 */
	public Environment fetchByName(String name, boolean useFinderCache);

	/**
	 * Removes the environment where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the environment that was removed
	 */
	public Environment removeByName(String name)
		throws NoSuchEnvironmentException;

	/**
	 * Returns the number of environments where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching environments
	 */
	public int countByName(String name);

	/**
	 * Caches the environment in the entity cache if it is enabled.
	 *
	 * @param environment the environment
	 */
	public void cacheResult(Environment environment);

	/**
	 * Caches the environments in the entity cache if it is enabled.
	 *
	 * @param environments the environments
	 */
	public void cacheResult(java.util.List<Environment> environments);

	/**
	 * Creates a new environment with the primary key. Does not add the environment to the database.
	 *
	 * @param environmentId the primary key for the new environment
	 * @return the new environment
	 */
	public Environment create(long environmentId);

	/**
	 * Removes the environment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param environmentId the primary key of the environment
	 * @return the environment that was removed
	 * @throws NoSuchEnvironmentException if a environment with the primary key could not be found
	 */
	public Environment remove(long environmentId)
		throws NoSuchEnvironmentException;

	public Environment updateImpl(Environment environment);

	/**
	 * Returns the environment with the primary key or throws a <code>NoSuchEnvironmentException</code> if it could not be found.
	 *
	 * @param environmentId the primary key of the environment
	 * @return the environment
	 * @throws NoSuchEnvironmentException if a environment with the primary key could not be found
	 */
	public Environment findByPrimaryKey(long environmentId)
		throws NoSuchEnvironmentException;

	/**
	 * Returns the environment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param environmentId the primary key of the environment
	 * @return the environment, or <code>null</code> if a environment with the primary key could not be found
	 */
	public Environment fetchByPrimaryKey(long environmentId);

	/**
	 * Returns all the environments.
	 *
	 * @return the environments
	 */
	public java.util.List<Environment> findAll();

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
	public java.util.List<Environment> findAll(int start, int end);

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
	public java.util.List<Environment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Environment>
			orderByComparator);

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
	public java.util.List<Environment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Environment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the environments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of environments.
	 *
	 * @return the number of environments
	 */
	public int countAll();

}