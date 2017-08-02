package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class SystemManagerRolesPage extends IEDriver
{
private  WebElement element = null;

	public  WebElement editRapidStartOnly()
	{
		element  = driver.findElement(By.id("dlRoles__ctl15_editLink"));
		return element;
	}
    
    public  WebElement editStudentTransfusionist()
	{
		element  = driver.findElement(By.id("dlRoles__ctl19_editLink"));
		return element;
	}
    public  WebElement editSystemAdminister()
    {
		element  = driver.findElement(By.id("dlRoles__ctl20_editLink"));
		return element;
	}
    public  WebElement editTransfusionSupervisor()
    {
		element  = driver.findElement(By.id("dlRoles__ctl21_editLink"));
		return element;
	}
    public  WebElement editTransfusionist()
  	{
  		element  = driver.findElement(By.id("dlRoles__ctl22_editLink"));
  		return element;
  	}
    public  WebElement linkLogout()
   	{
   		element  = driver.findElement(By.id("header_cmdLogout"));
   		return element;
   	}


}
