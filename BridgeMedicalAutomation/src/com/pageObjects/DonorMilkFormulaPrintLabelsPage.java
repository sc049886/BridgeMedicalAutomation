package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DonorMilkFormulaPrintLabelsPage 
{
	@FindBy (xpath=".//*[@id='cmdFortifiers_uncheckedImage']") 	
	public WebElement selectFortifierButton;
	
	@FindBy (xpath = ".//*[@id='grdPromptFortifiers']/tbody/tr[1]/td[1]/input") 		
	public WebElement firstFortifiercheckbox;
	
	@FindBy (xpath = ".//*[@id='grdPromptFortifiers']/tbody/tr[2]/td[1]/input")
	public WebElement secondFortifiercheckbox;
	
	@FindBy (xpath = ".//*[@id='grdPromptFortifiers']/tbody/tr[3]/td[1]/input")
	public WebElement thirdFortifierCheckbox;
	
	
	
	@FindBy (xpath = ".//*[@id='grdPromptFortifiers']/tbody/tr/td/table/tbody/tr[2]/td[2]/span/input[1]") 		
	public WebElement firstFortExpTextBox;
	
	@FindBy (xpath = ".//*[@id='grdPromptFortifiers']/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/span/input[1]")
	public WebElement thirdFortExpTextbox;
	
	
	@FindBy (xpath = ".//*[@id='grdPromptFortifiers']/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/span/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]/div") 		
	public WebElement firstFortExpDateSelection;
	
	@FindBy (xpath = ".//*[@id='grdPromptFortifiers']/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/span/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]/div")
	public WebElement thirdFortExpDateSelection;
	
	@FindBy (xpath = ".//*[@id='grdPromptFortifiers']/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/span/div/div") 		
	public WebElement firstFortDateSelectorPopup;
	
		
	@FindBy (xpath = ".//*[@id='grdPromptFortifiers']/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
	public WebElement secondFortLottextbox;
	
	@FindBy (xpath = ".//*[@id='grdPromptFortifiers']/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/input") 		
	public WebElement thirdFortLotTextbox;
	
	
	
	
	
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[11]/table/tbody/tr[6]/td[2]/div/div/div/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/span/div/div")
	public WebElement thirdFortDateSelectorPopup;
	
	@FindBy (xpath = ".//*[@id='grdPromptFortifiers']/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/span[2]")
	public WebElement secondFortLotLabel;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[11]/table/tbody/tr[6]/td[2]/div/div/div/table/tbody/tr[3]/td/table/tbody/tr[3]/td[1]/span[2]")
	public WebElement thirdFortExpLabel;

	
}
