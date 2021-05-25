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

package it.vmt.gh.sb.model.impl;

import it.vmt.gh.sb.model.Carpentry;
import it.vmt.gh.sb.model.Color;
import it.vmt.gh.sb.model.Environment;
import it.vmt.gh.sb.model.Handle;
import it.vmt.gh.sb.model.Profile;
import it.vmt.gh.sb.service.CarpentryLocalServiceUtil;
import it.vmt.gh.sb.service.ColorLocalServiceUtil;
import it.vmt.gh.sb.service.EnvironmentLocalServiceUtil;
import it.vmt.gh.sb.service.HandleLocalServiceUtil;
import it.vmt.gh.sb.service.ProfileLocalServiceUtil;

/**
 * The extended model implementation for the Item service. Represents a row in the &quot;gh_Item&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.vmt.gh.sb.model.Item</code> interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
public class ItemImpl extends ItemBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a item model instance should use the {@link it.vmt.gh.sb.model.Item} interface instead.
	 */
	public ItemImpl() {
	}
	
	public Carpentry getCarpentry() {
		return CarpentryLocalServiceUtil.fetchCarpentry(this.getCarpentryId());
	}
	public String getCarpentryImg() {
		Carpentry carpentry = CarpentryLocalServiceUtil.fetchCarpentry(this.getCarpentryId());
		return carpentry.getImg();
	}
	public Environment getEnvironment() {
		return EnvironmentLocalServiceUtil.fetchEnvironment(this.getEnvironmentId());
	}
	public Handle getHandle() {
		return HandleLocalServiceUtil.fetchHandle(this.getHandleId());
	}
	public Color getItemColor() {
		return ColorLocalServiceUtil.fetchColor(this.getColorId());
	}
	public Profile getProfile() {
		return ProfileLocalServiceUtil.fetchProfile(this.getProfileId());
	}
}