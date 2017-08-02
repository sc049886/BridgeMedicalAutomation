package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.IEDriver;
import com.pageObjects.SystemManagerEditBloodProductPage;

public class SystemManagerEditBloodProductPageFunctions 
{
	WebElement element;
	Select sel;
	SystemManagerEditBloodProductPage editbooldprodpage = PageFactory.initElements(IEDriver.driver, SystemManagerEditBloodProductPage.class );
	public void selectOptionForExpirationCheck(String a)
	{
		element= editbooldprodpage.expirationCheck();
    	sel = new Select(element);
    	sel.selectByValue(a);
	}

	public void selectOptionForCompareBloodType(String a)
	{
		element = editbooldprodpage.compareBloodType();
    	sel = new Select(element);
    	sel.selectByValue(a);
	}
	
	public void selectOptionForISBT_128_BloodProduct(String a)
	{
		element = editbooldprodpage.ISBT_128_BloodProduct();
    	sel = new Select(element);
    	sel.selectByValue(a);
	}
}
