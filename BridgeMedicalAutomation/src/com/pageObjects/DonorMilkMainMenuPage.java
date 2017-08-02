package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DonorMilkMainMenuPage {

	@FindBy(id = "cmdReceiveBottles_cmdButton")
	public WebElement receiveDonorBottleButton;

	@FindBy(id = "cmdPrintMilkLabels_cmdButton")
	public WebElement printDonorLabelsButton;

	@FindBy(id = "cmdReserveOrRelease_cmdButton")
	public WebElement reserveOrReleaseButton;

	@FindBy(id = "cmdCombineDonorMilk_cmdButton")
	public WebElement combineDonorMilkButton;

	@FindBy(id = "cmdBrowseBottleHistory_cmdButton")
	public WebElement browseBottleHistoryButton;

	@FindBy(id = "cmdMilkAvailabilityByPatient_cmdButton")
	public WebElement availablePatientBottleButton;

	@FindBy(id = "cmdStateChange_cmdButton")
	public WebElement stateChangeButton;

	@FindBy(id = "cmdPrintFormulaLabels_cmdButton")
	public WebElement printFormulaLabelsButton;

	@FindBy(id = "cmdBrowseFormulaHistory_cmdButton")
	public WebElement browseFormulaBottleHistoryButton;

	@FindBy(id = "header_cmdHomeLink")
	public WebElement homeLink;

	@FindBy(id = "header_cmdLogout")
	public WebElement logoutLink;

	@FindBy(id = "header_cmdHelp")
	public WebElement helpLink;

}
