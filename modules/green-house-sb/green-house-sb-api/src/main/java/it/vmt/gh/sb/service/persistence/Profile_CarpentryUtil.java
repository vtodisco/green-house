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

import it.vmt.gh.sb.model.Profile_Carpentry;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the profile_ carpentry service. This utility wraps <code>it.vmt.gh.sb.service.persistence.impl.Profile_CarpentryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Profile_CarpentryPersistence
 * @generated
 */
public class Profile_CarpentryUtil {

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
	public static void clearCache(Profile_Carpentry profile_Carpentry) {
		getPersistence().clearCache(profile_Carpentry);
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
	public static Map<Serializable, Profile_Carpentry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Profile_Carpentry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Profile_Carpentry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Profile_Carpentry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Profile_Carpentry update(
		Profile_Carpentry profile_Carpentry) {

		return getPersistence().update(profile_Carpentry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Profile_Carpentry update(
		Profile_Carpentry profile_Carpentry, ServiceContext serviceContext) {

		return getPersistence().update(profile_Carpentry, serviceContext);
	}

	/**
	 * Returns all the profile_ carpentries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching profile_ carpentries
	 */
	public static List<Profile_Carpentry> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the profile_ carpentries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @return the range of matching profile_ carpentries
	 */
	public static List<Profile_Carpentry> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching profile_ carpentries
	 */
	public static List<Profile_Carpentry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching profile_ carpentries
	 */
	public static List<Profile_Carpentry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first profile_ carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a matching profile_ carpentry could not be found
	 */
	public static Profile_Carpentry findByUuid_First(
			String uuid, OrderByComparator<Profile_Carpentry> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchProfile_CarpentryException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first profile_ carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile_ carpentry, or <code>null</code> if a matching profile_ carpentry could not be found
	 */
	public static Profile_Carpentry fetchByUuid_First(
		String uuid, OrderByComparator<Profile_Carpentry> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last profile_ carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a matching profile_ carpentry could not be found
	 */
	public static Profile_Carpentry findByUuid_Last(
			String uuid, OrderByComparator<Profile_Carpentry> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchProfile_CarpentryException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last profile_ carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile_ carpentry, or <code>null</code> if a matching profile_ carpentry could not be found
	 */
	public static Profile_Carpentry fetchByUuid_Last(
		String uuid, OrderByComparator<Profile_Carpentry> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the profile_ carpentries before and after the current profile_ carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param profile_CarpentryPK the primary key of the current profile_ carpentry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a profile_ carpentry with the primary key could not be found
	 */
	public static Profile_Carpentry[] findByUuid_PrevAndNext(
			it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
				profile_CarpentryPK,
			String uuid, OrderByComparator<Profile_Carpentry> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchProfile_CarpentryException {

		return getPersistence().findByUuid_PrevAndNext(
			profile_CarpentryPK, uuid, orderByComparator);
	}

	/**
	 * Removes all the profile_ carpentries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of profile_ carpentries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching profile_ carpentries
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the profile_ carpentries where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @return the matching profile_ carpentries
	 */
	public static List<Profile_Carpentry> findByProfile(long profileId) {
		return getPersistence().findByProfile(profileId);
	}

	/**
	 * Returns a range of all the profile_ carpentries where profileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param profileId the profile ID
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @return the range of matching profile_ carpentries
	 */
	public static List<Profile_Carpentry> findByProfile(
		long profileId, int start, int end) {

		return getPersistence().findByProfile(profileId, start, end);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries where profileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param profileId the profile ID
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching profile_ carpentries
	 */
	public static List<Profile_Carpentry> findByProfile(
		long profileId, int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		return getPersistence().findByProfile(
			profileId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries where profileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param profileId the profile ID
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching profile_ carpentries
	 */
	public static List<Profile_Carpentry> findByProfile(
		long profileId, int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByProfile(
			profileId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first profile_ carpentry in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a matching profile_ carpentry could not be found
	 */
	public static Profile_Carpentry findByProfile_First(
			long profileId,
			OrderByComparator<Profile_Carpentry> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchProfile_CarpentryException {

		return getPersistence().findByProfile_First(
			profileId, orderByComparator);
	}

	/**
	 * Returns the first profile_ carpentry in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile_ carpentry, or <code>null</code> if a matching profile_ carpentry could not be found
	 */
	public static Profile_Carpentry fetchByProfile_First(
		long profileId,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		return getPersistence().fetchByProfile_First(
			profileId, orderByComparator);
	}

	/**
	 * Returns the last profile_ carpentry in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a matching profile_ carpentry could not be found
	 */
	public static Profile_Carpentry findByProfile_Last(
			long profileId,
			OrderByComparator<Profile_Carpentry> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchProfile_CarpentryException {

		return getPersistence().findByProfile_Last(
			profileId, orderByComparator);
	}

	/**
	 * Returns the last profile_ carpentry in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile_ carpentry, or <code>null</code> if a matching profile_ carpentry could not be found
	 */
	public static Profile_Carpentry fetchByProfile_Last(
		long profileId,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		return getPersistence().fetchByProfile_Last(
			profileId, orderByComparator);
	}

	/**
	 * Returns the profile_ carpentries before and after the current profile_ carpentry in the ordered set where profileId = &#63;.
	 *
	 * @param profile_CarpentryPK the primary key of the current profile_ carpentry
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a profile_ carpentry with the primary key could not be found
	 */
	public static Profile_Carpentry[] findByProfile_PrevAndNext(
			it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
				profile_CarpentryPK,
			long profileId,
			OrderByComparator<Profile_Carpentry> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchProfile_CarpentryException {

		return getPersistence().findByProfile_PrevAndNext(
			profile_CarpentryPK, profileId, orderByComparator);
	}

	/**
	 * Removes all the profile_ carpentries where profileId = &#63; from the database.
	 *
	 * @param profileId the profile ID
	 */
	public static void removeByProfile(long profileId) {
		getPersistence().removeByProfile(profileId);
	}

	/**
	 * Returns the number of profile_ carpentries where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @return the number of matching profile_ carpentries
	 */
	public static int countByProfile(long profileId) {
		return getPersistence().countByProfile(profileId);
	}

	/**
	 * Returns all the profile_ carpentries where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @return the matching profile_ carpentries
	 */
	public static List<Profile_Carpentry> findByCarpentry(long carpentryId) {
		return getPersistence().findByCarpentry(carpentryId);
	}

	/**
	 * Returns a range of all the profile_ carpentries where carpentryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param carpentryId the carpentry ID
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @return the range of matching profile_ carpentries
	 */
	public static List<Profile_Carpentry> findByCarpentry(
		long carpentryId, int start, int end) {

		return getPersistence().findByCarpentry(carpentryId, start, end);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries where carpentryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param carpentryId the carpentry ID
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching profile_ carpentries
	 */
	public static List<Profile_Carpentry> findByCarpentry(
		long carpentryId, int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		return getPersistence().findByCarpentry(
			carpentryId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries where carpentryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param carpentryId the carpentry ID
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching profile_ carpentries
	 */
	public static List<Profile_Carpentry> findByCarpentry(
		long carpentryId, int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCarpentry(
			carpentryId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first profile_ carpentry in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a matching profile_ carpentry could not be found
	 */
	public static Profile_Carpentry findByCarpentry_First(
			long carpentryId,
			OrderByComparator<Profile_Carpentry> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchProfile_CarpentryException {

		return getPersistence().findByCarpentry_First(
			carpentryId, orderByComparator);
	}

	/**
	 * Returns the first profile_ carpentry in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile_ carpentry, or <code>null</code> if a matching profile_ carpentry could not be found
	 */
	public static Profile_Carpentry fetchByCarpentry_First(
		long carpentryId,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		return getPersistence().fetchByCarpentry_First(
			carpentryId, orderByComparator);
	}

	/**
	 * Returns the last profile_ carpentry in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a matching profile_ carpentry could not be found
	 */
	public static Profile_Carpentry findByCarpentry_Last(
			long carpentryId,
			OrderByComparator<Profile_Carpentry> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchProfile_CarpentryException {

		return getPersistence().findByCarpentry_Last(
			carpentryId, orderByComparator);
	}

	/**
	 * Returns the last profile_ carpentry in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile_ carpentry, or <code>null</code> if a matching profile_ carpentry could not be found
	 */
	public static Profile_Carpentry fetchByCarpentry_Last(
		long carpentryId,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		return getPersistence().fetchByCarpentry_Last(
			carpentryId, orderByComparator);
	}

	/**
	 * Returns the profile_ carpentries before and after the current profile_ carpentry in the ordered set where carpentryId = &#63;.
	 *
	 * @param profile_CarpentryPK the primary key of the current profile_ carpentry
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a profile_ carpentry with the primary key could not be found
	 */
	public static Profile_Carpentry[] findByCarpentry_PrevAndNext(
			it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
				profile_CarpentryPK,
			long carpentryId,
			OrderByComparator<Profile_Carpentry> orderByComparator)
		throws it.vmt.gh.sb.exception.NoSuchProfile_CarpentryException {

		return getPersistence().findByCarpentry_PrevAndNext(
			profile_CarpentryPK, carpentryId, orderByComparator);
	}

	/**
	 * Removes all the profile_ carpentries where carpentryId = &#63; from the database.
	 *
	 * @param carpentryId the carpentry ID
	 */
	public static void removeByCarpentry(long carpentryId) {
		getPersistence().removeByCarpentry(carpentryId);
	}

	/**
	 * Returns the number of profile_ carpentries where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @return the number of matching profile_ carpentries
	 */
	public static int countByCarpentry(long carpentryId) {
		return getPersistence().countByCarpentry(carpentryId);
	}

	/**
	 * Caches the profile_ carpentry in the entity cache if it is enabled.
	 *
	 * @param profile_Carpentry the profile_ carpentry
	 */
	public static void cacheResult(Profile_Carpentry profile_Carpentry) {
		getPersistence().cacheResult(profile_Carpentry);
	}

	/**
	 * Caches the profile_ carpentries in the entity cache if it is enabled.
	 *
	 * @param profile_Carpentries the profile_ carpentries
	 */
	public static void cacheResult(
		List<Profile_Carpentry> profile_Carpentries) {

		getPersistence().cacheResult(profile_Carpentries);
	}

	/**
	 * Creates a new profile_ carpentry with the primary key. Does not add the profile_ carpentry to the database.
	 *
	 * @param profile_CarpentryPK the primary key for the new profile_ carpentry
	 * @return the new profile_ carpentry
	 */
	public static Profile_Carpentry create(
		it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
			profile_CarpentryPK) {

		return getPersistence().create(profile_CarpentryPK);
	}

	/**
	 * Removes the profile_ carpentry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param profile_CarpentryPK the primary key of the profile_ carpentry
	 * @return the profile_ carpentry that was removed
	 * @throws NoSuchProfile_CarpentryException if a profile_ carpentry with the primary key could not be found
	 */
	public static Profile_Carpentry remove(
			it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
				profile_CarpentryPK)
		throws it.vmt.gh.sb.exception.NoSuchProfile_CarpentryException {

		return getPersistence().remove(profile_CarpentryPK);
	}

	public static Profile_Carpentry updateImpl(
		Profile_Carpentry profile_Carpentry) {

		return getPersistence().updateImpl(profile_Carpentry);
	}

	/**
	 * Returns the profile_ carpentry with the primary key or throws a <code>NoSuchProfile_CarpentryException</code> if it could not be found.
	 *
	 * @param profile_CarpentryPK the primary key of the profile_ carpentry
	 * @return the profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a profile_ carpentry with the primary key could not be found
	 */
	public static Profile_Carpentry findByPrimaryKey(
			it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
				profile_CarpentryPK)
		throws it.vmt.gh.sb.exception.NoSuchProfile_CarpentryException {

		return getPersistence().findByPrimaryKey(profile_CarpentryPK);
	}

	/**
	 * Returns the profile_ carpentry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param profile_CarpentryPK the primary key of the profile_ carpentry
	 * @return the profile_ carpentry, or <code>null</code> if a profile_ carpentry with the primary key could not be found
	 */
	public static Profile_Carpentry fetchByPrimaryKey(
		it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
			profile_CarpentryPK) {

		return getPersistence().fetchByPrimaryKey(profile_CarpentryPK);
	}

	/**
	 * Returns all the profile_ carpentries.
	 *
	 * @return the profile_ carpentries
	 */
	public static List<Profile_Carpentry> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the profile_ carpentries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @return the range of profile_ carpentries
	 */
	public static List<Profile_Carpentry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of profile_ carpentries
	 */
	public static List<Profile_Carpentry> findAll(
		int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of profile_ carpentries
	 */
	public static List<Profile_Carpentry> findAll(
		int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the profile_ carpentries from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of profile_ carpentries.
	 *
	 * @return the number of profile_ carpentries
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static Profile_CarpentryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<Profile_CarpentryPersistence, Profile_CarpentryPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			Profile_CarpentryPersistence.class);

		ServiceTracker
			<Profile_CarpentryPersistence, Profile_CarpentryPersistence>
				serviceTracker =
					new ServiceTracker
						<Profile_CarpentryPersistence,
						 Profile_CarpentryPersistence>(
							 bundle.getBundleContext(),
							 Profile_CarpentryPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}