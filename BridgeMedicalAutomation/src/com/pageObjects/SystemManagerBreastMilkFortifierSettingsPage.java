package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerBreastMilkFortifierSettingsPage 
{

	@FindBy (xpath = ".//*[@id='dlItems']/tbody/tr[2]/td[3]") 		public WebElement labelFirstFortifierName;
	@FindBy (xpath = ".//*[@id='dlItems']/tbody/tr[3]/td[3]") 		public WebElement labelSecondFortifierName;
	@FindBy (xpath = ".//*[@id='dlItems']/tbody/tr[4]/td[3]") 		public WebElement labelThirdFortifierName;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[9]/div[3]/div/table/tbody/tr[2]/td[1]/a/i") 						
	public WebElement editFirstFortifierlink;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[9]/div[3]/div/table/tbody/tr[3]/td[1]/a/i") 						
	public WebElement editSecondFortifierlink;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[9]/div[3]/div/table/tbody/tr[4]/td[1]/a/i") 						
	public WebElement editThirdFortifierlink;

	//Edit Fortifier Page
	@FindBy (id = "lstExtra") 		public WebElement selectPromptForLot;
	@FindBy (id = "lstExtra2") 		public WebElement selectPromptForExpiration;
	@FindBy (id = "lstExtra4") 		public WebElement selectPromptForVolume;
	@FindBy (id = "lstExtra3")		public WebElement SelectFortifierUsedWith;
	@FindBy (id = "cmdOK")			public WebElement buttonSave;
	
	
	
	
	
	
	
	
	
	
	
	
}
