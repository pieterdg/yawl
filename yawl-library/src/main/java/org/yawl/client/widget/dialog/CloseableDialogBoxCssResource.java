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

import com.google.gwt.resources.client.CssResource;

/**
 * CSS resource bundle that contains styles for the {@link CloseableDialogBox} widget.
 * 
 * @author Pieter De Graef
 * @since 1.0.0
 */
public interface CloseableDialogBoxCssResource extends CssResource {

	/**
	 * The style for the icon used for closing.
	 * 
	 * @return Get a CSS style class.
	 */
    @ClassName("yawl-closeableDialogCloseIcon")
	String closeableDialogCloseIcon();

	/**
	 * The style used for the caption title.
	 * 
	 * @return Get a CSS style class.
	 */
    @ClassName("yawl-closeableDialogTitle")
	String closeableDialogTitle();
}