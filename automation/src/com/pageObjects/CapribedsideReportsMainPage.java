package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.bridge.utilities.IEDriver;

public class CapribedsideReportsMainPage extends IEDriver
{
	  String report1 = "Auto Cancelled Collection";
	  String report2 = "Barcode Utilization for Transfusions by Point Of Care";
	  String report3 = "Barcode Utilization for Transfusions by User";
	  String report4 = "Blood Plasma Derivatives";
	  String report5 = "Blood Type Change";
	  String report6 = "Bottles Administered";
	  String report7 = "Breast Milk Barcode Compliance";
	  String report8 = "Breast Milk Errors";
	  String report9 = "Collection List by Point Of Care";
	  

	private WebElement element = null;
	public WebElement selectReportDropdown()
	{
		element  = driver.findElement(By.id("lstSelReport"));
		return element;
	}
	public WebElement buttonGo()
	{
		element  = driver.findElement(By.id("btnParam"));
		return element;
	}
	  
	  
}
