package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bridge.utilities.IEDriver;

public class CapribedsideBrowseBottleHistoryPage extends IEDriver {
	private  WebElement element = null;
	
	public  WebElement button_Back()
	{
		element = driver.findElement(By.id("Continue"));
		return  element;
	}
	
	public  WebElement sortReceivedColumn()
	{
		element = driver.findElement(By.xpath("//input[@class='sorted']"));
		return  element;
	}
	
	public  WebElement verifyDevidedBottle()
	{		
		element = driver.findElement(By.xpath("a[@href='BrowseBottlePrepPanel.aspx?id=25035364368397']"));
		return  element;
	}
	
	public  WebElement editDevidedBottle()
	{
		element = driver.findElement(By.id("dlBottleHistory__ctl2_btnCorrectBottles"));
		return  element;
	}
	
	public  WebElement finalStatusFilter()
	{
		element = driver.findElement(By.id("FinalStatusFilter"));
		return  element;
	}
	
	
	public  WebElement storageStateFilter()
	{
		element = driver.findElement(By.id("StorageStateFilter"));
		return  element;
	}
	
}
