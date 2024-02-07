package com.inetbanking.pageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.Utilities.ReadConfig;

public class BaseClass {

	ReadConfig rc=new ReadConfig();
	
	public String baseURL=rc.getAppUrl();
	public String username=rc.getusername();
	public String passward=rc.getpassward();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		 
		
		 logger = Logger.getLogger("ebanking");
		 
		PropertyConfigurator.configure("log4j.properties");
		
		
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",rc.getchromepath());
		ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver(options); 
		}
		else if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver",rc.getiepath());
			driver=new InternetExplorerDriver(); 
			
		}
		
		driver.get(baseURL);
		
	

	}
	@AfterClass
public void teardown() {
	driver.quit();
}

	
	public void capturescreen(WebDriver driver,String tname )throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File target= new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
		
	}
	
	
	
	
	
	
	
	
}
