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

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.asset.kernel.model.AssetCategory;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.service.AssetCategoryLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.document.library.kernel.exception.NoSuchFileEntryException;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.ClassName;
import com.liferay.portal.kernel.model.Contact;
import com.liferay.portal.kernel.model.Country;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.ListType;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.model.Region;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.module.configuration.ConfigurationProvider;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.IndexerRegistry;
import com.liferay.portal.kernel.service.AddressLocalService;
import com.liferay.portal.kernel.service.ClassNameLocalServiceUtil;
import com.liferay.portal.kernel.service.CountryService;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.ListTypeLocalService;
import com.liferay.portal.kernel.service.ListTypeLocalServiceUtil;
import com.liferay.portal.kernel.service.PhoneLocalService;
import com.liferay.portal.kernel.service.RegionService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserGroupLocalService;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.LocaleThreadLocal;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import it.vmt.gh.pdf.api.PdfApi;
import it.vmt.gh.sb.model.Carpentry;
import it.vmt.gh.sb.model.Cart;
import it.vmt.gh.sb.model.Color;
import it.vmt.gh.sb.model.Handle;
import it.vmt.gh.sb.model.Item;
import it.vmt.gh.sb.service.CarpentryLocalService;
import it.vmt.gh.sb.service.ColorLocalService;
import it.vmt.gh.sb.service.EnvironmentLocalService;
import it.vmt.gh.sb.service.HandleLocalService;
import it.vmt.gh.sb.service.ItemLocalService;
import it.vmt.gh.sb.service.ProfileLocalService;
import it.vmt.gh.sb.service.base.CartLocalServiceBaseImpl;

