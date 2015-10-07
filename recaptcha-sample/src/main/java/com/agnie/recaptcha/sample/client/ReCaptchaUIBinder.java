package com.agnie.recaptcha.sample.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author Pandurang Patil 07-Oct-2015
 *
 */
public class ReCaptchaUIBinder extends Composite {

	private static ReCaptchaUIBinderUiBinder	uiBinder	= GWT.create(ReCaptchaUIBinderUiBinder.class);

	interface ReCaptchaUIBinderUiBinder extends UiBinder<Widget, ReCaptchaUIBinder> {
	}

	public ReCaptchaUIBinder() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
