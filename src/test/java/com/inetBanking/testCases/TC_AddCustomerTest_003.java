package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;



public class TC_AddCustomerTest_003 extends BaseClass {
	
	@Test
	public void addnewCustomer() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clicksubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		
		logger.info("Providing Customer details......");
		
		addcust.custName("Sarfaraj");
		addcust.custgender("male");
		addcust.custdob("01", "05", "2001");
		Thread.sleep(3000);
		addcust.custaddress("India");
		addcust.custcity("Pune");
		addcust.custstate("MH");
		addcust.custpin("12345");
		addcust.custtelephone("9999999999");
		
		String email = randomeString()+"@gmail.com";
		addcust.custemailid(email);
		
		addcust.custsubmit();
		
		Thread.sleep(3000);
		logger.info("Validation Started.......");
		
	if(isAlertPresent()==true) {
		
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		Assert.assertTrue(true);
		logger.info("test case is passed");
		
	}
	else {
		
		Assert.assertTrue(false);
		logger.info("test case failed");
	}
			
		
		
		
	}

	
	
	
	
}

	
