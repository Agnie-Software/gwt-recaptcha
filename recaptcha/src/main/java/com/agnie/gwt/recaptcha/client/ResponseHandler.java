package com.agnie.gwt.recaptcha.client;

import com.google.gwt.event.shared.EventHandler;

/**
 * 
 * @author Pandurang Patil
 *
 */
public interface ResponseHandler extends EventHandler {

	void onResponse(ResponseEvent event);
}
