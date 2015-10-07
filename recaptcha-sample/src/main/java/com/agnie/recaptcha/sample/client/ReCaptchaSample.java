package com.agnie.recaptcha.sample.client;

import com.agnie.gwt.recaptcha.client.ExpiredEvent;
import com.agnie.gwt.recaptcha.client.ExpiredHandler;
import com.agnie.gwt.recaptcha.client.ReCaptcha;
import com.agnie.gwt.recaptcha.client.ResponseEvent;
import com.agnie.gwt.recaptcha.client.ResponseHandler;
import com.agnie.recaptcha.sample.client.service.RecaptchService;
import com.agnie.recaptcha.sample.client.service.RecaptchServiceAsync;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * @author Pandurang Patil
 *
 */
public class ReCaptchaSample implements EntryPoint {
	RecaptchServiceAsync	service	= GWT.create(RecaptchService.class);

	@Override
	public void onModuleLoad() {
		final ReCaptcha rc = new ReCaptcha();
		rc.setSitekey("6LdyNO8SAAAAAAdtyMbSMTqtWbx27YUe3JajZmfH");
		rc.addResponseHandler(new ResponseHandler() {

			@Override
			public void onResponse(ResponseEvent event) {
				Window.alert(event.getResponse());
			}
		});
		rc.addExpireHandler(new ExpiredHandler() {

			@Override
			public void onExpire(ExpiredEvent event) {
				Window.alert("Recpatcha expired event fired.");
			}
		});
		RootPanel.get().add(rc);
		
		final ReCaptchaUIBinder uibrc = new ReCaptchaUIBinder(); 
		// UiBinder Test
		RootPanel.get().add(uibrc);

		Button btn = new Button("Validate First Captcha");
		RootPanel.get().add(btn);
		btn.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				service.validate(rc.getResponse(), new AsyncCallback<Boolean>() {

					@Override
					public void onSuccess(Boolean result) {
						// TODO Auto-generated method stub
						if (result)
							Window.alert("success");
						else
							Window.alert("fail");
					}

					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						Window.alert("Some Exception");
						GWT.log(caught.getMessage());
					}
				});
			}
		});
		
		Button dettach = new Button("Detach and Add");
		RootPanel.get().add(dettach);
		dettach.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				RootPanel.get().remove(uibrc);
				RootPanel.get().add(uibrc);
			}
		});
	}
}
