package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.bridge.utilities.IEDriver;
import com.pageObjects.SystemManagerUsersPage;

public class SystemManagerUsersPageFunctions 
{
	SystemManagerUsersPage userspage = PageFactory.initElements(IEDriver.driver, SystemManagerUsersPage.class );
	Select sel;
	WebElement element;
 	public void selectCreateUserRole(String s)
	{
 		element = userspage.userRole();
	   	sel = new Select(element);
	   	sel.selectByVisibleText(s);
 	}
 	
    public void selectBabyMatchRecipient(String s)
   	{
    	element = userspage.babyMatchRecipient();
    	sel = new Select(element);
    	sel.selectByVisibleText(s);
   	}
}
