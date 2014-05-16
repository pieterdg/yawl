/*
 * This is part of YAWL - Yet Another Widget Library.
 *
 * Copyright 2008-2014 Geosparc nv, http://www.geosparc.com/, Belgium.
 *
 * The program is available in open source according to the 
 * Apache License v2. All contributions in this program are covered
 * by the YAWL Contributors License Agreement. For full licensing
 * details, see LICENSE in the project root.
 */

package org.yawl.client.widget.dialog;

import com.google.gwt.resources.client.ClientBundle;

/**
 * Client resource bundle interface for the {@link CloseableDialogBox} widget.
 * 
 * @author Pieter De Graef
 * @since 1.0.0
 */
public interface CloseableDialogBoxResource extends ClientBundle {

	/**
	 * Get the css resource.
	 * 
	 * @return the css resource
	 */
	@Source("CloseableDialogBox.css")
	CloseableDialogBoxCssResource css();
}