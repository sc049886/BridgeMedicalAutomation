package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class SystemManagerMainPage extends IEDriver
{
	private  WebElement element = null;
	public  WebElement button_PointsOfCare()
	{
		element  = driver.findElement(By.id("PointsOfCare_cmdButton"));
		return element;
	}
	public  WebElement button_Users( )
	{
		element  = driver.findElement(By.id("Users_cmdButton"));
		return element;
	}
	public  WebElement button_Roles()
	{
		element  = driver.findElement(By.id("Roles_cmdButton"));
		return element;
	}
	public  WebElement button_SystemMaintenance()
	{
		element  = driver.findElement(By.id("Maintenance_cmdButton"));
		return element;
	}
	public  WebElement button_ScheduleDowntime()
	{
		element  = driver.findElement(By.id("ScheduleDowntime_cmdButton"));
		return element;
	}
	public  WebElement button_LoginSettings()
	{
		element  = driver.findElement(By.id("userLogin_cmdButton"));
		return element;
	}
	public  WebElement button_GeneralSystemSettings()
	{
		element  = driver.findElement(By.id("general_cmdButton"));
		return element;
	}
	public  WebElement button_SpecimenSettings()
	{
		element  = driver.findElement(By.id("specimen_cmdButton"));
		return element;
	}
	public  WebElement button_TransfusionSettings()
	{
		element  = driver.findElement(By.id("transfusion_cmdButton"));
		return element;
	}
	public  WebElement button_BreastMilkSettings()
	{
		element  = driver.findElement(By.id("breastMilk_cmdButton"));
		return element;
	}
	public  WebElement button_BabyMatchSettings()
	{
		element  = driver.findElement(By.id("babymatch_cmdButton"));
		return element;
	}
	public  WebElement button_PrinterBarcodeSettings()
	{
		element  = driver.findElement(By.id("printerBarcode_cmdButton"));
		return element;
	}
	public  WebElement button_InterfaceSettings()
	{
		element  = driver.findElement(By.id("SystemInterface_cmdButton"));
		return element;
	}
	public  WebElement button_ReportSettings()
	{
		element  = driver.findElement(By.id("reports_cmdButton"));
		return element;
	}
	public  WebElement linkLogout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
	public  WebElement linkHelp()
	{
		element  = driver.findElement(By.id("header_cmdHelp"));
		return element;
	}
	
	
}
