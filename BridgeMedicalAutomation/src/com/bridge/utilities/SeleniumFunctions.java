package com.bridge.utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunctions {
	Select sel;
	// IEDriver iedriver = new IEDriver();
	// Explicit wait function

	// Function to select values from drop down.
	public void selectValueByVisibleText(WebElement element, String visibleText) {
		sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}

	public void selectValueByValueAttribute(WebElement element, String value) {
		// element = administerpage.dropdownBloodPlasmaDerivative();
		sel = new Select(element);
		sel.selectByValue(value);
	}

	public void waitForElement(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(IEDriver.ieDriver, 10000);
		wait.until(ExpectedConditions.visibilityOf(locator));
	}

	public void pressEnter() throws InterruptedException {
		Actions act = new Actions(IEDriver.ieDriver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
	}
}
