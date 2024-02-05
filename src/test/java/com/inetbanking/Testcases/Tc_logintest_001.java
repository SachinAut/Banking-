package com.inetbanking.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.BaseClass;
import com.inetbanking.pageObjects.loginPage;

public class Tc_logintest_001 extends BaseClass{

	@Test
	public void Logintest() throws IOException
	{
		
	logger.info("URL is Opened");
		
		loginPage lp= new loginPage(driver);
		lp.setusername(username);
		logger.info("Username Entered");
		lp.setpassward(passward);
		logger.info("passward entered");
		lp.clicksubmit();
		
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		
	{
		Assert.assertTrue(true);	
		logger.info("Login test passed");
	}
	else
	{
		capturescreen(driver,"Logintest");
		Assert.assertTrue(false);
		logger.info("login test fail");
	}
	
	
	}
	
	
	
}
