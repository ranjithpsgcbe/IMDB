package com.cucumber.framework.helper.PageObject.homepage;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends PageBase {
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(HomePage.class);

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	/** Web Elements */
	
	@FindBy(how=How.XPATH,using="//label[@id='imdbHeader-navDrawerOpen--desktop']/div")
	public WebElement menu_Btn;
	
	@FindBy(how=How.LINK_TEXT,using="Top Rated Movies")
	public WebElement topRatedMovies;
	
	@FindBy(how=How.ID,using="suggestion-search")
	public WebElement search_Btn;
	
	@FindBy(how=How.XPATH,using="//li[@id='react-autowhatever-1--item-0']/a/div[2]/div[2]")
	public WebElement select;

	@FindBy(how=How.XPATH,using="//div[@id='title-overview-widget']/div/div[2]/div/div/div/div/strong/span")
	public WebElement rating;

	@FindBy(how=How.XPATH,using="//div[@id='title-overview-widget']/div/div[2]/div/div/div/a/span")
	public WebElement reviews;


}
