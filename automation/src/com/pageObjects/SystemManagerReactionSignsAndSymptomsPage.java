package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class SystemManagerReactionSignsAndSymptomsPage extends IEDriver 
{
	private  WebElement element = null;
	//Blood Type Chnage Reasons
	public  WebElement linkCreateReactionSigns()
	{
			element  = driver.findElement(By.id("cmdCreate"));
			return element;
	}
	public  WebElement textBoxNameCreateReactionSigns()
	{
		element  = driver.findElement(By.id("txtValue"));
		return element;
	}
	public  WebElement textBoxDescriptionCreateReactionSigns()
	{
		element  = driver.findElement(By.id("txtDescription"));
		return element;
	}
	public  WebElement buttonConfirmCreateReactionSigns()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public  WebElement buttonCancelCreateReactionSigns()
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
