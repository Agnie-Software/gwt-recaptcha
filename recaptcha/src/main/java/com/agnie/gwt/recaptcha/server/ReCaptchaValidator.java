package com.agnie.gwt.recaptcha.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import com.agnie.gwt.recaptcha.client.ReCaptchaException;

/**
 * @author Pandurang Patil 07-Oct-2015
 *
 */
public class ReCaptchaValidator {
	private String	secret;

	/**
	 * @param secret
	 */
	public ReCaptchaValidator(String secret) {
		this.secret = secret;
	}

	/**
	 * validate given cpatcha response
	 * 
	 * @param response
	 *            captcha response.
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws ReCaptchaException
	 */
	public boolean validate(String response) throws ClientProtocolException, IOException, ReCaptchaException {
		return validate(response, null);
	}

	/**
	 * Validate given captcha response
	 * 
	 * @param response
	 *            ReCaptcha Response
	 * @param remoteip
	 *            optional user's remote ip address.
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws ReCaptchaException
	 */
	public boolean validate(String response, String remoteip) throws ClientProtocolException, IOException, ReCaptchaException {
		String url = "https://www.google.com/recaptcha/api/siteverify";

		HttpClient client = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(url);

		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("secret", secret));
		urlParameters.add(new BasicNameValuePair("response", response));
		if (remoteip != null && !remoteip.trim().isEmpty()) {
			urlParameters.add(new BasicNameValuePair("remoteip", remoteip));
		}

		post.setEntity(new UrlEncodedFormEntity(urlParameters));

		HttpResponse sresponse = client.execute(post);
		if (sresponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
			BufferedReader rd = new BufferedReader(new InputStreamReader(sresponse.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			JSONObject obj = new JSONObject(result.toString());
			if (obj.getBoolean("success")) {
				return true;
			} else {
				JSONArray errors = obj.getJSONArray("error-codes");
				if (errors != null && errors.length() > 0) {
					ReCaptchaException ex = new ReCaptchaException("google.server.invalid.request");
					for (int index = 0; index < errors.length(); index++) {
						ex.addErrorMessage(errors.getString(index));
					}
					throw ex;
				} else {
					throw new ReCaptchaException("google.server.status.fail");
				}
			}
		} else {
			throw new ReCaptchaException("google.server.error");
		}

	}
}
