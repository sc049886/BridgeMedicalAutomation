package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.bridge.utilities.BloodTransfusionCommonFunctionality;
import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.CapribedsideHoldTransfusionPageFunctions;

import multiScreenShot.MultiScreenShot;

public class CapribedsideHoldTransfusionPage extends IEDriver
{
	private  WebElement element = null;
	public  WebElement editboxUnitNumber()
	{
		element  = driver.findElement(By.id("txtUnitNumber" ));
		return element;
	}
	public  WebElement dropDownBlodProduct()
	{
		element  = driver.findElement(By.id("lstBloodProduct" ));
		return element;
	}
	//Exit Pop up
	public  WebElement buttonYesExitHoldPopup()
	{
		element  = driver.findElement(By.id("_modalConfirm_cmdOK" ));
		return element;
	}
	public  WebElement buttonNoExitHoldPopup()
	{
		element  = driver.findElement(By.id("_modalConfirm_cmdCancel" ));
		return element;
	}
	
	//cmdOK
	public  WebElement buttonContinue()
	{
		element  = driver.findElement(By.id("cmdOK" ));
		return element;
	}
	public  WebElement buttonExit()
	{
		element  = driver.findElement(By.id("cmdCancel" ));
		return element;
	}
	//Hold Section...
	public  WebElement startHoldDateAndTime()
	{
		element  = driver.findElement(By.id("dpStartHold_foo" ));
		return element;
	}
	public  WebElement reasonForHold()
	{
		element  = driver.findElement(By.id("lstReasonForHold" ));
		return element;
	}
	
	public  WebElement endHoldDateAndTime()
	{
		element  = driver.findElement(By.id("dpEndHold_foo" ));
		return element;
	}
	public  WebElement textboxComment()
	{
		element  = driver.findElement(By.id("txtComment" ));
		return element;
	}
	
	public  WebElement buttonContinueHold()
	{
		element  = driver.findElement(By.id("cmdOK" ));
		return element;
	}
	public  WebElement buttonExitHold()
	{
		element  = driver.findElement(By.id("cmdCancels" ));
		return element;
	}
	
	//Print Report Page
	public  WebElement buttonPrint()
	{
		element  = driver.findElement(By.id("btnPrint" ));
		return element;
	}
	public  WebElement buttonCancel()
	{
		element  = driver.findElement(By.id("btnReturn" ));
		return element;
	}
	
	//Hold Transfusion Method.
	public void holdTransfusion(String unitNo) throws Throwable
	{
		String FilePath = "C:\\Temp\\HoldTransfusionTest.html";
		String TestName = "HoldTransfusionTest";
		MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","HoldTransfusionTest");
		IEDriver iedriver = new IEDriver(FilePath, TestName);
		CapribedsideLoginPage login = new CapribedsideLoginPage();
		SystemManagerMainPage sysManagerMainPage = new SystemManagerMainPage();
		CommonFunctions common = new CommonFunctions();
		CapribedsidePatientMainPage patientMenu = new  CapribedsidePatientMainPage();
		
		CapribedsideStartTransfusionPage stTransPage = new CapribedsideStartTransfusionPage();
		BloodTransfusionCommonFunctionality transCommon = new BloodTransfusionCommonFunctionality();
		SystemManagerTransfusionSettingsPage transfusionSettings = new SystemManagerTransfusionSettingsPage();
		CapribedsideHoldTransfusionPage holdTransPage = new CapribedsideHoldTransfusionPage();
		CapribedsideEndTransfusionPage endTrans = new CapribedsideEndTransfusionPage();
		CapribedsideBrowseTransfusionHistoryPage browseTransHistory = new CapribedsideBrowseTransfusionHistoryPage();
		CapribedsideAdministerDerivativesPage administerDerivative = new CapribedsideAdministerDerivativesPage();
		CapribedsideHoldTransfusionPageFunctions holdtransfunctions = new  CapribedsideHoldTransfusionPageFunctions();
		     patientMenu.holdTransfusionButton().click();
			 Thread.sleep(6000);
			 multiScreens.multiScreenShot(iedriver.driver);
			 //step 4
			 holdTransPage.editboxUnitNumber().sendKeys(unitNo,Keys.ENTER);
			 Thread.sleep(10000);
			 multiScreens.multiScreenShot(iedriver.driver);
			 //Step 5
			 holdtransfunctions.selectBlodProduct(4);
			 Thread.sleep(6000);
			 holdTransPage.buttonContinue().click();
			 Thread.sleep(8000);
			 multiScreens.multiScreenShot(iedriver.driver);
			 /*
			 //Step 6
			 holdTransPage.buttonExitHold().click();
			 Thread.sleep(1000);
			 holdTransPage.buttonYesExitHoldPopup().click();
			 //Step 7
			 mainPage.holdTransfusionButton().click();
			 Thread.sleep(2000);
			 multiScreens.multiScreenShot(iedriver.driver);
			 holdTransPage.editboxUnitNumber().sendKeys(unitNo,Keys.ENTER);
			 Thread.sleep(2000);
			 multiScreens.multiScreenShot(iedriver.driver);
			 holdTransPage.selectBlodProduct(4);
			 Thread.sleep(1000);
			 holdTransPage.buttonContinue().click();
			 Thread.sleep(2000);
			 multiScreens.multiScreenShot(iedriver.driver);
			 */
			 //Step 8
			 Thread.sleep(10000);
			 String currentDate = common.currentDate("MM/dd/yyyy HH:mm",0);
			 holdTransPage.startHoldDateAndTime().sendKeys(currentDate,Keys.ENTER);
			 Thread.sleep(2000);
			 multiScreens.multiScreenShot(iedriver.driver);
			 //Step 9
			 holdtransfunctions.selectReasonForHold(1);
			 Thread.sleep(2000);
			 multiScreens.multiScreenShot(iedriver.driver);
			 //STep 10
			 //holdTransPage.endHoldDateAndTime().sendKeys(nextDate);
			 //Thread.sleep(1000);
			 holdTransPage.textboxComment().sendKeys("Testing");
			 Thread.sleep(2000);
			 holdTransPage.buttonContinueHold().click();
			 Thread.sleep(2000);
			 multiScreens.multiScreenShot(iedriver.driver);
			 //Step 11
			 holdTransPage.buttonCancel().click();
			 Thread.sleep(2000);
			 multiScreens.multiScreenShot(iedriver.driver);
		
	}
	
}
