package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bridge.utilities.IEDriver;

public class CapribedsideBrowseTransfusionHistoryPage extends IEDriver
{
	//Info Page
	private  WebElement element = null;
	public  WebElement buttonGeneral()
	{
		element  = driver.findElement(By.id("btnGen"));
		return element;
	}
	public  WebElement buttonReaction()
	{
		element  = driver.findElement(By.id("btnReact"));
		return element;
	}
	public  WebElement buttonVitals()
	{
		element  = driver.findElement(By.id("btnVitals"));
		return element;
	}
	public  WebElement buttonChecks()
	{
		element  = driver.findElement(By.id("btnChecks"));
		return element;
	}
	public  WebElement buttonHold()
	{
		element  = driver.findElement(By.id("btnHolds"));
		return element;
	}
	public  WebElement buttonBackInfoPage()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	
	//Edit Transfusion.
	public  WebElement endTransfusionDate()
	{
		element  = driver.findElement(By.id("dpEndTransDate_foo"));
		return element;
	}
	public  WebElement bloodProduct()
	{
		element  = driver.findElement(By.id("lstBloodProduct"));
		return element;
	}
	
	public  WebElement volumeTransfused()
	{
		element  = driver.findElement(By.id("txtVolume"));
		return element;
	}
	public  WebElement buttonConfirEditTransm()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
	}
	public  WebElement buttonExitEditTrans()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	//Correct Blood Plasma Derivative...
	public  WebElement administerDateTime()
	{
		element  = driver.findElement(By.id("dpDerivativeDateTime_foo"));
		return element;
	}
	public  WebElement buttonConfirmEditBloodPlasmaDerivative()
	{
		element  = driver.findElement(By.id("cmdConfirm"));
		return element;
	}
	public  WebElement buttonExitEditBloodPlasmaDerivative()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	//Logout Process
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
	
	//REaction-Post Transfusion Page
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
	public  WebElement checkboxHypotension()
	{
		element  = driver.findElement(By.id("lstReactions_2"));
		return element;
	}
	public  WebElement checkboxReducedUrinOutput()
	{
		element  = driver.findElement(By.id("lstReactions_3"));
		return element;
	}
	public  WebElement checkboxFailureToClot()
	{
		element  = driver.findElement(By.id("lstReactions_4"));
		return element;
	}
	public  WebElement checkboxDyspneaNausea()
	{
		element  = driver.findElement(By.id("lstReactions_5"));
		return element;
	}
	public  WebElement checkboxUticariaChills()
	{
		element  = driver.findElement(By.id("lstReactions_6"));
		return element;
	}
	public  WebElement buttonConfirmPostTransfusion()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
	}
	public  WebElement buttonExitPostTransfusion()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	//Post Transfusion Reaction Instruction page.
	public  WebElement headerReactionInstruction()
	{
		element  = driver.findElement(By.id("headerInstructions"));
		return element;
	}
	public  WebElement buttonConfirmReactionInstruction()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
	}
	public  WebElement buttonExitReactionInstruction()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	

	public  WebElement buttonBackBrowseTransfusionHistory()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	
	//Report Page
	public  WebElement buttonPrintPostTransfusionReport()
	{
		element  = driver.findElement(By.id("btnPrint"));
		return element;
	}
	public  WebElement buttonCancelPostTransfusionReport()
	{
		element  = driver.findElement(By.id("btnReturn"));
		return element;
	}
	


}
