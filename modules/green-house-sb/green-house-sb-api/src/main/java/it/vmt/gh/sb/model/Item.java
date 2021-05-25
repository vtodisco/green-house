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

package it.vmt.gh.sb.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Item service. Represents a row in the &quot;gh_Item&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ItemModel
 * @generated
 */
@ImplementationClassName("it.vmt.gh.sb.model.impl.ItemImpl")
@ProviderType
public interface Item extends ItemModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>it.vmt.gh.sb.model.impl.ItemImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Item, Long> ITEM_ID_ACCESSOR =
		new Accessor<Item, Long>() {

			@Override
			public Long get(Item item) {
				return item.getItemId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Item> getTypeClass() {
				return Item.class;
			}

		};

	public it.vmt.gh.sb.model.Carpentry getCarpentry();

	public String getCarpentryImg();

	public it.vmt.gh.sb.model.Environment getEnvironment();

	public it.vmt.gh.sb.model.Handle getHandle();

	public it.vmt.gh.sb.model.Color getItemColor();

	public it.vmt.gh.sb.model.Profile getProfile();

}