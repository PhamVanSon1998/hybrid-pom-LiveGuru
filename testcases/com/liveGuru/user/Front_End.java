package com.liveGuru.user;

import org.checkerframework.checker.units.qual.mol;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MobilePage;
import PageObjects.MyAccountPage;
import PageObjects.MyDashboardPage;
import PageObjects.PageGeneratorManager;
import PageObjects.RegisterPage;
import commons.AbstractTest;

public class Front_End extends AbstractTest {
	WebDriver driver;
	HomePage homePage;
	RegisterPage registerPage;
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	MyDashboardPage myDashboardPage;
	MobilePage mobilePage;
	String firstName, middleName, lastName, email, password;
	String mobileName,mobileNameCost;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void BeforeClass(String browserName, String urlname) {
		driver = getBrowserDriver(browserName, urlname);
		firstName = "Phan";
		middleName = "Thi";
		lastName = "Thuy";
		email = "Phanthuy" + getRandomNumber() + "@gmail.com";
		password = "28111998";
		mobileName = "Sony Xperia";

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

	@Test
	public void TC_03_Login_Sucess() {
		log.info("Login Success-Step 01: Click to Login link and navigate to Login Page");
		homePage.clickToAccountMenu();
		homePage.clickToLoginLink();
		
		log.info("Login Success-Step 02: Input to Email textbox with value:"+ email);
		loginPage = PageGeneratorManager.getLoginPage(driver);
		loginPage.inputToEmailTextbox(email);
		
		log.info("Login Success-Step 03: Input to Password textbox with value: "+password);
		loginPage.inputToPasswordTextbox(password);
		
		log.info("Login Success-Step 04: Click to Login button and navigate to My Dashboard Page");
		loginPage.clickToLoginButton();
		myDashboardPage =PageGeneratorManager.getLMyDashboardPage(driver);
		
		log.info("Login Success-Step 05: Verify Login Success with text value 'Hello, Phan Thi Thuy!");
		verifyEquals(myDashboardPage.getHelloText(), "Hello, "+firstName+" "+middleName+" "+lastName+"!");
		
		log.info("Login Success-Step 06: Verify 'My Dashboard' is displayed");
		verifyEquals(myDashboardPage.getPageTitle(),"MY DASHBOARD");
	}
	
	@Test
	public void TC_04_Verify_Cost() {
		log.info("Verify cost-Step 01: Click To Mobile link and navigate to Mobile Page");
		homePage = PageGeneratorManager.getHomePage(driver);
		homePage.clickToMobileLink();
		mobilePage = PageGeneratorManager.getLMobilePage(driver);
		
		log.info("Verify cost-Step 02:Get cost Sony Experia");
		mobileNameCost = mobilePage.getCostMobileName(mobileName);
		
		log.info("Verify cost-Step 03: Click To Sony Experia detail");
		mobilePage.clickTogMobileName(mobileName);
		
		log.info("Verify cost-Step 04: Get cost Sony Experia in Sony Experia detail");
		verifyEquals(mobilePage.getCostMobileNameInMobileNameDetail(mobileName), mobileNameCost);
	}
	
	@Test
	public void TC_05_Verify_Discount_Coupon() {
		log.info("Verify Discount Coupon-Step 01: Click To Mobile link and navigate to Mobile Page");
		homePage = PageGeneratorManager.getHomePage(driver);
		homePage.clickToMobileLink();
		mobilePage = PageGeneratorManager.getLMobilePage(driver);
		
		log.info("Verify Discount Coupon-Step 02: Click Add To Cart Sony Experia");
		mobilePage.clickAddToCartMobileName(mobileName);
		
		log.info("Verify Discount Coupon-Step 02: Veify Massage 'Sony Xperia was added to your shopping cart.' displayed");
		verifyEquals(mobilePage.getTextAddToCartMobileNameSuccess("Sony Xperia"), mobileName + " was added to your shopping cart.");
		
		log.info("Verify Discount Coupon-Step 03: Input To Discount code Textbox with value 'GURU50'");
		mobilePage.inputToDiscountCodeTextbox("GURU50");
		
		log.info("Verify Discount Coupon-Step 04: Click Apply link");
		mobilePage.clickToApplyLink();
		
		log.info("Verify Discount Coupon-Step 05: Verify the discout generate");
		verifyEquals(Integer.parseInt(mobilePage.getDiscountGenerate().replace("-$", "").replace(".00", ""))*20,Integer.parseInt( mobileNameCost.replace("$", "").replace(".00", "")));
	}
	
	@Test
	public void TC_06_Verify_Not_Add_More_500_Item() {
		log.info("Verify not Add more 500 Item-Step 01: Input to Qty textbox With value: 501");
		mobilePage.inPutToQtyTextbox("501");
		
		log.info("Verify not Add more 500 Item-Step 01: Click to Update button");
		mobilePage.clickToUpdateButton();
		
		log.info("Verify not Add more 500 Item-Step 01: verify Error message Display with value 'Some of the products cannot be ordered in requested quantity.'");
		verifyEquals(mobilePage.getMessageUpdateText(), "Some of the products cannot be ordered in requested quantity.");
		
		log.info("Verify not Add more 500 Item-Step 01: Click Empty cart link");
		mobilePage.clickToEmptyLink();
		
		log.info("Verify not Add more 500 Item-Step 01: Verify cart is empty");
		verifyTrue(mobilePage.verifyShoppingCartEmpty());
	}
	@AfterClass
	public void AfterClasss() {
		closeBrowserAndDriver();
	}
}
