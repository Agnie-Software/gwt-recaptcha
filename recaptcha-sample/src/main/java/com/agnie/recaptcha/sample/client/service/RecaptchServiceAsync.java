package com.agnie.recaptcha.sample.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author Pandurang Patil 07-Oct-2015
 *
 */
public interface RecaptchServiceAsync {

	void validate(String response, AsyncCallback<Boolean> callback);

}
