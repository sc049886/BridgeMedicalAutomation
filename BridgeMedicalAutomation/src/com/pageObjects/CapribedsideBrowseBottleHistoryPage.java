package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideBrowseBottleHistoryPage {
	
	@FindBy(id="Continue")
	public WebElement backButton;
	
	@FindBy(xpath="//input[@class='sorted']")
	public WebElement sortReceivedColumnLink;
	
	/*@FindBy(xpath="a[@href='BrowseBottlePrepPanel.aspx?id=25035364368397']")
	public WebElement verifyDividedBottleLink;*/
	
	@FindBy(id="dlBottleHistory__ctl2_btnCorrectBottles")
	public WebElement editDevidedBottleLink;
	
	@FindBy(id="FinalStatusFilter")
	public WebElement finalStatusFilter;
	
	
	@FindBy(id="StorageStateFilter")
	public WebElement storageStateFilter;
		
}
