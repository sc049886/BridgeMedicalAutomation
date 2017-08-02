package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class CapribedsidePrepareBottlesPage extends IEDriver {

	private  WebElement element = null;
	public  WebElement txt_box_BottleNumber()
	{
		element  = driver.findElement(By.id("txtBottleNumber"));
		return element;
	}
	public  WebElement txt_Expirationdate()
	{
		element  = driver.findElement(By.id("lblExpireDate"));
		return element;
	}
	
	public  WebElement thawDate()
	{
		element  = driver.findElement(By.id("dpThawDate_foo"));
		return element;
	}
	public  WebElement button_Divide()
	{
		element  = driver.findElement(By.id("cmdDivide"));
		return element;
	}
	public  WebElement checkbox_AddFortifiers()
	{
		element  = driver.findElement(By.id("cmdFortifiers_uncheckedImage"));
		return element;
	}
	public  WebElement checkbox_CancelFortifiers()
	{
		element  = driver.findElement(By.id("cmdFortifiers_checkedImage"));
		return element;
	}
	public  WebElement checkbox_Dispose()
	{
		element  = driver.findElement(By.id("cbDispose"));
		return element;
	}
	public  WebElement checkbox_ReprintLabel()
	{
		element  = driver.findElement(By.id("cbReprintLabel"));
		return element;
	}
	public  WebElement txt_box_Comments()
	{
		element  = driver.findElement(By.id("txtComment"));
		return element;
	}
	public  WebElement button_Confirm()
	{
		element  = driver.findElement(By.id("cmdDone"));
		return element;
	}
	public  WebElement button_Exit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	//Hazards...
	public  WebElement warning_popUp()
	{
		element  = driver.findElement(By.id("divModalErrorConfirm"));
		return element;
	}
	public  WebElement button_Warning_popUp_Yes()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdButton1"));
		return element;
	}
	public  WebElement button_Warning_popUp_No()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdCancel"));
		return element;
	}
	public  WebElement donorWarning_popUp()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_modalErrorConfirmPopup"));
		return element;
	}
	public  WebElement buttondonorWarningpopUpYes()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdButton1"));
		return element;
	}
	public  WebElement buttondonorWarningpopUpNo()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdCancel"));
		return element;
	}
	public  WebElement errMsgBottleNotReceived()
	{
		element  = driver.findElement(By.id("errorLabel"));
		return element;
	}
	//Divide Bottle Page
	public  WebElement btnPrintDivideBottle()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public  WebElement btnCancelDivideBottle()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	
	
}
