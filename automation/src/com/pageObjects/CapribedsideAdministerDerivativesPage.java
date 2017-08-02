package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.CapribedsideAdministerDerivativesPageFunctions;

public class CapribedsideAdministerDerivativesPage extends IEDriver
{
	private  WebElement element = null;
	public WebElement dropdownBloodPlasmaDerivative()
	{
		element  = driver.findElement(By.id("lstDerivatives"));
		return element;
	}


	public  WebElement patientID()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl2_textAttribute"));
		return element;
	}
	public  WebElement patientName()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl3_textAttribute"));
		return element;
	}
	public  WebElement patientBloodType()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl4_listAttribute"));
		return element;
	}
	
	public  WebElement manufacturer()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl5_textAttribute"));
		return element;
	}
	public  WebElement lotNumber()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl6_textAttribute"));
		return element;
	}
	
	public  WebElement iuConcentration()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl7_textAttribute"));
		return element;
	}
	public WebElement dropDownInjectionSite()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl8_listAttribute"));
		return element;
	}
	
	public  WebElement serialNumber()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl9_textAttribute"));
		return element;
	}
	public  WebElement volume()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl10_textAttribute"));
		return element;
	}
	public  WebElement Expires()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl11_dateAttribute_foo"));
		return element;
	}
	public  WebElement quantity()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl12_textAttribute"));
		return element;
	}
	
	//Cosignature
	public  WebElement userId()
	{
		element  = driver.findElement(By.id("txtLoginId"));
		return element;
	}
	public  WebElement password()
	{
		element  = driver.findElement(By.id("txtPassword"));
		return element;
	}
		
	public  WebElement buttonContinue()
	{
		element  = driver.findElement(By.id("cmdConfirm"));
		return element;
	}
	public  WebElement buttonExit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	//Logout process
	public  WebElement linkLogout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
	
	public  WebElement btnYesLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdOK"));
		return element;
	}
	public  WebElement btnNoLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdCancel"));
		return element;
	}
	
	public void admisnisterDerivative(String derivative,String bloodType,String patientID,String patientName,String manufacturer,String lotNo,String iuConcentration,String injectionSite,String serialNumber,String volume,String quantity) throws InterruptedException
	{
		 CapribedsideLoginPage login = new CapribedsideLoginPage();
		 SystemManagerMainPage sysManagerMainPage = new SystemManagerMainPage();
		 CommonFunctions common = new CommonFunctions();
		 CapribedsidePatientMainPage patientMenu = new  CapribedsidePatientMainPage();
		 CapribedsidePatientMainPage mainPage = new CapribedsidePatientMainPage();
		 SystemManagerRolesPage roles = new SystemManagerRolesPage();
		 SystemManagerEditRolePage editRole = new SystemManagerEditRolePage();
		 CapribedsideBrowseTransfusionHistoryPage browseTransHistory = new CapribedsideBrowseTransfusionHistoryPage();
		 CapribedsideAdministerDerivativesPage administerDerivative = new CapribedsideAdministerDerivativesPage();
		 CapribedsideAdministerDerivativesPageFunctions adminsterdirpagefunctions = new CapribedsideAdministerDerivativesPageFunctions();

		 String nextDate = common.currentDate("MM/dd/yyyy HH:mm",+2);
		
		  Assert.assertEquals(administerDerivative.dropdownBloodPlasmaDerivative().isEnabled(),true);
		  Thread.sleep(1000);
		  adminsterdirpagefunctions.selectBloodPlasmaDerivative(derivative);
		  Thread.sleep(3000);
		  administerDerivative.patientID().sendKeys(patientID);
		  Thread.sleep(2000);
		  administerDerivative.patientName().sendKeys(patientName);
		  Thread.sleep(2000);
		  adminsterdirpagefunctions.selectPatientBloodType(bloodType);
		  Thread.sleep(2000);
		  administerDerivative.manufacturer().sendKeys(manufacturer);
		  Thread.sleep(2000);
		  administerDerivative.lotNumber().sendKeys(lotNo);
		  Thread.sleep(2000);
		  administerDerivative.iuConcentration().sendKeys(iuConcentration);
		  Thread.sleep(2000);
		  adminsterdirpagefunctions.selectInjectionSite(injectionSite);
		  Thread.sleep(2000);
		  administerDerivative.serialNumber().sendKeys(serialNumber);
		  Thread.sleep(2000);
		  administerDerivative.volume().sendKeys(volume);
		  Thread.sleep(2000);
		  administerDerivative.Expires().sendKeys(nextDate);
		  Thread.sleep(2000);
		  administerDerivative.quantity().sendKeys(quantity);
		  Thread.sleep(2000);
		  administerDerivative.buttonContinue().click(); 
		
	}

}
