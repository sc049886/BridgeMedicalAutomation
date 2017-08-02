package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class SystemManagerBloodProductSubstitutionChartPage extends IEDriver
{
	private static WebElement element = null;
	//Select?Create Blood Product Substitution Chart
	public static WebElement editCryoprecipitates()
	{
		element  = driver.findElement(By.id("dlItems__ctl6_editLink"));
		return element;
	}
	public static WebElement linkBackCreateBloodProductSubstitutionChart()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	
}
