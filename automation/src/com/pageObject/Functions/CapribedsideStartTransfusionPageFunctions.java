package com.pageObject.Functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.IEDriver;
import com.pageObjects.CapribedsideStartTransfusionPage;

public class CapribedsideStartTransfusionPageFunctions {
	
	CapribedsideStartTransfusionPage starttranspage = PageFactory.initElements(IEDriver.driver, CapribedsideStartTransfusionPage.class );
	WebElement element;
	Select sel;
	Actions actions;	
	public void scanRacipientMRN(String a)  throws InterruptedException
    {
	   
    	actions= new Actions(IEDriver.driver);
		actions.keyDown(Keys.ALT).perform();
		starttranspage.textboxRacipientMRN().sendKeys("[");
		Thread.sleep(1000);
		starttranspage.textboxRacipientMRN().sendKeys(a);
		Thread.sleep(1000);
		actions.keyDown(Keys.ALT).perform();
		starttranspage.textboxRacipientMRN().sendKeys("]");
		//Thread.sleep(1000);
    }

	
	public void scanRacipientISBTUnitNumber(String a)  throws InterruptedException	
	{
	 	actions= new Actions(IEDriver.driver);
		actions.keyDown(Keys.ALT).perform();
		starttranspage.scanRacipientUnitNumber().sendKeys("[");
			//Thread.sleep(1000);
		starttranspage.scanRacipientUnitNumber().sendKeys(a);
			//Thread.sleep(1000);
		actions.keyDown(Keys.ALT).perform();
		starttranspage.scanRacipientUnitNumber().sendKeys("]");
	}
	 
	public void scanDonorUnitNumber(String a)  throws InterruptedException
	{ 
		actions= new Actions(IEDriver.driver);
		actions.keyDown(Keys.ALT).perform();
		starttranspage.donorScanUnitNumber().sendKeys("[");
			Thread.sleep(1000);
		starttranspage.donorScanUnitNumber().sendKeys(a);
		Thread.sleep(1000);
		actions.keyDown(Keys.ALT).perform();
		starttranspage.donorScanUnitNumber().sendKeys("]");
	 }
	  
	  public void scanDonorUnitDivision(String a)  throws InterruptedException
	    {
			actions= new Actions(IEDriver.driver);
			actions.keyDown(Keys.ALT).perform();
			starttranspage.donorUnitDivision().sendKeys("[");
			//Thread.sleep(1000);
			starttranspage.donorUnitDivision().sendKeys(a);
			//Thread.sleep(1000);
			actions.keyDown(Keys.ALT).perform();
			starttranspage.donorUnitDivision().sendKeys("]");
		 }
	  
	  public void selectDonorBloodProduct(String a) throws InterruptedException
	    {
		  element = starttranspage.donorBloodProductDeivisionExist();
		  sel = new Select(element);
		  sel.selectByVisibleText(a);
	    }
	  
	  public void scanDonorBloodProduct(String a)  throws InterruptedException
	    {
	    	actions= new Actions(IEDriver.driver);
			actions.keyDown(Keys.ALT).perform();
			starttranspage.donorBloodProductDropDown().sendKeys("[");
			//Thread.sleep(1000);
			starttranspage.donorBloodProductDropDown().sendKeys(a);
			//Thread.sleep(1000);
			actions.keyDown(Keys.ALT).perform();
			starttranspage.donorBloodProductDropDown().sendKeys("]");
			//Thread.sleep(1000);
	    }
	  
	  public void scanDonorBloodProductLookupfield(String a)  throws InterruptedException
	    {
	    	actions= new Actions(IEDriver.driver);
			actions.keyDown(Keys.ALT).perform();
			starttranspage.isbtDonorBloodProductLookup().sendKeys("[");
			//Thread.sleep(1000);
			starttranspage.isbtDonorBloodProductLookup().sendKeys(a);
			//Thread.sleep(1000);
			actions.keyDown(Keys.ALT).perform();
			starttranspage.isbtDonorBloodProductLookup().sendKeys("]");
			//Thread.sleep(1000);
	    }
	  
	  public void selectDonorBloodProductDonationType(int a)
		{
		  element = starttranspage.donorBloodProductDonationType();
	      sel = new Select(element);
	      sel.selectByIndex(a);
		}
	  
		public void selectDonorBloodType(String a) throws InterruptedException
	    {
			element = starttranspage.donorBloodTypeDropDown();
	    	sel = new Select(element);
	    	sel.selectByVisibleText(a);
	    }
}
