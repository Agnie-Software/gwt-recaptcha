package com.agnie.gwt.recaptcha.client;

import com.google.gwt.event.shared.EventHandler;

/**
 * 
 * @author Pandurang Patil
 *
 */
public interface ExpiredHandler extends EventHandler {

	void onExpire(ExpiredEvent event);
}
