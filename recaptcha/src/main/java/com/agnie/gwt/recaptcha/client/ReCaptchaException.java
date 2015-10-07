package com.agnie.gwt.recaptcha.client;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pandurang Patil 07-Oct-2015
 *
 */
public class ReCaptchaException extends Exception {

	private static final long	serialVersionUID	= 1L;
	private List<String>		errors				= new ArrayList<String>();

	/**
	 * 
	 */
	public ReCaptchaException() {
		super();
	}

	/**
	 * @param message
	 */
	public ReCaptchaException(String message) {
		super(message);
		errors.add(message);
	}

	public void addErrorMessage(String message) {
		errors.add(message);
	}

	/**
	 * @return the errors
	 */
	public final List<String> getErrors() {
		return errors;
	}

	/**
	 * @param errors
	 *            the errors to set
	 */
	public final void setErrors(List<String> errors) {
		this.errors = errors;
	}

}
