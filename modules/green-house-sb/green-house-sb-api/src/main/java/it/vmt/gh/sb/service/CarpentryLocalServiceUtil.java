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
 * Provides the local service utility for Carpentry. This utility wraps
 * <code>it.vmt.gh.sb.service.impl.CarpentryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CarpentryLocalService
 * @generated
 */
public class CarpentryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>it.vmt.gh.sb.service.impl.CarpentryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static it.vmt.gh.sb.model.Carpentry addCarpentry(
		it.vmt.gh.sb.model.Carpentry carpentry) {

		return getService().addCarpentry(carpentry);
	}

	/**
	 * Creates a new carpentry with the primary key. Does not add the carpentry to the database.
	 *
	 * @param carpentryId the primary key for the new carpentry
	 * @return the new carpentry
	 */
	public static it.vmt.gh.sb.model.Carpentry createCarpentry(
		long carpentryId) {

		return getService().createCarpentry(carpentryId);
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
	 * Deletes the carpentry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CarpentryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param carpentry the carpentry
	 * @return the carpentry that was removed
	 */
	public static it.vmt.gh.sb.model.Carpentry deleteCarpentry(
		it.vmt.gh.sb.model.Carpentry carpentry) {

		return getService().deleteCarpentry(carpentry);
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
	public static it.vmt.gh.sb.model.Carpentry deleteCarpentry(long carpentryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCarpentry(carpentryId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.CarpentryModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.CarpentryModelImpl</code>.
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

	public static it.vmt.gh.sb.model.Carpentry fetchCarpentry(
		long carpentryId) {

		return getService().fetchCarpentry(carpentryId);
	}

	/**
	 * Returns the carpentry matching the UUID and group.
	 *
	 * @param uuid the carpentry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching carpentry, or <code>null</code> if a matching carpentry could not be found
	 */
	public static it.vmt.gh.sb.model.Carpentry fetchCarpentryByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchCarpentryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.json.JSONObject fillCarpentryJson(
		it.vmt.gh.sb.model.Carpentry carpentry) {

		return getService().fillCarpentryJson(carpentry);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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
	public static java.util.List<it.vmt.gh.sb.model.Carpentry> getCarpentries(
		int start, int end) {

		return getService().getCarpentries(start, end);
	}

	/**
	 * Returns all the carpentries matching the UUID and company.
	 *
	 * @param uuid the UUID of the carpentries
	 * @param companyId the primary key of the company
	 * @return the matching carpentries, or an empty list if no matches were found
	 */
	public static java.util.List<it.vmt.gh.sb.model.Carpentry>
		getCarpentriesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getCarpentriesByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<it.vmt.gh.sb.model.Carpentry>
		getCarpentriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<it.vmt.gh.sb.model.Carpentry> orderByComparator) {

		return getService().getCarpentriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of carpentries.
	 *
	 * @return the number of carpentries
	 */
	public static int getCarpentriesCount() {
		return getService().getCarpentriesCount();
	}

	/**
	 * Returns the carpentry with the primary key.
	 *
	 * @param carpentryId the primary key of the carpentry
	 * @return the carpentry
	 * @throws PortalException if a carpentry with the primary key could not be found
	 */
	public static it.vmt.gh.sb.model.Carpentry getCarpentry(long carpentryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCarpentry(carpentryId);
	}

	/**
	 * Returns the carpentry matching the UUID and group.
	 *
	 * @param uuid the carpentry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching carpentry
	 * @throws PortalException if a matching carpentry could not be found
	 */
	public static it.vmt.gh.sb.model.Carpentry getCarpentryByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCarpentryByUuidAndGroupId(uuid, groupId);
	}

	public static String getCarpentryImages(long groupId, String name) {
		return getService().getCarpentryImages(groupId, name);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	 * Updates the carpentry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CarpentryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param carpentry the carpentry
	 * @return the carpentry that was updated
	 */
	public static it.vmt.gh.sb.model.Carpentry updateCarpentry(
		it.vmt.gh.sb.model.Carpentry carpentry) {

		return getService().updateCarpentry(carpentry);
	}

	public static it.vmt.gh.sb.model.Carpentry updateCarpentry(
		long carpentryId, long groupId, long userId, String code, String name,
		String img, double price, int shutters) {

		return getService().updateCarpentry(
			carpentryId, groupId, userId, code, name, img, price, shutters);
	}

	public static CarpentryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CarpentryLocalService, CarpentryLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CarpentryLocalService.class);

		ServiceTracker<CarpentryLocalService, CarpentryLocalService>
			serviceTracker =
				new ServiceTracker
					<CarpentryLocalService, CarpentryLocalService>(
						bundle.getBundleContext(), CarpentryLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}