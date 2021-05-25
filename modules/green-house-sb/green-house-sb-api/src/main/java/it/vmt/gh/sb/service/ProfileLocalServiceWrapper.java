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
 * Provides a wrapper for {@link ProfileLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProfileLocalService
 * @generated
 */
public class ProfileLocalServiceWrapper
	implements ProfileLocalService, ServiceWrapper<ProfileLocalService> {

	public ProfileLocalServiceWrapper(ProfileLocalService profileLocalService) {
		_profileLocalService = profileLocalService;
	}

	/**
	 * Adds the profile to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param profile the profile
	 * @return the profile that was added
	 */
	@Override
	public it.vmt.gh.sb.model.Profile addProfile(
		it.vmt.gh.sb.model.Profile profile) {

		return _profileLocalService.addProfile(profile);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _profileLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new profile with the primary key. Does not add the profile to the database.
	 *
	 * @param profileId the primary key for the new profile
	 * @return the new profile
	 */
	@Override
	public it.vmt.gh.sb.model.Profile createProfile(long profileId) {
		return _profileLocalService.createProfile(profileId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _profileLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param profileId the primary key of the profile
	 * @return the profile that was removed
	 * @throws PortalException if a profile with the primary key could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Profile deleteProfile(long profileId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _profileLocalService.deleteProfile(profileId);
	}

	/**
	 * Deletes the profile from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param profile the profile
	 * @return the profile that was removed
	 */
	@Override
	public it.vmt.gh.sb.model.Profile deleteProfile(
		it.vmt.gh.sb.model.Profile profile) {

		return _profileLocalService.deleteProfile(profile);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _profileLocalService.dynamicQuery();
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

		return _profileLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.ProfileModelImpl</code>.
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

		return _profileLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.ProfileModelImpl</code>.
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

		return _profileLocalService.dynamicQuery(
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

		return _profileLocalService.dynamicQueryCount(dynamicQuery);
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

		return _profileLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public it.vmt.gh.sb.model.Profile fetchProfile(long profileId) {
		return _profileLocalService.fetchProfile(profileId);
	}

	/**
	 * Returns the profile matching the UUID and group.
	 *
	 * @param uuid the profile's UUID
	 * @param groupId the primary key of the group
	 * @return the matching profile, or <code>null</code> if a matching profile could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Profile fetchProfileByUuidAndGroupId(
		String uuid, long groupId) {

		return _profileLocalService.fetchProfileByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject fillProfileJson(
		it.vmt.gh.sb.model.Profile profile) {

		return _profileLocalService.fillProfileJson(profile);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _profileLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _profileLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _profileLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _profileLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _profileLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the profile with the primary key.
	 *
	 * @param profileId the primary key of the profile
	 * @return the profile
	 * @throws PortalException if a profile with the primary key could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Profile getProfile(long profileId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _profileLocalService.getProfile(profileId);
	}

	/**
	 * Returns the profile matching the UUID and group.
	 *
	 * @param uuid the profile's UUID
	 * @param groupId the primary key of the group
	 * @return the matching profile
	 * @throws PortalException if a matching profile could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Profile getProfileByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _profileLocalService.getProfileByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public String getProfileImages(long groupId, String name) {
		return _profileLocalService.getProfileImages(groupId, name);
	}

	/**
	 * Returns a range of all the profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.ProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of profiles
	 * @param end the upper bound of the range of profiles (not inclusive)
	 * @return the range of profiles
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Profile> getProfiles(
		int start, int end) {

		return _profileLocalService.getProfiles(start, end);
	}

	/**
	 * Returns all the profiles matching the UUID and company.
	 *
	 * @param uuid the UUID of the profiles
	 * @param companyId the primary key of the company
	 * @return the matching profiles, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Profile>
		getProfilesByUuidAndCompanyId(String uuid, long companyId) {

		return _profileLocalService.getProfilesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of profiles matching the UUID and company.
	 *
	 * @param uuid the UUID of the profiles
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of profiles
	 * @param end the upper bound of the range of profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching profiles, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Profile>
		getProfilesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<it.vmt.gh.sb.model.Profile> orderByComparator) {

		return _profileLocalService.getProfilesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of profiles.
	 *
	 * @return the number of profiles
	 */
	@Override
	public int getProfilesCount() {
		return _profileLocalService.getProfilesCount();
	}

	@Override
	public it.vmt.gh.sb.model.Profile updateProfile(
		long profileId, long groupId, long userId, String code, String name,
		double price, String img) {

		return _profileLocalService.updateProfile(
			profileId, groupId, userId, code, name, price, img);
	}

	/**
	 * Updates the profile in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param profile the profile
	 * @return the profile that was updated
	 */
	@Override
	public it.vmt.gh.sb.model.Profile updateProfile(
		it.vmt.gh.sb.model.Profile profile) {

		return _profileLocalService.updateProfile(profile);
	}

	@Override
	public ProfileLocalService getWrappedService() {
		return _profileLocalService;
	}

	@Override
	public void setWrappedService(ProfileLocalService profileLocalService) {
		_profileLocalService = profileLocalService;
	}

	private ProfileLocalService _profileLocalService;

}