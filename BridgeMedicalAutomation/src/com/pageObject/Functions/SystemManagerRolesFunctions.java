package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.SystemManagerRolesPage;

public class SystemManagerRolesFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	SystemManagerRolesPage role = PageFactory.initElements(IEDriver.ieDriver,
			SystemManagerRolesPage.class);
	public void clickEditSystemAdminitserLink() 
	{
		try {
			seleniumFunctions.waitForElement(role.editSystemAdminister);
			role.editSystemAdminister.click();
		} catch (Exception e) {
			System.out.print("SystemManagerRolesFunctions-clickEditSystemAdminitserLink : Method is failed");
		}

	}
	public void clickEditTransfusionistLink() 
	{
		try {
			seleniumFunctions.waitForElement(role.editTransfusionist);
			role.editTransfusionist.click();
		} catch (Exception e) {
			System.out.print("SystemManagerRolesFunctions-clickEditTransfusionistLink : Method is failed");
		}

	}
	public void clickEditStudentTransfusionistLink() 
	{
		try {
			seleniumFunctions.waitForElement(role.editStudentTransfusionist);
			role.editStudentTransfusionist.click();
		} catch (Exception e) {
			System.out.print("SystemManagerRolesFunctions-clickEditStudentTransfusionistLink : Method is failed");
		}

	}
	public void clickEditStudentNurseLink() 
	{
		try {
			seleniumFunctions.waitForElement(role.editStudentNurse);
			role.editStudentTransfusionist.click();
		} catch (Exception e) {
			System.out.print("SystemManagerRolesFunctions-clickEditStudentTransfusionistLink : Method is failed");
		}

	}
	public void clickBackButton() 
	{
		try {
			seleniumFunctions.waitForElement(role.backButton);
			role.backButton.click();
		} catch (Exception e) {
			System.out.print("SystemManagerRolesFunctions-clickBackButton : Method is failed");
		}

	}

}
