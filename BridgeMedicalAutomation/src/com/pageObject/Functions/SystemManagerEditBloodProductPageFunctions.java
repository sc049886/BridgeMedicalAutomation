package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.SystemManagerEditBloodProductPage;

public class SystemManagerEditBloodProductPageFunctions 
{
	WebElement element;
	Select sel;
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	SystemManagerEditBloodProductPage editbooldprodpage = PageFactory.initElements(IEDriver.ieDriver, SystemManagerEditBloodProductPage.class );
	public void selectOptionForExpirationCheck(String option)
	{
		/*element= editbooldprodpage.expirationCheck;
    	sel = new Select(element);
    	sel.selectByValue(a);*/
    	try {
			seleniumFunctions.waitForElement(editbooldprodpage.expirationCheck);
			seleniumFunctions.selectValueByVisibleText(editbooldprodpage.expirationCheck,
					option);

		} catch (Exception e) {
			System.out.println("SystemManagerEditBloodProductPageFunctions: selectOptionForExpirationCheck method Failed " + e);
		}
	}

	public void selectOptionForCompareBloodType(String option)
	{
		/*element = editbooldprodpage.compareBloodType;
    	sel = new Select(element);
    	sel.selectByValue(a);*/
    	try {
			seleniumFunctions.waitForElement(editbooldprodpage.compareBloodType);
			seleniumFunctions.selectValueByVisibleText(editbooldprodpage.compareBloodType,
					option);

		} catch (Exception e) {
			System.out.println("SystemManagerEditBloodProductPageFunctions: selectOptionForCompareBloodType method Failed " + e);
		}
	}
	
	public void selectOptionForISBT_128_BloodProduct(String option)
	{
		/*element = editbooldprodpage.ISBT_128_BloodProduct;
    	sel = new Select(element);
    	sel.selectByValue(a);*/
    	try {
			seleniumFunctions.waitForElement(editbooldprodpage.ISBT_128_BloodProduct);
			seleniumFunctions.selectValueByVisibleText(editbooldprodpage.ISBT_128_BloodProduct,
					option);

		} catch (Exception e) {
			System.out.println("SystemManagerEditBloodProductPageFunctions: selectOptionForISBT_128_BloodProduct method Failed " + e);
		}
	}
	public void clickBloodProductAttributeLink() {
		try {
			seleniumFunctions.waitForElement(editbooldprodpage.linkBloodProductAttributes);
			editbooldprodpage.linkBloodProductAttributes.click();

		} catch (Exception e) {
			System.out.println("SystemManagerEditBloodProductPageFunctions: clickBloodProductAttributeLink method Failed " + e);
		}

	}
	public void checkAntiCMVNegativeCheckbox() {
		try {
			if(editbooldprodpage.checkboxAntiCMVNegative.isSelected()){
				Thread.sleep(2000);
			}
			else{
				seleniumFunctions.waitForElement(editbooldprodpage.checkboxAntiCMVNegative);
				editbooldprodpage.checkboxAntiCMVNegative.click();
			}
			

		} catch (Exception e) {
			System.out.println("SystemManagerEditBloodProductPageFunctions: checkAntiCMVNegativeCheckbox method Failed " + e);
		}

	}
	public void checkIrradateCheckbox() {
		try {
			if(editbooldprodpage.checkboxIrradiated.isSelected()){
				Thread.sleep(2000);
			}
			else{
				seleniumFunctions.waitForElement(editbooldprodpage.checkboxIrradiated);
				editbooldprodpage.checkboxIrradiated.click();
			}
			

		} catch (Exception e) {
			System.out.println("SystemManagerEditBloodProductPageFunctions: checkIrradateCheckbox method Failed " + e);
		}

	}
	public void clickBackButtonAttributePage() {
		try {
			seleniumFunctions.waitForElement(editbooldprodpage.linkBack);
			editbooldprodpage.linkBack.click();

		} catch (Exception e) {
			System.out.println("SystemManagerEditBloodProductPageFunctions: clickBackButtonAttributePage method Failed " + e);
		}

	}
	public void confirmButtonBloodProductAttribute() {
		try {
			seleniumFunctions.waitForElement(editbooldprodpage.buttonConfirm);
			editbooldprodpage.buttonConfirm.click();

		} catch (Exception e) {
			System.out.println("SystemManagerEditBloodProductPageFunctions: clickBackButtonAttributePage method Failed " + e);
		}

	}
	
}
