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

package org.yawl.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import org.yawl.client.widget.dialog.CloseableDialogBoxResource;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ExampleApp implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
        loadResourceBundles();
		RootLayoutPanel.get().add(new ShowcaseLayout());
	}

    private void loadResourceBundles() {
        CloseableDialogBoxResource cdbResource = GWT.create(CloseableDialogBoxResource.class);
        cdbResource.css().ensureInjected();
    }
}