package com.agnie.gwt.recaptcha.client;

import com.google.gwt.event.shared.GwtEvent;

/**
 * 
 * @author Pandurang Patil
 *
 */
public class ApiReadyEvent extends GwtEvent<ApiReadyHandler> {

	public static Type<ApiReadyHandler>	TYPE	= new Type<ApiReadyHandler>();

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<ApiReadyHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ApiReadyHandler handler) {
		handler.onReady(this);
	}

}
