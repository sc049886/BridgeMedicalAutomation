package regressionTestPlans;

import org.testng.annotations.Test;

import com.bridge.utilities.Constants;
import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.CapribedsideLoginFunctions;
import com.pageObject.Functions.CapribedsideSelectPatientFunctions;

public class LaunchBridgeMedicalTest {
	//String Url = "http://10.162.106.174/TransSpec2017010102/CapriBedside/Login.aspx";
	//CapribedsideLoginFunctions loginFunctions;
	//CommonFunctions commonFunctions = new CommonFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideLoginFunctions loginFunctions =new CapribedsideLoginFunctions();
	CapribedsideSelectPatientFunctions selectPatient = new CapribedsideSelectPatientFunctions();
 
	@Test
  public void bridgeMedicalLoginTest() throws InterruptedException 
  {
		
		/*commonFunctions.login(Constants.capribedsideUrl,Constants.ADMIN_USERNAME, Constants.ADMIN_PASSWORD);
		selectPatient.clickLogoutLink();
		selectPatient.enterPatientId("635201");*/
		
		IEDriver.iEDriver(Constants.capribedsideUrl);
		//CapribedsideLoginFunctions loginFunctions =new CapribedsideLoginFunctions();
		loginFunctions.enterUserName("Superuser");
		loginFunctions.enterPassword("123");
		loginFunctions.clickLoginButton();
		//CapribedsideSelectPatientFunctions selectPatient = new CapribedsideSelectPatientFunctions();
		//selectPatient.clickLogoutLink();
		/*CapribedsideSelectPatientPage selPat = new CapribedsideSelectPatientPage();
		selPat.patientIdTextbox.sendKeys("635201");*/
		selectPatient.enterPatientId("635201");
		
  }
}
