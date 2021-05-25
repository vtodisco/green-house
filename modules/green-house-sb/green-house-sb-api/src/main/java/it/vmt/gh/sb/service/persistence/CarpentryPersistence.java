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

import it.vmt.gh.sb.exception.NoSuchCarpentryException;
import it.vmt.gh.sb.model.Carpentry;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the carpentry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CarpentryUtil
 * @generated
 */
@ProviderType
public interface CarpentryPersistence extends BasePersistence<Carpentry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CarpentryUtil} to access the carpentry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the carpentries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching carpentries
	 */
	public java.util.List<Carpentry> findByUuid(String uuid);

	/**
	 * Returns a range of all the carpentries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of carpentries
	 * @param end the upper bound of the range of carpentries (not inclusive)
	 * @return the range of matching carpentries
	 */
	public java.util.List<Carpentry> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the carpentries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of carpentries
	 * @param end the upper bound of the range of carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching carpentries
	 */
	public java.util.List<Carpentry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the carpentries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of carpentries
	 * @param end the upper bound of the range of carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching carpentries
	 */
	public java.util.List<Carpentry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching carpentry
	 * @throws NoSuchCarpentryException if a matching carpentry could not be found
	 */
	public Carpentry findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
				orderByComparator)
		throws NoSuchCarpentryException;

	/**
	 * Returns the first carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching carpentry, or <code>null</code> if a matching carpentry could not be found
	 */
	public Carpentry fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
			orderByComparator);

	/**
	 * Returns the last carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching carpentry
	 * @throws NoSuchCarpentryException if a matching carpentry could not be found
	 */
	public Carpentry findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
				orderByComparator)
		throws NoSuchCarpentryException;

	/**
	 * Returns the last carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching carpentry, or <code>null</code> if a matching carpentry could not be found
	 */
	public Carpentry fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
			orderByComparator);

	/**
	 * Returns the carpentries before and after the current carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param carpentryId the primary key of the current carpentry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next carpentry
	 * @throws NoSuchCarpentryException if a carpentry with the primary key could not be found
	 */
	public Carpentry[] findByUuid_PrevAndNext(
			long carpentryId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
				orderByComparator)
		throws NoSuchCarpentryException;

	/**
	 * Removes all the carpentries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of carpentries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching carpentries
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the carpentry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCarpentryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching carpentry
	 * @throws NoSuchCarpentryException if a matching carpentry could not be found
	 */
	public Carpentry findByUUID_G(String uuid, long groupId)
		throws NoSuchCarpentryException;

	/**
	 * Returns the carpentry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching carpentry, or <code>null</code> if a matching carpentry could not be found
	 */
	public Carpentry fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the carpentry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching carpentry, or <code>null</code> if a matching carpentry could not be found
	 */
	public Carpentry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the carpentry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the carpentry that was removed
	 */
	public Carpentry removeByUUID_G(String uuid, long groupId)
		throws NoSuchCarpentryException;

	/**
	 * Returns the number of carpentries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching carpentries
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the carpentries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching carpentries
	 */
	public java.util.List<Carpentry> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the carpentries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of carpentries
	 * @param end the upper bound of the range of carpentries (not inclusive)
	 * @return the range of matching carpentries
	 */
	public java.util.List<Carpentry> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the carpentries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of carpentries
	 * @param end the upper bound of the range of carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching carpentries
	 */
	public java.util.List<Carpentry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the carpentries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of carpentries
	 * @param end the upper bound of the range of carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching carpentries
	 */
	public java.util.List<Carpentry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first carpentry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching carpentry
	 * @throws NoSuchCarpentryException if a matching carpentry could not be found
	 */
	public Carpentry findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
				orderByComparator)
		throws NoSuchCarpentryException;

	/**
	 * Returns the first carpentry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching carpentry, or <code>null</code> if a matching carpentry could not be found
	 */
	public Carpentry fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
			orderByComparator);

	/**
	 * Returns the last carpentry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching carpentry
	 * @throws NoSuchCarpentryException if a matching carpentry could not be found
	 */
	public Carpentry findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
				orderByComparator)
		throws NoSuchCarpentryException;

	/**
	 * Returns the last carpentry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching carpentry, or <code>null</code> if a matching carpentry could not be found
	 */
	public Carpentry fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
			orderByComparator);

	/**
	 * Returns the carpentries before and after the current carpentry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param carpentryId the primary key of the current carpentry
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next carpentry
	 * @throws NoSuchCarpentryException if a carpentry with the primary key could not be found
	 */
	public Carpentry[] findByUuid_C_PrevAndNext(
			long carpentryId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
				orderByComparator)
		throws NoSuchCarpentryException;

	/**
	 * Removes all the carpentries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of carpentries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching carpentries
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the carpentry where name = &#63; or throws a <code>NoSuchCarpentryException</code> if it could not be found.
	 *
	 * @param name the name
	 * @return the matching carpentry
	 * @throws NoSuchCarpentryException if a matching carpentry could not be found
	 */
	public Carpentry findByName(String name) throws NoSuchCarpentryException;

	/**
	 * Returns the carpentry where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching carpentry, or <code>null</code> if a matching carpentry could not be found
	 */
	public Carpentry fetchByName(String name);

	/**
	 * Returns the carpentry where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching carpentry, or <code>null</code> if a matching carpentry could not be found
	 */
	public Carpentry fetchByName(String name, boolean useFinderCache);

	/**
	 * Removes the carpentry where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the carpentry that was removed
	 */
	public Carpentry removeByName(String name) throws NoSuchCarpentryException;

	/**
	 * Returns the number of carpentries where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching carpentries
	 */
	public int countByName(String name);

	/**
	 * Returns the carpentry where code = &#63; or throws a <code>NoSuchCarpentryException</code> if it could not be found.
	 *
	 * @param code the code
	 * @return the matching carpentry
	 * @throws NoSuchCarpentryException if a matching carpentry could not be found
	 */
	public Carpentry findByCode(String code) throws NoSuchCarpentryException;

	/**
	 * Returns the carpentry where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param code the code
	 * @return the matching carpentry, or <code>null</code> if a matching carpentry could not be found
	 */
	public Carpentry fetchByCode(String code);

	/**
	 * Returns the carpentry where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param code the code
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching carpentry, or <code>null</code> if a matching carpentry could not be found
	 */
	public Carpentry fetchByCode(String code, boolean useFinderCache);

	/**
	 * Removes the carpentry where code = &#63; from the database.
	 *
	 * @param code the code
	 * @return the carpentry that was removed
	 */
	public Carpentry removeByCode(String code) throws NoSuchCarpentryException;

	/**
	 * Returns the number of carpentries where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching carpentries
	 */
	public int countByCode(String code);

	/**
	 * Caches the carpentry in the entity cache if it is enabled.
	 *
	 * @param carpentry the carpentry
	 */
	public void cacheResult(Carpentry carpentry);

	/**
	 * Caches the carpentries in the entity cache if it is enabled.
	 *
	 * @param carpentries the carpentries
	 */
	public void cacheResult(java.util.List<Carpentry> carpentries);

	/**
	 * Creates a new carpentry with the primary key. Does not add the carpentry to the database.
	 *
	 * @param carpentryId the primary key for the new carpentry
	 * @return the new carpentry
	 */
	public Carpentry create(long carpentryId);

	/**
	 * Removes the carpentry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param carpentryId the primary key of the carpentry
	 * @return the carpentry that was removed
	 * @throws NoSuchCarpentryException if a carpentry with the primary key could not be found
	 */
	public Carpentry remove(long carpentryId) throws NoSuchCarpentryException;

	public Carpentry updateImpl(Carpentry carpentry);

	/**
	 * Returns the carpentry with the primary key or throws a <code>NoSuchCarpentryException</code> if it could not be found.
	 *
	 * @param carpentryId the primary key of the carpentry
	 * @return the carpentry
	 * @throws NoSuchCarpentryException if a carpentry with the primary key could not be found
	 */
	public Carpentry findByPrimaryKey(long carpentryId)
		throws NoSuchCarpentryException;

	/**
	 * Returns the carpentry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param carpentryId the primary key of the carpentry
	 * @return the carpentry, or <code>null</code> if a carpentry with the primary key could not be found
	 */
	public Carpentry fetchByPrimaryKey(long carpentryId);

	/**
	 * Returns all the carpentries.
	 *
	 * @return the carpentries
	 */
	public java.util.List<Carpentry> findAll();

	/**
	 * Returns a range of all the carpentries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of carpentries
	 * @param end the upper bound of the range of carpentries (not inclusive)
	 * @return the range of carpentries
	 */
	public java.util.List<Carpentry> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the carpentries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of carpentries
	 * @param end the upper bound of the range of carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of carpentries
	 */
	public java.util.List<Carpentry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the carpentries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of carpentries
	 * @param end the upper bound of the range of carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of carpentries
	 */
	public java.util.List<Carpentry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Carpentry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the carpentries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of carpentries.
	 *
	 * @return the number of carpentries
	 */
	public int countAll();

}