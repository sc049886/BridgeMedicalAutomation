package com.bridge.security;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

import com.bridge.utilities.CommonFunctions;
import com.pageObject.Functions.SystemManagerUsersPageFunctions;
import com.pageObjects.SystemManagerLoginPage;
import com.pageObjects.SystemManagerLoginSettingsPage;
import com.pageObjects.SystemManagerMainPage;
import com.pageObjects.SystemManagerUsersPage;

import org.testng.annotations.BeforeMethod;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class PasswordRulesTest 
{
	String username="superuser";
    String password="123";
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010414/SystemManager/Login.aspx";
	String capribedUrl = "http://10.162.106.174/TransSpec2016010414/Capribedside/Login.aspx";
	CommonFunctions common = new CommonFunctions(); 
	SystemManagerMainPage systemmanagermainMenu = new SystemManagerMainPage();
	SystemManagerLoginPage sys_man_login_page = new SystemManagerLoginPage();
	SystemManagerLoginSettingsPage login_settings_page = new SystemManagerLoginSettingsPage();
	WebDriver driver;

	
@Test
  public void passwordRuleTest() throws InterruptedException {
	  String fName,lName,userid,initial,alias,errorMessage;
	  String[] passwords=new String[4];
	  passwords[0]="abcdef";
	  passwords[1]="ABCdef";
	  passwords[2]="ABCdef12";
	  passwords[3]="ABCdef12@";
	  	  
	  
	  fName=lName=userid=initial=alias = "test_125";
	  SystemManagerMainPage sysmanMenuPage = new SystemManagerMainPage();
	  SystemManagerUsersPage userPage = new SystemManagerUsersPage();
	  SystemManagerUsersPageFunctions userPagefunctions = new SystemManagerUsersPageFunctions();
		 common.login(sysmanUrl,username,password);
		 Thread.sleep(2000); 
		 sysmanMenuPage.button_Users().click();
		 Thread.sleep(2000); 
		 userPage.linkCreateUser().click(); 
		 Thread.sleep(2000); 
		 
		 
		 for(int i=0;i<=3;i++)
		 {
			 System.out.println("\n password -> "+passwords[i]);
			 
		 userPage.createUserFName().sendKeys(fName); 
		 Thread.sleep(1000); 
		 userPage.createUserLName().sendKeys(lName); 
		 Thread.sleep(1000); 
		 userPage.createUserUserId().sendKeys(userid); 
		 Thread.sleep(1000); 
		 userPage.createUserInitials().sendKeys(initial); 
		 Thread.sleep(1000);
		 userPage.createUsertxtAlias().sendKeys(alias); 
		 Thread.sleep(1000); 
		 userPage.createUserPassword().sendKeys(passwords[i]); 
		 Thread.sleep(1000); 
		 userPage.createUserConfirmPassword().sendKeys(passwords[i]); 
		 Thread.sleep(1000);
		 userPagefunctions.selectCreateUserRole("Nurse");
		 Thread.sleep(1000);
		 userPagefunctions.selectBabyMatchRecipient("yes");
		 Thread.sleep(1000);
		 userPage.btnConfirm().click();
		 Thread.sleep(1000);
		 
		 errorMessage = userPage.errorMessage().getText();
		 assertTrue(errorMessage!=null);
		 }
		 
		 userPage.createUserFacility_Default().click();
		 Thread.sleep(1000);
		 
		 driver=common.getCurrentdriver();
		// String url= driver.getCurrentUrl();
		 
		 userPage.btnConfirm().click();
		 Thread.sleep(2000);
		 sysmanMenuPage.linkLogout().click();
		
		 common.login(capribedUrl, userid, passwords[3]);
		 common.close();
		  
	  
  }
 
@BeforeMethod
  public void beforeMethod() throws InterruptedException 
  {
	  common.login(sysmanUrl,username,password);
	  Thread.sleep(10000); 
	  systemmanagermainMenu.button_LoginSettings().click();
	  Thread.sleep(2000);
	  if(!login_settings_page.requireLowerCase().isSelected())
	  {
		  login_settings_page.requireLowerCase().click();
	  }
	  Thread.sleep(2000);
	  if(!login_settings_page.requireUpperCase().isSelected())
	  {
		  login_settings_page.requireUpperCase().click();
	  }
	  Thread.sleep(2000);
	  if(!login_settings_page.requireNumeric().isSelected())
	  {
		  login_settings_page.requireNumeric().click();
	  }
	  Thread.sleep(2000);
	  if(!login_settings_page.requireSpecialCharecter().isSelected())
	  {
		  login_settings_page.requireSpecialCharecter().click();
	  }
	  Thread.sleep(2000);
	  login_settings_page.btnConfirm().click();
	  Thread.sleep(2000);
	  systemmanagermainMenu.linkLogout().click();
	  common.close();  
  }


@AfterMethod
  public void afterMethod() throws InterruptedException {
	  common.login(sysmanUrl,username,password);
	  Thread.sleep(10000); 
	  systemmanagermainMenu.button_LoginSettings().click();
	  Thread.sleep(2000);
	  if(login_settings_page.requireLowerCase().isSelected())
	  {
		  login_settings_page.requireLowerCase().click();
	  }
	  Thread.sleep(2000);
	  if(login_settings_page.requireUpperCase().isSelected())
	  {
		  login_settings_page.requireUpperCase().click();
	  }
	  Thread.sleep(2000);
	  if(login_settings_page.requireNumeric().isSelected())
	  {
		  login_settings_page.requireNumeric().click();
	  }
	  Thread.sleep(2000);
	  if(login_settings_page.requireSpecialCharecter().isSelected())
	  {
		  login_settings_page.requireSpecialCharecter().click();
	  }
	  Thread.sleep(2000);
	  login_settings_page.btnConfirm().click();
	  Thread.sleep(2000);
	  systemmanagermainMenu.linkLogout().click();
	  common.close();  
  }
  
}
