package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class SystemManagerBloodTypeChangeReasonPage extends IEDriver
{
	private  WebElement element = null;
	//Blood Type Chnage Reasons
		public  WebElement linkCreateBloodTypeChangeReasons()
		{
			element  = driver.findElement(By.id("cmdCreate"));
			return element;
		}
		public  WebElement textboxCodeCreateReason()
		{
			element  = driver.findElement(By.id("txtCode"));
			return element;
		}
		public  WebElement textboxNameCreateReason()
		{
			element  = driver.findElement(By.id("txtValue"));
			return element;
		}
		public  WebElement textboxDescriptionCreateReason()
		{
			element  = driver.findElement(By.id("txtDescription"));
			return element;
		}
		public  WebElement buttonConfirmCreateReason()
		{
			element  = driver.findElement(By.id("cmdOK"));
			return element;
		}
		public  WebElement buttonCancelCreateReason()
		{
			element  = driver.findElement(By.id("cmdCancel"));
			return element;
		}
		public  WebElement linkBack()
		{
			element  = driver.findElement(By.id("cmdOK"));
			return element;
		}
	
}
