package com.bridge.security;

import org.testng.annotations.Test;

import com.bridge.utilities.CommonFunctions;
import com.pageObjects.BabyMatchSelectPatientPage;
import com.pageObjects.CapribedsideChangePasswordPage;
import com.pageObjects.CapribedsideLoginPage;
import com.pageObjects.CapribedsideSelectPatientPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.nio.charset.Charset;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PasswordReflectionTest 
{
	String sysmanUrl; 
	String capribedUrl;
	String babymatchurl;
	String testuserid = "test_143"; 
	String testuserpwd = "abcd";
	String testuser_new_pwd = "hjkl";
	String testuser_new_pwd2 = "wxyz";
	
	CommonFunctions common = new CommonFunctions();
	CapribedsideChangePasswordPage changePasswordPage = new CapribedsideChangePasswordPage();
	CapribedsideLoginPage loginPage = new CapribedsideLoginPage();
	CapribedsideSelectPatientPage selectPatientPage = new CapribedsideSelectPatientPage();
	WebDriver driver;
	
	
	@BeforeTest
	@Parameters({ "testBuild"})
	public void beforeTest(String testBuild) throws InterruptedException 
	{
		sysmanUrl= testBuild+ "SystemManager/Login.aspx";
		capribedUrl= testBuild+ "CapriBedside/Login.aspx";
		babymatchurl= testBuild+"BabyMatch/Login.aspx";
		
		Random rand = new Random(); 
		testuserid = testuserid + (rand.nextInt(900) + rand.nextInt(98));
		
		 common.createUser(sysmanUrl,testuserid , testuserid, testuserid, testuserpwd, "System Administrator", testuserid, testuserid);  
	}

@Test
  public void passwordReflectionTest() throws InterruptedException 
  {
	 
	// Try new user can login to the system
	  common.login(capribedUrl, testuserid, testuserpwd);
	  Thread.sleep(2000);  
	  selectPatientPage.button_Logout().click();
	  Thread.sleep(4000); 
	  //change password link
	  loginPage.link_clickhere().click();
	  Thread.sleep(4000); 
	  changePasswordPage.currentUserID().sendKeys(testuserid);
	  changePasswordPage.currentPassword().sendKeys(testuserpwd);
	  changePasswordPage.newPassword().sendKeys(testuser_new_pwd);
	  changePasswordPage.newConfirmPassword().sendKeys(testuser_new_pwd );
	  Thread.sleep(2000);
	  changePasswordPage.buttonOK().click();
	  Thread.sleep(2000);
	  
	  //check if user can login using old password
	  common.login(capribedUrl, testuserid, testuserpwd);
	  String error_msg = loginPage.errMsgNoPrivilegeToAccessBridgeMedical().getText();
      assert error_msg.matches("Invalid User ID or password."):"user logging in with old password";
      //check new password for logging in
      common.login(capribedUrl, testuserid, testuser_new_pwd);
      Thread.sleep(2000);
      driver= common.getCurrentDriver();
	  String currentURL= driver.getCurrentUrl();
	  Assert.assertNotEquals(currentURL, capribedUrl);
	  common.close();
	  
	  
	  /*************Baby Match*******************************/
	// Try new user can login to the system
	  BabyMatchSelectPatientPage babymatchPage = new BabyMatchSelectPatientPage();
		  common.login(babymatchurl, testuserid, testuser_new_pwd);
		  Thread.sleep(2000);  
		  babymatchPage.button_Logout().click();
		  Thread.sleep(2000); 
		  //change password link
		  loginPage.link_clickhere().click();
		  Thread.sleep(2000); 
		  changePasswordPage.currentUserID().sendKeys(testuserid);
		  changePasswordPage.currentPassword().sendKeys(testuser_new_pwd);
		  changePasswordPage.newPassword().sendKeys(testuser_new_pwd2);
		  changePasswordPage.newConfirmPassword().sendKeys(testuser_new_pwd2 );
		  Thread.sleep(2000);
		  changePasswordPage.buttonOK().click();
		  Thread.sleep(2000);
	  
	  
	  
	  //Check in Baby macth
	  common.login(babymatchurl, testuserid, testuser_new_pwd);
	  error_msg = loginPage.errMsgNoPrivilegeToAccessBridgeMedical().getText();
      assert error_msg.matches("Invalid User ID or password."):"user logging in with old password";
      
      common.login(babymatchurl, testuserid, testuser_new_pwd2);
      Thread.sleep(2000);
      driver= common.getCurrentDriver();
	  currentURL= driver.getCurrentUrl();
	  Assert.assertNotEquals(currentURL, babymatchurl);
	  common.close();
	
	  
	  
  }
  

  @AfterTest
  public void afterMethod() {
	  if (driver != null)
	      driver.quit();
	 
  }

}
