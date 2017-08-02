package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.DonorMilkFormulaPrintLabelsPage;

public class DonorMilkFormulaPrintLabelsPageFunction 
{
	DonorMilkFormulaPrintLabelsPage printFormulaLabel = PageFactory.initElements(IEDriver.ieDriver, DonorMilkFormulaPrintLabelsPage.class);
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	
	public void clickSelectForifierButton()
	{
		try {
			seleniumFunctions.waitForElement(printFormulaLabel.selectFortifierButton);
			printFormulaLabel.selectFortifierButton.click();
		} catch (Exception e) {
			System.out.println("Failed to click on fortifier button : "+e);
		}
	}

	public void clickFirstFortifiercheckbox()
	{
		try {
			seleniumFunctions.waitForElement(printFormulaLabel.firstFortifiercheckbox);
			printFormulaLabel.firstFortifiercheckbox.click();
		} catch (Exception e) {
			System.out.println("Failed to click on 1st fortifier checkbox in DonorMilkFormulaPrintLabelsPageFunction: "+e);
		}
	}
		
	public void selectFirstFortifierExpDate()
	{
		try {
			seleniumFunctions.waitForElement(printFormulaLabel.firstFortExpTextBox);
			printFormulaLabel.firstFortExpTextBox.click();
			seleniumFunctions.waitForElement(printFormulaLabel.firstFortExpDateSelection);
			printFormulaLabel.firstFortExpDateSelection.click();
		} catch (Exception e) {
			System.out.println("Failed to select 1st fortifier Exp Date in DonorMilkFormulaPrintLabelsPageFunction: "+e);
		}
	}
	
	public void clickSecondFortifiercheckbox()
	{
		try {
			seleniumFunctions.waitForElement(printFormulaLabel.secondFortifiercheckbox);
			printFormulaLabel.secondFortifiercheckbox.click();
		} catch (Exception e) {
			System.out.println("Failed to click on 2nd fortifier checkbox in DonorMilkFormulaPrintLabelsPageFunction: "+e);
		}
	}
	
	public void writeSecondFortifierLotTextbox(String lotNumber)
	{
		try {
			seleniumFunctions.waitForElement(printFormulaLabel.secondFortLottextbox);
			printFormulaLabel.secondFortLottextbox.sendKeys(lotNumber);
		} catch (Exception e) {
			System.out.println("Failed to click on 2nd fortifier Lot# in DonorMilkFormulaPrintLabelsPageFunction: "+e);
		}
	}
	

	public void clickThirdFortifierCheckbox()
	{
		try {
			seleniumFunctions.waitForElement(printFormulaLabel.thirdFortifierCheckbox);
			printFormulaLabel.thirdFortifierCheckbox.click();
		} catch (Exception e) {
			System.out.println("Failed to click on 3rd fortifier checkbox in DonorMilkFormulaPrintLabelsPageFunction: "+e);
		}
	}
	
	public void selectThirdFortifierExpDate()
	{
		try {
			seleniumFunctions.waitForElement(printFormulaLabel.thirdFortExpTextbox);
			printFormulaLabel.thirdFortExpTextbox.click();
			seleniumFunctions.waitForElement(printFormulaLabel.thirdFortExpDateSelection);
			printFormulaLabel.thirdFortExpDateSelection.click();
		} catch (Exception e) {
			System.out.println("Failed to click on 3rd fortifier Exp Date in DonorMilkFormulaPrintLabelsPageFunction: "+e);
		}
	}
	
	public void writeThirdFortifierLotTextbox(String lotNumber)
	{
		try {
			seleniumFunctions.waitForElement(printFormulaLabel.thirdFortLotTextbox);
			printFormulaLabel.thirdFortLotTextbox.sendKeys(lotNumber);
		} catch (Exception e) {
			System.out.println("Failed to click on 3rd fortifier Lot# in DonorMilkFormulaPrintLabelsPageFunction: "+e);
		}
	}
	
}
