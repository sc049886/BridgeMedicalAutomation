package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerRolesPage 
{
	@FindBy (id = "dlRoles__ctl15_editLink") 	
	public WebElement editRapidStartOnly;
	
	@FindBy (id = "dlRoles__ctl19_editLink") 	
	public WebElement editStudentTransfusionist;
	
	@FindBy (id = "dlRoles__ctl20_editLink") 	
	public WebElement editSystemAdminister;
	
	@FindBy (id = "dlRoles__ctl21_editLink") 	
	public WebElement editTransfusionSupervisor;
	
	@FindBy (id = "dlRoles__ctl22_editLink") 	
	public WebElement editTransfusionist;
	
	@FindBy (id = "dlRoles__ctl18_editLink") 	
	public WebElement editStudentNurse;
	
	@FindBy (id = "header_cmdLogout") 			
	public WebElement linkLogout;
	
	@FindBy (id = "cmdOK") 
	public WebElement backButton;
	

}
