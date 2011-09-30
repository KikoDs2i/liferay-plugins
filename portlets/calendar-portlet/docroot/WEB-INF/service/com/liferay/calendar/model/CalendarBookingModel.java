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

package com.liferay.calendar.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AttachedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the CalendarBooking service. Represents a row in the &quot;CalendarBooking&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.calendar.model.impl.CalendarBookingModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.calendar.model.impl.CalendarBookingImpl}.
 * </p>
 *
 * @author Eduardo Lundgren
 * @see CalendarBooking
 * @see com.liferay.calendar.model.impl.CalendarBookingImpl
 * @see com.liferay.calendar.model.impl.CalendarBookingModelImpl
 * @generated
 */
public interface CalendarBookingModel extends AttachedModel,
	BaseModel<CalendarBooking>, GroupedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a calendar booking model instance should use the {@link CalendarBooking} interface instead.
	 */

	/**
	 * Returns the primary key of this calendar booking.
	 *
	 * @return the primary key of this calendar booking
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this calendar booking.
	 *
	 * @param primaryKey the primary key of this calendar booking
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this calendar booking.
	 *
	 * @return the uuid of this calendar booking
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this calendar booking.
	 *
	 * @param uuid the uuid of this calendar booking
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the calendar booking ID of this calendar booking.
	 *
	 * @return the calendar booking ID of this calendar booking
	 */
	public long getCalendarBookingId();

	/**
	 * Sets the calendar booking ID of this calendar booking.
	 *
	 * @param calendarBookingId the calendar booking ID of this calendar booking
	 */
	public void setCalendarBookingId(long calendarBookingId);

	/**
	 * Returns the group ID of this calendar booking.
	 *
	 * @return the group ID of this calendar booking
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this calendar booking.
	 *
	 * @param groupId the group ID of this calendar booking
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this calendar booking.
	 *
	 * @return the company ID of this calendar booking
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this calendar booking.
	 *
	 * @param companyId the company ID of this calendar booking
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this calendar booking.
	 *
	 * @return the user ID of this calendar booking
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this calendar booking.
	 *
	 * @param userId the user ID of this calendar booking
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this calendar booking.
	 *
	 * @return the user uuid of this calendar booking
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this calendar booking.
	 *
	 * @param userUuid the user uuid of this calendar booking
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this calendar booking.
	 *
	 * @return the user name of this calendar booking
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this calendar booking.
	 *
	 * @param userName the user name of this calendar booking
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this calendar booking.
	 *
	 * @return the create date of this calendar booking
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this calendar booking.
	 *
	 * @param createDate the create date of this calendar booking
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this calendar booking.
	 *
	 * @return the modified date of this calendar booking
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this calendar booking.
	 *
	 * @param modifiedDate the modified date of this calendar booking
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the calendar event ID of this calendar booking.
	 *
	 * @return the calendar event ID of this calendar booking
	 */
	public long getCalendarEventId();

	/**
	 * Sets the calendar event ID of this calendar booking.
	 *
	 * @param calendarEventId the calendar event ID of this calendar booking
	 */
	public void setCalendarEventId(long calendarEventId);

	/**
	 * Returns the calendar resource ID of this calendar booking.
	 *
	 * @return the calendar resource ID of this calendar booking
	 */
	public long getCalendarResourceId();

	/**
	 * Sets the calendar resource ID of this calendar booking.
	 *
	 * @param calendarResourceId the calendar resource ID of this calendar booking
	 */
	public void setCalendarResourceId(long calendarResourceId);

	/**
	 * Returns the fully qualified class name of this calendar booking.
	 *
	 * @return the fully qualified class name of this calendar booking
	 */
	public String getClassName();

	/**
	 * Returns the class name ID of this calendar booking.
	 *
	 * @return the class name ID of this calendar booking
	 */
	public long getClassNameId();

	/**
	 * Sets the class name ID of this calendar booking.
	 *
	 * @param classNameId the class name ID of this calendar booking
	 */
	public void setClassNameId(long classNameId);

	/**
	 * Returns the class p k of this calendar booking.
	 *
	 * @return the class p k of this calendar booking
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this calendar booking.
	 *
	 * @param classPK the class p k of this calendar booking
	 */
	public void setClassPK(long classPK);

	/**
	 * Returns the title of this calendar booking.
	 *
	 * @return the title of this calendar booking
	 */
	public String getTitle();

	/**
	 * Returns the localized title of this calendar booking in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized title of this calendar booking
	 */
	@AutoEscape
	public String getTitle(Locale locale);

	/**
	 * Returns the localized title of this calendar booking in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this calendar booking. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getTitle(Locale locale, boolean useDefault);

	/**
	 * Returns the localized title of this calendar booking in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized title of this calendar booking
	 */
	@AutoEscape
	public String getTitle(String languageId);

	/**
	 * Returns the localized title of this calendar booking in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this calendar booking
	 */
	@AutoEscape
	public String getTitle(String languageId, boolean useDefault);

	@AutoEscape
	public String getTitleCurrentLanguageId();

	@AutoEscape
	public String getTitleCurrentValue();

	/**
	 * Returns a map of the locales and localized titles of this calendar booking.
	 *
	 * @return the locales and localized titles of this calendar booking
	 */
	public Map<Locale, String> getTitleMap();

	/**
	 * Sets the title of this calendar booking.
	 *
	 * @param title the title of this calendar booking
	 */
	public void setTitle(String title);

	/**
	 * Sets the localized title of this calendar booking in the language.
	 *
	 * @param title the localized title of this calendar booking
	 * @param locale the locale of the language
	 */
	public void setTitle(String title, Locale locale);

	/**
	 * Sets the localized title of this calendar booking in the language, and sets the default locale.
	 *
	 * @param title the localized title of this calendar booking
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setTitle(String title, Locale locale, Locale defaultLocale);

	public void setTitleCurrentLanguageId(String languageId);

	/**
	 * Sets the localized titles of this calendar booking from the map of locales and localized titles.
	 *
	 * @param titleMap the locales and localized titles of this calendar booking
	 */
	public void setTitleMap(Map<Locale, String> titleMap);

	/**
	 * Sets the localized titles of this calendar booking from the map of locales and localized titles, and sets the default locale.
	 *
	 * @param titleMap the locales and localized titles of this calendar booking
	 * @param defaultLocale the default locale
	 */
	public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale);

	/**
	 * Returns the name of this calendar booking.
	 *
	 * @return the name of this calendar booking
	 */
	public String getName();

	/**
	 * Returns the localized name of this calendar booking in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized name of this calendar booking
	 */
	@AutoEscape
	public String getName(Locale locale);

	/**
	 * Returns the localized name of this calendar booking in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this calendar booking. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getName(Locale locale, boolean useDefault);

	/**
	 * Returns the localized name of this calendar booking in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized name of this calendar booking
	 */
	@AutoEscape
	public String getName(String languageId);

	/**
	 * Returns the localized name of this calendar booking in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this calendar booking
	 */
	@AutoEscape
	public String getName(String languageId, boolean useDefault);

	@AutoEscape
	public String getNameCurrentLanguageId();

	@AutoEscape
	public String getNameCurrentValue();

	/**
	 * Returns a map of the locales and localized names of this calendar booking.
	 *
	 * @return the locales and localized names of this calendar booking
	 */
	public Map<Locale, String> getNameMap();

	/**
	 * Sets the name of this calendar booking.
	 *
	 * @param name the name of this calendar booking
	 */
	public void setName(String name);

	/**
	 * Sets the localized name of this calendar booking in the language.
	 *
	 * @param name the localized name of this calendar booking
	 * @param locale the locale of the language
	 */
	public void setName(String name, Locale locale);

	/**
	 * Sets the localized name of this calendar booking in the language, and sets the default locale.
	 *
	 * @param name the localized name of this calendar booking
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setName(String name, Locale locale, Locale defaultLocale);

	public void setNameCurrentLanguageId(String languageId);

	/**
	 * Sets the localized names of this calendar booking from the map of locales and localized names.
	 *
	 * @param nameMap the locales and localized names of this calendar booking
	 */
	public void setNameMap(Map<Locale, String> nameMap);

	/**
	 * Sets the localized names of this calendar booking from the map of locales and localized names, and sets the default locale.
	 *
	 * @param nameMap the locales and localized names of this calendar booking
	 * @param defaultLocale the default locale
	 */
	public void setNameMap(Map<Locale, String> nameMap, Locale defaultLocale);

	/**
	 * Returns the description of this calendar booking.
	 *
	 * @return the description of this calendar booking
	 */
	public String getDescription();

	/**
	 * Returns the localized description of this calendar booking in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized description of this calendar booking
	 */
	@AutoEscape
	public String getDescription(Locale locale);

	/**
	 * Returns the localized description of this calendar booking in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this calendar booking. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getDescription(Locale locale, boolean useDefault);

	/**
	 * Returns the localized description of this calendar booking in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized description of this calendar booking
	 */
	@AutoEscape
	public String getDescription(String languageId);

	/**
	 * Returns the localized description of this calendar booking in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this calendar booking
	 */
	@AutoEscape
	public String getDescription(String languageId, boolean useDefault);

	@AutoEscape
	public String getDescriptionCurrentLanguageId();

	@AutoEscape
	public String getDescriptionCurrentValue();

	/**
	 * Returns a map of the locales and localized descriptions of this calendar booking.
	 *
	 * @return the locales and localized descriptions of this calendar booking
	 */
	public Map<Locale, String> getDescriptionMap();

	/**
	 * Sets the description of this calendar booking.
	 *
	 * @param description the description of this calendar booking
	 */
	public void setDescription(String description);

	/**
	 * Sets the localized description of this calendar booking in the language.
	 *
	 * @param description the localized description of this calendar booking
	 * @param locale the locale of the language
	 */
	public void setDescription(String description, Locale locale);

	/**
	 * Sets the localized description of this calendar booking in the language, and sets the default locale.
	 *
	 * @param description the localized description of this calendar booking
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setDescription(String description, Locale locale,
		Locale defaultLocale);

	public void setDescriptionCurrentLanguageId(String languageId);

	/**
	 * Sets the localized descriptions of this calendar booking from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this calendar booking
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap);

	/**
	 * Sets the localized descriptions of this calendar booking from the map of locales and localized descriptions, and sets the default locale.
	 *
	 * @param descriptionMap the locales and localized descriptions of this calendar booking
	 * @param defaultLocale the default locale
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap,
		Locale defaultLocale);

	/**
	 * Returns the location of this calendar booking.
	 *
	 * @return the location of this calendar booking
	 */
	@AutoEscape
	public String getLocation();

	/**
	 * Sets the location of this calendar booking.
	 *
	 * @param location the location of this calendar booking
	 */
	public void setLocation(String location);

	/**
	 * Returns the start date of this calendar booking.
	 *
	 * @return the start date of this calendar booking
	 */
	public Date getStartDate();

	/**
	 * Sets the start date of this calendar booking.
	 *
	 * @param startDate the start date of this calendar booking
	 */
	public void setStartDate(Date startDate);

	/**
	 * Returns the end date of this calendar booking.
	 *
	 * @return the end date of this calendar booking
	 */
	public Date getEndDate();

	/**
	 * Sets the end date of this calendar booking.
	 *
	 * @param endDate the end date of this calendar booking
	 */
	public void setEndDate(Date endDate);

	/**
	 * Returns the duration hour of this calendar booking.
	 *
	 * @return the duration hour of this calendar booking
	 */
	public int getDurationHour();

	/**
	 * Sets the duration hour of this calendar booking.
	 *
	 * @param durationHour the duration hour of this calendar booking
	 */
	public void setDurationHour(int durationHour);

	/**
	 * Returns the duration minute of this calendar booking.
	 *
	 * @return the duration minute of this calendar booking
	 */
	public int getDurationMinute();

	/**
	 * Sets the duration minute of this calendar booking.
	 *
	 * @param durationMinute the duration minute of this calendar booking
	 */
	public void setDurationMinute(int durationMinute);

	/**
	 * Returns the recurrence of this calendar booking.
	 *
	 * @return the recurrence of this calendar booking
	 */
	@AutoEscape
	public String getRecurrence();

	/**
	 * Sets the recurrence of this calendar booking.
	 *
	 * @param recurrence the recurrence of this calendar booking
	 */
	public void setRecurrence(String recurrence);

	/**
	 * Returns the type of this calendar booking.
	 *
	 * @return the type of this calendar booking
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this calendar booking.
	 *
	 * @param type the type of this calendar booking
	 */
	public void setType(String type);

	/**
	 * Returns the required of this calendar booking.
	 *
	 * @return the required of this calendar booking
	 */
	public boolean getRequired();

	/**
	 * Returns <code>true</code> if this calendar booking is required.
	 *
	 * @return <code>true</code> if this calendar booking is required; <code>false</code> otherwise
	 */
	public boolean isRequired();

	/**
	 * Sets whether this calendar booking is required.
	 *
	 * @param required the required of this calendar booking
	 */
	public void setRequired(boolean required);

	/**
	 * Returns the status of this calendar booking.
	 *
	 * @return the status of this calendar booking
	 */
	public int getStatus();

	/**
	 * Sets the status of this calendar booking.
	 *
	 * @param status the status of this calendar booking
	 */
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this calendar booking.
	 *
	 * @return the status by user ID of this calendar booking
	 */
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this calendar booking.
	 *
	 * @param statusByUserId the status by user ID of this calendar booking
	 */
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this calendar booking.
	 *
	 * @return the status by user uuid of this calendar booking
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this calendar booking.
	 *
	 * @param statusByUserUuid the status by user uuid of this calendar booking
	 */
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this calendar booking.
	 *
	 * @return the status by user name of this calendar booking
	 */
	@AutoEscape
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this calendar booking.
	 *
	 * @param statusByUserName the status by user name of this calendar booking
	 */
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this calendar booking.
	 *
	 * @return the status date of this calendar booking
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this calendar booking.
	 *
	 * @param statusDate the status date of this calendar booking
	 */
	public void setStatusDate(Date statusDate);

	/**
	 * @deprecated Renamed to {@link #isApproved()}
	 */
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this calendar booking is approved.
	 *
	 * @return <code>true</code> if this calendar booking is approved; <code>false</code> otherwise
	 */
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this calendar booking is a draft.
	 *
	 * @return <code>true</code> if this calendar booking is a draft; <code>false</code> otherwise
	 */
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this calendar booking is expired.
	 *
	 * @return <code>true</code> if this calendar booking is expired; <code>false</code> otherwise
	 */
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this calendar booking is pending.
	 *
	 * @return <code>true</code> if this calendar booking is pending; <code>false</code> otherwise
	 */
	public boolean isPending();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(CalendarBooking calendarBooking);

	public int hashCode();

	public CacheModel<CalendarBooking> toCacheModel();

	public CalendarBooking toEscapedModel();

	public String toString();

	public String toXmlString();
}