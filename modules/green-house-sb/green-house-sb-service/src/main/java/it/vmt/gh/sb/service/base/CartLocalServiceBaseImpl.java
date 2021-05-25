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

package it.vmt.gh.sb.service.base;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import it.vmt.gh.sb.model.Cart;
import it.vmt.gh.sb.service.CartLocalService;
import it.vmt.gh.sb.service.persistence.CarpentryPersistence;
import it.vmt.gh.sb.service.persistence.CartPersistence;
import it.vmt.gh.sb.service.persistence.ColorPersistence;
import it.vmt.gh.sb.service.persistence.EnvironmentPersistence;
import it.vmt.gh.sb.service.persistence.HandlePersistence;
import it.vmt.gh.sb.service.persistence.ItemPersistence;
import it.vmt.gh.sb.service.persistence.ProfilePersistence;
import it.vmt.gh.sb.service.persistence.Profile_CarpentryPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the cart local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link it.vmt.gh.sb.service.impl.CartLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see it.vmt.gh.sb.service.impl.CartLocalServiceImpl
 * @generated
 */
public abstract class CartLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, CartLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CartLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>it.vmt.gh.sb.service.CartLocalServiceUtil</code>.
	 */

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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Cart addCart(Cart cart) {
		cart.setNew(true);

		return cartPersistence.update(cart);
	}

	/**
	 * Creates a new cart with the primary key. Does not add the cart to the database.
	 *
	 * @param cartId the primary key for the new cart
	 * @return the new cart
	 */
	@Override
	@Transactional(enabled = false)
	public Cart createCart(long cartId) {
		return cartPersistence.create(cartId);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Cart deleteCart(long cartId) throws PortalException {
		return cartPersistence.remove(cartId);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Cart deleteCart(Cart cart) {
		return cartPersistence.remove(cart);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Cart.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return cartPersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return cartPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return cartPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return cartPersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return cartPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Cart fetchCart(long cartId) {
		return cartPersistence.fetchByPrimaryKey(cartId);
	}

	/**
	 * Returns the cart matching the UUID and group.
	 *
	 * @param uuid the cart's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cart, or <code>null</code> if a matching cart could not be found
	 */
	@Override
	public Cart fetchCartByUuidAndGroupId(String uuid, long groupId) {
		return cartPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cart with the primary key.
	 *
	 * @param cartId the primary key of the cart
	 * @return the cart
	 * @throws PortalException if a cart with the primary key could not be found
	 */
	@Override
	public Cart getCart(long cartId) throws PortalException {
		return cartPersistence.findByPrimaryKey(cartId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(cartLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Cart.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("cartId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(cartLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Cart.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("cartId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(cartLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Cart.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("cartId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Cart>() {

				@Override
				public void performAction(Cart cart) throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, cart);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(Cart.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return cartPersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return cartLocalService.deleteCart((Cart)persistedModel);
	}

	public BasePersistence<Cart> getBasePersistence() {
		return cartPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return cartPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the carts matching the UUID and company.
	 *
	 * @param uuid the UUID of the carts
	 * @param companyId the primary key of the company
	 * @return the matching carts, or an empty list if no matches were found
	 */
	@Override
	public List<Cart> getCartsByUuidAndCompanyId(String uuid, long companyId) {
		return cartPersistence.findByUuid_C(uuid, companyId);
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
	public List<Cart> getCartsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Cart> orderByComparator) {

		return cartPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
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
	public Cart getCartByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return cartPersistence.findByUUID_G(uuid, groupId);
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
	public List<Cart> getCarts(int start, int end) {
		return cartPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of carts.
	 *
	 * @return the number of carts
	 */
	@Override
	public int getCartsCount() {
		return cartPersistence.countAll();
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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Cart updateCart(Cart cart) {
		return cartPersistence.update(cart);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CartLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		cartLocalService = (CartLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CartLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Cart.class;
	}

	protected String getModelClassName() {
		return Cart.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = cartPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@Reference
	protected CarpentryPersistence carpentryPersistence;

	protected CartLocalService cartLocalService;

	@Reference
	protected CartPersistence cartPersistence;

	@Reference
	protected ColorPersistence colorPersistence;

	@Reference
	protected EnvironmentPersistence environmentPersistence;

	@Reference
	protected HandlePersistence handlePersistence;

	@Reference
	protected ItemPersistence itemPersistence;

	@Reference
	protected ProfilePersistence profilePersistence;

	@Reference
	protected Profile_CarpentryPersistence profile_CarpentryPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetCategoryLocalService
		assetCategoryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

}