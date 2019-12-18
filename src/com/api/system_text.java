package com.api;

import java.util.Properties;
import java.util.Set;

public class system_text {

	public static void main(String[] args) {
	Properties shuxing=System.getProperties();
	Set<String>shuxingmin=shuxing.stringPropertyNames();
	for (String key : shuxingmin) {
		String value=System.getProperty(key);
		System.out.println(key+"------>"+value);
	}

	}

}
