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

package com.liferay.portlet.softwarecatalog.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.softwarecatalog.model.SCLicense;
import com.liferay.portlet.softwarecatalog.service.SCLicenseLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @deprecated As of 7.0.0, replaced by {@link SCLicenseLocalServiceUtil#getExportActionableDynamicQuery()}
 * @generated
 */
@Deprecated
public abstract class SCLicenseActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public SCLicenseActionableDynamicQuery() throws SystemException {
		setBaseLocalService(SCLicenseLocalServiceUtil.getService());
		setClass(SCLicense.class);

		setClassLoader(PortalClassLoaderUtil.getClassLoader());

		setPrimaryKeyPropertyName("licenseId");
	}
}