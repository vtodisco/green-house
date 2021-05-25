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
 * Provides a wrapper for {@link ItemLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ItemLocalService
 * @generated
 */
public class ItemLocalServiceWrapper
	implements ItemLocalService, ServiceWrapper<ItemLocalService> {

	public ItemLocalServiceWrapper(ItemLocalService itemLocalService) {
		_itemLocalService = itemLocalService;
	}

	/**
	 * Adds the item to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ItemLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param item the item
	 * @return the item that was added
	 */
	@Override
	public it.vmt.gh.sb.model.Item addItem(it.vmt.gh.sb.model.Item item) {
		return _itemLocalService.addItem(item);
	}

	/**
	 * Creates a new item with the primary key. Does not add the item to the database.
	 *
	 * @param itemId the primary key for the new item
	 * @return the new item
	 */
	@Override
	public it.vmt.gh.sb.model.Item createItem(long itemId) {
		return _itemLocalService.createItem(itemId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the item from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ItemLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param item the item
	 * @return the item that was removed
	 */
	@Override
	public it.vmt.gh.sb.model.Item deleteItem(it.vmt.gh.sb.model.Item item) {
		return _itemLocalService.deleteItem(item);
	}

	/**
	 * Deletes the item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ItemLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param itemId the primary key of the item
	 * @return the item that was removed
	 * @throws PortalException if a item with the primary key could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Item deleteItem(long itemId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemLocalService.deleteItem(itemId);
	}

	@Override
	public it.vmt.gh.sb.model.Item deleteItemFromCart(long itemId)
		throws com.liferay.portal.kernel.json.JSONException {

		return _itemLocalService.deleteItemFromCart(itemId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _itemLocalService.dynamicQuery();
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

		return _itemLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.ItemModelImpl</code>.
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

		return _itemLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.ItemModelImpl</code>.
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

		return _itemLocalService.dynamicQuery(
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

		return _itemLocalService.dynamicQueryCount(dynamicQuery);
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

		return _itemLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public it.vmt.gh.sb.model.Item fetchItem(long itemId) {
		return _itemLocalService.fetchItem(itemId);
	}

	/**
	 * Returns the item matching the UUID and group.
	 *
	 * @param uuid the item's UUID
	 * @param groupId the primary key of the group
	 * @return the matching item, or <code>null</code> if a matching item could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Item fetchItemByUuidAndGroupId(
		String uuid, long groupId) {

		return _itemLocalService.fetchItemByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject fillItemJson(
		it.vmt.gh.sb.model.Item item) {

		return _itemLocalService.fillItemJson(item);
	}

	@Override
	public String findByCartId(long cartId)
		throws com.liferay.portal.kernel.json.JSONException {

		return _itemLocalService.findByCartId(cartId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _itemLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _itemLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _itemLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the item with the primary key.
	 *
	 * @param itemId the primary key of the item
	 * @return the item
	 * @throws PortalException if a item with the primary key could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Item getItem(long itemId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemLocalService.getItem(itemId);
	}

	/**
	 * Returns the item matching the UUID and group.
	 *
	 * @param uuid the item's UUID
	 * @param groupId the primary key of the group
	 * @return the matching item
	 * @throws PortalException if a matching item could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Item getItemByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemLocalService.getItemByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.ItemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of items
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Item> getItems(
		int start, int end) {

		return _itemLocalService.getItems(start, end);
	}

	@Override
	public java.util.List<it.vmt.gh.sb.model.Item> getItems(long cartId) {
		return _itemLocalService.getItems(cartId);
	}

	/**
	 * Returns all the items matching the UUID and company.
	 *
	 * @param uuid the UUID of the items
	 * @param companyId the primary key of the company
	 * @return the matching items, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Item> getItemsByUuidAndCompanyId(
		String uuid, long companyId) {

		return _itemLocalService.getItemsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of items matching the UUID and company.
	 *
	 * @param uuid the UUID of the items
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching items, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Item> getItemsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<it.vmt.gh.sb.model.Item> orderByComparator) {

		return _itemLocalService.getItemsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of items.
	 *
	 * @return the number of items
	 */
	@Override
	public int getItemsCount() {
		return _itemLocalService.getItemsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _itemLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ItemLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param item the item
	 * @return the item that was updated
	 */
	@Override
	public it.vmt.gh.sb.model.Item updateItem(it.vmt.gh.sb.model.Item item) {
		return _itemLocalService.updateItem(item);
	}

	@Override
	public it.vmt.gh.sb.model.Item updateItem(
		long groupId, long userId, long itemId, long cartId, long environmentId,
		long profileId, long carpentryId, long handleId, long colorId,
		int price, int qty, double width, double height, String color) {

		return _itemLocalService.updateItem(
			groupId, userId, itemId, cartId, environmentId, profileId,
			carpentryId, handleId, colorId, price, qty, width, height, color);
	}

	@Override
	public ItemLocalService getWrappedService() {
		return _itemLocalService;
	}

	@Override
	public void setWrappedService(ItemLocalService itemLocalService) {
		_itemLocalService = itemLocalService;
	}

	private ItemLocalService _itemLocalService;

}