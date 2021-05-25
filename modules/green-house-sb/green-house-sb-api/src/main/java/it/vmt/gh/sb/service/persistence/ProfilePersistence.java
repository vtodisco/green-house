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

import it.vmt.gh.sb.exception.NoSuchProfileException;
import it.vmt.gh.sb.model.Profile;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the profile service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProfileUtil
 * @generated
 */
@ProviderType
public interface ProfilePersistence extends BasePersistence<Profile> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProfileUtil} to access the profile persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the profiles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching profiles
	 */
	public java.util.List<Profile> findByUuid(String uuid);

	/**
	 * Returns a range of all the profiles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfileModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of profiles
	 * @param end the upper bound of the range of profiles (not inclusive)
	 * @return the range of matching profiles
	 */
	public java.util.List<Profile> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the profiles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfileModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of profiles
	 * @param end the upper bound of the range of profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching profiles
	 */
	public java.util.List<Profile> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Profile>
			orderByComparator);

	/**
	 * Returns an ordered range of all the profiles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfileModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of profiles
	 * @param end the upper bound of the range of profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching profiles
	 */
	public java.util.List<Profile> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Profile>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first profile in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile
	 * @throws NoSuchProfileException if a matching profile could not be found
	 */
	public Profile findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Profile>
				orderByComparator)
		throws NoSuchProfileException;

	/**
	 * Returns the first profile in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile, or <code>null</code> if a matching profile could not be found
	 */
	public Profile fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Profile>
			orderByComparator);

	/**
	 * Returns the last profile in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile
	 * @throws NoSuchProfileException if a matching profile could not be found
	 */
	public Profile findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Profile>
				orderByComparator)
		throws NoSuchProfileException;

	/**
	 * Returns the last profile in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile, or <code>null</code> if a matching profile could not be found
	 */
	public Profile fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Profile>
			orderByComparator);

	/**
	 * Returns the profiles before and after the current profile in the ordered set where uuid = &#63;.
	 *
	 * @param profileId the primary key of the current profile
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next profile
	 * @throws NoSuchProfileException if a profile with the primary key could not be found
	 */
	public Profile[] findByUuid_PrevAndNext(
			long profileId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Profile>
				orderByComparator)
		throws NoSuchProfileException;

	/**
	 * Removes all the profiles where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of profiles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching profiles
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the profile where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchProfileException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching profile
	 * @throws NoSuchProfileException if a matching profile could not be found
	 */
	public Profile findByUUID_G(String uuid, long groupId)
		throws NoSuchProfileException;

	/**
	 * Returns the profile where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching profile, or <code>null</code> if a matching profile could not be found
	 */
	public Profile fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the profile where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching profile, or <code>null</code> if a matching profile could not be found
	 */
	public Profile fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the profile where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the profile that was removed
	 */
	public Profile removeByUUID_G(String uuid, long groupId)
		throws NoSuchProfileException;

	/**
	 * Returns the number of profiles where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching profiles
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the profiles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching profiles
	 */
	public java.util.List<Profile> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the profiles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfileModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of profiles
	 * @param end the upper bound of the range of profiles (not inclusive)
	 * @return the range of matching profiles
	 */
	public java.util.List<Profile> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the profiles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfileModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of profiles
	 * @param end the upper bound of the range of profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching profiles
	 */
	public java.util.List<Profile> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Profile>
			orderByComparator);

	/**
	 * Returns an ordered range of all the profiles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfileModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of profiles
	 * @param end the upper bound of the range of profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching profiles
	 */
	public java.util.List<Profile> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Profile>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first profile in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile
	 * @throws NoSuchProfileException if a matching profile could not be found
	 */
	public Profile findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Profile>
				orderByComparator)
		throws NoSuchProfileException;

	/**
	 * Returns the first profile in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile, or <code>null</code> if a matching profile could not be found
	 */
	public Profile fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Profile>
			orderByComparator);

	/**
	 * Returns the last profile in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile
	 * @throws NoSuchProfileException if a matching profile could not be found
	 */
	public Profile findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Profile>
				orderByComparator)
		throws NoSuchProfileException;

	/**
	 * Returns the last profile in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile, or <code>null</code> if a matching profile could not be found
	 */
	public Profile fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Profile>
			orderByComparator);

	/**
	 * Returns the profiles before and after the current profile in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param profileId the primary key of the current profile
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next profile
	 * @throws NoSuchProfileException if a profile with the primary key could not be found
	 */
	public Profile[] findByUuid_C_PrevAndNext(
			long profileId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Profile>
				orderByComparator)
		throws NoSuchProfileException;

	/**
	 * Removes all the profiles where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of profiles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching profiles
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the profile where name = &#63; or throws a <code>NoSuchProfileException</code> if it could not be found.
	 *
	 * @param name the name
	 * @return the matching profile
	 * @throws NoSuchProfileException if a matching profile could not be found
	 */
	public Profile findByName(String name) throws NoSuchProfileException;

	/**
	 * Returns the profile where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching profile, or <code>null</code> if a matching profile could not be found
	 */
	public Profile fetchByName(String name);

	/**
	 * Returns the profile where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching profile, or <code>null</code> if a matching profile could not be found
	 */
	public Profile fetchByName(String name, boolean useFinderCache);

	/**
	 * Removes the profile where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the profile that was removed
	 */
	public Profile removeByName(String name) throws NoSuchProfileException;

	/**
	 * Returns the number of profiles where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching profiles
	 */
	public int countByName(String name);

	/**
	 * Returns the profile where code = &#63; or throws a <code>NoSuchProfileException</code> if it could not be found.
	 *
	 * @param code the code
	 * @return the matching profile
	 * @throws NoSuchProfileException if a matching profile could not be found
	 */
	public Profile findByCode(String code) throws NoSuchProfileException;

	/**
	 * Returns the profile where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param code the code
	 * @return the matching profile, or <code>null</code> if a matching profile could not be found
	 */
	public Profile fetchByCode(String code);

	/**
	 * Returns the profile where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param code the code
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching profile, or <code>null</code> if a matching profile could not be found
	 */
	public Profile fetchByCode(String code, boolean useFinderCache);

	/**
	 * Removes the profile where code = &#63; from the database.
	 *
	 * @param code the code
	 * @return the profile that was removed
	 */
	public Profile removeByCode(String code) throws NoSuchProfileException;

	/**
	 * Returns the number of profiles where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching profiles
	 */
	public int countByCode(String code);

	/**
	 * Caches the profile in the entity cache if it is enabled.
	 *
	 * @param profile the profile
	 */
	public void cacheResult(Profile profile);

	/**
	 * Caches the profiles in the entity cache if it is enabled.
	 *
	 * @param profiles the profiles
	 */
	public void cacheResult(java.util.List<Profile> profiles);

	/**
	 * Creates a new profile with the primary key. Does not add the profile to the database.
	 *
	 * @param profileId the primary key for the new profile
	 * @return the new profile
	 */
	public Profile create(long profileId);

	/**
	 * Removes the profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param profileId the primary key of the profile
	 * @return the profile that was removed
	 * @throws NoSuchProfileException if a profile with the primary key could not be found
	 */
	public Profile remove(long profileId) throws NoSuchProfileException;

	public Profile updateImpl(Profile profile);

	/**
	 * Returns the profile with the primary key or throws a <code>NoSuchProfileException</code> if it could not be found.
	 *
	 * @param profileId the primary key of the profile
	 * @return the profile
	 * @throws NoSuchProfileException if a profile with the primary key could not be found
	 */
	public Profile findByPrimaryKey(long profileId)
		throws NoSuchProfileException;

	/**
	 * Returns the profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param profileId the primary key of the profile
	 * @return the profile, or <code>null</code> if a profile with the primary key could not be found
	 */
	public Profile fetchByPrimaryKey(long profileId);

	/**
	 * Returns all the profiles.
	 *
	 * @return the profiles
	 */
	public java.util.List<Profile> findAll();

	/**
	 * Returns a range of all the profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of profiles
	 * @param end the upper bound of the range of profiles (not inclusive)
	 * @return the range of profiles
	 */
	public java.util.List<Profile> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of profiles
	 * @param end the upper bound of the range of profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of profiles
	 */
	public java.util.List<Profile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Profile>
			orderByComparator);

	/**
	 * Returns an ordered range of all the profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of profiles
	 * @param end the upper bound of the range of profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of profiles
	 */
	public java.util.List<Profile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Profile>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the profiles from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of profiles.
	 *
	 * @return the number of profiles
	 */
	public int countAll();

}