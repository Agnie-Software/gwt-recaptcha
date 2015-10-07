package com.agnie.gwt.recaptcha.client;

/**
 * @author Pandurang Patil 06-Oct-2015
 *
 */
public enum Theme {

	DARK("dark"), LIGHT("light");
	private String	theme;

	/**
	 * @param theme
	 */
	private Theme(String theme) {
		this.theme = theme;
	}

	/**
	 * @return the theme
	 */
	public String getTheme() {
		return theme;
	}

}
