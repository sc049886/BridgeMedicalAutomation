package com.bridge.utilities;

import com.pageObjects.CapribedsideStartTransfusionPage;

import multiScreenShot.MultiScreenShot;

public class BloodTransfusionCommonFunctionality 
{
	CapribedsideStartTransfusionPage stTransPage;
	String FilePath = "C:\\Temp\\BloodTransfusionCommonFunctionality.html";
	String TestName = "PatientIdentificationErrorTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","BloodTransfusionCommonFunctionality");
	//IEDriver iedriver = new IEDriver(FilePath, TestName);
	
    //String a = "635201";
   /* public void scanRacipientPatientID(String a)  throws InterruptedException
    {
    	//iedriver.scanpatient("635201");
    	stTransPage = PageFactory.initElements(IEDriver.driver, 	CapribedsideStartTransfusionPage.class );
		Actions actions= new Actions(driver);
		actions.keyDown(Keys.ALT).perform();
		stTransPage.scanRacipientPatientID().sendKeys("[");
		//Thread.sleep(1000);
		stTransPage.scanRacipientPatientID().sendKeys(a);
		//Thread.sleep(1000);
		actions.keyDown(Keys.ALT).perform();
		stTransPage.scanRacipientPatientID().sendKeys("]");
		//Thread.sleep(1000);
    }
    public void scanRacipientPatientName(String a)  throws InterruptedException
    {
    	//iedriver.scanpatient("635201");
    	stTransPage = PageFactory.initElements(IEDriver.driver, 	CapribedsideStartTransfusionPage.class );
		Actions actions= new Actions(driver);
		actions.keyDown(Keys.ALT).perform();
		stTransPage.scanRacipientPatientName().sendKeys("[");
		//Thread.sleep(1000);
		stTransPage.scanRacipientPatientName().sendKeys(a);
		//Thread.sleep(1000);
		actions.keyDown(Keys.ALT).perform();
		stTransPage.scanRacipientPatientName().sendKeys("]");
		//Thread.sleep(1000);
    }
  
    
    public void selectPatientBloodType(int a) throws InterruptedException
    {
    	//stTransPage = PageFactory.initElements(IEDriver.driver, 	StartTransfusionPage.class );
    	WebElement wb = stTransPage.racipientBloodTypeDropDown();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    //select by visible text
    public void selectPatientBloodTypeVisibleText(String a) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, CapribedsideStartTransfusionPage.class );
    	WebElement wb = stTransPage.racipientBloodTypeDropDown();
    	Select sel = new Select(wb);
    	sel.selectByVisibleText(a);
    	
    }
    public void donorCenterCodeDropDown(int a) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, CapribedsideStartTransfusionPage.class );
    	WebElement wb = stTransPage.donorCenterCodeDropDown();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    
    public void donorUnitNumberMissMatchErrorMsg() throws IOException
    {
    	
    	stTransPage = PageFactory.initElements(IEDriver.driver, CapribedsideStartTransfusionPage.class );
    	boolean wb = stTransPage.donorUnitNumberMissmatchErrorMsg().isDisplayed();
    	if(wb)
    	{
    		System.out.println("This unit number does not match the unit number on the crossmatch recipient label-Is displayed");
    		 multiScreens.multiScreenShot(iedriver.driver);
    	}
    	else
    	{
    		System.out.println("Error message for Unit Number missmatch is not displayed");
    		multiScreens.multiScreenShot(iedriver.driver);
    	}
    	
    }
    public void donorBloodProduct(int a) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, CapribedsideStartTransfusionPage.class );
    	WebElement wb = stTransPage.donorBloodProductDropDown();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    public void scanDonorBloodProduct(String a)  throws InterruptedException
    {
    	//iedriver.scanpatient("635201");
    	stTransPage = PageFactory.initElements(IEDriver.driver, CapribedsideStartTransfusionPage.class );
		Actions actions= new Actions(driver);
		actions.keyDown(Keys.ALT).perform();
		stTransPage.donorBloodProductDropDown().sendKeys("[");
		//Thread.sleep(1000);
		stTransPage.donorBloodProductDropDown().sendKeys(a);
		//Thread.sleep(1000);
		actions.keyDown(Keys.ALT).perform();
		stTransPage.donorBloodProductDropDown().sendKeys("]");
		//Thread.sleep(1000);
    }
    
    public void donorBloodType(int a) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, 	CapribedsideStartTransfusionPage.class );
    	WebElement wb = stTransPage.donorBloodTypeDropDown();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    }
    //Donor Blood Product Error Message when Snanned non existing blood product.
    public void donorNonExistingBloodProdScanErrorMsg() throws IOException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, CapribedsideStartTransfusionPage.class );
    	boolean wb = stTransPage.donorBloodProductErrorMsg().isDisplayed();
    	if(wb)
    	{
    		System.out.println("The barcode value you entered 'x' is not a valid blood product.-Is displayed");
    		multiScreens.multiScreenShot(iedriver.driver);
    	}
    	else
    	{
    		System.out.println("Error message for non existing Blood Product scan is not displayed");
    		multiScreens.multiScreenShot(iedriver.driver);
    	}
    

}
    public void vitalsTempSite(int a) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, CapribedsideStartTransfusionPage.class );
    	WebElement wb = stTransPage.vitalsTempSiteTextBox();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    public void transfusionisAlreadyInProgressErrorMsg() throws IOException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, CapribedsideStartTransfusionPage.class );
    	boolean wb = stTransPage.transfusionIsAlreadyInProgressErrorMsg().isDisplayed();
    	if(wb)
    	{
    		System.out.println("This unit number matches a transfusion that was started 'X' by 'Y'.-Is displayed");
    		multiScreens.multiScreenShot(iedriver.driver);
    	}
    	else
    	{
    		System.out.println("Error message for non existing Blood Product scan is not displayed");
    		multiScreens.multiScreenShot(iedriver.driver);
    	}
    }
    
    //Cosign Page Drop Down...
    public void cosignBloodBankPermission(String s) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, CapribedsideStartTransfusionPage.class );
    	WebElement wb = stTransPage.cosignBloodBankPermission();
    	Select sel = new Select(wb);
    	sel.selectByVisibleText(s);
    	
    }
    public void cosignAgreeBloodTypeSubtitution(String s) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, CapribedsideStartTransfusionPage.class );
    	WebElement wb = stTransPage.cosignAgreeBloodTypeSubtitution();
    	Select sel = new Select(wb);
    	sel.selectByVisibleText(s);
    	
    }
    public void cosignReasonForBloodTypeSubtitution(int a) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, CapribedsideStartTransfusionPage.class );
    	WebElement wb = stTransPage.cosignReasonForBloodTypeSubtitution();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    
    //Rapid Transfusion Commonfunctionality.
    CapribedsideRapidStartTransfusionPage rapidTrans = new CapribedsideRapidStartTransfusionPage();
    public void rapidStartDonorCenterCode(int a) throws InterruptedException
    {
    	rapidTrans = PageFactory.initElements(IEDriver.driver, CapribedsideRapidStartTransfusionPage.class );
    	WebElement wb = rapidTrans.donorCenterCode();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    public void rapidStartDonorBloodProduct(int a) throws InterruptedException
    {
    	rapidTrans = PageFactory.initElements(IEDriver.driver, CapribedsideRapidStartTransfusionPage.class );
    	WebElement wb = rapidTrans.donorBloodProductDropDown();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    
    //Change Blood Type Commonfunctionality..
    CapribedsideChangeBloodTypePage changeBT = new CapribedsideChangeBloodTypePage();
    public void changeBTNewBloodType(String s) throws InterruptedException
    {
    	changeBT = PageFactory.initElements(IEDriver.driver, CapribedsideChangeBloodTypePage.class );
    	WebElement wb = changeBT.newBloodType();
    	Select sel = new Select(wb);
    	sel.selectByVisibleText(s);
    	
    }
    public void changeBTConfirmNewBloodType(String s) throws InterruptedException
    {
    	changeBT = PageFactory.initElements(IEDriver.driver, CapribedsideChangeBloodTypePage.class );
    	WebElement wb = changeBT.confirmNewBloodType();
    	Select sel = new Select(wb);
    	sel.selectByVisibleText(s);
    	
    }
    public void changeBTReasonForBloodTypeChange(int a) throws InterruptedException
    {
    	changeBT = PageFactory.initElements(IEDriver.driver, CapribedsideChangeBloodTypePage.class );
    	WebElement wb = changeBT.reasonForBloodTypeChange();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
	//Common method..
	public void startTransfusion(String unitNo,String racipientPatientID,String patientName) throws InterruptedException, IOException
	  {
		IEDriver iedriver = new IEDriver(); 
		MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","BrowseTransfusionHistoryTest");
		CapribedsideStartTransfusionPage stTransPage = new CapribedsideStartTransfusionPage();
		BloodTransfusionCommonFunctionality transCommon = new BloodTransfusionCommonFunctionality();
		CapribedsideLoginPage login = new CapribedsideLoginPage();
		SystemManagerMainPage sysManagerMainPage = new SystemManagerMainPage();
		CommonFunctions common = new CommonFunctions();
		CapribedsidePatientMainPage patientMenu = new  CapribedsidePatientMainPage();
		CapribedsidePatientMainPage mainPage = new CapribedsidePatientMainPage();
		CapribedsideStartTransfusionPageFunctions starttranspagefunction = new CapribedsideStartTransfusionPageFunctions();
		//StartTransfusionPage stTransPage = new StartTransfusionPage();
	     mainPage.startTransfusionButton().click();
	     String nextDate = common.currentDate("MM/dd/yyyy HH:mm",+2);
		 Thread.sleep(2000);
		 transCommon.scanRacipientPatientID(racipientPatientID);
		 //stTransPage.scanRacipientPatientID().sendKeys("(0000)6352-000-1");
		 //act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(2000);
		 transCommon.scanRacipientPatientName(patientName);
		 Thread.sleep(2000);
		 //btCmn.scanRacipientUnitNumber("123");
		 Actions act = new Actions(iedriver.driver);
		 stTransPage.scanRacipientUnitNumber().sendKeys(unitNo);
		 act.sendKeys(Keys.ENTER).perform();
        // common.waitForElement("lstBloodType");
		 transCommon.selectPatientBloodTypeVisibleText("O pos");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(2000);
		 stTransPage.racipientContinueButton().click();
		 Thread.sleep(4000);
		 //multiScreens.multiScreenShot(iedriver.driver);
		 //iedriver.extent_Test().log(LogStatus.PASS, "Step 01 Passed");
		 transCommon.donorCenterCodeDropDown(2);
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(2000);
		 stTransPage.donorScanUnitNumber().sendKeys(unitNo);
		 act.sendKeys(Keys.ENTER).perform();
		 multiScreens.multiScreenShot(iedriver.driver);
		 //iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
		 Thread.sleep(2000);
		 starttranspagefunction.selectDonorBloodProduct("PD1");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 stTransPage.donorBloodProductExipreDate().sendKeys(nextDate);
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(2000);
		 transCommon.donorBloodType(4);
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 stTransPage.vitalsTempTextBoxFar().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsTempTextBoxFar().sendKeys("95");
		 Thread.sleep(3000);
		 transCommon.vitalsTempSite(2);
		 Thread.sleep(3000);
		 stTransPage.vitalsHeartRateTextBox().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsHeartRateTextBox().sendKeys("82");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 stTransPage.vitalsSystolicBloodPressureTextBox().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsSystolicBloodPressureTextBox().sendKeys("120");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 stTransPage.vitalsDiastolicBloodPressureTextBox().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsDiastolicBloodPressureTextBox().sendKeys("83");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 stTransPage.vitalsRespirationTextBox().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsRespirationTextBox().sendKeys("18");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 stTransPage.vitalsOxygenSaturationTextBox().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsOxygenSaturationTextBox().sendKeys("92");
		 Thread.sleep(3000);
		 //act.sendKeys(Keys.ENTER).perform();
		 //Thread.sleep(5000);
		 stTransPage.vitalsContinueButton().click();
		 Thread.sleep(3000);
		 stTransPage.vitalsContinueButton().click();
		 Thread.sleep(3000);
		 stTransPage.checksOriginalTransOrderCheckBox().click();
		 Thread.sleep(2000);
		 stTransPage.checksSecondOrderVerificationTextBox().sendKeys("Nancy");
		 Thread.sleep(2000);
		 stTransPage.checksSignedConsentCheckBox().click();
		 Thread.sleep(2000);
		 stTransPage.checksContinueButton().click();
		 Thread.sleep(3000);
		 stTransPage.startStartButton().click();
		 Thread.sleep(3000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 stTransPage.printCancelButton().click();
		 Thread.sleep(2000);
	  }
	
	public void vitalsAndConfirmActionMethod() throws Throwable
	{
		 IEDriver iedriver = new IEDriver(); 
		 MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","vitalsAndConfirmActionMethod");
		 CapribedsideStartTransfusionPage stTransPage = new CapribedsideStartTransfusionPage();
			BloodTransfusionCommonFunctionality transCommon = new BloodTransfusionCommonFunctionality();
		 stTransPage.vitalsTempTextBoxFar().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsTempTextBoxFar().sendKeys("95");
		 Thread.sleep(3000);
		 transCommon.vitalsTempSite(2);
		 Thread.sleep(3000);
		 stTransPage.vitalsHeartRateTextBox().clear();
		 Thread.sleep(1000);
		 Actions act = new Actions(driver);
		 stTransPage.vitalsHeartRateTextBox().sendKeys("82");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 stTransPage.vitalsSystolicBloodPressureTextBox().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsSystolicBloodPressureTextBox().sendKeys("120");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 stTransPage.vitalsDiastolicBloodPressureTextBox().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsDiastolicBloodPressureTextBox().sendKeys("83");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 stTransPage.vitalsRespirationTextBox().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsRespirationTextBox().sendKeys("18");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 stTransPage.vitalsOxygenSaturationTextBox().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsOxygenSaturationTextBox().sendKeys("92");
		 Thread.sleep(3000);
		 //act.sendKeys(Keys.ENTER).perform();
		 //Thread.sleep(5000);
		 stTransPage.vitalsContinueButton().click();
		 Thread.sleep(4000);
		 stTransPage.vitalsContinueButton().click();
		 Thread.sleep(3000);
		 stTransPage.checksOriginalTransOrderCheckBox().click();
		 Thread.sleep(2000);
		 stTransPage.checksSecondOrderVerificationTextBox().sendKeys("Nancy");
		 Thread.sleep(2000);
		 stTransPage.checksSignedConsentCheckBox().click();
		 Thread.sleep(2000);
		 stTransPage.checksContinueButton().click();
		 Thread.sleep(3000);
		 stTransPage.startStartButton().click();
		 Thread.sleep(3000);
		 multiScreens.multiScreenShot(driver);
		 stTransPage.printCancelButton().click();
		 Thread.sleep(2000);
		
	}
    
   */ 
    
    
    
}
