package com.cucumber.framework.stepdefinition;

import com.cucumber.framework.helper.Generic.GenericHelper;
import com.cucumber.framework.helper.PageObject.userdetails.Userdetails;
import cucumber.api.java.en.And;
import org.testng.Assert;

import com.cucumber.framework.helper.PageObject.homepage.HomePage;
import com.cucumber.framework.settings.ObjectRepo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	private HomePage hPage;
	private Userdetails uPage;
	private GenericHelper Gen;


	@Given("^I am at the home page$")
	public void _i_am_at_the_home_page() throws Throwable {
		ObjectRepo.driver.get(ObjectRepo.reader.getWebsite());
		uPage = new Userdetails(ObjectRepo.driver);
		ObjectRepo.data.put("Userdetails", uPage);
		hPage = new HomePage(ObjectRepo.driver);
		ObjectRepo.data.put("HomePage", hPage);
		String cwd = System.getProperty("user.dir");
		System.out.println("Current working directory : " + cwd);
		Gen = new GenericHelper(ObjectRepo.driver);
		ObjectRepo.data.put("GenericHelper", Gen);
		Gen.takeScreenShot("first");
	}

	@When("^User click on the Menu Button$")
	public void User_click_on_the_Menu_Button() throws Throwable {
		hPage.waitForElement(hPage.menu_Btn,ObjectRepo.reader.getExplicitWait());
		hPage.menu_Btn.click();
		Gen.takeScreenShot("User_click_on_the_Menu_Button");


	}
	@Then("^User click on Top Rated movies$")
	public void User_click_on_Top_Rated_movies() throws Throwable {
		hPage.waitForElement(hPage.topRatedMovies,ObjectRepo.reader.getExplicitWait());
		hPage.topRatedMovies.click();
		Gen.takeScreenShot("User_click_on_Top_Rated_movies");


	}
	@And("^Verify the TV show Category$")
	public void Verify_the_TV_show_Category() throws Throwable {


	}
	@When("^User search for Game of Thrones$")
	public void User_search_for_Game_of_Thrones() throws Throwable {
		hPage.waitForElement(hPage.search_Btn,ObjectRepo.reader.getExplicitWait());
		hPage.search_Btn.sendKeys(ObjectRepo.reader.getSearchTitle());
		Gen.takeScreenShot("User_search_for_Game_of_Thrones");

	}

	@Then("^User select Game of Thrones The Last Watch from the suggestion window$")
	public void User_select_Game_of_Thrones_The_Last_Watch_from_the_suggestion_window() throws Throwable {
		hPage.waitForElement(hPage.select,ObjectRepo.reader.getExplicitWait());
		hPage.select.click();
		Gen.takeScreenShot("User_select_Game_of_Thrones_The_Last_Watch_from_the_suggestion_window");

	}

	@And("^Verify the Titile, Rating and Reviews$")
	public void Verify_the_Titile_Rating_and_Reviews() throws Throwable {
		String Rating = hPage.rating.getText();
		System.out.println("++++++++++++++"+Rating);

		Assert.assertEquals("7.2",Rating);

		String Reviews = hPage.reviews.getText();
		System.out.println("++++++++++++++"+Reviews);

		Assert.assertEquals("5337",Reviews.replaceAll(",",""));

	}

	@When("^User click on the SignIn Button$")
	public void User_click_on_the_SignIn_Button() throws Throwable {
		uPage.waitForElement(uPage.signIn_Btn,ObjectRepo.reader.getExplicitWait());
		uPage.signIn_Btn.click();
		Gen.takeScreenShot("User_click_on_the_SignIn_Button");

	}

	@Then("^User click on the Create New Account Button$")
	public void User_click_on_the_Create_New_Account_Button() throws Throwable {
		uPage.waitForElement(uPage.createNewAcc_btn,ObjectRepo.reader.getExplicitWait());
		uPage.createNewAcc_btn.click();
		Gen.takeScreenShot("User_click_on_the_Create_New_Account_Button");

	}
	@Then("^User enter Your Name$")
	public void User_enter_Your_Name() throws Throwable {
		uPage.waitForElement(uPage.yourName_txt,ObjectRepo.reader.getExplicitWait());
		uPage.yourName_txt.sendKeys(ObjectRepo.reader.getName());

	}

	@Then("^User enter EmailID$")
	public void User_enter_EmailID() throws Throwable {

		uPage.emailid_txt.sendKeys(ObjectRepo.reader.getEmailId());


	}
	@Then("^User enter Password and ReTry Password$")
	public void User_enter_Password_and_ReTry_Password() throws Throwable {

		uPage.password_txt.sendKeys(ObjectRepo.reader.getPassword());

		uPage.retryPassword_txt.sendKeys(ObjectRepo.reader.getRetryPassword());


	}

	@And("^User click on the Create your IMDB Account Button$")
	public void User_click_on_the_Create_your_IMDB_Account_Button() throws Throwable {
		uPage.waitForElement(uPage.Create_btn,ObjectRepo.reader.getExplicitWait());
		uPage.Create_btn.click();
		Gen.takeScreenShot("User_click_on_the_Continue_Button");

	}

	@And("^User click on the Signout Button$")
	public void User_click_on_the_Signout_Button() throws Throwable {
		uPage.waitForElement(uPage.User_Menu_Toggle,ObjectRepo.reader.getExplicitWait());
		uPage.User_Menu_Toggle.click();
		Gen.takeScreenShot("User_click_on_the_User_Menu_Toggle");
		uPage.waitForElement(uPage.SignOut,ObjectRepo.reader.getExplicitWait());
		uPage.SignOut.click();
		Gen.takeScreenShot("User_click_on_the_Signout_Button");

	}

	@And("^Verify User able to Login$")
	public void Verify_User_able_to_Login() throws Throwable {
		uPage.waitForElement(uPage.signIn_Btn,ObjectRepo.reader.getExplicitWait());
		uPage.signIn_Btn.click();
		Gen.takeScreenShot("User_click_on_the_Sign_Button");
		uPage.waitForElement(uPage.Sign_btn,ObjectRepo.reader.getExplicitWait());
		uPage.Sign_btn.click();
		uPage.waitForElement(uPage.emailid_txt,ObjectRepo.reader.getExplicitWait());
		uPage.emailid_txt.sendKeys(ObjectRepo.reader.getEmailId());
		uPage.password_txt.sendKeys(ObjectRepo.reader.getPassword());
		uPage.Submit.click();
		Gen.takeScreenShot("User_click_on_the_Submit_Button");
		System.out.println("++++++++++++++++++++++++"+Gen.getTitle());
		Assert.assertEquals(Gen.getTitle(),ObjectRepo.reader.getImdbTitle());
		System.out.println("++++++++++++++++++++++++"+Gen.getTitle());


}}
