package com.agnie.recaptcha.sample.server;

import java.io.IOException;

import com.agnie.gwt.recaptcha.client.ReCaptchaException;
import com.agnie.gwt.recaptcha.server.ReCaptchaValidator;
import com.agnie.recaptcha.sample.client.service.RecaptchService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * @author Pandurang Patil 26-Feb-2014
 * 
 */
public class RecaptchaServiceImpl extends RemoteServiceServlet implements RecaptchService {

	private static final long	serialVersionUID	= 1L;

	ReCaptchaValidator			validator			= new ReCaptchaValidator("6LdyNO8SAAAAAL4NUIBXw-eYMgA4NpbvcbivPTUq");

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.agnie.recaptcha.sample.client.service.RecaptchService#validate(java.lang.String)
	 */
	@Override
	public Boolean validate(String response) throws ReCaptchaException {

		try {
			return validator.validate(response);
		} catch (IOException e) {
			throw new ReCaptchaException("server.request.fail");
		}
	}

}
