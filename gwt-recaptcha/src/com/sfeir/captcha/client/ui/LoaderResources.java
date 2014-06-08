package com.sfeir.captcha.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface LoaderResources extends ClientBundle {
	public static LoaderResources	INSTANCE	= GWT.create(LoaderResources.class);

	@Source("captcha.gif")
	ImageResource loader();
}
