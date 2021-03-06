package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;



public class TC_LoginPage_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException {
		
		
		logger.info("URL is opened");
		
	
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username is entered");
		
		
		lp.setPassword(password);
		logger.info("Password is entered");
		
		lp.clicksubmit();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
			logger.info("login test is passed");
		}
		  
		 else {
			
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("login test is fail");
		}
		
	}
	

}
