package com.bridge.utilities;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.pageObjects.CapribedsideAdministerBottlesPage;
import com.relevantcodes.extentreports.LogStatus;

import multiScreenShot.MultiScreenShot;

public class CapribedsideNavigation extends IEDriver
{
	 String FilePath = "C:\\Temp\\Sayyad.html";
	 String TestName = "Recive Bottle";
	 IEDriver iedriver = new IEDriver(FilePath, TestName); 
     CommonFunctions fun = new CommonFunctions();
	 CapribedsideAdministerBottlesPage cap = new CapribedsideAdministerBottlesPage();
	//String pat_id ="635203";
	//String bottle_no= fun.uniqueNumber();
	//String onedayago= fun.yestDate();
	  MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","ScreenShot1");
	  @BeforeClass
	     public void preExecutionTest() throws InterruptedException
	  { 
		iedriver.extent_Reports();
		iedriver.extent_Test();
		//iedriver.extent_Reports().startTest();
		String capribedsideUrl = "http://10.162.106.174/TransSpec2016010410/capribedside/Login.aspx";
		fun.login(capribedsideUrl,"superuser","123");	
		//iedriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		iedriver.extent_Test().log(LogStatus.INFO, "Application launched successfully");
		//fun.scanpatientid( pat_id);
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    fun.scanpatientid("635201");
		
	     
	  }

	 @AfterClass
	  public void postExecutionTest() 
	  {
		 driver.close();
	  }

}
