package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerReactionInstructionPage 
{
	@FindBy (id = "cmdCreate") 			
	public WebElement linkCreateReactionInstruction;
	
	@FindBy (id = "txtValue") 			
	public WebElement textBoxNameOfReactionInstruction;
	
	@FindBy (id = "txtDescription") 	
	public WebElement textBoxDescriptionReactionInstruction;
	
	@FindBy (id = "cmdOK") 				
	public WebElement submitReactionInstruction;
	
	@FindBy (id = "cmdCancel") 			
	public WebElement cancelCreateReactionInstruction;
	
	@FindBy (id = "cmdOK") 			
	public WebElement backLink;
		
}
