package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class CapribedsideReportParametersPage extends IEDriver
{
	private  WebElement element = null;
	public  WebElement fromDate()
	{
		element  = driver.findElement(By.id("in_From_foo"));
		return element;
	}
	public  WebElement toDate()
	{
		element  = driver.findElement(By.id("in_To_foo"));
		return element;
	}
	public  WebElement btnDisplay()
	{
		element  = driver.findElement(By.id("btnDisplay"));
		return element;
	}
	public  WebElement btnCancel()
	{
		element  = driver.findElement(By.id("btnDisplay"));
		return element;
	}

}
