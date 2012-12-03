package org.hardartcore.spree;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.hardartcore.utils.Consts;
import org.hardartcore.utils.IOUtils;

public class Connector {

	private static final String TAG = "Connector";
	private static String server;
	private static String method;
	private static String params;
	private static String service;

	public static String getServer() {
		return server;
	}

	public static void setServer(String server) {
		Connector.server = server;
	}

	public static String getMethod() {
		return method;
	}

	public static void setMethod(String method) {
		Connector.method = method;
	}

	public static String getParams() {
		return params;
	}

	public static void setParams(String params) {
		Connector.params = params;
	}

	public static String getService() {
		return service;
	}

	public static void setService(String service) {
		Connector.service = service;
	}

	public enum ResponseType {
		_httpOK(200), _notFound(404);

		private int value;

		private ResponseType(int i) {
			this.value = i;
		}

		public static ResponseType getByValue(int i) {
			for (ResponseType dt : ResponseType.values()) {
				if (dt.value == i) {
					return dt;
				}
			}
			throw new IllegalArgumentException("No datatype with " + i
					+ " exists");
		}

	}

	/**
	 * This function is used for connections the server with url<br />
	 * <b>THIS FUNCTION MUST RUN IN SEPARATE THREAD OR IT MAY CAUSE NetworkOnMainThreadException</b><br />
	 * <i>For SSL connection {@link requestServerUsingSSL} .</i>
	 * @param url
	 * @return response from server.
	 */
	public String requestServer(final String url) {

		String charset = "UTF-8";
		InputStream response = null;
		HttpURLConnection connection = null;

		try {
			connection = (HttpURLConnection) new URL(url).openConnection();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return Consts.INCORRECT_URL;
		} catch (IOException e) {
			e.printStackTrace();
			return Consts.CONNECTION_ERROR;
		}
		connection.setReadTimeout(10000);
		try {
			connection.setRequestMethod("GET");
		} catch (ProtocolException e) {
			e.printStackTrace();
		}
		connection.setRequestProperty("Charset", charset);

		if (connection != null) {
			int status = 0;
			try {
				status = connection.getResponseCode();
			} catch (IOException e) {
				e.printStackTrace();
			}
			SpreeLog.i(TAG, "status HTTP : " + status);

			try {
				response = connection.getInputStream();
			} catch (IOException e) {
				e.printStackTrace();
				return Consts.CONNECTION_ERROR;
			}
			if (response != null) {
				String result = null;
				try {
					result = IOUtils.convertStreamToString(response);
				} catch (Exception e) {
					e.printStackTrace();
				}
				//if (result != null) {
					return result;
				//}
			}
		}
		return null;
	}
	
	/**
	 * Use for sending http request to server with given url.<br />
	 * <b>THIS FUNCTION MUST RUN IN SEPARATE THREAD OR IT MAY CAUSE NetworkOnMainThreadException</b><br />
	 * <i>Use only with SSL</i>
	 * @param url
	 * @return
	 */
	public String requestServerUsingSSL(final String url) {

		String charset = "UTF-8";
		InputStream response = null;
		HttpsURLConnection connection = null;

		try {
			connection = (HttpsURLConnection) new URL(url).openConnection();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return Consts.INCORRECT_URL;
		} catch (IOException e) {
			e.printStackTrace();
			return Consts.CONNECTION_ERROR;
		}
		connection.setReadTimeout(10000);
		try {
			connection.setRequestMethod("GET");
		} catch (ProtocolException e) {
			e.printStackTrace();
		}
		connection.setRequestProperty("Charset", charset);

		if (connection != null) {
			int status = 0;
			try {
				status = connection.getResponseCode();
			} catch (IOException e) {
				e.printStackTrace();
			}
			SpreeLog.i(TAG, "status HTTP : " + status);

			try {
				response = connection.getInputStream();
			} catch (IOException e) {
				e.printStackTrace();
				return Consts.CONNECTION_ERROR;
			}
			if (response != null) {
				String result = null;
				try {
					result = IOUtils.convertStreamToString(response);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				return result;
				
			}
		}
		return null;
	}


}
