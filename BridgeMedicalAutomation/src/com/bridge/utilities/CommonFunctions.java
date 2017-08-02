package com.bridge.utilities;

import static org.monte.media.FormatKeys.EncodingKey;
import static org.monte.media.FormatKeys.FrameRateKey;
import static org.monte.media.FormatKeys.KeyFrameIntervalKey;
import static org.monte.media.FormatKeys.MIME_AVI;
import static org.monte.media.FormatKeys.MediaTypeKey;
import static org.monte.media.FormatKeys.MimeTypeKey;
import static org.monte.media.VideoFormatKeys.CompressorNameKey;
import static org.monte.media.VideoFormatKeys.DepthKey;
import static org.monte.media.VideoFormatKeys.ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE;
import static org.monte.media.VideoFormatKeys.QualityKey;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageObject.Functions.CapribedsideLoginFunctions;
import com.pageObject.Functions.CapribedsidePatientMainMenuFunctions;
import com.pageObject.Functions.CapribedsideStartTransfusionFunctions;
import com.pageObjects.CapribedsideLoginPage;
import com.pageObjects.CapribedsideReceiveBottlesPage;
import com.pageObjects.CapribedsideSelectPatientPage;
import com.pageObjects.SystemManagerMainPage;

public class CommonFunctions  {

	String username = "superuser";
	String password = "123";
	CapribedsideLoginPage login = new CapribedsideLoginPage();
	Constants constants = new Constants();
	CapribedsideSelectPatientPage select_page;
	CapribedsideReceiveBottlesPage rece_page;
	SystemManagerMainPage sysMain = new SystemManagerMainPage();
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	private static ScreenRecorder screenRecorder;
	//CapribedsideLoginFunctions loginFunctions = new CapribedsideLoginFunctions();
	public void login(String username, String password) throws InterruptedException {
		/*//iedriver.callDriver(URL);
		loginFunctions.enterUserName("Superuser");
		loginFunctions.enterPassword("123");
		loginFunctions.clickLoginButton();
		Thread.sleep(1000);*/
		//ieDriver.iEDriver();
		CapribedsideLoginFunctions loginFunctions =new CapribedsideLoginFunctions();
		loginFunctions.enterUserName(username);
		loginFunctions.enterPassword(password);
		loginFunctions.clickLoginButton();
		Thread.sleep(1000);
	}

	/*public void scanpatientid(String a) throws InterruptedException {

		select_page = PageFactory.initElements(IEDriver.ieDriver, CapribedsideSelectPatientPage.class);
		Actions actions = new Actions(ieDriver.iEDriver());
		actions.keyDown(Keys.ALT).perform();
		select_page.txt_box_patientid().sendKeys("[");
		select_page.txt_box_patientid().sendKeys(a);
		actions.keyDown(Keys.ALT).perform();
		select_page.txt_box_patientid().sendKeys("]");
		Thread.sleep(1000);
	}
*/
	public String uniqueNumber(int a) {

		SimpleDateFormat date1 = new SimpleDateFormat("yyyyddMMHHmm");// ("MM/dd/yyyy
																		// HH:mm");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, a); // -1
		String date = date1.format(cal.getTime());
		return date;
	}

	public String donorUniqueNumber3() {
		SimpleDateFormat date1 = new SimpleDateFormat("yyMMddHHmm");// ("MM/dd/yyyy
																	// HH:mm");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -2);
		String date = date1.format(cal.getTime());
		return date;
	}

	public String currentDate(String dateFormat, int number) {
		SimpleDateFormat date1 = new SimpleDateFormat(dateFormat); // "MM/dd/yyyy
																	// HH:mm"
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, number); // 0
		String date = date1.format(cal.getTime());
		return date;

	}

	public void waitForElement(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(IEDriver.ieDriver, 10000);
		wait.until(ExpectedConditions.visibilityOf(locator));
	}
	
	public void logOutDuringWorkFlow()
	{
		
		
	}

	@SuppressWarnings("static-access")
	public void startScreenRecord() throws IOException, AWTException {
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice()
				.getDefaultConfiguration();
		this.screenRecorder = new ScreenRecorder(gc, new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
						CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, 24, FrameRateKey,
						Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)),
				null);
		this.screenRecorder.start();
	}

	@SuppressWarnings("static-access")
	public void stopScreenRecord() throws IOException {
		this.screenRecorder.stop();
	}