/**
 * The implementation of the cart local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.vmt.gh.sb.service.CartLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CartLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=it.vmt.gh.sb.model.Cart",
	service = AopService.class
)
public class CartLocalServiceImpl extends CartLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>it.vmt.gh.sb.service.CartLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>it.vmt.gh.sb.service.CartLocalServiceUtil</code>.
	 */
	private static final String TEMPLATES_PATH = "mail-templates";
	
	public Address addAddress(long userId, String street, String number, String city, String zip, String countryA3, String regionCode) throws PortalException {
		User user = _userLocalService.fetchUser(userId);
		ListType listType = ListTypeLocalServiceUtil.getListType("business", "com.liferay.portal.kernel.model.Contact.address");
		Country country = _countryService.fetchCountryByA2(countryA3);
		Region region = _regionService.fetchRegion(country.getPrimaryKey(), regionCode);
		Address address = null;
		if(Validator.isNotNull(listType)) {
			if(user.getAddresses().size() > 0) {
				address = user.getAddresses().get(0);
				address.setStreet1(street);
				address.setCity(city);
				address.setZip(zip);
				_addressLocalService.updateAddress(address);
			}else {
				address = _addressLocalService.addAddress(
						user.getUserId(), 
						Contact.class.getName(), 
						user.getContact().getPrimaryKey(), 
						street, 
						number, // civico 
						"", 
						city, // comune
						zip, 
						region.getPrimaryKey(), // provincia
						country.getPrimaryKey(), // stato
						listType.getPrimaryKey(), 
						Boolean.TRUE, 
						Boolean.TRUE, 
						new ServiceContext());
			}
		}
		return address;
	}
	
	@Indexable(type = IndexableType.REINDEX)
	public String addItemToCart(
			long groupId, 
			long userId, 
			long itemId, 
			long cartId, 
			long environmentId, 
			long profileId, 
			long carpentryId,
			long handleId, 
			long colorId, 
			int price, 
			int qty, 
			double width, 
			double height, 
			String color) throws JSONException, ConfigurationException {
		String result = null;
		Cart cart = null;
		if(cartId > 0) {
			cart = cartPersistence.fetchByPrimaryKey(cartId);
		}else {
			cart = updateCart(groupId, userId, cartId, 0, Boolean.FALSE);
		}
		_itemLocalService.updateItem(groupId, userId, itemId, cart.getCartId(), environmentId, profileId, carpentryId, handleId, colorId, price, qty, width, height, color);
		List<Item> items = itemPersistence.findByCart(cart.getCartId());
		JSONArray itemsJson = JSONFactoryUtil.createJSONArray();
		double total = 0;
		for (Item item : items) {
			total += calculateItemPrice(item);
			JSONObject itemJson = _itemLocalService.fillItemJson(item);
			JSONObject environmentJson = _environmentLocalService.fillEnvironmentJson(environmentPersistence.fetchByPrimaryKey(item.getEnvironmentId()));
			JSONObject profileJson = _profileLocalService.fillProfileJson(profilePersistence.fetchByPrimaryKey(item.getProfileId()));
			JSONObject carpentryJson = _carpentryLocalService.fillCarpentryJson(carpentryPersistence.fetchByPrimaryKey(item.getCarpentryId()));
			JSONObject handleJson = _handleLocalService.fillHandleJson(handlePersistence.fetchByPrimaryKey(item.getHandleId()));
			itemJson.put("environment", environmentJson);
			itemJson.put("profile", profileJson);
			itemJson.put("carpentry", carpentryJson);
			itemJson.put("handle", handleJson);
			itemsJson.put(itemJson);
		}
		cart.setTotal(total);
		cart.setStatus(WorkflowConstants.STATUS_DRAFT);
		cart.setInstallationTotal(cart.getInstallation() == Boolean.TRUE ? (100 * items.size()) : 0);
		cartPersistence.update(cart);
		JSONObject cartJson = fillCartJson(cart);
		cartJson.put("items", itemsJson);
		result = cartJson.toString();
		return result;
	}
	
	@Indexable(type = IndexableType.REINDEX)
	public String approveUserCart(
			long cartId, 
			long userId,
			long groupId,
			String firstName,
			String lastName,
			String emailAddress,
			String phone,
			boolean invoiceDiscount,
			boolean installation,
			boolean delivery) throws PortalException {
		Cart result = null;
		Group ghGroup = GroupLocalServiceUtil.fetchFriendlyURLGroup(PortalUtil.getDefaultCompanyId(), "/green-house");
		User user = _userLocalService.fetchUser(userId);
		if(Validator.isNull(user) || user.isDefaultUser() || user.getScreenName().equalsIgnoreCase("test")) {
			user = createUser(userId, PortalUtil.getDefaultCompanyId(), firstName, lastName, emailAddress, phone);
		}
		Calendar now = Calendar.getInstance();
		if(cartId > 0) {
			result = cartPersistence.fetchByPrimaryKey(cartId);
		}else {
			return null;
		}
		int itemsCount = itemPersistence.countByCart(cartId);
		result.setGroupId(ghGroup.getGroupId());
		result.setStatus(WorkflowConstants.STATUS_APPROVED);
		result.setModifiedDate(now.getTime());
		result.setUserId(user.getUserId());
		result.setUserName(user.getFullName());
		result.setUserUuid(user.getUuid());
		result.setInvoiceDiscount(invoiceDiscount);
		result.setInstallation(installation);
		result.setInstallationTotal(installation == Boolean.TRUE ? (100 * itemsCount) : 0);
		result.setDelivery(delivery);
		result.setDeliveryTotal(delivery == Boolean.TRUE ? 150 : 0);
		result.setTotal(calculateCartTotal(result));
		result.setVat(0.1);
		result.setTotalWithVat(calculateCartTotalWithVat(result));
		result.setDiscountedTotal(invoiceDiscount ? result.getTotalWithVat()/2 : result.getTotalWithVat());
		cartPersistence.update(result);
		sanitizeCartItems(result, user);
		JSONObject resultJson = JSONFactoryUtil.createJSONObject();
		JSONObject cartJson = findByCartId(cartId);
		resultJson.put("contact", fillUserJson(user));
		resultJson.put("cart", cartJson.getJSONObject("cart"));
		try {
			long offerId = _pdfApi.generateUserOffer(cartJson.toJSONString());
			result.setOfferId(offerId);
		} catch (Exception e) {
			_log.fatal(e.getMessage());
		}
		cartPersistence.update(result);
		associateAssetEntry(result);
		associateResource(result, new ServiceContext());
		_indexerRegistry.getIndexer(Cart.class.getName()).reindex(result);
		sendUserActivationNotification(user.getUserId());
		// add phone
		addPhone(user.getUserId(), phone);
		return resultJson.toString();
	}

	public String recalculateUserCart(
			long cartId, 
			long userId,
			long groupId,
			long carpentryId,
			long handleId, 
			long colorId, 
			int itemHeight,
			int itemWidth,
			String firstName,
			String lastName,
			String emailAddress,
			String phone,
			boolean invoiceDiscount,
			boolean installation,
			boolean delivery) throws PortalException {
		Cart result = null;
		Calendar now = Calendar.getInstance();
		User user = userLocalService.fetchUser(userId);
		JSONObject userJson = null;
		if(Validator.isNotNull(user)) {
			userJson = fillUserJson(user);
		}else {
			userJson = JSONFactoryUtil.createJSONObject();
			userJson.put("userId", user.getUserId());
			userJson.put("firstName", user.getFirstName());
			userJson.put("lastName", user.getLastName());
			userJson.put("emailAddress", user.getEmailAddress());
			userJson.put("phone", 0);
		}
		if(cartId > 0) {
			result = cartPersistence.fetchByPrimaryKey(cartId);
		}else {
			result = updateCart(groupId, userId, cartId, 0, invoiceDiscount);
		}
		Item currentItem = itemPersistence.create(0);
		currentItem.setHandleId(handleId);
		currentItem.setCarpentryId(carpentryId);
		currentItem.setColorId(colorId);
		currentItem.setHeight(itemHeight);
		currentItem.setWidth(itemWidth);
		currentItem.setPrice(calculateItemPrice(currentItem));
		result.setGroupId(groupId);
		result.setStatus(WorkflowConstants.STATUS_APPROVED);
		result.setModifiedDate(now.getTime());
		result.setUserId(userId);
		result.setUserName(firstName + " " + lastName);
		result.setUserUuid("");
		result.setInvoiceDiscount(invoiceDiscount);
		result.setInstallation(installation);
		result.setDelivery(delivery);
		result.setDeliveryTotal(delivery == Boolean.TRUE ? 150 : 0);
		result.setTotal(calculateCartTotal(result) + calculateItemPrice(currentItem));
		result.setVat(0.1);
		result.setTotalWithVat(calculateCartTotalWithVat(result));
		result.setDiscountedTotal(invoiceDiscount ? result.getTotalWithVat()/2 : result.getTotalWithVat());
		JSONObject resultJson = JSONFactoryUtil.createJSONObject();
		JSONObject cartJson = findByCartId(result.getCartId());
		List<Item> items = itemPersistence.findByCart(result.getCartId());
		result.setInstallationTotal(installation == Boolean.TRUE ? (100 * items.size()) : 0);
		JSONArray itemsJson = JSONFactoryUtil.createJSONArray();
		double total = 0;
		// CURRENT ITEM
		total += calculateItemPrice(currentItem);
		JSONObject currentItemJson = _itemLocalService.fillItemJson(currentItem);
		JSONObject currentCarpentryJson = _carpentryLocalService.fillCarpentryJson(carpentryPersistence.fetchByPrimaryKey(currentItem.getCarpentryId()));
		if(currentItem.getHandleId() > 0) {
			JSONObject currentHandleJson = _handleLocalService.fillHandleJson(handlePersistence.fetchByPrimaryKey(currentItem.getHandleId()));
			currentItemJson.put("handle", currentHandleJson);
		}
		currentItemJson.put("carpentry", currentCarpentryJson);
		itemsJson.put(currentItemJson);
		// PERSISTED ITEMS
		for (Item item : items) {
			double itemTotal = calculateItemPrice(item); 
			total += itemTotal;
			item.setCartId(cartId);
			item.setPrice(itemTotal);
			JSONObject itemJson = _itemLocalService.fillItemJson(item);
			JSONObject environmentJson = _environmentLocalService.fillEnvironmentJson(environmentPersistence.fetchByPrimaryKey(item.getEnvironmentId()));
			JSONObject profileJson = _profileLocalService.fillProfileJson(profilePersistence.fetchByPrimaryKey(item.getProfileId()));
			JSONObject carpentryJson = _carpentryLocalService.fillCarpentryJson(carpentryPersistence.fetchByPrimaryKey(item.getCarpentryId()));
			JSONObject handleJson = _handleLocalService.fillHandleJson(handlePersistence.fetchByPrimaryKey(item.getHandleId()));
			itemJson.put("environment", environmentJson);
			itemJson.put("profile", profileJson);
			itemJson.put("carpentry", carpentryJson);
			itemJson.put("handle", handleJson);
			itemsJson.put(itemJson);
		}
		result.setTotal(total);
		result.setStatus(WorkflowConstants.STATUS_DRAFT);
		cartPersistence.update(result);
		cartJson = findByCartId(result.getPrimaryKey());
		cartJson.put("items", itemsJson);

		resultJson.put("contact", userJson);
		resultJson.put("cart", cartJson.getJSONObject("cart"));
		resultJson.put("currentItem", currentItemJson);
		return resultJson.toString();
	}

	@Indexable(type = IndexableType.REINDEX)
	public Cart updateCart(
			long groupId, 
			long userId,
			long cartId,
			double total,
			boolean invoiceDiscount) {
		Cart result = null;
		User user = _userLocalService.fetchUser(userId);
		Calendar now = Calendar.getInstance();
		if(cartId > 0) {
			result = cartPersistence.fetchByPrimaryKey(cartId);
		}else {
			result = cartPersistence.create(_counterLocalService.increment());
			result.setCompanyId(PortalUtil.getDefaultCompanyId());
			result.setCreateDate(now.getTime());
			result.setDisplayDate(now.getTime());
			result.setGroupId(groupId);
		}
		result.setTotal(total);
		result.setInvoiceDiscount(invoiceDiscount);
		result.setModifiedDate(now.getTime());
		result.setUserId(userId);
		result.setUserName(user.getFullName());
		result.setUserUuid(user.getUuid());
		associateAssetEntry(result);
		associateResource(result, new ServiceContext());
		cartPersistence.update(result);
		associateAssetEntry(result);
		return result;
	}

	public String deleteItemFromCart(long itemId) throws JSONException {
		String result = null;
		Item existing = _itemLocalService.deleteItemFromCart(itemId);
		if(Validator.isNotNull(existing)) {
			Cart cart = cartPersistence.fetchByPrimaryKey(existing.getCartId());
			List<Item> items = itemPersistence.findByCart(cart.getCartId());
			JSONArray itemsJson = JSONFactoryUtil.createJSONArray();
			for (Item item : items) {
				JSONObject itemJson = _itemLocalService.fillItemJson(item);
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

	public Cart emptyCart(long cartId) {
		Cart result = null;
		if(cartId > 0) {
			result = cartPersistence.fetchByPrimaryKey(cartId);
			itemPersistence.removeByCart(cartId);
			result.setTotal(0);
			cartPersistence.update(result);
		}else {
			return null;
		}
		return result;
	}
	
	public Cart deleteCart(long cartId) throws PortalException {
		Cart cart = null;
		cart = cartPersistence.fetchByPrimaryKey(cartId);
		List<Item> items = itemPersistence.findByCart(cartId);
		for(Item item : items) {
			_itemLocalService.deleteItem(item);
		}
		cartPersistence.remove(cart);
		if(cart.getOfferId() > 0) {
			try {
				_dlFileEntryLocalService.deleteDLFileEntry(cart.getOfferId());
			}catch(NoSuchFileEntryException e) {
				_log.warn("Offer not found");
			}
		}
		if(cart.getInvoiceId() > 0) {
			try {
				_dlFileEntryLocalService.deleteDLFileEntry(cart.getInvoiceId());
			}catch(NoSuchFileEntryException e) {
				_log.warn("Invoice not found");
			}
		}
		deAssociateAssetEntry(cart);
		deAssociateResource(cart);
		return cart;
	}

	private AssetEntry associateAssetEntry(Cart item) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		AssetEntry asset = assetEntryLocalService.fetchEntry(Cart.class.getName(), item.getPrimaryKey());
		Layout displayPage = LayoutLocalServiceUtil.fetchLayoutByFriendlyURL(item.getGroupId(), Boolean.TRUE,
				"/dashboard");
		if (asset == null) {
			ClassName cn = ClassNameLocalServiceUtil.getClassName(Cart.class.getName());
			asset = assetEntryLocalService.createAssetEntry(_counterLocalService.increment());
			asset.setClassName(Cart.class.getName());
			asset.setClassNameId(cn.getClassNameId());
			asset.setClassPK(item.getPrimaryKey());
			asset.setCompanyId(item.getCompanyId());
			asset.setCreateDate(item.getCreateDate());
			asset.setModifiedDate(item.getModifiedDate());
			asset.setPublishDate(item.getDisplayDate());
			asset.setVisible(Boolean.TRUE);
			asset.setListable(Boolean.TRUE);
		} else {
			asset.setModifiedDate(item.getModifiedDate());
		}
		if (Validator.isNotNull(displayPage)) {
			asset.setLayoutUuid(displayPage.getUuid());
		}
		asset.setUserId(item.getUserId());
		asset.setGroupId(item.getGroupId());
		asset.setUserName(item.getUserName());
		asset.setUserUuid(item.getUserUuid());
		asset.setSummary(item.getUserName() + " (" + sdf.format(item.getCreateDate()) + ")", LocaleThreadLocal.getThemeDisplayLocale());
		asset.setTitle(item.getUserName() + " (" + sdf.format(item.getCreateDate()) + ")", LocaleThreadLocal.getThemeDisplayLocale());
		asset.setDescription(item.getUserName() + " (" + sdf.format(item.getCreateDate()) + ")", LocaleThreadLocal.getThemeDisplayLocale());
		assetEntryLocalService.updateAssetEntry(asset);
		return asset;
	}

	private void associateResource(Cart item, ServiceContext sc) {
		try {
			resourceLocalService.addResources(item.getCompanyId(), item.getGroupId(), Cart.class.getName(), true);
			resourceLocalService.addModelResources(
					item.getCompanyId(), 
					item.getGroupId(), 
					item.getUserId(), 
					Cart.class.getName(), 
					item.getPrimaryKey(), sc.getModelPermissions());
		} catch (PortalException e) {
			_log.error(e.getMessage());
		}
	}

	private AssetEntry deAssociateAssetEntry(Cart item) {
		AssetEntry asset = assetEntryLocalService.fetchEntry(Cart.class.getName(), item.getPrimaryKey());
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
	private void deAssociateResource(Cart item) {
		try {
			resourceLocalService.deleteResource(item.getCompanyId(), Cart.class.getName(), ResourceConstants.SCOPE_GROUP, item.getPrimaryKey());
		} catch (PortalException e) {
			_log.error(e.getMessage());
		}
		
	}

	private JSONObject fillUserJson(User user) {
		JSONObject userJson = JSONFactoryUtil.createJSONObject();
		userJson.put("userId", user.getUserId());
		userJson.put("firstName", user.getFirstName());
		userJson.put("lastName", user.getLastName());
		userJson.put("emailAddress", user.getEmailAddress());
		userJson.put("phone", 0);
		return userJson;
	}

	private User createUser(
			long userId,
			long companyId,
			String firstName,
			String lastName,
			String emailAddress,
			String phone
		) throws PortalException {
		User user = userLocalService.fetchUserByScreenName(PortalUtil.getDefaultCompanyId(), String.valueOf(firstName + "." + lastName));
		Calendar birthdayCal = Calendar.getInstance();
		if(Validator.isNull(user)) {
			user = userLocalService.addUser(
					userId, 
					companyId, 
					Boolean.FALSE,
					String.valueOf("pass4" + firstName.toLowerCase()),
					String.valueOf("pass4" + firstName.toLowerCase()), 
					Boolean.FALSE,
					String.valueOf(firstName + "." + lastName), 
					String.valueOf(emailAddress), 
					-1L, 
					null,
					LocaleUtil.ITALY, 
					firstName, 
					"", 
					lastName,
					0,
					0,
					Boolean.TRUE, 
					birthdayCal.get(Calendar.MONTH),
					birthdayCal.get(Calendar.DAY_OF_MONTH), 
					birthdayCal.get(Calendar.YEAR),
					"Cliente", 
					new long[] {}, 
					new long[] {}, 
					new long[] {},
					new long[] {}, 
					Boolean.FALSE, 
					new ServiceContext());
			
			userLocalService.updateStatus(user.getUserId(), WorkflowConstants.STATUS_INACTIVE, new ServiceContext());
			userLocalService.updatePasswordReset(user.getPrimaryKey(), Boolean.TRUE);
			if(Validator.isNotNull(phone) && !phone.isEmpty()) {
				addPhone(user.getUserId(), phone);
			}
			UserGroup ug = _userGroupLocalService.fetchUserGroup(PortalUtil.getDefaultCompanyId(), "GH-CUSTOMER");
			if(Validator.isNotNull(ug)) {
				_userLocalService.addUserGroupUser(ug.getPrimaryKey(), user.getPrimaryKey());
			}
			
		}
		return user;
	}

	public JSONObject findByCartId(long cartId) throws JSONException {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		Cart cart = cartPersistence.fetchByPrimaryKey(cartId);
		User user = null;
		if (Validator.isNotNull(cart)) {
			user = userLocalService.fetchUser(cart.getUserId());
			List<Item> items = itemPersistence.findByCart(cart.getCartId());
			JSONArray itemsJson = JSONFactoryUtil.createJSONArray();
			for (Item item : items) {
				JSONObject itemJson = _itemLocalService.fillItemJson(item);
				JSONObject environmentJson = _environmentLocalService.fillEnvironmentJson(environmentPersistence.fetchByPrimaryKey(item.getEnvironmentId()));
				JSONObject profileJson = _profileLocalService.fillProfileJson(profilePersistence.fetchByPrimaryKey(item.getProfileId()));
				JSONObject carpentryJson = _carpentryLocalService.fillCarpentryJson(carpentryPersistence.fetchByPrimaryKey(item.getCarpentryId()));
				JSONObject handleJson = _handleLocalService.fillHandleJson(handlePersistence.fetchByPrimaryKey(item.getHandleId()));
				JSONObject colorJson = _colorLocalService.fillColorJson(colorPersistence.fetchByPrimaryKey(item.getColorId()));
				itemJson.put("environment", environmentJson);
				itemJson.put("profile", profileJson);
				itemJson.put("carpentry", carpentryJson);
				itemJson.put("handle", handleJson);
				itemJson.put("color", colorJson);
				itemsJson.put(itemJson);
			}
			JSONObject cartJson = fillCartJson(cart);
			JSONObject userJson = fillUserJson(user);
			cartJson.put("items", itemsJson);
			result.put("cart", cartJson);
			result.put("contact", userJson);
		}
		return result;
	}
	
	public List<Cart> findByUserId(long userId) {
		return cartPersistence.findByUser(userId);
	}
	
	public Phone addPhone(long userId, String number) throws PortalException {
		Phone phone = null;
		User user = _userLocalService.fetchUser(userId);
		List<ListType> listTypes = ListTypeLocalServiceUtil.getListTypes("com.liferay.portal.kernel.model.Contact.phone");
		if(listTypes.size() > 0) {
			ListType listType = listTypes.get(0);
			if(user.getPhones().size() > 0) {
				phone  = user.getPhones().get(0);
				phone.setNumber(number);
				_phoneLocalService.updatePhone(phone);
			}else {
				phone = _phoneLocalService.addPhone(
						user.getUserId(), 
						Contact.class.getName(), 
						user.getContact().getPrimaryKey(), 
						number, 
						"", 
						listType.getListTypeId(), 
						Boolean.TRUE, 
						new ServiceContext());
			}
		}
		return phone;
	}

	private void sendUserActivationNotification(long userId) throws ConfigurationException {
		String activationUrl = "https://configuratore.ghouse2020.it/attivazione";
		String mainFrom = "noreply@ghouse2020.com";
		User user = UserLocalServiceUtil.fetchUser(userId);
		activationUrl = activationUrl + "?id=" + user.getUserId();
		InternetAddress from = null;
		try {
			from = new InternetAddress(mainFrom);
		} catch (AddressException e) {
			_log.error(e.getMessage());
		}
		InternetAddress[] tos;
		try {
			tos = new InternetAddress[]{new InternetAddress(user.getEmailAddress())};
		} catch (AddressException e) {
			tos = new InternetAddress[] {};
		}
		String subject = null;
		String body = "<h2>" + LanguageUtil.get(LocaleThreadLocal.getSiteDefaultLocale(), "user.activation.notification.body", "GREEN-HOUSE") + "</h2>" + 
				"<p> <h3>" + user.getEmailAddress() + " - " + user.getFullName() + " </h3> </p>" + 
				"<p><a href=\""+activationUrl+"\">activation</a></p>";

		try {
			subject = StringUtil.read(getClassLoader(), TEMPLATES_PATH +"/user-activation-subject.tmpl");
		} catch (IOException e) {
			subject = LanguageUtil.get(LocaleThreadLocal.getSiteDefaultLocale(), "user.activation.notification.subject", "GREEN-HOUSE: Attivazione account");
			_log.error(e.getMessage());
		}
		_log.info(body);
		MailMessage mailMessage = new MailMessage(from, subject, body, true);
		_log.info("Sending notification to:");
		mailMessage.setTo(tos);
		MailServiceUtil.sendEmail(mailMessage);
		_log.info("E-Mail sent");
	}

	private void sanitizeCartItems(Cart cart, User user) {
		List<Item> items = itemPersistence.findByCart(cart.getPrimaryKey());
		for(Item item : items) {
			item.setUserId(user.getUserId());
			item.setUserName(user.getFullName());
			item.setUserUuid(user.getUuid());
			item.setGroupId(cart.getGroupId());
			itemPersistence.update(item);
		}
	}

	private double calculateItemPrice(Item item) throws ConfigurationException {
		
		double total = 0;
		double handlePrice = 0;
		double carpentryPrice = 0;
		if(item.getHandleId() > 0) {
			Handle handle = handlePersistence.fetchByPrimaryKey(item.getHandleId());
			handlePrice = handle.getPrice();
		}
		if(item.getCarpentryId() > 0) {
			Carpentry carpentry = carpentryPersistence.fetchByPrimaryKey(item.getCarpentryId());
			Color color = colorPersistence.fetchByPrimaryKey(item.getColorId());
			carpentryPrice = calculateCarpentryPrice(carpentry, item);
		}
		total = handlePrice + carpentryPrice;
		item.setPrice(total);
		if(item.getPrimaryKey() > 0) {
			itemPersistence.update(item);
		}
		return Math.round(total);
	}
	
	private double calculateCarpentryPrice(Carpentry carpentry, Item item) {
		double price = 0;
		double perimeter =  0;
		if(carpentry.getShutters() == 1) {
			perimeter = ((item.getHeight() * 2)/1000) + ((item.getWidth() * 2)/1000);
		}else if(carpentry.getShutters() == 2) {
			perimeter = ((item.getHeight() * 4)/1000) + ((item.getWidth() * 2)/1000);
		}else if(carpentry.getShutters() == 3) {
			perimeter = ((item.getHeight() * 6)/1000) + ((item.getWidth() * 2)/1000);
		}
		price = (carpentry.getPrice() * perimeter);
		_log.info("CARPENTRY PRICE - PERIMETER " + perimeter + " PRICE " + carpentry.getPrice() + " TOTAL " + price);
		return Math.round(price);
	}

	private double calculateCartTotal(Cart cart) {
		List<Item> items = itemPersistence.findByCart(cart.getPrimaryKey());
		double total = 0;
		for(Item item : items) {
			total += item.getPrice();
		}
		if(cart.isDelivery()) {
			total += 150;
		}
		if(cart.isInstallation()) {
			total += 150;
		}
		return Math.round(total);
	}

	private double calculateCartTotalWithVat(Cart cart) {
		return Math.round((cart.getTotal() * 0.1) + cart.getTotal());
	}

	private JSONObject fillCartJson(Cart cart) {
		JSONObject cartJson = JSONFactoryUtil.createJSONObject();
		cartJson.put("userId", cart.getUserId());
		cartJson.put("cartId", cart.getCartId());
		cartJson.put("total", cart.getTotal());
		cartJson.put("status", cart.getStatus());
		cartJson.put("invoiceDiscount", cart.getInvoiceDiscount());
		cartJson.put("installation", cart.getInstallation());
		cartJson.put("installationTotal", cart.getInstallationTotal());
		cartJson.put("delivery", cart.getDelivery());
		cartJson.put("deliveryTotal", cart.getDeliveryTotal());
		cartJson.put("discount", (cart.getInvoiceDiscount() ? 50 : 0));
		cartJson.put("discountedTotal", (cart.getInvoiceDiscount() ? (calculateCartTotalWithVat(cart)/2) : calculateCartTotalWithVat(cart)));
		cartJson.put("vat", 0.1);
		cartJson.put("totalWithVat", calculateCartTotalWithVat(cart));
		return cartJson;
	}

	@Reference
	private AddressLocalService _addressLocalService;
	@Reference
	private CarpentryLocalService _carpentryLocalService;
	@Reference
	private ColorLocalService _colorLocalService;
	@Reference
	private CounterLocalService _counterLocalService;
	@Reference
	private CountryService _countryService;
	@Reference
	private EnvironmentLocalService _environmentLocalService;
	@Reference
	private HandleLocalService _handleLocalService;
	@Reference
	private ItemLocalService _itemLocalService;
	@Reference
	private ListTypeLocalService _listTypeLocalService;
	@Reference
	private PhoneLocalService _phoneLocalService;
	@Reference
	private ProfileLocalService _profileLocalService;
	@Reference
	private RegionService _regionService;
	@Reference
	private UserLocalService _userLocalService;
	@Reference
	private UserGroupLocalService _userGroupLocalService;
	@Reference
	private PdfApi _pdfApi;
	@Reference
	private IndexerRegistry _indexerRegistry;
	@Reference
	private DLFileEntryLocalService _dlFileEntryLocalService;

	@Reference
	private ConfigurationProvider _configurationProvider;
	
	private static final Log _log = LogFactoryUtil.getLog(CartLocalServiceImpl.class.getName());
}