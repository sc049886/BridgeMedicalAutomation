package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bridge.utilities.IEDriver;

public class SystemManagerUsersPage extends IEDriver 
{
private  WebElement element = null;
	
    public  WebElement editSuperuser()
	{
		element  = driver.findElement(By.id("dlUsers__ctl33_editLink"));
		//element  = driver.findElement(By.xpath("//tr[td[contains(text(),'User, Super D.')]]/td/i[@class='icon-pencil icon-large']"));
		return element;
	}
    //Superuse/Edit Userr Page Elements
    public  WebElement textBoxPassword()
	{
		element  = driver.findElement(By.id("txtPassword"));
		return element;
	}
    public  WebElement textReenterPassword()
	{
		element  = driver.findElement(By.id("txtConfirmPassword"));
		return element;
	}
    public  WebElement roleDropDownBox()
	{
		element  = driver.findElement(By.id("lstRole"));
		return element;
	}
    
    public  WebElement btnConfirm()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
    public  WebElement btnCancel()
   	{
   		element  = driver.findElement(By.id("cmdCancel"));
   		return element;
   	}
    //Logout
    public  WebElement linkLogout()
   	{
   		element  = driver.findElement(By.id("header_cmdLogout"));
   		return element;
   	}
    
    
    public  WebElement linkCreateUser()
   	{
   		element  = driver.findElement(By.id("cmdCreate"));
   		return element;
   	}
    
    public WebElement userRole()
   	{
   		element  = driver.findElement(By.id("lstRole"));
   		return element;
   	}
    
    
    //Create User page objects
    public  WebElement createUserFName()
   	{
   		element  = driver.findElement(By.id("txtFirstName"));
   		return element;
   	}
    
    public  WebElement createUserLName()
   	{
   		element  = driver.findElement(By.id("txtLastName"));
   		return element;
   	}
    
    public  WebElement createUserUserId()
   	{
   		element  = driver.findElement(By.id("txtLoginId"));
   		return element;
   	}
    
    public  WebElement createUserInitials()
   	{
   		element  = driver.findElement(By.id("txtInitials"));
   		return element;
   	}
    
    public  WebElement createUsertxtAlias()
   	{
   		element  = driver.findElement(By.id("txtAlias"));
   		return element;
   	}
    
  
    
    public  WebElement createUserPassword()
   	{
   		element  = driver.findElement(By.id("txtPassword"));
   		return element;
   	}
    
    public  WebElement createUserConfirmPassword()
   	{
   		element  = driver.findElement(By.id("txtConfirmPassword"));
   		return element;
   	}
    
    public  WebElement createUserFacility_Default()
   	{
   		element  = driver.findElement(By.id("grdFacility__ctl2_checkboxFacility"));
   		return element;
   	} 
    
    public  WebElement babyMatchRecipient()
   	{
   		element  = driver.findElement(By.id("lstBabyMatchRecipient"));
   		return element;
   	}
    
      
    public  WebElement errorMessage()
   	{
   		element  = driver.findElement(By.id("MainError"));
   		return element;
   	}
    
    

}
