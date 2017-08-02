package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.IEDriver;
import com.pageObjects.CapribedsideAdministerDerivativesPage;

public class CapribedsideAdministerDerivativesPageFunctions {
	
	WebElement element;
	Select sel;
	CapribedsideAdministerDerivativesPage administerpage = PageFactory.initElements(IEDriver.driver,CapribedsideAdministerDerivativesPage.class );
	public void selectBloodPlasmaDerivative(String a)
	{
    	element = administerpage.dropdownBloodPlasmaDerivative();
    	sel = new Select(element);
    	sel.selectByValue(a);
	}

	public void selectInjectionSite(String a)
	{
    	element = administerpage.dropDownInjectionSite();
    	sel = new Select(element);
    	sel.selectByVisibleText(a);
	}
	
	public void selectPatientBloodType(String a)
	{
    	element = administerpage.patientBloodType();
    	sel = new Select(element);
    	sel.selectByVisibleText(a);
	}
}
