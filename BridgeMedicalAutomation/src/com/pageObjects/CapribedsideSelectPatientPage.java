package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CapribedsideSelectPatientPage {
	public CapribedsideSelectPatientPage(WebDriver ieDriver)
	{
		PageFactory.initElements(ieDriver,this);
	}

	@FindBy(id = "txtPatientId")
	public WebElement patientIdTextbox;

	@FindBy(id = "errorsLabel")
	public WebElement ErrorMsg;

	@FindBy(id = "header_cmdLogout")
	public WebElement logoutLink;
	
	@FindBy(id = "header_cmdDonorLink")
	public WebElement milkManagementLink;

	@FindBy(id = "header_cmdReportsLink")
	public WebElement reportsLink;

	@FindBy(id = "errorsLabel")
	public WebElement patientNotFoundErrorMessage;

	@FindBy(id = "errorsLabel")
	public WebElement expectingPatientIDErrorMessage;

	public WebElement getPatientIdTextbox() {
		return patientIdTextbox;
	}

	public void setPatientIdTextbox(WebElement patientIdTextbox) {
		this.patientIdTextbox = patientIdTextbox;
	}

	public WebElement getErrorMsg() {
		return ErrorMsg;
	}

	public void setErrorMsg(WebElement errorMsg) {
		ErrorMsg = errorMsg;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}

	public WebElement getMilkManagementLink() {
		return milkManagementLink;
	}

	public void setMilkManagementLink(WebElement milkManagementLink) {
		this.milkManagementLink = milkManagementLink;
	}

	public WebElement getReportsLink() {
		return reportsLink;
	}

	public void setReportsLink(WebElement reportsLink) {
		this.reportsLink = reportsLink;
	}

	public WebElement getPatientNotFoundErrorMessage() {
		return patientNotFoundErrorMessage;
	}

	public void setPatientNotFoundErrorMessage(WebElement patientNotFoundErrorMessage) {
		this.patientNotFoundErrorMessage = patientNotFoundErrorMessage;
	}

	public WebElement getExpectingPatientIDErrorMessage() {
		return expectingPatientIDErrorMessage;
	}

	public void setExpectingPatientIDErrorMessage(WebElement expectingPatientIDErrorMessage) {
		this.expectingPatientIDErrorMessage = expectingPatientIDErrorMessage;
	}

	

}
