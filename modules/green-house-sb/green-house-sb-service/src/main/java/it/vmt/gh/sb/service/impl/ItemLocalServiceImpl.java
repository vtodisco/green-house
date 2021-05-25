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

package it.vmt.gh.sb.service.impl;

import java.util.Calendar;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.asset.kernel.model.AssetCategory;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.service.AssetCategoryLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ClassName;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ClassNameLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.LocaleThreadLocal;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;

import it.vmt.gh.sb.model.Cart;
import it.vmt.gh.sb.model.Item;
import it.vmt.gh.sb.service.base.ItemLocalServiceBaseImpl;

/**
 * The implementation of the item local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>it.vmt.gh.sb.service.ItemLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ItemLocalServiceBaseImpl
 */
@Component(property = "model.class.name=it.vmt.gh.sb.model.Item", service = AopService.class)
public class ItemLocalServiceImpl extends ItemLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>it.vmt.gh.sb.service.ItemLocalService</code> via injection or a
	 * <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>it.vmt.gh.sb.service.ItemLocalServiceUtil</code>.
	 */


	@Indexable(type = IndexableType.DELETE)
	public Item deleteItemFromCart(long itemId) throws JSONException {
		Item existing = itemPersistence.fetchByPrimaryKey(itemId);
		if(Validator.isNotNull(existing)) {
			itemPersistence.remove(existing);
			deAssociateAssetEntry(existing);
			deAssociateResource(existing);
		}
		return existing;
	}

	public String findByCartId(long cartId) throws JSONException {
		String result = JSONFactoryUtil.createJSONObject().toString();
		Cart cart = cartPersistence.fetchByPrimaryKey(cartId);
		if (Validator.isNotNull(cart)) {
			List<Item> items = itemPersistence.findByCart(cart.getCartId());
			JSONArray itemsJson = JSONFactoryUtil.createJSONArray();
			for (Item item : items) {
				JSONObject itemJson = fillItemJson(item);
				JSONObject environmentJson = JSONFactoryUtil.createJSONObject(
						JSONFactoryUtil.serialize(environmentPersistence.fetchByPrimaryKey(item.getEnvironmentId())));
				JSONObject profileJson = JSONFactoryUtil.createJSONObject(
						JSONFactoryUtil.serialize(profilePersistence.fetchByPrimaryKey(item.getProfileId())));
				JSONObject carpentryJson = JSONFactoryUtil.createJSONObject(
						JSONFactoryUtil.serialize(carpentryPersistence.fetchByPrimaryKey(item.getCarpentryId())));
				JSONObject handleJson = JSONFactoryUtil.createJSONObject(
						JSONFactoryUtil.serialize(handlePersistence.fetchByPrimaryKey(item.getHandleId())));
				itemJson.put("environment", environmentJson);
				itemJson.put("profile", profileJson);
				itemJson.put("carpentry", carpentryJson);
				itemJson.put("handle", handleJson);
				itemsJson.put(itemJson);
			}
			JSONObject cartJson = fillCartJson(cart);
			cartJson.put("items", itemsJson);
			result = cartJson.toString();
		}
		return result;
	}
	
	public List<Item> getItems(long cartId){
		return itemPersistence.findByCart(cartId);
	}

	@Indexable(type = IndexableType.REINDEX)
	public Item updateItem(long groupId, long userId, long itemId, long cartId, long environmentId, long profileId, long carpentryId,
			long handleId, long colorId, int price, int qty, double width, double height, String color) {
		Item result = null;
		User user = _userLocalService.fetchUser(userId);
		Calendar now = Calendar.getInstance();
		if (itemId > 0) {
			result = itemPersistence.fetchByPrimaryKey(itemId);
		} else {
			result = itemPersistence.create(_counterLocalService.increment());
			result.setCompanyId(PortalUtil.getDefaultCompanyId());
			result.setCreateDate(now.getTime());
			result.setDisplayDate(now.getTime());
			result.setGroupId(groupId);
			result.setCartId(cartId);
		}
		result.setCarpentryId(carpentryId);
		result.setModifiedDate(now.getTime());
		result.setHandleId(handleId);
		result.setColorId(colorId);
		result.setProfileId(profileId);
		result.setPrice(price);
		result.setQty(qty);
		result.setWidth(width);
		result.setHeight(height);
		result.setColor(color);
		result.setEnvironmentId(environmentId);
		result.setUserId(userId);
		result.setUserName(user.getFullName());
		result.setUserUuid(user.getUuid());
		associateAssetEntry(result);
		associateResource(result, new ServiceContext());
		itemPersistence.update(result);
		return result;
	}
	
	private AssetEntry associateAssetEntry(Item item) {
		AssetEntry asset = assetEntryLocalService.fetchEntry(Item.class.getName(), item.getPrimaryKey());
		Layout displayPage = LayoutLocalServiceUtil.fetchLayoutByFriendlyURL(item.getGroupId(), Boolean.TRUE,
				"/dashboard");
		if (asset == null) {
			ClassName cn = ClassNameLocalServiceUtil.getClassName(Item.class.getName());
			asset = assetEntryLocalService.createAssetEntry(_counterLocalService.increment());
			asset.setClassName(Item.class.getName());
			asset.setClassNameId(cn.getClassNameId());
			asset.setClassPK(item.getPrimaryKey());
			asset.setCompanyId(item.getCompanyId());
			asset.setCreateDate(item.getCreateDate());
			asset.setDescription(item.getUserName() + " (" + item.getCreateDate() + ")", LocaleThreadLocal.getThemeDisplayLocale());
			asset.setGroupId(item.getGroupId());
			asset.setModifiedDate(item.getModifiedDate());
			asset.setPublishDate(item.getDisplayDate());
			asset.setVisible(Boolean.TRUE);
			asset.setListable(Boolean.TRUE);
			asset.setSummary(item.getUserName() + " (" + item.getCreateDate() + ")", LocaleThreadLocal.getThemeDisplayLocale());
			asset.setTitle(item.getUserName() + " (" + item.getCreateDate() + ")", LocaleThreadLocal.getThemeDisplayLocale());
			asset.setUserId(item.getUserId());
			asset.setUserName(item.getUserName());
			asset.setUserUuid(item.getUserUuid());
			if (Validator.isNotNull(displayPage)) {
				asset.setLayoutUuid(displayPage.getUuid());
			}
		} else {
			asset.setDescription(item.getUserName() + " (" + item.getCreateDate() + ")", LocaleThreadLocal.getThemeDisplayLocale());
			asset.setModifiedDate(item.getModifiedDate());
			asset.setSummary(item.getUserName() + " (" + item.getCreateDate() + ")", LocaleThreadLocal.getThemeDisplayLocale());
			asset.setUserId(item.getUserId());
			asset.setUserName(item.getUserName());
			asset.setUserUuid(item.getUserUuid());
		}
		assetEntryLocalService.updateAssetEntry(asset);
		return asset;
	}

	private void associateResource(Item item, ServiceContext sc) {
		try {
			resourceLocalService.addResources(item.getCompanyId(), item.getGroupId(), Item.class.getName(), true);
			resourceLocalService.addModelResources(
					item.getCompanyId(), 
					item.getGroupId(), 
					item.getUserId(), 
					Item.class.getName(), 
					item.getPrimaryKey(), sc.getModelPermissions());
		} catch (PortalException e) {
			_log.error(e.getMessage());
		}
	}

	public JSONObject fillItemJson(Item item) {
		JSONObject itemJson = JSONFactoryUtil.createJSONObject();
		itemJson.put("userId", item.getUserId());
		itemJson.put("groupId", item.getGroupId());
		itemJson.put("itemId", item.getItemId());
		itemJson.put("environmentId", item.getEnvironmentId());
		itemJson.put("profileId", item.getProfileId());
		itemJson.put("carpentryId", item.getCarpentryId());
		itemJson.put("handleId", item.getHandleId());
		itemJson.put("colorId", item.getColorId());
		itemJson.put("cartId", item.getCartId());
		itemJson.put("qty", item.getQty());
		itemJson.put("price", item.getPrice());
		itemJson.put("width", item.getWidth());
		itemJson.put("height", item.getHeight());
		itemJson.put("color", item.getColor());
		itemJson.put("carpentryImg", item.getCarpentryImg());
		return itemJson;
	}

	private AssetEntry deAssociateAssetEntry(Item item) {
		AssetEntry asset = assetEntryLocalService.fetchEntry(Item.class.getName(), item.getPrimaryKey());
		if(Validator.isNotNull(asset)) {
			List<AssetCategory> categories = AssetCategoryLocalServiceUtil.getAssetEntryAssetCategories(asset.getEntryId());
			AssetCategoryLocalServiceUtil.clearAssetEntryAssetCategories(asset.getEntryId());
			for(AssetCategory category : categories) {
				assetEntryLocalService.deleteAssetCategoryAssetEntry(category.getCategoryId(), asset.getEntryId());
			}
			assetEntryLocalService.deleteAssetEntry(asset);
		}
		return asset;
	}
	private void deAssociateResource(Item item) {
		try {
			resourceLocalService.deleteResource(item.getCompanyId(), Item.class.getName(), ResourceConstants.SCOPE_GROUP, item.getPrimaryKey());
		} catch (PortalException e) {
			_log.error(e.getMessage());
		}
		
	}

	private JSONObject fillCartJson(Cart cart) {
		JSONObject cartJson = JSONFactoryUtil.createJSONObject();
		cartJson.put("userId", cart.getUserId());
		cartJson.put("cartId", cart.getCartId());
		cartJson.put("total", cart.getTotal());
		cartJson.put("status", cart.getStatus());
		cartJson.put("invoiceDiscount", cart.getInvoiceDiscount());
		cartJson.put("discount", (cart.getInvoiceDiscount() ? 50 : 0));
		cartJson.put("discountedTotal", (cart.getInvoiceDiscount() ? (cart.getTotal()/2) : cart.getTotal()));
		return cartJson;
	}

	@Reference
	private CounterLocalService _counterLocalService;
	@Reference
	private UserLocalService _userLocalService;

	
	private static final Log _log = LogFactoryUtil.getLog(ItemLocalServiceImpl.class.getName());
}