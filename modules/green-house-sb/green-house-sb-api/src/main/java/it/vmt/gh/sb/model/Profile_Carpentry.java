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
 * The extended model interface for the Profile_Carpentry service. Represents a row in the &quot;gh_Profile_Carpentry&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see Profile_CarpentryModel
 * @generated
 */
@ImplementationClassName("it.vmt.gh.sb.model.impl.Profile_CarpentryImpl")
@ProviderType
public interface Profile_Carpentry
	extends PersistedModel, Profile_CarpentryModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>it.vmt.gh.sb.model.impl.Profile_CarpentryImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Profile_Carpentry, Long> PROFILE_ID_ACCESSOR =
		new Accessor<Profile_Carpentry, Long>() {

			@Override
			public Long get(Profile_Carpentry profile_Carpentry) {
				return profile_Carpentry.getProfileId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Profile_Carpentry> getTypeClass() {
				return Profile_Carpentry.class;
			}

		};
	public static final Accessor<Profile_Carpentry, Long>
		CARPENTRY_ID_ACCESSOR = new Accessor<Profile_Carpentry, Long>() {

			@Override
			public Long get(Profile_Carpentry profile_Carpentry) {
				return profile_Carpentry.getCarpentryId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Profile_Carpentry> getTypeClass() {
				return Profile_Carpentry.class;
			}

		};

}