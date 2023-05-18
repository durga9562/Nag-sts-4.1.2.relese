package com.ojas;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;

import org.apache.catalina.Globals;

public class HackTestTwo {

	public static void main(String[] args)  {
		URL urlobj = new URL(url);
		HttpURLConnection httpCon = (HttpURLConnection)urlobj.openConnection();
		int responseCode = httpCon.getResponseCode();
		String responseMessage = httpCon.getResponseMessage();
		String contentType = httpCon.getContentType();
		String contentEncoding = httpCon.getContentEncoding();
		int contentLength = httpCon.getContentLength();
		long date = httpCon.getDate();
		long expiration = httpCon.getExpiration();
		long lastModified = httpCon.getLastModified();
	
		  Globals.displayLoggerInfo("Response Code: " + responseCode);
	        Globals.displayLoggerInfo("Response Message: " + responseMessage);
	        Globals.displayLoggerInfo("Content Type: " + contentType);
	        Globals.displayLoggerInfo("Content Encoding: " + contentEncoding);
	        Globals.displayLoggerInfo("Content Length: " + contentLength);
	        Globals.displayLoggerInfo("Date: " + new Date(date));
	        Globals.displayLoggerInfo("Expiration: " + new Date(expiration));
	        Globals.displayLoggerInfo("Last Modified: " + new Date(lastModified));

	}

}
