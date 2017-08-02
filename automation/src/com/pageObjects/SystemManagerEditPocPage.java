package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class SystemManagerEditPocPage extends IEDriver
{
	private  WebElement element = null;
	
	//Section Secondary Identifier
	public  WebElement utilizeSecondaryIdentifier()
	{
		element  = driver.findElement(By.id("lstSecondaryIndentifier"));
		return element;
	}
	
	public  WebElement secondaryIdName()
	{
		element  = driver.findElement(By.id("txtSecondaryIdName"));
		return element;
	}
	public  WebElement secondaryIdFormat()
	{
		element  = driver.findElement(By.id("txtSecondaryIdFormat"));
		return element;
	}
	public  WebElement turnOffSecondaryIdCheckForTxWristband()
	{
		element  = driver.findElement(By.id("lstNoTxWristbandSecIdCheck"));
		return element;
	}
	
	//Breast Milk Setting
	public  WebElement requireScanInRecieveBtl()
	{
		element  = driver.findElement(By.id("lstRequireScanReceive"));
		return element;
	}
	public  WebElement requireScanningInEndTransfusion()
	{
		element  = driver.findElement(By.id("ListRequireScanEndTx"));
		return element;
	}
	
	
	public  WebElement checkCenterCode()
	{
		element  = driver.findElement(By.id("ListCenterCodes"));
		return element;
	}
	
	public  WebElement checkPatientName()
	{
		element  = driver.findElement(By.id("ListPatientNameForTransfusions"));
		return element;
	}
	
	public  WebElement checkDisplayCommentsInStartTransfusion()
	{
		element  = driver.findElement(By.id("ListStartComments"));
		return element;
	}
	
	public  WebElement requireCosignature()
	{
		element  = driver.findElement(By.id("ListTransfusionCosignRequired"));
		return element;
	}
	public  WebElement requireCosignOnBloodTypeMismatch()
	{
		element  = driver.findElement(By.id("ListRequireCosign"));
		return element;
	}
	
	
	public  WebElement displayCommentsInRapidStartTransfusion()
	{
		element  = driver.findElement(By.id("ListRapidStartComments"));
		return element;
	}
	
	public  WebElement promptForUnitNumberDivisionField()
	{
		element  = driver.findElement(By.id("ListUnitNumerDivision"));
		return element;
	}
	
	public  WebElement promptForVolume()
	{
		element  = driver.findElement(By.id("ListPromptTransVolume"));
		return element;
	}

	//Checks Modify link.
	public  WebElement linkModifyChecksTransfusionSettings()
	{
		element  = driver.findElement(By.id("lnkPreChecks"));
		return element;
	}
	public  WebElement checkboxCheckTheOriginalTransfusionOrder()
	{
		element  = driver.findElement(By.id("dlItems__ctl2_cboxItem"));
		return element;
	}
	public  WebElement linkBackModifyChecksTransfusionSettings()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	
	//Vital Signs Section
	public  WebElement collectVitalSignsOnStartTransfusion()
	{
		element  = driver.findElement(By.id("ListCollOnBegin"));
		return element;
	}
	
	public  WebElement collectVitalSignsOnEndTransfusion()
	{
		element  = driver.findElement(By.id("ListCollOnEnd"));
		return element;
	}
	
	public  WebElement displayHeartRateSite()
	{
		element  = driver.findElement(By.id("ListDisplayHeartRateSite"));
		return element;
	}
	
	public  WebElement displayBloodPressureMethod()
	{
		element  = driver.findElement(By.id("ListDisplayBloodPressureMethod"));
		return element;
	}
	
	public  WebElement displayBothCelsiusAndFahrenheitFieldsForTemperature()
	{
		element  = driver.findElement(By.id("ListAcceptAltTempUnits"));
		return element;
	}
	
	public  WebElement buttonConfirm()
	{
		element  = driver.findElement(By.id("cmdOKUp"));
		return element;
	}
	public  WebElement buttonCancel()
	{
		element  = driver.findElement(By.id("btnCancelUp"));
		return element;
	}
	
	public  WebElement dropDwn_RequireCosignInAdministerBottles(WebDriver driver)
	{
		element  = driver.findElement(By.id("ListRequireCosignAdministerBottles"));
		return element;
	}
}