/*	public void createUser(String sysManURL, String fName, String lName, String userid, String password, String role,
			String initial, String alias) throws InterruptedException {
		SystemManagerMainPage sysmanMenuPage = new SystemManagerMainPage();
		SystemManagerUsersPage userPage = new SystemManagerUsersPage();
		SystemManagerUsersPageFunctions userpagefunctions = new SystemManagerUsersPageFunctions();
		//login(sysManURL, "superuser", "123");
		Thread.sleep(2000);
		sysmanMenuPage.buttonUsers.click();
		Thread.sleep(2000);
		userPage.linkCreateUser.click();
		Thread.sleep(2000);
		userPage.createUserFName.sendKeys(fName);
		userPage.createUserLName.sendKeys(lName);
		userPage.createUserUserId.sendKeys(userid);
		userPage.createUserInitials.sendKeys(initial);
		userPage.createUsertxtAlias.sendKeys(alias);
		userPage.createUserPassword.sendKeys(password);
		userPage.createUserConfirmPassword.sendKeys(password);
		userpagefunctions.selectCreateUserRole(role);
		userpagefunctions.selectBabyMatchRecipient("yes");
		Thread.sleep(1000);
		userPage.buttonConfirm.click();
		Thread.sleep(1000);
		userPage.createUserFacility_Default.click();
		Thread.sleep(1000);

		//ieDriver = iedriver.getCurrentdriver();
		String url = ieDriver.iEDriver().getCurrentUrl();

		userPage.buttonConfirm.click();
		Thread.sleep(2000);

		//ieDriver = ieDriver.getCurrentdriver();
		String url2 = ieDriver.iEDriver().getCurrentUrl();

		assertFalse("\n\n cannot create new user " + userid + "\n\n", url.equals(url2));
		sysmanMenuPage.linkLogout.click();
		//close();
	}*/
	
	/*
	 * ------BloodTransfusion Commonfunctions
	 */
	public void recordVitals() throws InterruptedException
	{
		CapribedsideStartTransfusionFunctions startTransfusionFunctions = new CapribedsideStartTransfusionFunctions();
		/*startTransfusionFunctions.enterTemperatureVitalsPage("");
		Thread.sleep(1000);
		startTransfusionFunctions.enterTemperatureVitalsPage("102");
		Thread.sleep(2000);
		startTransfusionFunctions.selectTemperatureSite("Oral");
		Thread.sleep(1000);
		startTransfusionFunctions.enterVitalsHeartRate("");
		Thread.sleep(3000);
		startTransfusionFunctions.enterVitalsHeartRate("93");
		Thread.sleep(1000);
		startTransfusionFunctions.enterVitalsSystolicBloodPressure("");
		Thread.sleep(3000);
		startTransfusionFunctions.enterVitalsSystolicBloodPressure("123");
		Thread.sleep(1000);
		startTransfusionFunctions.enterVitalsDiastolicBloodPressure("");
		Thread.sleep(3000);
		startTransfusionFunctions.enterVitalsDiastolicBloodPressure("84");
		Thread.sleep(1000);
		startTransfusionFunctions.enterVitalsRespiration("");
		Thread.sleep(3000);
		startTransfusionFunctions.enterVitalsRespiration("86");
		Thread.sleep(1000);*/
		startTransfusionFunctions.enterVitalsOxygenSaturation("");
		Thread.sleep(3000);
		startTransfusionFunctions.enterVitalsOxygenSaturation("93");
		Thread.sleep(2000);
		startTransfusionFunctions.clickVitalsContinueButton();
		Thread.sleep(2000);
		startTransfusionFunctions.clickVitalsContinueButton();
		Thread.sleep(2000); 
		/*CapribedsideStartTransfusionPage startTransfusionPage = new CapribedsideStartTransfusionPage();
		if(startTransfusionPage.vitalsContinueButton.isEnabled())
		{
			startTransfusionFunctions.clickVitalsContinueButton();
		}
		else
		{
			Thread.sleep(1000);
		}*/
		
		
		
		
	}
	
	public void startTransfusion(String patientID,String patientName,String unitNumber,String bloodType,String bloodProduct,String bloodProductExpiryDate) throws Throwable
	{
		//CapribedsideSelectPatientFunctions selectPatientFunctions = new CapribedsideSelectPatientFunctions();
		CapribedsidePatientMainMenuFunctions patientMainMenu = new CapribedsidePatientMainMenuFunctions();
		
		patientMainMenu.clickStartTransfusionButton();
		CapribedsideStartTransfusionFunctions startTransfusionFunctions = new CapribedsideStartTransfusionFunctions();
		startTransfusionFunctions.enterRecipientPatientIDTextbox(patientID);
		seleniumFunctions.pressEnter();
		startTransfusionFunctions.enterRecipientPatientName(patientName);
		seleniumFunctions.pressEnter();
		startTransfusionFunctions.enterRecipientUnitNumber(unitNumber);
		seleniumFunctions.pressEnter();
		startTransfusionFunctions.selectRecipientBloodType(bloodType);
		seleniumFunctions.pressEnter();
		startTransfusionFunctions.clickRecipientContinueButton();
		startTransfusionFunctions.selectDonorCenterCode(Constants.donorCenterCode);
		seleniumFunctions.pressEnter();
		startTransfusionFunctions.enterDonorUnitNumber(unitNumber);
		seleniumFunctions.pressEnter();
		startTransfusionFunctions.selectDonorBloodProduct(bloodProduct);
		seleniumFunctions.pressEnter();
		startTransfusionFunctions.enterDonorBloodProductExpirationDate(bloodProductExpiryDate);
		seleniumFunctions.pressEnter();
		startTransfusionFunctions.selectDonorBloodType(bloodType);
		seleniumFunctions.pressEnter();
		// startTransfusionFunctions.clickDonorContinueButton();
		recordVitals();
		startTransfusionFunctions.checkOriginalTransOrderCheckBox();
		startTransfusionFunctions.enterSecondOrderVerification(Constants.secondOrderVerificationBy);
		startTransfusionFunctions.checkSignedConsentCheckBox();
		startTransfusionFunctions.clickChecksContinueButton();
		startTransfusionFunctions.clickStartButtonStartTransfusionPage();
		startTransfusionFunctions.clickCancelButtonPrintReportPage();
	}
	
	
	
	

}
