package com.bridge.utilities;

import static org.testng.AssertJUnit.assertFalse;
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
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageObject.Functions.SystemManagerUsersPageFunctions;
import com.pageObjects.CapribedsideLoginPage;
import com.pageObjects.CapribedsidePatientMainPage;
import com.pageObjects.CapribedsideReceiveBottlesPage;
import com.pageObjects.CapribedsideSelectPatientPage;
import com.pageObjects.SystemManagerMainPage;
import com.pageObjects.SystemManagerUsersPage;



public class CommonFunctions extends IEDriver 
{

    String username="superuser";
    String password="123";
	IEDriver iedriver = new IEDriver();
	CapribedsideLoginPage login;
	CapribedsideSelectPatientPage select_page;
	CapribedsideReceiveBottlesPage rece_page;
	SystemManagerMainPage sysMain = new SystemManagerMainPage();
	private static ScreenRecorder screenRecorder;
	
	
	public void call_Driver(String URL) throws InterruptedException
	{
		iedriver.callDriver(URL);
	}
	
	public WebDriver getCurrentDriver() throws InterruptedException
	{
		
		return iedriver.getCurrentdriver();
		
	}
	
	/*
	public void login_default(String URL) throws InterruptedException
	{		
		iedriver.callDriver(URL);
		login = PageFactory.initElements(IEDriver.driver, CapribedsideLoginPage.class ); 
		login.txt_box_username().sendKeys("superuser");
	    login.txt_box_password().clear();
	    login.txt_box_password().sendKeys("123");
	   	Thread.sleep(2000);
        login.button_login().click();
     }
	*/
	
	public void login(String URL, String username, String password) throws InterruptedException
	{
		iedriver.callDriver(URL);
		login = PageFactory.initElements(IEDriver.driver, CapribedsideLoginPage.class ); 	
	    login.txt_box_username().sendKeys(username);
	    login.txt_box_password().clear();
	    login.txt_box_password().sendKeys(password);
	    Thread.sleep(2000);
        login.button_login().click();
      	Thread.sleep(1000);
	}
	
	public void scanpatientid(String a) throws InterruptedException
	{
		
		select_page = PageFactory.initElements(IEDriver.driver, CapribedsideSelectPatientPage.class );
		Actions actions= new Actions(driver);
		actions.keyDown(Keys.ALT).perform();
		select_page.txt_box_patientid().sendKeys("[");
		select_page.txt_box_patientid().sendKeys(a);
		actions.keyDown(Keys.ALT).perform();
		select_page.txt_box_patientid().sendKeys("]");
		Thread.sleep(1000);
	}
	
	public void logout() throws InterruptedException
	{
		sysMain.linkLogout().click();
	
	}
	
	public void forceLogout() throws InterruptedException
	{
		sysMain.linkLogout().click();
		
	}
	
	public void receive_bottle() throws InterruptedException
	{
		//Edited-Sayyad
		String URL="http://10.162.106.174/TransSpec2016010410/capribedside/login.aspx";
		iedriver.callDriver(URL);
		rece_page=PageFactory.initElements(IEDriver.driver, CapribedsideReceiveBottlesPage.class );
		
	}
	
    public String uniqueNumber(int a)
		{
			
			SimpleDateFormat date1 = new SimpleDateFormat("yyyyddMMHHmm");//("MM/dd/yyyy HH:mm");	    
		    Calendar cal = Calendar.getInstance();
		    cal.add(Calendar.DATE, a);	  //-1  		
			String date = date1.format(cal.getTime());				
			return date;
		}
    
     public String donorUniqueNumber3()
       {			
				SimpleDateFormat date1 = new SimpleDateFormat("yyMMddHHmm");//("MM/dd/yyyy HH:mm");	    
			    Calendar cal = Calendar.getInstance();
			    cal.add(Calendar.DATE,-2);	    		
				String date = date1.format(cal.getTime());				
				return date;
       	}
     
    public String isbtSupportNumber()
          {
				
				SimpleDateFormat date1 = new SimpleDateFormat("yyMMddss");//("MM/dd/yyyy HH:mm");	    
			    Calendar cal = Calendar.getInstance();
			    cal.add(Calendar.DATE,0);	    		
				String date = date1.format(cal.getTime());				
				return date;
			}
    
      public String currentDate(String dateFormat, int number)
			{
				SimpleDateFormat date1 = new SimpleDateFormat(dateFormat);	    //"MM/dd/yyyy HH:mm"
			    Calendar cal = Calendar.getInstance();
			    cal.add(Calendar.DATE, number);	 //0   		
				String date = date1.format(cal.getTime());				
				return date;
				
			}
      @SuppressWarnings("static-access")	
	  public void waitForElement(String Locator)
	 {
    	  WebDriverWait wait = new WebDriverWait(iedriver.driver, 10000);
    	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Locator)));
	  }
	  
	 
	  @SuppressWarnings("static-access")
	public void startScreenRecord() throws IOException, AWTException
	  {
		    GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
	    	this.screenRecorder = new ScreenRecorder(gc,
	    	new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
	    	new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	    	CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, 24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f,KeyFrameIntervalKey, 15 * 60),new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),null);
	    	this.screenRecorder.start();
	  }
	  
	  @SuppressWarnings("static-access")
	public void stopScreenRecord() throws IOException
	  {
		  this.screenRecorder.stop();
	  }
	  
	
		 
	public void createUser(String sysManURL, String fName, String lName, String userid, String password, String role, String initial, String alias) throws InterruptedException
	 {
			 SystemManagerMainPage sysmanMenuPage = new SystemManagerMainPage();
			 SystemManagerUsersPage userPage = new SystemManagerUsersPage();
			 SystemManagerUsersPageFunctions userpagefunctions = new SystemManagerUsersPageFunctions();
			 login(sysManURL,"superuser","123");
			 Thread.sleep(2000); 
			 sysmanMenuPage.button_Users().click();
			 Thread.sleep(2000); 
			 userPage.linkCreateUser().click(); 
			 Thread.sleep(2000); 
			 userPage.createUserFName().sendKeys(fName); 
			 userPage.createUserLName().sendKeys(lName);  
			 userPage.createUserUserId().sendKeys(userid); 
			 userPage.createUserInitials().sendKeys(initial); 
			 userPage.createUsertxtAlias().sendKeys(alias); 
			 userPage.createUserPassword().sendKeys(password); 
			 userPage.createUserConfirmPassword().sendKeys(password); 
			 userpagefunctions.selectCreateUserRole(role);
			 userpagefunctions.selectBabyMatchRecipient("yes");
			 Thread.sleep(1000);
			 userPage.btnConfirm().click();
			 Thread.sleep(1000);
			 userPage.createUserFacility_Default().click();
			 Thread.sleep(1000);
			 
			 driver=iedriver.getCurrentdriver();
			 String url= driver.getCurrentUrl();
			 
			 userPage.btnConfirm().click();
			 Thread.sleep(2000);
			 
			 driver=iedriver.getCurrentdriver();
			 String url2= driver.getCurrentUrl();
			 
			 assertFalse("\n\n cannot create new user "+userid+"\n\n", url.equals(url2));
			 sysmanMenuPage.linkLogout().click();
			 close();
	}
		 
	  
}
		  
	  		
			



