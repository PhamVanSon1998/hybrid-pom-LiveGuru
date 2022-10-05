package com.liveGuru.user;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import PageObjects.RegisterPage;
import commons.AbstractTest;

public class Front_End extends AbstractTest {
	WebDriver driver;
	HomePage homePage;
	RegisterPage registerPage;
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	String firstName, middleName, lastName, email, password;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void BeforeClass(String browserName, String urlname) {
		driver = getBrowserDriver(browserName, urlname);
		firstName = "Phan";
		middleName = "Thi";
		lastName = "Thuy";
		email = "Phanthuy" + getRandomNumber() + "@gmail.com";
		password = "28111998";

	}

	@Test
	public void TC_01_Register_Success_To_System() {
		log.info("Register Success Step-01: Click on 'Account' menu");
		homePage = PageObjects.PageGeneratorManager.getHomePage(driver);
		homePage.clickToAccountMenu();

		log.info("Register Success Step-02: Click to 'Register' link and navigate to Register Page");
		homePage.clickToRegisterLinkInAccountMenu();

		log.info("Register Success Step-03: Input to 'FirtName' textbox with value: " + firstName);
		homePage.inputToFirstNameTextbox(firstName);

		log.info("Register Success Step-04: Input to 'Middle Name' textbox value:" + middleName);
		homePage.inputToMiddleNameTextbox(middleName);

		log.info("Register Success Step-05: Input to 'LastName' textboxvalue: " + lastName);
		homePage.inputToLastNameTextbox(lastName);

		log.info("Register Success Step-06: Input to 'Email Address' textboxvalue: " + email);
		homePage.inputToEmailTextbox(email);

		log.info("Register Success Step-07: Input to 'Password' textbox value: " + password);
		homePage.inputToPasswordTextbox(password);

		log.info("Register Success Step-08: Input to 'Confirm password' textbox value: " + password);
		homePage.inputToConfirmPasswordTextbox(password);

		log.info("Register Success Step-08: Input to 'Confirm password' textbox value: " + password);
		homePage.checkToNewleterCheckbox();

		log.info("Register Success Step-09: Click ton 'Register' link");
		homePage.clickToregisterButton();

		log.info("Register Success Step-10: Verify Register Success with message 'Thank you for registering with Main Website Store.' displayed");
		verifyEquals(homePage.getMessageSuccess(), "Thank you for registering with Main Website Store.");
	}

	@Test
	public void TC_02_Verify_Infomation_Register() {
		log.info("Verify Infomation Register-Step 01: Click to 'My Account' link and navigate to My Account Page");
		homePage = PageObjects.PageGeneratorManager.getHomePage(driver);
		myAccountPage = homePage.clickToMyAccountLink();
		
		log.info("Verify Infomation Register-Step 02: Click to 'Acount Information' in My Account Page");
		myAccountPage.clickToAccountInformationInMyAccountPage();
		
		log.info("Verify Infomation Register-Step 03: Verify FirstName textbox displayed with value:" + firstName);
		verifyEquals(myAccountPage.getFirstNameTextboxValue(), firstName);
		
		log.info("Verify Infomation Register-Step 04: Verify Middlel tName textbox displayed with value:" + middleName);
		verifyEquals(myAccountPage.getMiddleNameTextboxValue(), middleName);
		
		log.info("Verify Infomation Register-Step 05: Verify LastName textbox displayed with value:" + lastName);
		verifyEquals(myAccountPage.getLastNameTextboxValue(), lastName);
		
		log.info("Verify Infomation Register-Step 06: Verify Email textbox displayed with value:" + email);
		verifyEquals(myAccountPage.getEmailTextboxValue(), email);
		

		log.info("Verify Infomation Register-Step 07: Click to 'Logout' link and navigate to Home Page");
		homePage = PageObjects.PageGeneratorManager.getHomePage(driver);
		homePage.clickToAccountMenu();
		homePage.clickToLogoutLinkInAccountMenu();
	}

	@AfterClass
	public void AfterClasss() {
//		closeBrowserAndDriver();
	}
}
