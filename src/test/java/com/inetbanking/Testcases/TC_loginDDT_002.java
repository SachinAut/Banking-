package com.inetbanking.Testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.Utilities.XLUtils;
import com.inetbanking.pageObjects.BaseClass;
import com.inetbanking.pageObjects.loginPage;

public class TC_loginDDT_002 extends BaseClass {
	
	public String k;
	@Test(dataProvider="loginData")
	public void loginDDT(String user, String pwd) throws IOException {
		
		
	
		
		loginPage lp=new loginPage(driver);
		logger.info("Url is opened");
		lp.setusername(user);
		logger.info("user name entered");
		lp.setpassward(pwd);
		logger.info("passward name entered");
		lp.clicksubmit();
	
		if (isAlertPresent()==true) {

			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			
		}
		else {
			Assert.assertTrue(true);
			
			lp.ClickLogout();
		}
		
		
	
	}
	
	public boolean isAlertPresent() throws IOException {
		
		try {
			driver.switchTo().alert();
			capturescreen(driver,"user");
			return true;
		}
	catch(NoAlertPresentException e) {
		
	
		return false;
	}
		
	}
	
	
	@DataProvider(name="loginData")
	String [][]getData()throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/DATA.xlsx";
		int rowCount=XLUtils.getRowCount(path, "Sheet1");
		int cellCount=XLUtils.getCellCount(path,"Sheet1", 1);
		String loginData [][]=new String [rowCount][cellCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount;j++) {
				
				loginData[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
				
			}
		}
		
		return loginData;
		
	}

}
