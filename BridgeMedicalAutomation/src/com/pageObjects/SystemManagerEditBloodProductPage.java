package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerEditBloodProductPage {
	@FindBy(id = "txtCode")
	public WebElement textboxCode;

	@FindBy(id = "txtValue")
	public WebElement textboxName;

	@FindBy(id = "txtDescription")
	public WebElement textboxDescription;

	@FindBy(id = "lstChart")
	public WebElement bloodProductSubstitutionChart;

	@FindBy(id = "lstExpiration")
	public WebElement expirationCheck;

	@FindBy(id = "ListCompareBloodTypes")
	public WebElement compareBloodType;

	@FindBy(id = "lstISBT128BloodProduct")
	public WebElement ISBT_128_BloodProduct;

	@FindBy(id = "lstDisplayBloodProductQuestion")
	public WebElement displayAdditionalBloodTypeMismatchQuestion;

	@FindBy(id = "lnkAttributes")
	public WebElement linkBloodProductAttributes;

	@FindBy(id = "dlItems__ctl2_cboxItem")
	public WebElement checkboxAntiCMVNegative;

	@FindBy(id = "dlItems__ctl3_cboxItem")
	public WebElement checkboxIrradiated;

	@FindBy(id = "dlItems__ctl4_cboxItem")
	public WebElement checkboxHbSNegative;

	@FindBy(id = "cmdOK")
	public WebElement buttonConfirm;

	@FindBy(id = "cmdCancel")
	public WebElement buttonCancel;
	
	@FindBy(id = "cmdOK")
	public WebElement linkBack;
}
