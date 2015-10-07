package com.agnie.gwt.recaptcha.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author Pandurang Patil 06-Oct-2015
 *
 */
public class ReCaptchaConfig extends JavaScriptObject {
	protected ReCaptchaConfig() {
	}

	/**
	 * @return the sitekey
	 */
	public final native String getSitekey() /*-{
		return this.sitekey;
	}-*/;

	/**
	 * @param sitekey
	 *            the sitekey to set
	 */
	public final native void setSitekey(String sitekey) /*-{
		this.sitekey = sitekey;
	}-*/;

	/**
	 * @return the theme
	 */
	private final native String getThemeInternal() /*-{
		return this.theme;
	}-*/;

	/**
	 * @param theme
	 *            the theme to set
	 */
	private final native void setThemeInternal(String theme) /*-{
		this.theme = theme;
	}-*/;

	/**
	 * @return the size
	 */
	private final native String getSizeInternal() /*-{
		return this.size;
	}-*/;

	/**
	 * @param size
	 *            the size to set
	 */
	private final native void setSizeInternal(String size) /*-{
		this.size = size;
	}-*/;

	/**
	 * @return the tabindex
	 */
	public final native Integer getTabindex() /*-{
		return this.tabindex;
	}-*/;

	/**
	 * @param tabindex
	 *            the tabindex to set
	 */
	public final native void setTabindex(Integer tabindex) /*-{
		this.tabindex = tabindex;
	}-*/;

	/**
	 * @return the type
	 */
	private final native String getTypeInternal()/*-{
		return type;
	}-*/;

	/**
	 * @param type
	 *            the type to set
	 */
	private final native void setTypeInternal(String type) /*-{
		this.type = type;
	}-*/;

	/**
	 * @return the type
	 */
	public final Type getType() {
		String type = getTypeInternal();
		return (type != null ? Type.valueOf(type) : null);
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public final void setType(Type type) {
		setTypeInternal(type.getType());
	}

	/**
	 * @return the theme
	 */
	public final Theme getTheme() {
		String theme = getThemeInternal();
		return (theme != null ? Theme.valueOf(theme) : null);
	}

	/**
	 * @param theme
	 *            the theme to set
	 */
	public final void setTheme(Theme theme) {
		setThemeInternal(theme.getTheme());
	}

	/**
	 * @return the size
	 */
	public final Size getSize() {
		String size = getSizeInternal();
		return (size != null ? Size.valueOf(size) : null);
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public final void setSize(Size size) {
		setSizeInternal(size.getSize());
	}

}
