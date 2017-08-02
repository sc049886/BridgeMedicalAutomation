package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;;
public class SystemManagerLoginPage extends IEDriver {
	private static WebElement element = null;
	
public WebElement txt_box_username()
	{
		element  = driver.findElement(By.id("UserId"));
		return element;
	}

	public WebElement txt_box_password()
	{
		element=driver.findElement(By.id("Password"));
		return element;
	}

	public WebElement button_login()
	{
		element = driver.findElement(By.id("cmdLogin"));
		return element;

	}
	public WebElement error_Text()
	{
		element = driver.findElement(By.id("errorsLabel"));
		return element;

	}
}
