package com.inetbanking.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.BaseClass;
import com.inetbanking.pageObjects.addNewCust;
import com.inetbanking.pageObjects.loginPage;

public class TC_addNewCustomer_003 extends BaseClass {

	
	
	@Test
	public void Logintest() throws IOException, InterruptedException {
		logger.info("URL is Opened");
		loginPage lp = new loginPage(driver);
		lp.setusername(username);
		logger.info("Username Entered");
		lp.setpassward(passward);
		logger.info("passward entered");
		lp.clicksubmit();
		logger.info("homepage open");

		addNewCust ad = new addNewCust(driver);
		Thread.sleep(3000);
		
		
	
		ad.clickaddNewCust();
		
	
		
		logger.info("cust");
		Thread.sleep(3000);
		ad.setusername("sachin");
		logger.info("name");
		ad.setusergender("male");
		logger.info("gender");
		ad.setdate("25", "03", "1992");
		logger.info("date");
		ad.setadress("Malad");
		ad.setcity("Baramati");
		ad.setstate("pune");
		ad.setpinno("413102");
		ad.settelno("1236448");
		ad.setemail("sadjajd@gmail.com");
		ad.setpassward("153624");
		ad.ClickSubmit();
		logger.info("date");
		
		
	}

}
