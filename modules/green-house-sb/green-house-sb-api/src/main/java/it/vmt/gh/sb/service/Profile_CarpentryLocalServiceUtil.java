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
 * Provides the local service utility for Profile_Carpentry. This utility wraps
 * <code>it.vmt.gh.sb.service.impl.Profile_CarpentryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see Profile_CarpentryLocalService
 * @generated
 */
public class Profile_CarpentryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>it.vmt.gh.sb.service.impl.Profile_CarpentryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the profile_ carpentry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Profile_CarpentryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param profile_Carpentry the profile_ carpentry
	 * @return the profile_ carpentry that was added
	 */
	public static it.vmt.gh.sb.model.Profile_Carpentry addProfile_Carpentry(
		it.vmt.gh.sb.model.Profile_Carpentry profile_Carpentry) {

		return getService().addProfile_Carpentry(profile_Carpentry);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new profile_ carpentry with the primary key. Does not add the profile_ carpentry to the database.
	 *
	 * @param profile_CarpentryPK the primary key for the new profile_ carpentry
	 * @return the new profile_ carpentry
	 */
	public static it.vmt.gh.sb.model.Profile_Carpentry createProfile_Carpentry(
		it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
			profile_CarpentryPK) {

		return getService().createProfile_Carpentry(profile_CarpentryPK);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the profile_ carpentry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Profile_CarpentryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param profile_Carpentry the profile_ carpentry
	 * @return the profile_ carpentry that was removed
	 */
	public static it.vmt.gh.sb.model.Profile_Carpentry deleteProfile_Carpentry(
		it.vmt.gh.sb.model.Profile_Carpentry profile_Carpentry) {

		return getService().deleteProfile_Carpentry(profile_Carpentry);
	}

	/**
	 * Deletes the profile_ carpentry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Profile_CarpentryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param profile_CarpentryPK the primary key of the profile_ carpentry
	 * @return the profile_ carpentry that was removed
	 * @throws PortalException if a profile_ carpentry with the primary key could not be found
	 */
	public static it.vmt.gh.sb.model.Profile_Carpentry deleteProfile_Carpentry(
			it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
				profile_CarpentryPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteProfile_Carpentry(profile_CarpentryPK);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static it.vmt.gh.sb.model.Profile_Carpentry fetchProfile_Carpentry(
		it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
			profile_CarpentryPK) {

		return getService().fetchProfile_Carpentry(profile_CarpentryPK);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns a range of all the profile_ carpentries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @return the range of profile_ carpentries
	 */
	public static java.util.List<it.vmt.gh.sb.model.Profile_Carpentry>
		getProfile_Carpentries(int start, int end) {

		return getService().getProfile_Carpentries(start, end);
	}

	/**
	 * Returns the number of profile_ carpentries.
	 *
	 * @return the number of profile_ carpentries
	 */
	public static int getProfile_CarpentriesCount() {
		return getService().getProfile_CarpentriesCount();
	}

	/**
	 * Returns the profile_ carpentry with the primary key.
	 *
	 * @param profile_CarpentryPK the primary key of the profile_ carpentry
	 * @return the profile_ carpentry
	 * @throws PortalException if a profile_ carpentry with the primary key could not be found
	 */
	public static it.vmt.gh.sb.model.Profile_Carpentry getProfile_Carpentry(
			it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
				profile_CarpentryPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getProfile_Carpentry(profile_CarpentryPK);
	}

	/**
	 * Updates the profile_ carpentry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Profile_CarpentryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param profile_Carpentry the profile_ carpentry
	 * @return the profile_ carpentry that was updated
	 */
	public static it.vmt.gh.sb.model.Profile_Carpentry updateProfile_Carpentry(
		it.vmt.gh.sb.model.Profile_Carpentry profile_Carpentry) {

		return getService().updateProfile_Carpentry(profile_Carpentry);
	}

	public static Profile_CarpentryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<Profile_CarpentryLocalService, Profile_CarpentryLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			Profile_CarpentryLocalService.class);

		ServiceTracker
			<Profile_CarpentryLocalService, Profile_CarpentryLocalService>
				serviceTracker =
					new ServiceTracker
						<Profile_CarpentryLocalService,
						 Profile_CarpentryLocalService>(
							 bundle.getBundleContext(),
							 Profile_CarpentryLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}