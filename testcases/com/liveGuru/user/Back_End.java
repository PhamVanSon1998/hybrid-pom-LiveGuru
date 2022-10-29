package com.liveGuru.user;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.HomePageBackEnd;
import PageObjects.HomePageFrontEnd;
import PageObjects.PageGeneratorManager;
import commons.AbstractTest;

public class Back_End extends AbstractTest{
	WebDriver driver;
	HomePageBackEnd homePageBackEnd;
	HomePageFrontEnd homePage;
	String firstName, middleName, lastName, email, password;
	String userName,passwordBackEnd;
	@Parameters({ "browser", "url" })
	@BeforeClass
	public void BeforeClass(String browserName, String urlname) {
		driver = getBrowserDriver(browserName, urlname);
		userName = "user01";
		passwordBackEnd = "guru99com";
		firstName = "Phan";
		middleName = "Thi";
		lastName = "Thuy";
		email = "Phanthuy" + getRandomNumber() + "@gmail.com";
		password = "28111998";
	}
	
	@Test
	public void TC_01_Create_New_Account_Front_End_And_Login_BackEnd() {
		log.info("Create New Account in FrontEnd and Login in BackEnd Step-01: Click on 'Account' menu");
		homePage = PageObjects.PageGeneratorManager.getHomePage(driver);
		homePage.clickToAccountMenu();

		log.info("Create New Account in FrontEnd and Login in BackEnd Step-02: Click to 'Register' link and navigate to Register Page");
		homePage.clickToRegisterLinkInAccountMenu();

		log.info("Create New Account in FrontEnd and Login in BackEnd Step-03: Input to 'FirtName' textbox with value: " + firstName);
		homePage.inputToFirstNameTextbox(firstName);

		log.info("Create New Account in FrontEnd and Login in BackEnd Step-04: Input to 'Middle Name' textbox value:" + middleName);
		homePage.inputToMiddleNameTextbox(middleName);

		log.info("Create New Account in FrontEnd and Login in BackEnd Step-05: Input to 'LastName' textboxvalue: " + lastName);
		homePage.inputToLastNameTextbox(lastName);

		log.info("Create New Account in FrontEnd and Login in BackEnd Step-06: Input to 'Email Address' textboxvalue: " + email);
		homePage.inputToEmailTextbox(email);

		log.info("Create New Account in FrontEnd and Login in BackEnd Step-07: Input to 'Password' textbox value: " + password);
		homePage.inputToPasswordTextbox(password);

		log.info("Create New Account in FrontEnd and Login in BackEnd Step-08: Input to 'Confirm password' textbox value: " + password);
		homePage.inputToConfirmPasswordTextbox(password);

		log.info("Create New Account in FrontEnd and Login in BackEnd Step-08: Input to 'Confirm password' textbox value: " + password);
		homePage.checkToNewleterCheckbox();

		log.info("Create New Account in FrontEnd and Login in BackEnd Step-09: Click ton 'Register' link");
		homePage.clickToregisterButton();

		log.info("Create New Account in FrontEnd and Login in BackEnd Step-10: Verify Register Success with message 'Thank you for registering with Main Website Store.' displayed");
		verifyEquals(homePage.getMessageSuccess(), "Thank you for registering with Main Website Store.");
		
		log.info("Create New Account in FrontEnd and Login in BackEnd Step 11: Navigate to Liveguru adminPage");
		homePageBackEnd = PageGeneratorManager.getHomePageBackEnd(driver);
		homePageBackEnd.getLiveguruAdminPage();
		
		log.info("Create New Account in FrontEnd and Login in BackEnd Step 11: Input to userName BackEnd textbox with value 'user01'");
		homePageBackEnd.inputToUserNameBackEndTextbox(userName);
		
		log.info("Create New Account in FrontEnd and Login in BackEnd Step 11: Input to password Backend textbox with value 'guru99com'");
		homePageBackEnd.inputToPasswordBackEndTextbox(passwordBackEnd);
		
		log.info("Create New Account in FrontEnd and Login in BackEnd Step 11: Click Login button");
		homePageBackEnd.clickToLoginButton();
	}
	
	
}
