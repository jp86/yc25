package com.yc.ums.util;

public class ServletUtil {
	
	public static String getUriName(String requestURI) {
		int start = requestURI.lastIndexOf("/");
		return requestURI.substring(start + 1);
	}
	
}
