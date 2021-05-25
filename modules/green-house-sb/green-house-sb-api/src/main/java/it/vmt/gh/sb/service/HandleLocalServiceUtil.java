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
 * Provides the local service utility for Handle. This utility wraps
 * <code>it.vmt.gh.sb.service.impl.HandleLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HandleLocalService
 * @generated
 */
public class HandleLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>it.vmt.gh.sb.service.impl.HandleLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static it.vmt.gh.sb.model.Handle addHandle(
		it.vmt.gh.sb.model.Handle handle) {

		return getService().addHandle(handle);
	}

	/**
	 * Creates a new handle with the primary key. Does not add the handle to the database.
	 *
	 * @param handleId the primary key for the new handle
	 * @return the new handle
	 */
	public static it.vmt.gh.sb.model.Handle createHandle(long handleId) {
		return getService().createHandle(handleId);
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
	 * Deletes the handle from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HandleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param handle the handle
	 * @return the handle that was removed
	 */
	public static it.vmt.gh.sb.model.Handle deleteHandle(
		it.vmt.gh.sb.model.Handle handle) {

		return getService().deleteHandle(handle);
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
	public static it.vmt.gh.sb.model.Handle deleteHandle(long handleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteHandle(handleId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.HandleModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.HandleModelImpl</code>.
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

	public static it.vmt.gh.sb.model.Handle fetchHandle(long handleId) {
		return getService().fetchHandle(handleId);
	}

	/**
	 * Returns the handle matching the UUID and group.
	 *
	 * @param uuid the handle's UUID
	 * @param groupId the primary key of the group
	 * @return the matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public static it.vmt.gh.sb.model.Handle fetchHandleByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchHandleByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.json.JSONObject fillHandleJson(
		it.vmt.gh.sb.model.Handle handle) {

		return getService().fillHandleJson(handle);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns the handle with the primary key.
	 *
	 * @param handleId the primary key of the handle
	 * @return the handle
	 * @throws PortalException if a handle with the primary key could not be found
	 */
	public static it.vmt.gh.sb.model.Handle getHandle(long handleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getHandle(handleId);
	}

	/**
	 * Returns the handle matching the UUID and group.
	 *
	 * @param uuid the handle's UUID
	 * @param groupId the primary key of the group
	 * @return the matching handle
	 * @throws PortalException if a matching handle could not be found
	 */
	public static it.vmt.gh.sb.model.Handle getHandleByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getHandleByUuidAndGroupId(uuid, groupId);
	}

	public static String getHandleImages(long groupId, String name) {
		return getService().getHandleImages(groupId, name);
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
	public static java.util.List<it.vmt.gh.sb.model.Handle> getHandles(
		int start, int end) {

		return getService().getHandles(start, end);
	}

	/**
	 * Returns all the handles matching the UUID and company.
	 *
	 * @param uuid the UUID of the handles
	 * @param companyId the primary key of the company
	 * @return the matching handles, or an empty list if no matches were found
	 */
	public static java.util.List<it.vmt.gh.sb.model.Handle>
		getHandlesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getHandlesByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<it.vmt.gh.sb.model.Handle>
		getHandlesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<it.vmt.gh.sb.model.Handle> orderByComparator) {

		return getService().getHandlesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of handles.
	 *
	 * @return the number of handles
	 */
	public static int getHandlesCount() {
		return getService().getHandlesCount();
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
	 * Updates the handle in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HandleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param handle the handle
	 * @return the handle that was updated
	 */
	public static it.vmt.gh.sb.model.Handle updateHandle(
		it.vmt.gh.sb.model.Handle handle) {

		return getService().updateHandle(handle);
	}

	public static it.vmt.gh.sb.model.Handle updateHandle(
		long handleId, long groupId, long userId, String code, String name,
		String img, double price) {

		return getService().updateHandle(
			handleId, groupId, userId, code, name, img, price);
	}

	public static HandleLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HandleLocalService, HandleLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(HandleLocalService.class);

		ServiceTracker<HandleLocalService, HandleLocalService> serviceTracker =
			new ServiceTracker<HandleLocalService, HandleLocalService>(
				bundle.getBundleContext(), HandleLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}