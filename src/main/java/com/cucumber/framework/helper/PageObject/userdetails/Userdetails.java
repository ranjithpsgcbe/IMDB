package com.cucumber.framework.helper.PageObject.userdetails;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Userdetails extends PageBase {

	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Userdetails.class);
	
	public Userdetails(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	

	
	@FindBy(how=How.CSS,using=".imdb-header__signin-text > .ipc-button__text")
	public WebElement signIn_Btn;
	
	@FindBy(how=How.LINK_TEXT,using="Create a New Account")
	public WebElement createNewAcc_btn;
	
	@FindBy(how=How.ID,using="ap_customer_name")
	public WebElement yourName_txt;
	
	@FindBy(how=How.ID,using="ap_email")
	public WebElement emailid_txt;
	
	@FindBy(how=How.ID,using="ap_password")
	public WebElement password_txt;
	
	@FindBy(how=How.ID,using="ap_password_check")
	public WebElement retryPassword_txt;
	
	@FindBy(how=How.ID,using="continue")
	public WebElement Create_btn;

	@FindBy(how=How.ID,using="signInSubmit")
	public WebElement Submit;

	@FindBy(how=How.XPATH,using="//span[contains(.,'Sign in with IMDb')]")
	public WebElement Sign_btn;

	@FindBy(how=How.CSS,using=".navbar__user-menu-toggle__name")
	public WebElement User_Menu_Toggle;

	@FindBy(how=How.LINK_TEXT,using="Sign out")
	public WebElement SignOut;



}
