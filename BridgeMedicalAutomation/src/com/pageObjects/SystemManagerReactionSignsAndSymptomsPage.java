package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerReactionSignsAndSymptomsPage 
{
	
	@FindBy (id = "cmdCreate") 			public WebElement linkCreateReactionSigns;
	@FindBy (id = "txtValue") 			public WebElement textBoxNameCreateReactionSigns;
	@FindBy (id = "txtDescription") 	public WebElement textBoxDescriptionCreateReactionSigns;
	@FindBy (id = "cmdOK") 				public WebElement submitCreateReactionSigns;
	@FindBy (id = "cmdCancel") 			public WebElement cancelCreateReactionSigns;
	
}
