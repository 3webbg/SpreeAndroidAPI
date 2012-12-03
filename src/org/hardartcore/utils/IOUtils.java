package org.hardartcore.utils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class IOUtils {

	public static String convertStreamToString(InputStream is) throws Exception {
		ByteArrayOutputStream into = new ByteArrayOutputStream();
	    byte[] buf = new byte[4096];
	    for (int n; 0 < (n = is.read(buf));) {
	        into.write(buf, 0, n);
	    }
	    into.close();
	    return new String(into.toByteArray(), "UTF-8");
	}
	
}
