package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class SystemManagerEditBloodProductPage extends IEDriver

{
	private  WebElement element = null;
	public  WebElement textboxCode()
	{
		element  = driver.findElement(By.id("txtCode"));
		return element;
	}
	public  WebElement textboxName()
	{
		element  = driver.findElement(By.id("txtValue"));
		return element;
	}
	public  WebElement textboxDescription()
	{
		element  = driver.findElement(By.id("txtDescription"));
		return element;
	}
	public  WebElement bloodProductSubstitutionChart()
	{
		element  = driver.findElement(By.id("lstChart"));
		return element;
	}
	public WebElement expirationCheck()
	{
		element  = driver.findElement(By.id("lstExpiration"));
		return element;
	}
	
	public  WebElement compareBloodType()
	{
		element  = driver.findElement(By.id("ListCompareBloodTypes"));
		return element;
	}
	
	public  WebElement ISBT_128_BloodProduct()
	{
		element  = driver.findElement(By.id("lstISBT128BloodProduct"));
		return element;
	}

	public  WebElement displayAdditionalBloodTypeMismatchQuestion()
	{
		element  = driver.findElement(By.id("lstDisplayBloodProductQuestion"));
		return element;
	}
	public  WebElement linkBloodProductAttributes()
	{
		element  = driver.findElement(By.id("lnkAttributes"));
		return element;
	}
	//Product Attributes
	public  WebElement checkboxAntiCMVNegative()
	{
		element  = driver.findElement(By.id("dlItems__ctl2_cboxItem"));
		return element;
	}
	public  WebElement checkboxIrradiated()
	{
		element  = driver.findElement(By.id("dlItems__ctl3_cboxItem"));
		return element;
	}
	public  WebElement checkboxHbSNegative()
	{
		element  = driver.findElement(By.id("dlItems__ctl4_cboxItem"));
		return element;
	}
	public  WebElement linkBack()
	{
		element  = driver.findElement(By.id("cmdOK"));
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
