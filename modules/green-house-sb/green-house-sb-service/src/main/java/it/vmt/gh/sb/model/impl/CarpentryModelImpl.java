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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import it.vmt.gh.sb.model.Carpentry;
import it.vmt.gh.sb.model.CarpentryModel;
import it.vmt.gh.sb.model.CarpentrySoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Carpentry service. Represents a row in the &quot;gh_Carpentry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CarpentryModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CarpentryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CarpentryImpl
 * @generated
 */
@JSON(strict = true)
public class CarpentryModelImpl
	extends BaseModelImpl<Carpentry> implements CarpentryModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a carpentry model instance should use the <code>Carpentry</code> interface instead.
	 */
	public static final String TABLE_NAME = "gh_Carpentry";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"carpentryId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"code_", Types.VARCHAR}, {"name", Types.VARCHAR},
		{"img", Types.VARCHAR}, {"price", Types.DOUBLE},
		{"shutters", Types.INTEGER}, {"specificationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("carpentryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("code_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("img", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("price", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("shutters", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("specificationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table gh_Carpentry (uuid_ VARCHAR(75) null,carpentryId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,code_ VARCHAR(75) null,name VARCHAR(75) null,img VARCHAR(256) null,price DOUBLE,shutters INTEGER,specificationId LONG)";

	public static final String TABLE_SQL_DROP = "drop table gh_Carpentry";

	public static final String ORDER_BY_JPQL = " ORDER BY carpentry.name ASC";

	public static final String ORDER_BY_SQL = " ORDER BY gh_Carpentry.name ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)
	 */
	@Deprecated
	public static final long CODE_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)
	 */
	@Deprecated
	public static final long NAME_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 16L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static Carpentry toModel(CarpentrySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Carpentry model = new CarpentryImpl();

		model.setUuid(soapModel.getUuid());
		model.setCarpentryId(soapModel.getCarpentryId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCode(soapModel.getCode());
		model.setName(soapModel.getName());
		model.setImg(soapModel.getImg());
		model.setPrice(soapModel.getPrice());
		model.setShutters(soapModel.getShutters());
		model.setSpecificationId(soapModel.getSpecificationId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<Carpentry> toModels(CarpentrySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Carpentry> models = new ArrayList<Carpentry>(soapModels.length);

		for (CarpentrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public CarpentryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _carpentryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCarpentryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _carpentryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Carpentry.class;
	}

	@Override
	public String getModelClassName() {
		return Carpentry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Carpentry, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Carpentry, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Carpentry, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Carpentry)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Carpentry, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Carpentry, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Carpentry)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Carpentry, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Carpentry, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Carpentry>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Carpentry.class.getClassLoader(), Carpentry.class,
			ModelWrapper.class);

		try {
			Constructor<Carpentry> constructor =
				(Constructor<Carpentry>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Carpentry, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Carpentry, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Carpentry, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Carpentry, Object>>();
		Map<String, BiConsumer<Carpentry, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Carpentry, ?>>();

		attributeGetterFunctions.put("uuid", Carpentry::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Carpentry, String>)Carpentry::setUuid);
		attributeGetterFunctions.put("carpentryId", Carpentry::getCarpentryId);
		attributeSetterBiConsumers.put(
			"carpentryId",
			(BiConsumer<Carpentry, Long>)Carpentry::setCarpentryId);
		attributeGetterFunctions.put("groupId", Carpentry::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Carpentry, Long>)Carpentry::setGroupId);
		attributeGetterFunctions.put("companyId", Carpentry::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Carpentry, Long>)Carpentry::setCompanyId);
		attributeGetterFunctions.put("userId", Carpentry::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Carpentry, Long>)Carpentry::setUserId);
		attributeGetterFunctions.put("userName", Carpentry::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Carpentry, String>)Carpentry::setUserName);
		attributeGetterFunctions.put("createDate", Carpentry::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<Carpentry, Date>)Carpentry::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", Carpentry::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<Carpentry, Date>)Carpentry::setModifiedDate);
		attributeGetterFunctions.put("code", Carpentry::getCode);
		attributeSetterBiConsumers.put(
			"code", (BiConsumer<Carpentry, String>)Carpentry::setCode);
		attributeGetterFunctions.put("name", Carpentry::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<Carpentry, String>)Carpentry::setName);
		attributeGetterFunctions.put("img", Carpentry::getImg);
		attributeSetterBiConsumers.put(
			"img", (BiConsumer<Carpentry, String>)Carpentry::setImg);
		attributeGetterFunctions.put("price", Carpentry::getPrice);
		attributeSetterBiConsumers.put(
			"price", (BiConsumer<Carpentry, Double>)Carpentry::setPrice);
		attributeGetterFunctions.put("shutters", Carpentry::getShutters);
		attributeSetterBiConsumers.put(
			"shutters", (BiConsumer<Carpentry, Integer>)Carpentry::setShutters);
		attributeGetterFunctions.put(
			"specificationId", Carpentry::getSpecificationId);
		attributeSetterBiConsumers.put(
			"specificationId",
			(BiConsumer<Carpentry, Long>)Carpentry::setSpecificationId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getCarpentryId() {
		return _carpentryId;
	}

	@Override
	public void setCarpentryId(long carpentryId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_carpentryId = carpentryId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getCode() {
		if (_code == null) {
			return "";
		}
		else {
			return _code;
		}
	}

	@Override
	public void setCode(String code) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_code = code;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalCode() {
		return getColumnOriginalValue("code_");
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalName() {
		return getColumnOriginalValue("name");
	}

	@JSON
	@Override
	public String getImg() {
		if (_img == null) {
			return "";
		}
		else {
			return _img;
		}
	}

	@Override
	public void setImg(String img) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_img = img;
	}

	@JSON
	@Override
	public double getPrice() {
		return _price;
	}

	@Override
	public void setPrice(double price) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_price = price;
	}

	@JSON
	@Override
	public int getShutters() {
		return _shutters;
	}

	@Override
	public void setShutters(int shutters) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_shutters = shutters;
	}

	@JSON
	@Override
	public long getSpecificationId() {
		return _specificationId;
	}

	@Override
	public void setSpecificationId(long specificationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_specificationId = specificationId;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Carpentry.class.getName()));
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (entry.getValue() != getColumnValue(entry.getKey())) {
				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Carpentry.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Carpentry toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Carpentry>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CarpentryImpl carpentryImpl = new CarpentryImpl();

		carpentryImpl.setUuid(getUuid());
		carpentryImpl.setCarpentryId(getCarpentryId());
		carpentryImpl.setGroupId(getGroupId());
		carpentryImpl.setCompanyId(getCompanyId());
		carpentryImpl.setUserId(getUserId());
		carpentryImpl.setUserName(getUserName());
		carpentryImpl.setCreateDate(getCreateDate());
		carpentryImpl.setModifiedDate(getModifiedDate());
		carpentryImpl.setCode(getCode());
		carpentryImpl.setName(getName());
		carpentryImpl.setImg(getImg());
		carpentryImpl.setPrice(getPrice());
		carpentryImpl.setShutters(getShutters());
		carpentryImpl.setSpecificationId(getSpecificationId());

		carpentryImpl.resetOriginalValues();

		return carpentryImpl;
	}

	@Override
	public int compareTo(Carpentry carpentry) {
		int value = 0;

		value = getName().compareTo(carpentry.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Carpentry)) {
			return false;
		}

		Carpentry carpentry = (Carpentry)object;

		long primaryKey = carpentry.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Carpentry> toCacheModel() {
		CarpentryCacheModel carpentryCacheModel = new CarpentryCacheModel();

		carpentryCacheModel.uuid = getUuid();

		String uuid = carpentryCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			carpentryCacheModel.uuid = null;
		}

		carpentryCacheModel.carpentryId = getCarpentryId();

		carpentryCacheModel.groupId = getGroupId();

		carpentryCacheModel.companyId = getCompanyId();

		carpentryCacheModel.userId = getUserId();

		carpentryCacheModel.userName = getUserName();

		String userName = carpentryCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			carpentryCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			carpentryCacheModel.createDate = createDate.getTime();
		}
		else {
			carpentryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			carpentryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			carpentryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		carpentryCacheModel.code = getCode();

		String code = carpentryCacheModel.code;

		if ((code != null) && (code.length() == 0)) {
			carpentryCacheModel.code = null;
		}

		carpentryCacheModel.name = getName();

		String name = carpentryCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			carpentryCacheModel.name = null;
		}

		carpentryCacheModel.img = getImg();

		String img = carpentryCacheModel.img;

		if ((img != null) && (img.length() == 0)) {
			carpentryCacheModel.img = null;
		}

		carpentryCacheModel.price = getPrice();

		carpentryCacheModel.shutters = getShutters();

		carpentryCacheModel.specificationId = getSpecificationId();

		return carpentryCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Carpentry, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Carpentry, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Carpentry, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Carpentry)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Carpentry, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Carpentry, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Carpentry, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Carpentry)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Carpentry>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private long _carpentryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _code;
	private String _name;
	private String _img;
	private double _price;
	private int _shutters;
	private long _specificationId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Carpentry, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Carpentry)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("carpentryId", _carpentryId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("code_", _code);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("img", _img);
		_columnOriginalValues.put("price", _price);
		_columnOriginalValues.put("shutters", _shutters);
		_columnOriginalValues.put("specificationId", _specificationId);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");
		attributeNames.put("code_", "code");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("carpentryId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("code_", 256L);

		columnBitmasks.put("name", 512L);

		columnBitmasks.put("img", 1024L);

		columnBitmasks.put("price", 2048L);

		columnBitmasks.put("shutters", 4096L);

		columnBitmasks.put("specificationId", 8192L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Carpentry _escapedModel;

}