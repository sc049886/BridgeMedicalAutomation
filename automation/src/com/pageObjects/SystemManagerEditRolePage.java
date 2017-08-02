package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class SystemManagerEditRolePage extends IEDriver
{
private  WebElement element = null;
	
    public  WebElement checkBoxAccessBrowseTransfusionHistory()
	{
		element  = driver.findElement(By.id("cBoxListTransfusion_0"));
		return element;
	}
    //cBoxListTransfusion_16
    public  WebElement checkBoxMayCorrectTransfusion()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_16"));
   		return element;
   	}
    public  WebElement checkBoxMayCorrectVitals()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_18"));
   		return element;
   	}
    
    public  WebElement checkBoxMayStartTransfusionWithoutCosignature()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_2"));
   		return element;
   	}
    public  WebElement checkBoxMayStartTransfusionWithCosignature()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_3"));
   		return element;
   	}
    public  WebElement checkBoxMayStartRapidTransfusionWithoutCosignature()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_4"));
   		return element;
   	}
    public  WebElement checkBoxMayStartRapidTransfusionWithCosignature()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_5"));
   		return element;
   	}
    public  WebElement checkBoxHoldTransfusion()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_6"));
   		return element;
   	}
    public  WebElement checkBoxMayEndTransfusion()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_7"));
   		return element;
   	}
    public  WebElement checkBoxMaySuperviseTransfusion()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_8"));
   		return element;
   	}
    public  WebElement checkBoxMayCosignTransfusion()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_9"));
   		return element;
   	}
   
    public  WebElement checkBoxMayAccessChangeBloodTypeWithCosignature()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_10"));
   		return element;
   	}
    public  WebElement checkBoxMayAccessChangeBloodTypeWithoutCosignature()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_11"));
   		return element;
   	}
  
   
    //Confirm or Cancel
    public  WebElement buttonConfirm()
	{
		element  = driver.findElement(By.id("cmdOKUp" ));
		return element;
	}
	public  WebElement buttonCancel()
	{
		element  = driver.findElement(By.id("btnCancelUp" ));
		return element;
	}

}
