/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.ams.model.impl;

import com.liferay.ams.model.Checkout;
import com.liferay.ams.model.CheckoutModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the Checkout service. Represents a row in the &quot;AMS_Checkout&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.ams.model.CheckoutModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CheckoutImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CheckoutImpl
 * @see com.liferay.ams.model.Checkout
 * @see com.liferay.ams.model.CheckoutModel
 * @generated
 */
public class CheckoutModelImpl extends BaseModelImpl<Checkout>
	implements CheckoutModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a checkout model instance should use the {@link com.liferay.ams.model.Checkout} interface instead.
	 */
	public static final String TABLE_NAME = "AMS_Checkout";
	public static final Object[][] TABLE_COLUMNS = {
			{ "checkoutId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "assetId", Types.BIGINT },
			{ "checkOutDate", Types.TIMESTAMP },
			{ "expectedCheckInDate", Types.TIMESTAMP },
			{ "actualCheckInDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table AMS_Checkout (checkoutId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,assetId LONG,checkOutDate DATE null,expectedCheckInDate DATE null,actualCheckInDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table AMS_Checkout";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.ams.model.Checkout"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.ams.model.Checkout"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.ams.model.Checkout"));

	public CheckoutModelImpl() {
	}

	public long getPrimaryKey() {
		return _checkoutId;
	}

	public void setPrimaryKey(long primaryKey) {
		setCheckoutId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_checkoutId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return Checkout.class;
	}

	public String getModelClassName() {
		return Checkout.class.getName();
	}

	public long getCheckoutId() {
		return _checkoutId;
	}

	public void setCheckoutId(long checkoutId) {
		_checkoutId = checkoutId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getAssetId() {
		return _assetId;
	}

	public void setAssetId(long assetId) {
		_assetId = assetId;
	}

	public Date getCheckOutDate() {
		return _checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		_checkOutDate = checkOutDate;
	}

	public Date getExpectedCheckInDate() {
		return _expectedCheckInDate;
	}

	public void setExpectedCheckInDate(Date expectedCheckInDate) {
		_expectedCheckInDate = expectedCheckInDate;
	}

	public Date getActualCheckInDate() {
		return _actualCheckInDate;
	}

	public void setActualCheckInDate(Date actualCheckInDate) {
		_actualCheckInDate = actualCheckInDate;
	}

	@Override
	public Checkout toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Checkout)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					Checkout.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		CheckoutImpl checkoutImpl = new CheckoutImpl();

		checkoutImpl.setCheckoutId(getCheckoutId());
		checkoutImpl.setCompanyId(getCompanyId());
		checkoutImpl.setUserId(getUserId());
		checkoutImpl.setUserName(getUserName());
		checkoutImpl.setCreateDate(getCreateDate());
		checkoutImpl.setModifiedDate(getModifiedDate());
		checkoutImpl.setAssetId(getAssetId());
		checkoutImpl.setCheckOutDate(getCheckOutDate());
		checkoutImpl.setExpectedCheckInDate(getExpectedCheckInDate());
		checkoutImpl.setActualCheckInDate(getActualCheckInDate());

		checkoutImpl.resetOriginalValues();

		return checkoutImpl;
	}

	public int compareTo(Checkout checkout) {
		long primaryKey = checkout.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Checkout checkout = null;

		try {
			checkout = (Checkout)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = checkout.getPrimaryKey();

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

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Checkout> toCacheModel() {
		CheckoutCacheModel checkoutCacheModel = new CheckoutCacheModel();

		checkoutCacheModel.checkoutId = getCheckoutId();

		checkoutCacheModel.companyId = getCompanyId();

		checkoutCacheModel.userId = getUserId();

		checkoutCacheModel.userName = getUserName();

		String userName = checkoutCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			checkoutCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			checkoutCacheModel.createDate = createDate.getTime();
		}
		else {
			checkoutCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			checkoutCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			checkoutCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		checkoutCacheModel.assetId = getAssetId();

		Date checkOutDate = getCheckOutDate();

		if (checkOutDate != null) {
			checkoutCacheModel.checkOutDate = checkOutDate.getTime();
		}
		else {
			checkoutCacheModel.checkOutDate = Long.MIN_VALUE;
		}

		Date expectedCheckInDate = getExpectedCheckInDate();

		if (expectedCheckInDate != null) {
			checkoutCacheModel.expectedCheckInDate = expectedCheckInDate.getTime();
		}
		else {
			checkoutCacheModel.expectedCheckInDate = Long.MIN_VALUE;
		}

		Date actualCheckInDate = getActualCheckInDate();

		if (actualCheckInDate != null) {
			checkoutCacheModel.actualCheckInDate = actualCheckInDate.getTime();
		}
		else {
			checkoutCacheModel.actualCheckInDate = Long.MIN_VALUE;
		}

		return checkoutCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{checkoutId=");
		sb.append(getCheckoutId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", assetId=");
		sb.append(getAssetId());
		sb.append(", checkOutDate=");
		sb.append(getCheckOutDate());
		sb.append(", expectedCheckInDate=");
		sb.append(getExpectedCheckInDate());
		sb.append(", actualCheckInDate=");
		sb.append(getActualCheckInDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.liferay.ams.model.Checkout");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>checkoutId</column-name><column-value><![CDATA[");
		sb.append(getCheckoutId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetId</column-name><column-value><![CDATA[");
		sb.append(getAssetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkOutDate</column-name><column-value><![CDATA[");
		sb.append(getCheckOutDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expectedCheckInDate</column-name><column-value><![CDATA[");
		sb.append(getExpectedCheckInDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actualCheckInDate</column-name><column-value><![CDATA[");
		sb.append(getActualCheckInDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Checkout.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Checkout.class
		};
	private long _checkoutId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _assetId;
	private Date _checkOutDate;
	private Date _expectedCheckInDate;
	private Date _actualCheckInDate;
	private transient ExpandoBridge _expandoBridge;
	private Checkout _escapedModelProxy;
}