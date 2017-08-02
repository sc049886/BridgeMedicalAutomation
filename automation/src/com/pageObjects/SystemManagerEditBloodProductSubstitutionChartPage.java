package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class SystemManagerEditBloodProductSubstitutionChartPage extends IEDriver
{
	private  WebElement element = null;
	//Select?Create Blood Product Substitution Chart
	public  WebElement textboxABNegGroupBPooledRh()
	{
		element  = driver.findElement(By.id("d8302171783270p4294967382"));
		return element;
	}
	public  WebElement buttonConfirm()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public  WebElement buttonCancel()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}

}
