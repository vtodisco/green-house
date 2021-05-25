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

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import it.vmt.gh.sb.model.Color;
import it.vmt.gh.sb.service.ColorService;
import it.vmt.gh.sb.service.persistence.CarpentryPersistence;
import it.vmt.gh.sb.service.persistence.CartPersistence;
import it.vmt.gh.sb.service.persistence.ColorPersistence;
import it.vmt.gh.sb.service.persistence.EnvironmentPersistence;
import it.vmt.gh.sb.service.persistence.HandlePersistence;
import it.vmt.gh.sb.service.persistence.ItemPersistence;
import it.vmt.gh.sb.service.persistence.ProfilePersistence;
import it.vmt.gh.sb.service.persistence.Profile_CarpentryPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the color remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link it.vmt.gh.sb.service.impl.ColorServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see it.vmt.gh.sb.service.impl.ColorServiceImpl
 * @generated
 */
public abstract class ColorServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, ColorService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>ColorService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>it.vmt.gh.sb.service.ColorServiceUtil</code>.
	 */
	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			ColorService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		colorService = (ColorService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ColorService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Color.class;
	}

	protected String getModelClassName() {
		return Color.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = colorPersistence.getDataSource();

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

	@Reference
	protected CartPersistence cartPersistence;

	@Reference
	protected it.vmt.gh.sb.service.ColorLocalService colorLocalService;

	protected ColorService colorService;

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
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetCategoryLocalService
		assetCategoryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetCategoryService
		assetCategoryService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryService
		assetEntryService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagService assetTagService;

}