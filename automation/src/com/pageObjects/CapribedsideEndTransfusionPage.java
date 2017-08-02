package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bridge.utilities.IEDriver;

public class CapribedsideEndTransfusionPage extends IEDriver 
{
	private  WebElement element = null;
	public  WebElement unitNumber()
	{
		element  = driver.findElement(By.id("txtUnitNumber"));
		return element;
	}
	public  WebElement unitNumberDivision()
	{
		element  = driver.findElement(By.id("txtUnitDivision"));
		return element;
	}
	public WebElement dropDownBloodProduct()
	{
		element  = driver.findElement(By.id("lstBloodProduct"));
		return element;
	}
	
	public  WebElement buttonContinueUnitProductSection()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public  WebElement buttonExitUnitProductSection()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
    //Volume Page
	public  WebElement linkChangeEndTransfusionDateTimeVolumePage()
	{
		element  = driver.findElement(By.id("cmdUpdateDateTime"));
		return element;
	}
	public  WebElement textboxEndTransfusionDateTimeVolumePage()
	{
		element  = driver.findElement(By.id("dpEndDate_foo"));
		return element;
	}
	public  WebElement volumeTransferred()
	{
		element  = driver.findElement(By.id("txtVolume"));
		return element;
	}
	public  WebElement dropdownTransfusionReaction()
	{
		element  = driver.findElement(By.id("lstReactions"));
		return element;
	}
	
	public  WebElement textboxEndTransfusionCommentVolumePage()
	{
		element  = driver.findElement(By.id("txtComment"));
		return element;
	}
	public  WebElement buttonContinueVolumeSection()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
	}
	public  WebElement buttonExitVolumeSection()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	//Reactons Page
	public  WebElement checkboxElevatedTemp()
	{
		element  = driver.findElement(By.id("lstReactions_0"));
		return element;
	}
	public  WebElement checkboxAnaphylaxis()
	{
		element  = driver.findElement(By.id("lstReactions_1"));
		return element;
	}
	public  WebElement checkboxHypotensionOrPain()
	{
		element  = driver.findElement(By.id("lstReactions_2"));
		return element;
	}
	public  WebElement textboxCommentClinicalSignsAndSymptomsPage()
	{
		element  = driver.findElement(By.id("txtComments"));
		return element;
	}
	public  WebElement buttonContinueClinicalSignsAndSymptomsPage()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
	}
	public  WebElement buttonExitClinicalSignsAndSymptomsPage()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	//Reaction Instruction Page
	public  WebElement buttonContinueReactionInstructionsPage()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
	}
	public  WebElement buttonExitReactionInstructionsPage()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	
	//Vitals
	public  WebElement vitalsTempTextBoxFar()
	{
		element  = driver.findElement(By.id("_vitals_txtTemperature"));
		return element;
	}
	public  WebElement vitalsTempTextBoxCel()
	{
		element  = driver.findElement(By.id("_vitals_txtAltTemperature"));
		return element;
	}
	public  WebElement vitalsTempSiteTextBox()
	{
		element  = driver.findElement(By.id("_vitals_lstTemperatureSite"));
		return element;
	}
	 
	public  WebElement vitalsHeartRateTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtHeartRate"));
		return element;
	}
	public  WebElement vitalsSystolicBloodPressureTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtSystolic"));
		return element;
	}
	public  WebElement vitalsDiastolicBloodPressureTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtDiastolic"));
		return element;
	}
	public  WebElement vitalsPalpCheckBox()
	{
		element  = driver.findElement(By.id("_vitals_cboxPalp"));
		return element;
	}
	public  WebElement vitalsRespirationTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtRespirations"));
		return element;
	}
	public  WebElement vitalsOxygenSaturationTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtOxygenSaturation"));
		return element;
	}
	public  WebElement vitalsCommentTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtComment"));
		return element;
	}
	public  WebElement vitalsContinueButton()
	{
		element  = driver.findElement(By.id("_vitals_cont"));
		return element;
	}
	public  WebElement vitalsExitButton()
	{
		element  = driver.findElement(By.id("_vitals_canc"));
		return element;
	}
	
	//Print Report Page
	public  WebElement buttonPrint()
	{
		element  = driver.findElement(By.id("btnPrint" ));
		return element;
	}
	public  WebElement buttonCancelPrint()
	{
		element  = driver.findElement(By.id("btnReturn" ));
		return element;
	}
	
	//Pop up when transfusion is not started
	public  WebElement buttonYesUnitNumberDoesNotMatchRecordedTrans()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdOK" ));
		return element;
	}
	public  WebElement buttonNoUnitNumberDoesNotMatchRecordedTrans()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdCancel" ));
		return element;
	}
	public  WebElement buttonYesBloodProdDoesNotMatchRecordedTrans()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdOK" ));
		return element;
	}
	public  WebElement buttonNoBloodProdDoesNotMatchRecordedTrans()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdCancel" ));
		return element;
	}

	
	
	
	
}
