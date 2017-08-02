package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerEditPocPage
{
	@FindBy (id = "lstSecondaryIndentifier") 				public WebElement utilizeSecondaryIdentifier;
	@FindBy (id = "txtSecondaryIdName") 					public WebElement secondaryIdName;
	@FindBy (id = "txtSecondaryIdFormat") 					public WebElement secondaryIdFormat;
	@FindBy (id = "lstNoTxWristbandSecIdCheck") 			public WebElement turnOffSecondaryIdCheckForTxWristband;
	@FindBy (id = "lstRequireScanReceive") 					public WebElement requireScanInRecieveBtl;
	@FindBy (id = "ListRequireScanEndTx") 					public WebElement requireScanningInEndTransfusion;
	@FindBy (id = "ListCenterCodes") 						public WebElement checkCenterCode;
	@FindBy (id = "ListPatientNameForTransfusions") 		public WebElement checkPatientName;
	@FindBy (id = "ListStartComments") 						public WebElement checkDisplayCommentsInStartTransfusion;
	@FindBy (id = "ListTransfusionCosignRequired") 			public WebElement requireCosignature;
	@FindBy (id = "ListRequireCosign") 						public WebElement requireCosignOnBloodTypeMismatch;
	@FindBy (id = "ListRapidStartComments") 				public WebElement displayCommentsInRapidStartTransfusion;
	@FindBy (id = "ListUnitNumerDivision") 					public WebElement promptForUnitNumberDivisionField;
	@FindBy (id = "ListPromptTransVolume") 					public WebElement promptForVolume;
	@FindBy (id = "lnkPreChecks") 							public WebElement linkModifyChecksTransfusionSettings;
	@FindBy (id = "dlItems__ctl2_cboxItem") 				public WebElement checkboxCheckTheOriginalTransfusionOrder;
	@FindBy (id = "cmdOK") 									public WebElement saveModifyChecksTransfusionSettings;
	@FindBy (id = "ListCollOnBegin") 						public WebElement collectVitalSignsOnStartTransfusion;
	@FindBy (id = "ListCollOnEnd") 							public WebElement collectVitalSignsOnEndTransfusion;
	@FindBy (id = "ListDisplayHeartRateSite") 				public WebElement displayHeartRateSite;
	@FindBy (id = "ListDisplayBloodPressureMethod") 		public WebElement displayBloodPressureMethod;
	@FindBy (id = "ListAcceptAltTempUnits") 				public WebElement displayBothCelsiusAndFahrenheitFieldsForTemperature;
	@FindBy (id = "cmdOKUp") 								public WebElement buttonConfirm;
	@FindBy (id = "btnCancelUp") 							public WebElement buttonCancel;
	@FindBy (id = "ListRequireCosignAdministerBottles")		public WebElement dropDwn_RequireCosignInAdministerBottles;
	
}

