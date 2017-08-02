package com.pageObject.Functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.pageObjects.DonorMilkReceiveDonorBottlePage;

public class DonorMilkReceiveDonorBottlePageFunctions 
{
	Actions actions;
 
	DonorMilkReceiveDonorBottlePage donormilkrecievepage = PageFactory.initElements(IEDriver.driver, 	DonorMilkReceiveDonorBottlePage.class );
	 public void scanDonorBottleID(String a)  throws InterruptedException
	 {
			actions= new Actions(IEDriver.driver);
			actions.keyDown(Keys.ALT).perform(); 
			donormilkrecievepage.donorBottleNumber().sendKeys("[");
			//Thread.sleep(1000);
			donormilkrecievepage.donorBottleNumber().sendKeys(a);
			//Thread.sleep(1000);
			actions.keyDown(Keys.ALT).perform();
			donormilkrecievepage.donorBottleNumber().sendKeys("]");
			//Thread.sleep(1000);
	    }
	 
}
