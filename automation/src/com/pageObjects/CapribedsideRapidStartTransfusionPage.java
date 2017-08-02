
package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.bridge.utilities.IEDriver;

public class CapribedsideRapidStartTransfusionPage  extends IEDriver
{
	private static WebElement element = null;
	//Donor Page Element
	public  WebElement donorCenterCode()
	{
		element  = driver.findElement(By.id("lstCenterCode"));
		return element;
	}
	
	public  WebElement donorUnitNumber()
	{
		element  = driver.findElement(By.id("txtUnitNumber"));
		return element;
	}
		
	public  WebElement donorBloodProductDropDown()
	{
		element  = driver.findElement(By.id("lstBloodProduct"));
		return element;
	}
	public  WebElement bloodProductAttribute()
	{
		element  = driver.findElement(By.id("lblAttributes"));
		return element;
	}
	public  WebElement checkBoxBloodProductAttributeAntiCMVNegative()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl3_checkboxSelect"));
		return element;
	}
	public  WebElement checkBoxBloodProductAttributeIrradiated()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl4_checkboxSelect"));
		return element;
	}
	public  WebElement buttonSaveBloodAttribute()
	{
		element  = driver.findElement(By.id("cmdSave"));
		return element;
	}
	public  WebElement donorBloodProductExipreDate()
	{
		element  = driver.findElement(By.id("dpExpirationDate_foo"));
		return element;
	}
	
	public WebElement donorBloodTypeDropDown()
	{
		element  = driver.findElement(By.id("lstBloodType"));
		return element;
	}

	public  WebElement donorComments()
	{
		element  = driver.findElement(By.id("txtStartTxComment"));
		return element;
	}
	public  WebElement donorContinueButton()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public  WebElement donorExitButton()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	//Donor Page Hazards
	public  WebElement errMsgDonorBloodTypeIsNotAllowedForPatient()
	{
		element  = driver.findElement(By.id("StartTransfusionEvent_BloodType"));
		return element;
	}
	public  WebElement popupBloodTypeMissMatch()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_lblTitleHeader"));
		return element;
	}
	public  WebElement btnYesDonorBloodTypeMissMatchPopup()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdOK"));
		return element;
	}
	public  WebElement btnNoDonorBloodTypeMissMatchPopup()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdCancel"));
		return element;
	}
	
	//Cosign Page
	public  WebElement cosignUserIdTextBox()
	{
		element  = driver.findElement(By.id("txtLoginId"));
		return element;
	}
	public  WebElement cosignPasswordTextBox()
	{
		element  = driver.findElement(By.id("txtPassword"));
		return element;
	}
	public  WebElement btnCosignContinue()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
	}
	public  WebElement btnCosignExit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	//Cosign Page Hazard
	public  WebElement errMsgCosignUserIdOrPasswordInvalid()
	{
		element  = driver.findElement(By.id("User_LoginId"));
		return element;
	}
	
	//Rapid Start Star Page.
	public  WebElement buttonStartRapidTransfusion()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public  WebElement buttonExitRapidTransfusion()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	//Rapid Start Print Page.
	public WebElement buttonPrintRapidTransfusionReport()
	{
		element  = driver.findElement(By.id("btnPrint"));
		return element;
	}
	public  WebElement buttonCancelRapidTransfusionReport()
	{
		element  = driver.findElement(By.id("btnReturn"));
		return element;
	}
	
	
	//Logout process
	public static WebElement linkLogout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
	
	public static WebElement btnYesLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdOK"));
		return element;
	}
	public WebElement btnNoLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdCancel"));
		return element;
	}
	
	//Logout method
	public void logoutRapidTransfusion() throws Throwable
	{
		CapribedsideRapidStartTransfusionPage.linkLogout().click();
		Thread.sleep(2000);
		CapribedsideRapidStartTransfusionPage.btnYesLogoutPopup().click();
				
	}

}
