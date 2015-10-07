package com.agnie.recaptcha.sample.client.service;

import com.agnie.gwt.recaptcha.client.ReCaptchaException;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * 
 * @author Pandurang Patil 07-Oct-2015
 *
 */
@RemoteServiceRelativePath("captchaService")
public interface RecaptchService extends RemoteService {

	Boolean validate(String response) throws ReCaptchaException;

}
