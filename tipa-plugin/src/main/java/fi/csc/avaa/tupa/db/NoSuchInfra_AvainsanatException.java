/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package fi.csc.avaa.tupa.db;

import com.liferay.portal.NoSuchModelException;

/**
 * @author pj,jmlehtin
 */
public class NoSuchInfra_AvainsanatException extends NoSuchModelException {

	public NoSuchInfra_AvainsanatException() {
		super();
	}

	public NoSuchInfra_AvainsanatException(String msg) {
		super(msg);
	}

	public NoSuchInfra_AvainsanatException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchInfra_AvainsanatException(Throwable cause) {
		super(cause);
	}

}