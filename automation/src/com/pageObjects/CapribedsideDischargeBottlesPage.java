package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class CapribedsideDischargeBottlesPage extends IEDriver {
	private  WebElement element = null;
	private  String warningPop = ".//span[text()='Warning:']";
	
	public  WebElement txt_box_bottlenumber()
	{
		element  = driver.findElement(By.id("txtBottleNumber"));
		return element;
	}
	public  WebElement Warning_popup()
	{
		element  = driver.findElement(By.id("divModalErrorConfirm"));
		return element;
	}
	public  WebElement button_Warning_popup_Yes()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdButton1"));
		return element;
	}
	public  WebElement button_Warning_popup_No()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdCancel"));
		return element;
	}
	public  WebElement button_Exit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	public  String getWarningPop() {
		return warningPop;
	}
	
	public  WebElement bottleMayNotBeDischargeToThisPatientErrorMsg()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_lblTitleHeader"));
		return element;
	}
	public  WebElement buttonAckBottleMayNotBeDischargeToThisPatPopup()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdButton3"));
		return element;
	}
	//Hazards
	public  WebElement errMsgBottleNotReceived()
	{
		element  = driver.findElement(By.id("errorLabel"));
		return element;
	}

}
