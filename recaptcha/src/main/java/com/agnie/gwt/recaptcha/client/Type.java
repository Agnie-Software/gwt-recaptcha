package com.agnie.gwt.recaptcha.client;

/**
 * @author Pandurang Patil 06-Oct-2015
 *
 */
public enum Type {

	AUDIO("audio"), IMAGE("image");
	private String	type;

	/**
	 * @param type
	 */
	private Type(String type) {
		this.type = type;
	}

	/**
	 * @return the Type
	 */
	public String getType() {
		return type;
	}

}
