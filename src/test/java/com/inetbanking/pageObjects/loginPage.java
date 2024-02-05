package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
  WebDriver ldriver;
  
  
public  loginPage(WebDriver rdriver) {
	  ldriver =rdriver;
  PageFactory.initElements(rdriver,this);
  
  }
  
 @FindBy(name = "uid")
 
 WebElement txtusername;
 
 
 @FindBy(name="password")
 
 WebElement txtpassward;
 
 @FindBy(name="btnLogin")
 WebElement btnlogin;
 
 @FindBy(linkText="Log out")
 WebElement btnlogout;
 
 public void setusername(String uname)
 {
	 txtusername.sendKeys(uname);
 }
 public void setpassward(String pwd)
 {
	 txtpassward.sendKeys(pwd);
 }
  public void clicksubmit()
  {
	  btnlogin.click();
  }
  public void ClickLogout()
  {
	  btnlogout.click();
	  }
  
  
  
  
  
  
  
  
  
  
}
