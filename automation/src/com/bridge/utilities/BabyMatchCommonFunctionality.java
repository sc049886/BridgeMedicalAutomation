package com.bridge.utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.pageObjects.BabyMatchSelectPatientPage;
import com.pageObjects.CapribedsideBabyMatchPage;

public class BabyMatchCommonFunctionality extends IEDriver
{
	  CapribedsideBabyMatchPage babyMatchPage;
	    //String a = "635201";
	    public void scanBabyMatchPatients(String a)  throws InterruptedException
	    {
	    	//iedriver.scanpatient("635201");
	    	babyMatchPage = PageFactory.initElements(IEDriver.driver, CapribedsideBabyMatchPage.class );
			Actions actions= new Actions(driver);
			actions.keyDown(Keys.ALT).perform();
			babyMatchPage.scanPatientID().sendKeys("[");
			babyMatchPage.scanPatientID().sendKeys(a);
			actions.keyDown(Keys.ALT).perform();
			babyMatchPage.scanPatientID().sendKeys("]");
	    }
	    public void scanBabyMatchRacipient(String b) throws InterruptedException
	    {
	    	babyMatchPage = PageFactory.initElements(IEDriver.driver, CapribedsideBabyMatchPage.class );
			Actions actions= new Actions(driver);
			
			actions.keyDown(Keys.ALT).perform();
			babyMatchPage.scanRacipientID().sendKeys("[");
			babyMatchPage.scanRacipientID().sendKeys(b);
			actions.keyDown(Keys.ALT).perform();
			babyMatchPage.scanRacipientID().sendKeys("]");
	    }
	    
	    BabyMatchSelectPatientPage selectPatient;
	    public void scanSelectPatientId(String a )  throws InterruptedException
	    {
	    	selectPatient = PageFactory.initElements(IEDriver.driver, BabyMatchSelectPatientPage.class );
	    	Actions actions= new Actions(driver);
			actions.keyDown(Keys.ALT).perform();
			selectPatient.scanPatientID().sendKeys("[");
			selectPatient.scanPatientID().sendKeys(a);
			actions.keyDown(Keys.ALT).perform();
			selectPatient.scanPatientID().sendKeys("]");
			
	    }

}
