package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class CapribedsidePatientMainPage extends IEDriver {
	private static   WebElement element = null;
	public  static WebElement button_ReceiveBottles()
	{
		element  = driver.findElement(By.id("cmdReceiveBottles_cmdButton"));
		return element;
	}
	public  WebElement button_StateChange()
	{
		element  = driver.findElement(By.id("cmdStateChangeBottles_cmdButton"));
		return element;
	}
	public  WebElement button_CombineBottles()
	{
		element  = driver.findElement(By.id("cmdCombineBottles_cmdButton"));
		return element;
	}
	public   WebElement button_PrepareBottles()
	{
		element  = driver.findElement(By.id("cmdPrepareBottles_cmdButton"));
		return element;
	}
	public   WebElement button_AdministerBottles()
	{
		element  = driver.findElement(By.id("cmdDispenseBottles_cmdButton"));
		return element;
	}
	public  WebElement button_PrintLabels()
	{
		element  = driver.findElement(By.id("cmdPrintMilkLabels_cmdButton"));
		return element;
	}
	public   WebElement button_DischargeBottles()
	{
		element  = driver.findElement(By.id("cmdDischargeBottles_cmdButton"));
		return element;
	}
	public   WebElement button_BrowseBottleHistory()
	{
		element  = driver.findElement(By.id("cmdBrowseBottleHistory_cmdButton"));
		return element;
	}
	public  WebElement button_ManagePatientInformation()
	{
		element  = driver.findElement(By.id("cmdManagePatientInformation_cmdButton"));
		return element;
	}
	public  WebElement button_logout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
	//Blood TransfusionMenuElements
	public  WebElement startTransfusionButton()
	{
		element  = driver.findElement(By.id("cmdStartTransfusion_cmdButton"));
		return element;
	}
	public  WebElement holdTransfusionButton()
	{
		element  = driver.findElement(By.id("cmdHoldTransfusion_cmdButton"));
		return element;
	}
	public  WebElement endTransfusionButton()
	{
		element  = driver.findElement(By.id("cmdEndTransfusion_cmdButton"));
		return element;
	}
	public  WebElement rapidStartTransfusionButton()
	{
		element  = driver.findElement(By.id("cmdRapidStartTransfusion_cmdButton"));
		return element;
	}
	public  WebElement administerDerivativeButton()
	{
		element  = driver.findElement(By.id("cmdAdministerDerivative_cmdButton"));
		return element;
	}
	public  WebElement browseTransfusinHistoryButton()
	{
		element  = driver.findElement(By.id("cmdBrowseTransfusions_cmdButton"));
		return element;
	}
	//cmdBrowseTransfusions_cmdButtonDisabled
	public  WebElement buttonDitheredRrowseTransfusinHistory()
	{
		element  = driver.findElement(By.id("cmdBrowseTransfusions_cmdButtonDisabled"));
		return element;
	}
	public  WebElement viewReactionInformationButton()
	{
		element  = driver.findElement(By.id("cmdViewReactionInstructions_cmdButton"));
		return element;
	}
	public  WebElement changeBloodTypeButton()
	{
		element  = driver.findElement(By.id("cmdChangeBloodType_cmdButton"));
		return element;
	}
	public  WebElement changePatientButton()
	{
		element  = driver.findElement(By.id("PatientDetails_cmdChangePatient"));
		return element;
	}
	
	//Collect Specimen Elements
	public  WebElement buttonCollectSpecimens()
	{
		element  = driver.findElement(By.id("cmdCollectSpecimens_cmdButton"));
		return element;
	}

	
	//Logout
	public WebElement linkLogout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
	
	public WebElement confirmLogoutOKButton()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdOK"));
		return element;
	}

}
