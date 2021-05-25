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
 * Provides a wrapper for {@link CartLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CartLocalService
 * @generated
 */
public class CartLocalServiceWrapper
	implements CartLocalService, ServiceWrapper<CartLocalService> {

	public CartLocalServiceWrapper(CartLocalService cartLocalService) {
		_cartLocalService = cartLocalService;
	}

	@Override
	public com.liferay.portal.kernel.model.Address addAddress(
			long userId, String street, String number, String city, String zip,
			String countryA3, String regionCode)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.addAddress(
			userId, street, number, city, zip, countryA3, regionCode);
	}

	/**
	 * Adds the cart to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CartLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cart the cart
	 * @return the cart that was added
	 */
	@Override
	public it.vmt.gh.sb.model.Cart addCart(it.vmt.gh.sb.model.Cart cart) {
		return _cartLocalService.addCart(cart);
	}

	@Override
	public String addItemToCart(
			long groupId, long userId, long itemId, long cartId,
			long environmentId, long profileId, long carpentryId, long handleId,
			long colorId, int price, int qty, double width, double height,
			String color)
		throws com.liferay.portal.kernel.json.JSONException,
			   com.liferay.portal.kernel.module.configuration.
				   ConfigurationException {

		return _cartLocalService.addItemToCart(
			groupId, userId, itemId, cartId, environmentId, profileId,
			carpentryId, handleId, colorId, price, qty, width, height, color);
	}

	@Override
	public com.liferay.portal.kernel.model.Phone addPhone(
			long userId, String number)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.addPhone(userId, number);
	}

	@Override
	public String approveUserCart(
			long cartId, long userId, long groupId, String firstName,
			String lastName, String emailAddress, String phone,
			boolean invoiceDiscount, boolean installation, boolean delivery)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.approveUserCart(
			cartId, userId, groupId, firstName, lastName, emailAddress, phone,
			invoiceDiscount, installation, delivery);
	}

	/**
	 * Creates a new cart with the primary key. Does not add the cart to the database.
	 *
	 * @param cartId the primary key for the new cart
	 * @return the new cart
	 */
	@Override
	public it.vmt.gh.sb.model.Cart createCart(long cartId) {
		return _cartLocalService.createCart(cartId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the cart from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CartLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cart the cart
	 * @return the cart that was removed
	 */
	@Override
	public it.vmt.gh.sb.model.Cart deleteCart(it.vmt.gh.sb.model.Cart cart) {
		return _cartLocalService.deleteCart(cart);
	}

	/**
	 * Deletes the cart with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CartLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cartId the primary key of the cart
	 * @return the cart that was removed
	 * @throws PortalException if a cart with the primary key could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Cart deleteCart(long cartId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.deleteCart(cartId);
	}

	@Override
	public String deleteItemFromCart(long itemId)
		throws com.liferay.portal.kernel.json.JSONException {

		return _cartLocalService.deleteItemFromCart(itemId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cartLocalService.dynamicQuery();
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

		return _cartLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.CartModelImpl</code>.
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

		return _cartLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.CartModelImpl</code>.
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

		return _cartLocalService.dynamicQuery(
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

		return _cartLocalService.dynamicQueryCount(dynamicQuery);
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

		return _cartLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public it.vmt.gh.sb.model.Cart emptyCart(long cartId) {
		return _cartLocalService.emptyCart(cartId);
	}

	@Override
	public it.vmt.gh.sb.model.Cart fetchCart(long cartId) {
		return _cartLocalService.fetchCart(cartId);
	}

	/**
	 * Returns the cart matching the UUID and group.
	 *
	 * @param uuid the cart's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cart, or <code>null</code> if a matching cart could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Cart fetchCartByUuidAndGroupId(
		String uuid, long groupId) {

		return _cartLocalService.fetchCartByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject findByCartId(long cartId)
		throws com.liferay.portal.kernel.json.JSONException {

		return _cartLocalService.findByCartId(cartId);
	}

	@Override
	public java.util.List<it.vmt.gh.sb.model.Cart> findByUserId(long userId) {
		return _cartLocalService.findByUserId(userId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cartLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the cart with the primary key.
	 *
	 * @param cartId the primary key of the cart
	 * @return the cart
	 * @throws PortalException if a cart with the primary key could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Cart getCart(long cartId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.getCart(cartId);
	}

	/**
	 * Returns the cart matching the UUID and group.
	 *
	 * @param uuid the cart's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cart
	 * @throws PortalException if a matching cart could not be found
	 */
	@Override
	public it.vmt.gh.sb.model.Cart getCartByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.getCartByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the carts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.vmt.gh.sb.model.impl.CartModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of carts
	 * @param end the upper bound of the range of carts (not inclusive)
	 * @return the range of carts
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Cart> getCarts(
		int start, int end) {

		return _cartLocalService.getCarts(start, end);
	}

	/**
	 * Returns all the carts matching the UUID and company.
	 *
	 * @param uuid the UUID of the carts
	 * @param companyId the primary key of the company
	 * @return the matching carts, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Cart> getCartsByUuidAndCompanyId(
		String uuid, long companyId) {

		return _cartLocalService.getCartsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of carts matching the UUID and company.
	 *
	 * @param uuid the UUID of the carts
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of carts
	 * @param end the upper bound of the range of carts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching carts, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.vmt.gh.sb.model.Cart> getCartsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<it.vmt.gh.sb.model.Cart> orderByComparator) {

		return _cartLocalService.getCartsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of carts.
	 *
	 * @return the number of carts
	 */
	@Override
	public int getCartsCount() {
		return _cartLocalService.getCartsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _cartLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cartLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cartLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public String recalculateUserCart(
			long cartId, long userId, long groupId, long carpentryId,
			long handleId, long colorId, int itemHeight, int itemWidth,
			String firstName, String lastName, String emailAddress,
			String phone, boolean invoiceDiscount, boolean installation,
			boolean delivery)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.recalculateUserCart(
			cartId, userId, groupId, carpentryId, handleId, colorId, itemHeight,
			itemWidth, firstName, lastName, emailAddress, phone,
			invoiceDiscount, installation, delivery);
	}

	/**
	 * Updates the cart in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CartLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cart the cart
	 * @return the cart that was updated
	 */
	@Override
	public it.vmt.gh.sb.model.Cart updateCart(it.vmt.gh.sb.model.Cart cart) {
		return _cartLocalService.updateCart(cart);
	}

	@Override
	public it.vmt.gh.sb.model.Cart updateCart(
		long groupId, long userId, long cartId, double total,
		boolean invoiceDiscount) {

		return _cartLocalService.updateCart(
			groupId, userId, cartId, total, invoiceDiscount);
	}

	@Override
	public CartLocalService getWrappedService() {
		return _cartLocalService;
	}

	@Override
	public void setWrappedService(CartLocalService cartLocalService) {
		_cartLocalService = cartLocalService;
	}

	private CartLocalService _cartLocalService;

}