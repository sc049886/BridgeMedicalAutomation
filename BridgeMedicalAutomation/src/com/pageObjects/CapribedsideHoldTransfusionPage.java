package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideHoldTransfusionPage {

	@FindBy(id = "txtUnitNumber")
	public WebElement unitNumberTextbox;

	@FindBy(id = "lstBloodProduct")
	public WebElement bloodProductDroDown;

	// Exit Pop up
	@FindBy(id = "_modalConfirm_cmdOK")
	public WebElement yesButtonExitHoldPopup;

	@FindBy(id = "_modalConfirm_cmdCancel")
	public WebElement noButtonExitHoldPopup;

	// cmdOK
	@FindBy(id = "cmdOK")
	public WebElement continueButton;

	@FindBy(id = "cmdCancel")
	public WebElement exitButton;

	// Hold Section...
	@FindBy(id = "dpStartHold_foo")
	public WebElement startHoldDateAndTimeTextbox;

	@FindBy(id = "lstReasonForHold")
	public WebElement reasonForHoldDropdown;

	@FindBy(id = "dpEndHold_foo")
	public WebElement endHoldDateAndTimeTextbox;

	@FindBy(id = "txtComment")
	public WebElement commentTextbox;

	@FindBy(id = "cmdOK")
	public WebElement continueButtonHoldPage;

	@FindBy(id = "cmdCancel")
	public WebElement exitButtonHoldPage;
	//--Error message in Hold page
	@FindBy(id = "HoldTransfusionEvent_StartDateTime")
	public WebElement startHoldAndTimeFieldRequiresValueErrorMessage;
	
	@FindBy(id = "HoldTransfusionEvent_ReasonForHold")
	public WebElement reasonForHoldRequiresErrorMessage;
	

	// Print Report Page
	@FindBy(id = "btnPrint")
	public WebElement printButton;

	@FindBy(id = "btnReturn")
	public WebElement cancelPrintButton;
	
	

	/*
	 * //Hold Transfusion Method.
	 * 
	 * @FindBy(id = "txtUnitNumber") public WebElement unitNumberTextbox; public
	 * void holdTransfusion(String unitNo) throws Throwable { String FilePath =
	 * "C:\\Temp\\HoldTransfusionTest.html"; String TestName =
	 * "HoldTransfusionTest"; MultiScreenShot multiScreens = new
	 * MultiScreenShot("C:/Temp/","HoldTransfusionTest"); IEDriver iedriver =
	 * new IEDriver(FilePath, TestName); CapribedsideLoginPage login = new
	 * CapribedsideLoginPage(); SystemManagerMainPage sysManagerMainPage = new
	 * SystemManagerMainPage(); CommonFunctions common = new CommonFunctions();
	 * CapribedsidePatientMainPage patientMenu = new
	 * CapribedsidePatientMainPage();
	 * 
	 * CapribedsideStartTransfusionPage stTransPage = new
	 * CapribedsideStartTransfusionPage(); BloodTransfusionCommonFunctionality
	 * transCommon = new BloodTransfusionCommonFunctionality();
	 * SystemManagerTransfusionSettingsPage transfusionSettings = new
	 * SystemManagerTransfusionSettingsPage(); CapribedsideHoldTransfusionPage
	 * holdTransPage = new CapribedsideHoldTransfusionPage();
	 * CapribedsideEndTransfusionPage endTrans = new
	 * CapribedsideEndTransfusionPage();
	 * CapribedsideBrowseTransfusionHistoryPage browseTransHistory = new
	 * CapribedsideBrowseTransfusionHistoryPage();
	 * CapribedsideAdministerDerivativesPage administerDerivative = new
	 * CapribedsideAdministerDerivativesPage();
	 * CapribedsideHoldTransfusionPageFunctions holdtransfunctions = new
	 * CapribedsideHoldTransfusionPageFunctions();
	 * patientMenu.holdTransfusionButton().click(); Thread.sleep(6000);
	 * multiScreens.multiScreenShot(iedriver.driver); //step 4
	 * holdTransPage.editboxUnitNumber().sendKeys(unitNo,Keys.ENTER);
	 * Thread.sleep(10000); multiScreens.multiScreenShot(iedriver.driver);
	 * //Step 5 holdtransfunctions.selectBlodProduct(4); Thread.sleep(6000);
	 * holdTransPage.buttonContinue().click(); Thread.sleep(8000);
	 * multiScreens.multiScreenShot(iedriver.driver);
	 * 
	 * //Step 6 holdTransPage.buttonExitHold().click(); Thread.sleep(1000);
	 * holdTransPage.buttonYesExitHoldPopup().click(); //Step 7
	 * mainPage.holdTransfusionButton().click(); Thread.sleep(2000);
	 * multiScreens.multiScreenShot(iedriver.driver);
	 * holdTransPage.editboxUnitNumber().sendKeys(unitNo,Keys.ENTER);
	 * Thread.sleep(2000); multiScreens.multiScreenShot(iedriver.driver);
	 * holdTransPage.selectBlodProduct(4); Thread.sleep(1000);
	 * holdTransPage.buttonContinue().click(); Thread.sleep(2000);
	 * multiScreens.multiScreenShot(iedriver.driver);
	 * 
	 * //Step 8 Thread.sleep(10000); String currentDate =
	 * common.currentDate("MM/dd/yyyy HH:mm",0);
	 * holdTransPage.startHoldDateAndTime().sendKeys(currentDate,Keys.ENTER);
	 * Thread.sleep(2000); multiScreens.multiScreenShot(iedriver.driver); //Step
	 * 9 holdtransfunctions.selectReasonForHold(1); Thread.sleep(2000);
	 * multiScreens.multiScreenShot(iedriver.driver); //STep 10
	 * //holdTransPage.endHoldDateAndTime().sendKeys(nextDate);
	 * //Thread.sleep(1000); holdTransPage.textboxComment().sendKeys("Testing");
	 * Thread.sleep(2000); holdTransPage.buttonContinueHold().click();
	 * Thread.sleep(2000); multiScreens.multiScreenShot(iedriver.driver); //Step
	 * 11 holdTransPage.buttonCancel().click(); Thread.sleep(2000);
	 * multiScreens.multiScreenShot(iedriver.driver);
	 * 
	 * }
	 */

}
