package com.bridge.security;

import org.testng.annotations.Test;

import com.bridge.utilities.CommonFunctions;
import com.pageObject.Functions.SystemManagerLoginSettingsPageFunctions;
import com.pageObjects.SystemManagerLoginPage;
import com.pageObjects.SystemManagerLoginSettingsPage;
import com.pageObjects.SystemManagerMainPage;

import org.testng.annotations.BeforeTest;

import java.util.Random;

import org.testng.annotations.AfterTest;

public class UserLockOutTest 
{
	String FilePath = "C:\\Temp\\UserLockOutTest.html";
	String TestName = "UserLockOutTest";
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010414/SystemManager/Login.aspx";
	String capribedUrl = "http://10.162.106.174/TransSpec2016010414/CapriBedside/Login.aspx";
	String babymatchurl = "http://10.162.106.174/TransSpec2016010414/BabyMatch/Login.aspx";
	String username="superuser";
    String password="123";
	String user1="user_"; 
	String user2="Z_";
	String user3="Z_";
	String pwd="1234";
	
	 
	CommonFunctions common = new CommonFunctions(); 
	SystemManagerMainPage systemmanagermainMenu = new SystemManagerMainPage();
	SystemManagerLoginPage sys_man_login_page = new SystemManagerLoginPage();
	SystemManagerLoginSettingsPage login_settings_page = new SystemManagerLoginSettingsPage();
	SystemManagerLoginSettingsPageFunctions loginsettingspagefunctions = new SystemManagerLoginSettingsPageFunctions();
	
  @Test
  public void userLockOutTest() throws InterruptedException 
  {
	
	 String error_msg;
	 
	//Case 1 
	 common.login(capribedUrl, user1, "12345");
	 error_msg = sys_man_login_page.error_Text().getText();
	 assert error_msg.matches("Invalid User ID or password."):"Success";
	 common.close();
	 
	 common.login(capribedUrl, user1, "Test");
	 error_msg = sys_man_login_page.error_Text().getText();
	 assert error_msg.matches("Invalid User ID or password."):"Success";
	 common.close();
	 
	 common.login(capribedUrl, user1, pwd);
	 error_msg = sys_man_login_page.error_Text().getText();
	 assert error_msg.matches("Maximum login attempts. User is locked out."):"Success"; 
	 common.close();
	 
	//Case 2
		 /*
		 common.login(babymatchurl, user2, "12345");
		 error_msg = sys_man_login_page.error_Text().getText();
		 assert error_msg.matches("Invalid User ID or password."):"Success";
		 common.close();
		 
		 common.login(babymatchurl, user2, "Test");
		 error_msg = sys_man_login_page.error_Text().getText();
		 assert error_msg.matches("Invalid User ID or password."):"Success";
		 common.close();
		 
		 common.login(babymatchurl, user2, pwd);
		 error_msg = sys_man_login_page.error_Text().getText();
		 assert error_msg.matches("Maximum login attempts. User is locked out."):"Success"; 
		 common.close();
	
	//case 3
		 common.login(sysmanUrl, user3, "12345");
		 error_msg = sys_man_login_page.error_Text().getText();
		 assert error_msg.matches("Invalid User ID or password."):"Success";
		 common.close();
		 
		 common.login(sysmanUrl, user3, "Test");
		 error_msg = sys_man_login_page.error_Text().getText();
		 assert error_msg.matches("Invalid User ID or password."):"Success";
		 common.close();
		 
		 common.login(sysmanUrl, user3, pwd);
		 error_msg = sys_man_login_page.error_Text().getText();
		 assert error_msg.matches("Maximum login attempts. User is locked out."):"Success"; 
		 common.close();
		 
		 */
  }
  

@BeforeTest
 public void beforeUserLockOutTest() throws InterruptedException 
 {
	Random rand = new Random(); 
	
	user1=user1+rand.nextInt(900);
	user2=user2+rand.nextInt(900);
	user3=user3+rand.nextInt(900);
	System.out.println(user1+user2+user3);
	//create 3 test users
	 common.createUser(sysmanUrl, user1,user1, user1, pwd, "Nurse", user1, user1);
	/* common.createUser(sysmanUrl, user2,user2, user2, pwd, "Nurse", user2, user2);
	 common.createUser(sysmanUrl, user3,user3, user3, pwd, "Nurse", user3, user3);
	 */
	 //set lock out settings
	 common.login(sysmanUrl,username,password);
	 Thread.sleep(10000); 
	 systemmanagermainMenu.button_LoginSettings().click();
	  Thread.sleep(2000);
	  loginsettingspagefunctions.selectPasswordAttemptsBefore("2");
	  Thread.sleep(2000);
	  loginsettingspagefunctions.selectUnlockDuration("15 Minutes");
	  Thread.sleep(3000);
	  login_settings_page.btnConfirm().click();
	  Thread.sleep(2000);
	  systemmanagermainMenu.linkLogout().click();
	  common.close();
	  
 }

@AfterTest
 public void afterUserLockOutTest() throws InterruptedException 
 {
	  common.login(sysmanUrl,username,password);
	  Thread.sleep(2000); 
	  systemmanagermainMenu.button_LoginSettings().click();
	  //systemmanagermainMenu.button_Roles().click();
	  Thread.sleep(2000);
	  loginsettingspagefunctions.selectPasswordAttemptsBefore("5");
	  Thread.sleep(2000);
	  loginsettingspagefunctions.selectUnlockDuration("15 Minutes");
	  Thread.sleep(3000);
	  login_settings_page.btnConfirm().click();
	  Thread.sleep(2000);
	  systemmanagermainMenu.linkLogout().click();
	  common.close();
	  
 }
}