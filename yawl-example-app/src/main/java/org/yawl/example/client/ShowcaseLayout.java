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

import org.yawl.client.widget.dialog.CloseableDialogBox;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class ShowcaseLayout extends Composite {

	/** UI binder interface. */
	interface MyUiBinder extends UiBinder<Widget, ShowcaseLayout> {
	}

	private static final MyUiBinder UIBINDER = GWT.create(MyUiBinder.class);

	public ShowcaseLayout() {
		initWidget(UIBINDER.createAndBindUi(this));
	}

	@UiHandler("showDialogBtn")
	protected void onShowCloseableDialogBoxClicked(ClickEvent event) {
		CloseableDialogBox dialog = new CloseableDialogBox();
		dialog.setWidget(new Label("Hello World"));
		dialog.setAnimationEnabled(true);
		dialog.setGlassEnabled(true);
		dialog.setModal(true);
		dialog.center();
		dialog.setHTML("I am the title");
	}
}