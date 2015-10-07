package com.agnie.gwt.recaptcha.client;

import com.google.gwt.event.shared.GwtEvent;

/**
 * 
 * @author Pandurang Patil
 *
 */
public class ExpiredEvent extends GwtEvent<ExpiredHandler> {

	public static Type<ExpiredHandler>	TYPE	= new Type<ExpiredHandler>();

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<ExpiredHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ExpiredHandler handler) {
		handler.onExpire(this);
	}

}
