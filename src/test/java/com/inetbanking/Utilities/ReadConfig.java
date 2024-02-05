package com.inetbanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
	
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
	}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
	}
		public String getAppUrl()
		{
			String URL=pro.getProperty("baseURL");
			return URL;
		}
		public String getusername()
		{
			String username=pro.getProperty("username");
			return username;
			
		}
		
		public String getchromepath()
		{
			String chromepath=pro.getProperty("chromepath");
			return chromepath;
			
		}
		
		public String getiepath()
		{
			String iepath=pro.getProperty("iepath");
			return iepath;
			
		}
		
		public String getpassward() {
			String pwd=pro.getProperty("passward");
			return pwd;
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

