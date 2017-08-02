package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class CapribedsideSelectPrinterPage extends IEDriver 
{
	private  WebElement element = null;
	public  WebElement btnPrint()
	{
		element  = driver.findElement(By.id("DialogConfirmPrinter_cmdOK"));
		return element;
	}
	public  WebElement btnCancel()
	{
		element  = driver.findElement(By.id("DialogConfirmPrinter_cmdCancel"));
		return element;
	}
	public  WebElement selectAutomationPrinter()
	{
		element  = driver.findElement(By.xpath("//a[@href='SelectPrinter.aspx?PrinterId=XXVA06-19-5134']"));
		return element;
	}

}
