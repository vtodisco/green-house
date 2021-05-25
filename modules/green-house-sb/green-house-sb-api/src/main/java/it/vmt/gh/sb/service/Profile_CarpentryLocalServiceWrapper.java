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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Profile_CarpentryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Profile_CarpentryLocalService
 * @generated
 */
public class Profile_CarpentryLocalServiceWrapper
	implements Profile_CarpentryLocalService,
			   ServiceWrapper<Profile_CarpentryLocalService> {

	public Profile_CarpentryLocalServiceWrapper(
		Profile_CarpentryLocalService profile_CarpentryLocalService) {

		_profile_CarpentryLocalService = profile_CarpentryLocalService;
	}

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
	@Override
	public it.vmt.gh.sb.model.Profile_Carpentry addProfile_Carpentry(
		it.vmt.gh.sb.model.Profile_Carpentry profile_Carpentry) {

		return _profile_CarpentryLocalService.addProfile_Carpentry(
			profile_Carpentry);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _profile_CarpentryLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new profile_ carpentry with the primary key. Does not add the profile_ carpentry to the database.
	 *
	 * @param profile_CarpentryPK the primary key for the new profile_ carpentry
	 * @return the new profile_ carpentry
	 */
	@Override
	public it.vmt.gh.sb.model.Profile_Carpentry createProfile_Carpentry(
		it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
			profile_CarpentryPK) {

		return _profile_CarpentryLocalService.createProfile_Carpentry(
			profile_CarpentryPK);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _profile_CarpentryLocalService.deletePersistedModel(
			persistedModel);
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
	@Override
	public it.vmt.gh.sb.model.Profile_Carpentry deleteProfile_Carpentry(
		it.vmt.gh.sb.model.Profile_Carpentry profile_Carpentry) {

		return _profile_CarpentryLocalService.deleteProfile_Carpentry(
			profile_Carpentry);
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
	@Override
	public it.vmt.gh.sb.model.Profile_Carpentry deleteProfile_Carpentry(
			it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
				profile_CarpentryPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _profile_CarpentryLocalService.deleteProfile_Carpentry(
			profile_CarpentryPK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _profile_CarpentryLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _profile_CarpentryLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _profile_CarpentryLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _profile_CarpentryLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _profile_CarpentryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _profile_CarpentryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public it.vmt.gh.sb.model.Profile_Carpentry fetchProfile_Carpentry(
		it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
			profile_CarpentryPK) {

		return _profile_CarpentryLocalService.fetchProfile_Carpentry(
			profile_CarpentryPK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _profile_CarpentryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _profile_CarpentryLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _profile_CarpentryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _profile_CarpentryLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<it.vmt.gh.sb.model.Profile_Carpentry>
		getProfile_Carpentries(int start, int end) {

		return _profile_CarpentryLocalService.getProfile_Carpentries(
			start, end);
	}

	/**
	 * Returns the number of profile_ carpentries.
	 *
	 * @return the number of profile_ carpentries
	 */
	@Override
	public int getProfile_CarpentriesCount() {
		return _profile_CarpentryLocalService.getProfile_CarpentriesCount();
	}

	/**
	 * Returns the profile_ carpentry with the primary key.
	 *
	 * @param profile_CarpentryPK the primary key of the profile_ carpentry
	 * @return the profile_ carpentry
	 * @throws PortalException if a profile_ carpentry with the primary key could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Profile_Carpentry getProfile_Carpentry(
			it.vmt.gh.sb.service.persistence.Profile_CarpentryPK
				profile_CarpentryPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _profile_CarpentryLocalService.getProfile_Carpentry(
			profile_CarpentryPK);
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
	@Override
	public it.vmt.gh.sb.model.Profile_Carpentry updateProfile_Carpentry(
		it.vmt.gh.sb.model.Profile_Carpentry profile_Carpentry) {

		return _profile_CarpentryLocalService.updateProfile_Carpentry(
			profile_Carpentry);
	}

	@Override
	public Profile_CarpentryLocalService getWrappedService() {
		return _profile_CarpentryLocalService;
	}

	@Override
	public void setWrappedService(
		Profile_CarpentryLocalService profile_CarpentryLocalService) {

		_profile_CarpentryLocalService = profile_CarpentryLocalService;
	}

	private Profile_CarpentryLocalService _profile_CarpentryLocalService;

}