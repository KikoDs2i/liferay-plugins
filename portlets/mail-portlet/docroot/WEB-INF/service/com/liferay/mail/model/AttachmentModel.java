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

package com.liferay.mail.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Attachment service. Represents a row in the &quot;Mail_Attachment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.mail.model.impl.AttachmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.mail.model.impl.AttachmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Attachment
 * @see com.liferay.mail.model.impl.AttachmentImpl
 * @see com.liferay.mail.model.impl.AttachmentModelImpl
 * @generated
 */
public interface AttachmentModel extends BaseModel<Attachment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a attachment model instance should use the {@link Attachment} interface instead.
	 */

	/**
	 * Returns the primary key of this attachment.
	 *
	 * @return the primary key of this attachment
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this attachment.
	 *
	 * @param primaryKey the primary key of this attachment
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the attachment ID of this attachment.
	 *
	 * @return the attachment ID of this attachment
	 */
	public long getAttachmentId();

	/**
	 * Sets the attachment ID of this attachment.
	 *
	 * @param attachmentId the attachment ID of this attachment
	 */
	public void setAttachmentId(long attachmentId);

	/**
	 * Returns the company ID of this attachment.
	 *
	 * @return the company ID of this attachment
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this attachment.
	 *
	 * @param companyId the company ID of this attachment
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this attachment.
	 *
	 * @return the user ID of this attachment
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this attachment.
	 *
	 * @param userId the user ID of this attachment
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this attachment.
	 *
	 * @return the user uuid of this attachment
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this attachment.
	 *
	 * @param userUuid the user uuid of this attachment
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the account ID of this attachment.
	 *
	 * @return the account ID of this attachment
	 */
	public long getAccountId();

	/**
	 * Sets the account ID of this attachment.
	 *
	 * @param accountId the account ID of this attachment
	 */
	public void setAccountId(long accountId);

	/**
	 * Returns the folder ID of this attachment.
	 *
	 * @return the folder ID of this attachment
	 */
	public long getFolderId();

	/**
	 * Sets the folder ID of this attachment.
	 *
	 * @param folderId the folder ID of this attachment
	 */
	public void setFolderId(long folderId);

	/**
	 * Returns the message ID of this attachment.
	 *
	 * @return the message ID of this attachment
	 */
	public long getMessageId();

	/**
	 * Sets the message ID of this attachment.
	 *
	 * @param messageId the message ID of this attachment
	 */
	public void setMessageId(long messageId);

	/**
	 * Returns the content path of this attachment.
	 *
	 * @return the content path of this attachment
	 */
	@AutoEscape
	public String getContentPath();

	/**
	 * Sets the content path of this attachment.
	 *
	 * @param contentPath the content path of this attachment
	 */
	public void setContentPath(String contentPath);

	/**
	 * Returns the file name of this attachment.
	 *
	 * @return the file name of this attachment
	 */
	@AutoEscape
	public String getFileName();

	/**
	 * Sets the file name of this attachment.
	 *
	 * @param fileName the file name of this attachment
	 */
	public void setFileName(String fileName);

	/**
	 * Returns the size of this attachment.
	 *
	 * @return the size of this attachment
	 */
	public long getSize();

	/**
	 * Sets the size of this attachment.
	 *
	 * @param size the size of this attachment
	 */
	public void setSize(long size);

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

	public int compareTo(Attachment attachment);

	public int hashCode();

	public CacheModel<Attachment> toCacheModel();

	public Attachment toEscapedModel();

	public String toString();

	public String toXmlString();
}