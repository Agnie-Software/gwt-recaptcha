package com.agnie.gwt.recaptcha.client;

/**
 * @author Pandurang Patil 06-Oct-2015
 *
 */
public enum Size {

	COMPACT("compact"), NORMAL("normal");
	private String	size;

	/**
	 * @param size
	 */
	private Size(String size) {
		this.size = size;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

}
