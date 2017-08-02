package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class SystemManagerLabelPrinterAndBarcodeSettingsPage extends IEDriver
{
	private static WebElement element = null;
	public static WebElement linkBarcodeType()
	{
		element  = driver.findElement(By.id("trBarcodeTypes"));
		return element;
	}
	
	//Add all the links above.
	
}
