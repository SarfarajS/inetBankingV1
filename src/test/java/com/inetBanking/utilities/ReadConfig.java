package com.inetBanking.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		try {
			
			FileInputStream fis = new FileInputStream ("./Configuration\\config.properties");
			pro = new Properties ();
			pro.load(fis);
			
		}catch(Exception e){
			
			System.out.println("Exception is" + e.getMessage());
			
			}
	}

	public String getapplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	public String getChromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	public String getfirefoxpath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	
	
	
	
}
