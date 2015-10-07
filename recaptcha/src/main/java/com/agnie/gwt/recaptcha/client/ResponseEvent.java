package com.agnie.gwt.recaptcha.client;

import com.google.gwt.event.shared.GwtEvent;

/**
 * 
 * @author Pandurang Patil
 *
 */
public class ResponseEvent extends GwtEvent<ResponseHandler> {

	private String response;
	
	
	/**
	 * @param response
	 */
	public ResponseEvent(String response) {
		super();
		this.response = response;
	}

	/**
	 * @return the response
	 */
	public final String getResponse() {
		return response;
	}

	public static Type<ResponseHandler>	TYPE	= new Type<ResponseHandler>();

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<ResponseHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ResponseHandler handler) {
		handler.onResponse(this);
	}

}
