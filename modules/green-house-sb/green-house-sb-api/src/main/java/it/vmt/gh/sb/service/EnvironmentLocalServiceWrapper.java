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
 * Provides a wrapper for {@link EnvironmentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EnvironmentLocalService
 * @generated
 */
public class EnvironmentLocalServiceWrapper
	implements EnvironmentLocalService,
			   ServiceWrapper<EnvironmentLocalService> {

	public EnvironmentLocalServiceWrapper(
		EnvironmentLocalService environmentLocalService) {

		_environmentLocalService = environmentLocalService;
	}

	/**
	 * Adds the environment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EnvironmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param environment the environment
	 * @return the environment that was added
	 */
	@Override
	public it.vmt.gh.sb.model.Environment addEnvironment(
		it.vmt.gh.sb.model.Environment environment) {

		return _environmentLocalService.addEnvironment(environment);
	}

	/**
	 * Creates a new environment with the primary key. Does not add the environment to the database.
	 *
	 * @param environmentId the primary key for the new environment
	 * @return the new environment
	 */
	@Override
	public it.vmt.gh.sb.model.Environment createEnvironment(
		long environmentId) {

		return _environmentLocalService.createEnvironment(environmentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _environmentLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the environment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EnvironmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param environment the environment
	 * @return the environment that was removed
	 */
	@Override
	public it.vmt.gh.sb.model.Environment deleteEnvironment(
		it.vmt.gh.sb.model.Environment environment) {

		return _environmentLocalService.deleteEnvironment(environment);
	}

	/**
	 * Deletes the environment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EnvironmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param environmentId the primary key of the environment
	 * @return the environment that was removed
	 * @throws PortalException if a environment with the primary key could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Environment deleteEnvironment(long environmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _environmentLocalService.deleteEnvironment(environmentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _environmentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _environmentLocalService.dynamicQuery();
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

		return _environmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.EnvironmentModelImpl</code>.
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

		return _environmentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.EnvironmentModelImpl</code>.
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

		return _environmentLocalService.dynamicQuery(
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

		return _environmentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _environmentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public it.vmt.gh.sb.model.Environment fetchEnvironment(long environmentId) {
		return _environmentLocalService.fetchEnvironment(environmentId);
	}

	/**
	 * Returns the environment matching the UUID and group.
	 *
	 * @param uuid the environment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching environment, or <code>null</code> if a matching environment could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Environment fetchEnvironmentByUuidAndGroupId(
		String uuid, long groupId) {

		return _environmentLocalService.fetchEnvironmentByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject fillEnvironmentJson(
		it.vmt.gh.sb.model.Environment environment) {

		return _environmentLocalService.fillEnvironmentJson(environment);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _environmentLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the environment with the primary key.
	 *
	 * @param environmentId the primary key of the environment
	 * @return the environment
	 * @throws PortalException if a environment with the primary key could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Environment getEnvironment(long environmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _environmentLocalService.getEnvironment(environmentId);
	}

	/**
	 * Returns the environment matching the UUID and group.
	 *
	 * @param uuid the environment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching environment
	 * @throws PortalException if a matching environment could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Environment getEnvironmentByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _environmentLocalService.getEnvironmentByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public String getEnvironments() {
		return _environmentLocalService.getEnvironments();
	}

	/**
	 * Returns a range of all the environments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.EnvironmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of environments
	 * @param end the upper bound of the range of environments (not inclusive)
	 * @return the range of environments
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Environment> getEnvironments(
		int start, int end) {

		return _environmentLocalService.getEnvironments(start, end);
	}

	/**
	 * Returns all the environments matching the UUID and company.
	 *
	 * @param uuid the UUID of the environments
	 * @param companyId the primary key of the company
	 * @return the matching environments, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Environment>
		getEnvironmentsByUuidAndCompanyId(String uuid, long companyId) {

		return _environmentLocalService.getEnvironmentsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of environments matching the UUID and company.
	 *
	 * @param uuid the UUID of the environments
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of environments
	 * @param end the upper bound of the range of environments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching environments, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Environment>
		getEnvironmentsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<it.vmt.gh.sb.model.Environment> orderByComparator) {

		return _environmentLocalService.getEnvironmentsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of environments.
	 *
	 * @return the number of environments
	 */
	@Override
	public int getEnvironmentsCount() {
		return _environmentLocalService.getEnvironmentsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _environmentLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _environmentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _environmentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _environmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the environment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EnvironmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param environment the environment
	 * @return the environment that was updated
	 */
	@Override
	public it.vmt.gh.sb.model.Environment updateEnvironment(
		it.vmt.gh.sb.model.Environment environment) {

		return _environmentLocalService.updateEnvironment(environment);
	}

	@Override
	public it.vmt.gh.sb.model.Environment updateEnvironment(
		long environmentId, long groupId, long userId, String name) {

		return _environmentLocalService.updateEnvironment(
			environmentId, groupId, userId, name);
	}

	@Override
	public EnvironmentLocalService getWrappedService() {
		return _environmentLocalService;
	}

	@Override
	public void setWrappedService(
		EnvironmentLocalService environmentLocalService) {

		_environmentLocalService = environmentLocalService;
	}

	private EnvironmentLocalService _environmentLocalService;

}