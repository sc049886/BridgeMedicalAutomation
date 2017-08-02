package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.Constants;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.SystemManagerLoginPage;

public class SystemManagerLoginPageFunctions 
{
	private String url;
	IEDriver ieDriver;
	SystemManagerLoginPage loginPage;
	SeleniumFunctions common= new SeleniumFunctions();
	
	public SystemManagerLoginPageFunctions(String url) 
	{
		this.url = url;
		ieDriver = new IEDriver(url);
		loginPage = PageFactory.initElements(IEDriver.ieDriver,SystemManagerLoginPage.class );
	}
	
	
	
	public void enterUserName(String userName) 
	{ 
		loginPage.getTextboxUsername().clear();		
		loginPage.getTextboxUsername().sendKeys(userName);	
	}
	
	public void enterPassword(String pwd) 
	{ 
		loginPage.getTextboxPassword().clear();		
		loginPage.getTextboxPassword().sendKeys(pwd);	
	}
	
	public void clickSubmit() 
	{ 
		loginPage.getButtonSubmit().click();		
	}
	
	
	public void adminLogin()
	{		
		enterUserName(Constants.ADMIN_USERNAME);
		enterPassword(Constants.ADMIN_PASSWORD);
		loginPage.buttonSubmit.click();	
		System.out.println("Login function invoked");
		
	}
	
}
