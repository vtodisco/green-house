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
 * Provides a wrapper for {@link CarpentryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CarpentryLocalService
 * @generated
 */
public class CarpentryLocalServiceWrapper
	implements CarpentryLocalService, ServiceWrapper<CarpentryLocalService> {

	public CarpentryLocalServiceWrapper(
		CarpentryLocalService carpentryLocalService) {

		_carpentryLocalService = carpentryLocalService;
	}

	/**
	 * Adds the carpentry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CarpentryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param carpentry the carpentry
	 * @return the carpentry that was added
	 */
	@Override
	public it.vmt.gh.sb.model.Carpentry addCarpentry(
		it.vmt.gh.sb.model.Carpentry carpentry) {

		return _carpentryLocalService.addCarpentry(carpentry);
	}

	/**
	 * Creates a new carpentry with the primary key. Does not add the carpentry to the database.
	 *
	 * @param carpentryId the primary key for the new carpentry
	 * @return the new carpentry
	 */
	@Override
	public it.vmt.gh.sb.model.Carpentry createCarpentry(long carpentryId) {
		return _carpentryLocalService.createCarpentry(carpentryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _carpentryLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the carpentry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CarpentryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param carpentry the carpentry
	 * @return the carpentry that was removed
	 */
	@Override
	public it.vmt.gh.sb.model.Carpentry deleteCarpentry(
		it.vmt.gh.sb.model.Carpentry carpentry) {

		return _carpentryLocalService.deleteCarpentry(carpentry);
	}

	/**
	 * Deletes the carpentry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CarpentryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param carpentryId the primary key of the carpentry
	 * @return the carpentry that was removed
	 * @throws PortalException if a carpentry with the primary key could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Carpentry deleteCarpentry(long carpentryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _carpentryLocalService.deleteCarpentry(carpentryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _carpentryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _carpentryLocalService.dynamicQuery();
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

		return _carpentryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.CarpentryModelImpl</code>.
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

		return _carpentryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.CarpentryModelImpl</code>.
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

		return _carpentryLocalService.dynamicQuery(
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

		return _carpentryLocalService.dynamicQueryCount(dynamicQuery);
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

		return _carpentryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public it.vmt.gh.sb.model.Carpentry fetchCarpentry(long carpentryId) {
		return _carpentryLocalService.fetchCarpentry(carpentryId);
	}

	/**
	 * Returns the carpentry matching the UUID and group.
	 *
	 * @param uuid the carpentry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching carpentry, or <code>null</code> if a matching carpentry could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Carpentry fetchCarpentryByUuidAndGroupId(
		String uuid, long groupId) {

		return _carpentryLocalService.fetchCarpentryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject fillCarpentryJson(
		it.vmt.gh.sb.model.Carpentry carpentry) {

		return _carpentryLocalService.fillCarpentryJson(carpentry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _carpentryLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the carpentries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of carpentries
	 * @param end the upper bound of the range of carpentries (not inclusive)
	 * @return the range of carpentries
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Carpentry> getCarpentries(
		int start, int end) {

		return _carpentryLocalService.getCarpentries(start, end);
	}

	/**
	 * Returns all the carpentries matching the UUID and company.
	 *
	 * @param uuid the UUID of the carpentries
	 * @param companyId the primary key of the company
	 * @return the matching carpentries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Carpentry>
		getCarpentriesByUuidAndCompanyId(String uuid, long companyId) {

		return _carpentryLocalService.getCarpentriesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of carpentries matching the UUID and company.
	 *
	 * @param uuid the UUID of the carpentries
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of carpentries
	 * @param end the upper bound of the range of carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching carpentries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Carpentry>
		getCarpentriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<it.vmt.gh.sb.model.Carpentry> orderByComparator) {

		return _carpentryLocalService.getCarpentriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of carpentries.
	 *
	 * @return the number of carpentries
	 */
	@Override
	public int getCarpentriesCount() {
		return _carpentryLocalService.getCarpentriesCount();
	}

	/**
	 * Returns the carpentry with the primary key.
	 *
	 * @param carpentryId the primary key of the carpentry
	 * @return the carpentry
	 * @throws PortalException if a carpentry with the primary key could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Carpentry getCarpentry(long carpentryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _carpentryLocalService.getCarpentry(carpentryId);
	}

	/**
	 * Returns the carpentry matching the UUID and group.
	 *
	 * @param uuid the carpentry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching carpentry
	 * @throws PortalException if a matching carpentry could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Carpentry getCarpentryByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _carpentryLocalService.getCarpentryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public String getCarpentryImages(long groupId, String name) {
		return _carpentryLocalService.getCarpentryImages(groupId, name);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _carpentryLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _carpentryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _carpentryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _carpentryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the carpentry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CarpentryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param carpentry the carpentry
	 * @return the carpentry that was updated
	 */
	@Override
	public it.vmt.gh.sb.model.Carpentry updateCarpentry(
		it.vmt.gh.sb.model.Carpentry carpentry) {

		return _carpentryLocalService.updateCarpentry(carpentry);
	}

	@Override
	public it.vmt.gh.sb.model.Carpentry updateCarpentry(
		long carpentryId, long groupId, long userId, String code, String name,
		String img, double price, int shutters) {

		return _carpentryLocalService.updateCarpentry(
			carpentryId, groupId, userId, code, name, img, price, shutters);
	}

	@Override
	public CarpentryLocalService getWrappedService() {
		return _carpentryLocalService;
	}

	@Override
	public void setWrappedService(CarpentryLocalService carpentryLocalService) {
		_carpentryLocalService = carpentryLocalService;
	}

	private CarpentryLocalService _carpentryLocalService;

}