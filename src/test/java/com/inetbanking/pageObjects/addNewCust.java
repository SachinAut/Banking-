package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class addNewCust {

	WebDriver ldriver;
	public addNewCust(WebDriver rdriver) {
		ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a" )
	WebElement clicknewcust;
	
	@FindBy(name="name")
	WebElement txtusername;
	
	@FindBy(name="rad1")
	WebElement selectgender;
	
	@FindBy(name="dob")
	WebElement txtDate;
	
	@FindBy(name="addr")
	WebElement txtadress;
	
	@FindBy(name="city")
	WebElement txtcity;
	

	@FindBy(name="state")
	WebElement txtstate;
	
	
	@FindBy(name="pinno")
	WebElement txtpinno;
	
	

	@FindBy(name="telephoneno")
	WebElement txttelno;
	

	@FindBy(name="emailid")
	WebElement txtemail;
	

	@FindBy(name="password")
	WebElement txtpassward;

	@FindBy(name="sub")
	WebElement btnsubmit;
	
	
	
	
	public void clickaddNewCust(){
		
		clicknewcust.click();
	}
	
	
	public void setusername(String username){
		txtusername.sendKeys(username);
	}
	public void setusergender(String gder){
		selectgender.click();;
	}
	public void setdate(String dd,String mm,String yy){
		txtDate.sendKeys(dd);
		txtDate.sendKeys(mm);
		txtDate.sendKeys(yy);
	}
	public void setadress(String adress){
		txtadress.sendKeys(adress);
	}
	public void setcity(String ccity){
		txtcity.sendKeys(ccity);
	}
	public void setstate(String cstate){
		txtstate.sendKeys(cstate);
	}
	public void setpinno(String pinno){
		txtpinno.sendKeys(pinno);
	}
	public void settelno(String ctelno){
		txttelno.sendKeys(ctelno);
	}
	
	
	public void setemail(String email){
		txtemail.sendKeys(email);
	}
	
	public void setpassward(String pass){
		txtpassward.sendKeys(pass);
	}
	
	public void ClickSubmit() {
		btnsubmit.click();
	}
	
	
	
	
	
	
	
}
