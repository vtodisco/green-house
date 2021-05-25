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
 * Provides a wrapper for {@link HandleLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HandleLocalService
 * @generated
 */
public class HandleLocalServiceWrapper
	implements HandleLocalService, ServiceWrapper<HandleLocalService> {

	public HandleLocalServiceWrapper(HandleLocalService handleLocalService) {
		_handleLocalService = handleLocalService;
	}

	/**
	 * Adds the handle to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HandleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param handle the handle
	 * @return the handle that was added
	 */
	@Override
	public it.vmt.gh.sb.model.Handle addHandle(
		it.vmt.gh.sb.model.Handle handle) {

		return _handleLocalService.addHandle(handle);
	}

	/**
	 * Creates a new handle with the primary key. Does not add the handle to the database.
	 *
	 * @param handleId the primary key for the new handle
	 * @return the new handle
	 */
	@Override
	public it.vmt.gh.sb.model.Handle createHandle(long handleId) {
		return _handleLocalService.createHandle(handleId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _handleLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the handle from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HandleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param handle the handle
	 * @return the handle that was removed
	 */
	@Override
	public it.vmt.gh.sb.model.Handle deleteHandle(
		it.vmt.gh.sb.model.Handle handle) {

		return _handleLocalService.deleteHandle(handle);
	}

	/**
	 * Deletes the handle with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HandleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param handleId the primary key of the handle
	 * @return the handle that was removed
	 * @throws PortalException if a handle with the primary key could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Handle deleteHandle(long handleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _handleLocalService.deleteHandle(handleId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _handleLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _handleLocalService.dynamicQuery();
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

		return _handleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.HandleModelImpl</code>.
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

		return _handleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.HandleModelImpl</code>.
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

		return _handleLocalService.dynamicQuery(
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

		return _handleLocalService.dynamicQueryCount(dynamicQuery);
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

		return _handleLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public it.vmt.gh.sb.model.Handle fetchHandle(long handleId) {
		return _handleLocalService.fetchHandle(handleId);
	}

	/**
	 * Returns the handle matching the UUID and group.
	 *
	 * @param uuid the handle's UUID
	 * @param groupId the primary key of the group
	 * @return the matching handle, or <code>null</code> if a matching handle could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Handle fetchHandleByUuidAndGroupId(
		String uuid, long groupId) {

		return _handleLocalService.fetchHandleByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject fillHandleJson(
		it.vmt.gh.sb.model.Handle handle) {

		return _handleLocalService.fillHandleJson(handle);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _handleLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _handleLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	/**
	 * Returns the handle with the primary key.
	 *
	 * @param handleId the primary key of the handle
	 * @return the handle
	 * @throws PortalException if a handle with the primary key could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Handle getHandle(long handleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _handleLocalService.getHandle(handleId);
	}

	/**
	 * Returns the handle matching the UUID and group.
	 *
	 * @param uuid the handle's UUID
	 * @param groupId the primary key of the group
	 * @return the matching handle
	 * @throws PortalException if a matching handle could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Handle getHandleByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _handleLocalService.getHandleByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public String getHandleImages(long groupId, String name) {
		return _handleLocalService.getHandleImages(groupId, name);
	}

	/**
	 * Returns a range of all the handles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.HandleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @return the range of handles
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Handle> getHandles(
		int start, int end) {

		return _handleLocalService.getHandles(start, end);
	}

	/**
	 * Returns all the handles matching the UUID and company.
	 *
	 * @param uuid the UUID of the handles
	 * @param companyId the primary key of the company
	 * @return the matching handles, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Handle>
		getHandlesByUuidAndCompanyId(String uuid, long companyId) {

		return _handleLocalService.getHandlesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of handles matching the UUID and company.
	 *
	 * @param uuid the UUID of the handles
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching handles, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Handle>
		getHandlesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<it.vmt.gh.sb.model.Handle> orderByComparator) {

		return _handleLocalService.getHandlesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of handles.
	 *
	 * @return the number of handles
	 */
	@Override
	public int getHandlesCount() {
		return _handleLocalService.getHandlesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _handleLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _handleLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _handleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the handle in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HandleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param handle the handle
	 * @return the handle that was updated
	 */
	@Override
	public it.vmt.gh.sb.model.Handle updateHandle(
		it.vmt.gh.sb.model.Handle handle) {

		return _handleLocalService.updateHandle(handle);
	}

	@Override
	public it.vmt.gh.sb.model.Handle updateHandle(
		long handleId, long groupId, long userId, String code, String name,
		String img, double price) {

		return _handleLocalService.updateHandle(
			handleId, groupId, userId, code, name, img, price);
	}

	@Override
	public HandleLocalService getWrappedService() {
		return _handleLocalService;
	}

	@Override
	public void setWrappedService(HandleLocalService handleLocalService) {
		_handleLocalService = handleLocalService;
	}

	private HandleLocalService _handleLocalService;

}