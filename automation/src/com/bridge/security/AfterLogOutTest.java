package com.bridge.security;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.bridge.utilities.CommonFunctions;
import com.pageObjects.CapribedsideBabyMatchPage;
import com.pageObjects.CapribedsideViewReactionInformationPage;
import com.pageObjects.SystemManagerMainPage;

public class AfterLogOutTest 
{
@Parameters({ "testBuild","adminusername","adminpassword" })
@Test
  public void AfterLogOut(String testBuild, String adminusername, String adminpassword) throws InterruptedException 
  {
	  
	  String sysmanUrl = testBuild+"SystemManager/Login.aspx";
	  String capribedUrl = testBuild+"CapriBedside/Login.aspx";
	  String babymatchurl = testBuild+"BabyMatch/Login.aspx";
	  String[] Capribedside_Bookmarks=new String[10];
	  String[] systemManager_Bookmarks=new String[5];
	  String[] babyMatch_bookmarks=new String[2];
	  	Capribedside_Bookmarks[0]=testBuild+"capribedside/transfusions/DonorLabel.aspx";
	  	Capribedside_Bookmarks[1]=testBuild+"capribedside/transfusions/CollectVitals.aspx?ProcessType=StartTransfusion";
	  	Capribedside_Bookmarks[2]=testBuild+"capribedside/transfusions/TransfusionReport.aspx?id=10823317585925_";
		Capribedside_Bookmarks[3]=testBuild+"CapriBedside/Transfusions/ChangeBloodType.aspx";
		Capribedside_Bookmarks[4]=testBuild+"CapriBedside/transfusions/EndTransfusion_UnitNumber.aspx";
		Capribedside_Bookmarks[5]=testBuild+"CapriBedside/transfusions/HoldTransfusion_Hold.aspx";
		Capribedside_Bookmarks[6]=testBuild+"CapriBedside/transfusions/EndTransfusion_Volume.aspx";
		Capribedside_Bookmarks[7]=testBuild+"CapriBedside/Transfusions/TransfusionDetailsPanel.aspx?id=10823317585925_";
		Capribedside_Bookmarks[8]=testBuild+"CapriBedside/CollectVitalSigns.aspx?vitalSignOid=10909216931843&returnpage=http://10.162.106.174/TransSpec2016010414/CapriBedside/Transfusions/BrowseVitals.aspx";
		Capribedside_Bookmarks[9]=testBuild+"CapriBedside/transfusions/TransfusionReport.aspx?id=10926396801046_&returnPage=StartTransfusion.aspx";
		systemManager_Bookmarks[0]=testBuild+"SystemManager/EditPointOfCare.aspx?oid=7241314861064";
		systemManager_Bookmarks[1]=testBuild+"SystemManager/EditUser.aspx?oid=12884902519";
		systemManager_Bookmarks[2]=testBuild+"SystemManager/EditRole.aspx?oid=8358006358018";
		systemManager_Bookmarks[3]=testBuild+"SystemManager/EditListItem.aspx?oid=146028888158&listtype=FACILITY";
		systemManager_Bookmarks[4]=testBuild+"SystemManager/EditBloodProduct.aspx?oid=4294967364&listtype=BLOOD_PRODUCT";
		babyMatch_bookmarks[0]=testBuild+"BabyMatch/ManagePatientInformation.aspx";
		babyMatch_bookmarks[1]=testBuild+"BabyMatch/BabyMatch.aspx";
		
		
	  CommonFunctions common = new CommonFunctions(); 
	  WebDriver driver;
	  
	  /*********************Capribed side****************/
	  CapribedsideViewReactionInformationPage reactionPage = new CapribedsideViewReactionInformationPage();
	  common.login(capribedUrl, adminusername, adminpassword);
	  Thread.sleep(2000);

	  //copy current URL
	  driver= common.getCurrentDriver();
	  String currentURL= driver.getCurrentUrl();
	  //Logout
	  reactionPage.linkLogout().click();
	  Thread.sleep(2000);
	  
	  // Check if back button can access the session
	  driver.navigate().back(); 
	  Thread.sleep(2000);
	  String currentURL1= driver.getCurrentUrl();
	  //Check the current url is Login page
	  
	  Assert.assertEquals(currentURL1, capribedUrl,"Page accessable even after lagout"); 
	  common.close();
	  
	  //Checking Bookmarks
	  for(int i=0;i<Capribedside_Bookmarks.length;i++)
	  {
	  common.call_Driver(Capribedside_Bookmarks[i]);
	  Thread.sleep(2000);
	  driver= common.getCurrentDriver();
	  Thread.sleep(2000);
	  currentURL= driver.getCurrentUrl();
  	  //check direct URL redirects to Login Page
	  Assert.assertEquals(currentURL, capribedUrl,"\n\nThe Below URL is not redirecting to login page:\n"+Capribedside_Bookmarks[i]+"\n\n");
	  common.close();
	  }
	  /*********************Baby Match****************/
	  CapribedsideBabyMatchPage babyMatchPage = new CapribedsideBabyMatchPage();
	  common.login(babymatchurl, adminusername, adminpassword);
	  Thread.sleep(2000);
	  // Copy current baby match main page url
	  driver= common.getCurrentDriver();
	  Thread.sleep(2000);
	  currentURL= driver.getCurrentUrl();
	  //Logout 	  
	  babyMatchPage.linkLogOut().click();
	  Thread.sleep(2000);
	  // Check if back button can access the session
	  driver.navigate().back(); 
	  Thread.sleep(2000);
	  currentURL1= driver.getCurrentUrl();
	  //check does Back button redirects to login page
	  Assert.assertEquals(currentURL1, babymatchurl);
	  common.close();
	  
	//Checking Bookmarks
	  for(int i=0;i<babyMatch_bookmarks.length;i++)
	  {
	  common.call_Driver(babyMatch_bookmarks[i]);
	  Thread.sleep(2000);
	  driver= common.getCurrentDriver();
	  Thread.sleep(2000);
	  currentURL= driver.getCurrentUrl();
  	  //check direct URL redirects to Login Page
	  Assert.assertEquals(currentURL, babymatchurl,"\n\nThe Below URL is not redirecting to login page:\n"+babyMatch_bookmarks[i]+"\n \n" );
	  common.close();
	  }
	  
	  /*********************System Manager****************/
	  SystemManagerMainPage systemmanagermainMenu = new SystemManagerMainPage();
	  common.login(sysmanUrl, adminusername, adminpassword);
	  Thread.sleep(2000);
	  // save current baby match main page url
	  driver= common.getCurrentDriver();
	  Thread.sleep(2000);
	  currentURL= driver.getCurrentUrl();
	  //logout
	  systemmanagermainMenu.linkLogout().click();
	  Thread.sleep(2000);
	// Check if back button can access the session
	  driver.navigate().back(); 
	  Thread.sleep(2000);
	  currentURL1= driver.getCurrentUrl();
	//check if it redirects to login page
	  Assert.assertEquals(currentURL1, sysmanUrl);
	  common.close();
	  
	//Checking Bookmarks
	  for(int i=0;i<systemManager_Bookmarks.length;i++)
	  {
	  common.call_Driver(systemManager_Bookmarks[i]);
	  Thread.sleep(2000);
	  driver= common.getCurrentDriver();
	  Thread.sleep(2000);
	  currentURL= driver.getCurrentUrl();
  	  //check direct URL redirects to Login Page
	  Assert.assertEquals(currentURL, sysmanUrl,"\n\nThe Below URL is not redirecting to login page:\n"+systemManager_Bookmarks[i]+"\n\n" );
	  	  common.close();
	  }
	  
	  
  }
}
