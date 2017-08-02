package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class SystemManagerReactionInstructionPage extends IEDriver
{
	private  WebElement element = null;
	//Blood Type Chnage Reasons
		public  WebElement linkCreateReactionInstruction()
		{
			element  = driver.findElement(By.id("cmdCreate"));
			return element;
		}
		public  WebElement textBoxNameCreateReactionInstruction()
		{
			element  = driver.findElement(By.id("txtValue"));
			return element;
		}
		public  WebElement textBoxDescriptionCreateReactionInstruction()
		{
			element  = driver.findElement(By.id("txtDescription"));
			return element;
		}
		public  WebElement buttonConfirmCreateReactionInstruction()
		{
			element  = driver.findElement(By.id("cmdOK"));
			return element;
		}
		public  WebElement buttonCancelCreateReactionInstruction()
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
