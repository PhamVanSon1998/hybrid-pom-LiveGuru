package com.liveGuru.user;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.HomePageFrontEnd;
import PageObjects.LoginPageFrontEnd;
import PageObjects.MobilePageFrontEnd;
import PageObjects.MyAccountPageFrontEnd;
import PageObjects.MyDashboardPageFrontEnd;
import PageObjects.PageGeneratorManager;
import PageObjects.RegisterPageFrontEnd;
import PageObjects.TVPageFrontEnd;
import commons.AbstractTest;

public class Front_End extends AbstractTest {
	WebDriver driver;
	HomePageFrontEnd homePage;
	RegisterPageFrontEnd registerPage;
	LoginPageFrontEnd loginPage;
	MyAccountPageFrontEnd myAccountPage;
	MyDashboardPageFrontEnd myDashboardPage;
	MobilePageFrontEnd mobilePage;
	TVPageFrontEnd tvPage;
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
		mobilePage.clickAddToCartMobileName();
		
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
	
	@Test
	public void TC_07_Verify_Able_Compare_Two_Products() {
		log.info("Verify able Compare Two Products-Step 01: Click moblie menu");
		homePage = PageGeneratorManager.getHomePage(driver);
		homePage.clickToMobileLink();
		mobilePage = PageGeneratorManager.getLMobilePage(driver);
		
		log.info("Verify able Compare Two Products-Step 02: Click Add to compare with product Sony Experia");
		mobilePage.clickAddToCartSonyXperia();
		
		log.info("Verify able Compare Two Products-Step 03: Verify Add to compare with product Sony Experia Success");
		verifyEquals(mobilePage.getMessageAddToCompareMobileNameSuccess(), "The product Sony Xperia has been added to comparison list.");
		
		log.info("Verify able Compare Two Products-Step 04: Click Add to compare with product Iphone");
		mobilePage.clickAddToCartIphone();
		
		log.info("Verify able Compare Two Products-Step 05: Verify Add to compare with product Iphone Success");
		verifyEquals(mobilePage.getMessageAddToCompareMobileNameSuccess(), "The product IPhone has been added to comparison list.");
		
		log.info("Verify able Compare Two Products-Step 06: Click Compare button and open popup");
		String parentId = driver.getWindowHandle();
		mobilePage.clickCompareButton();
		
		log.info("Verify able Compare Two Products-Step 07: Click moblie menu");
		verifyTrue(mobilePage.verifyPopupDisplayed(parentId));
		
		log.info("Verify able Compare Two Products-Step 08: Verify Mobile Name Add To Compare Display");
		verifyTrue(mobilePage.isMobileNameAddToCompareDisplay("Sony Xperia"));
		verifyTrue(mobilePage.isMobileNameAddToCompareDisplay("IPhone"));
		
		log.info("Verify able Compare Two Products-Step 09: Close Popup Windows");
		mobilePage.closeAllWindowWithoutWindowParent(driver, parentId);
		
		log.info("Verify able Compare Two Products-Step 10: Verify popup Window is closed");
		verifyTrue(mobilePage.verifyPopupUnDisplayed());
	}
	
	@Test
	public void TC_08_Verify_Share_Wishlist_Other_People() {
		log.info("Verify Share Wishlist Other People-Step 01: Click To TV link");
		homePage = PageGeneratorManager.getHomePage(driver);
		homePage.clickToTVLink();
		tvPage = PageGeneratorManager.getTVPage(driver);
		
		log.info("Verify Share Wishlist Other People-Step 02:Add LG LCD To Wishlist");
		tvPage.clickToAddTVNameToWishlist();
		
		log.info("Verify Share Wishlist Other People-Step 03:Verify Message Add To Wishlist Success");
		verifyTrue(tvPage.getMessageAddToWishlistSuccess().contains("LG LCD has been added to your wishlist. Click"));
		
		log.info("Verify Share Wishlist Other People-Step 04: Click Share Wishlist Button");
		tvPage.clickToShareWishlistButton();
		
		log.info("Verify Share Wishlist Other People-Step 05: Input Email To Share Wishlist");
		tvPage.inputToEmailTextArea("PhamSon@gmail.com");
		
		log.info("Verify Share Wishlist Other People-Step 06: Input Message to Share Wishlist");
		tvPage.inputToMessageTextArrea("Because I like");
		
		log.info("Verify Share Wishlist Other People-Step 06: Click Share Wishlist Button in Share Your Wishlist Page");
		tvPage.clickShareButtonInShareYourWishlistPage();
		
		log.info("Verify Share Wishlist Other People-Step 06: Verify Message Share Wishlist Success");
		verifyEquals(tvPage.getMessageShareWishlistSuccess(), "Your Wishlist has been shared.");
		
		log.info("Verify Share Wishlist Other People-Step 06: Verify My Wishlist page have 1 item");
		verifyTrue(tvPage.isTVAddShareWishlishInMyWishlistDisplayed());
		
		log.info("Verify Share Wishlist Other People-Step 06: Verify My Wishlist page have 1 item");
		verifyEquals(tvPage.isQtyTVAddShareWishlishInMyWishlist(),"1");
	}
	
	@Test
	public void TC_09_Verify_Add_Your_Review() {
		log.info("Verify Add Your Rview-Step 01: Click to TV link");
		homePage = PageGeneratorManager.getHomePage(driver);
		homePage.clickToTVLink();
		tvPage = PageGeneratorManager.getTVPage(driver);
		
		log.info("Verify Add Your Rview-Step 02: Click to 'SAMSUNG LCD'");
		tvPage.clickToSamsungLCDLink();
		
		log.info("Verify Add Your Rview-Step 03: Click to 'Add to Review' link");
		tvPage.clickToAddToReviewLink();
		
		log.info("Verify Add Your Rview-Step 04: Click to 'Submit Review' button");
		tvPage.clickToSubmitReview();
		
		log.info("Verify Add Your Rview-Step 05: Verify message 'This is a required field.' displayed in thoughts field");
		verifyEquals(tvPage.getMessageInFieldName("review").toLowerCase(), "this is a required field.");
		
		log.info("Verify Add Your Rview-Step 06: Verify message 'This is a required field.' displayed in review field ");
		verifyEquals(tvPage.getMessageInFieldName("summary").toLowerCase(), "this is a required field.");
		
//		log.info("Verify Add Your Rview-Step 07: Verify message 'This is a required field.' displayed in nickname filed");
//		verifyEquals(tvPage.getMessageInFieldName("nickname").toLowerCase(), "this is a required field.");
		
		log.info("Verify Add Your Rview-Step 08: Select quality radio button");
		tvPage.selectToQuality2Star();
		
		log.info("Verify Add Your Rview-Step 09: Input to 'Thoughts' textarea");
		tvPage.inputToThoughtsTextarea("so bad");
	
		log.info("Verify Add Your Rview-Step 10: Input to 'Your Review' textbox");
		tvPage.inputToSummaryTextbox("not good");
		
		log.info("Verify Add Your Rview-Step 11: Input to 'Your NickName' textbox");
		tvPage.inputToNickNameTextbox("senda");
		
		log.info("Verify Add Your Rview-Step 12: Click to 'Submit Review' button");
		tvPage.clickToSubmitReview();
		
		log.info("Verify Add Your Rview-Step 13:Verify mssage'Your review has been accepted for moderation.' displayed");
		verifyEquals(tvPage.getMessageAddToReviewSuccess(), "Your review has been accepted for moderation.");
		
	}
	
	@Test
	public void TC_10_Verify_Purchase_Product() {
		log.info("Verify purchase Product-Step 01: Click Go to Wishlist link" );
		tvPage.clickToGotoWishlistLink();
		
		log.info("Verify purchase Product-Step 02: Click Add to cart link ");
		tvPage.clickAddToCartLink();
		
		log.info("Verify purchase Product-Step 03: Select Shipping country dropdown with value: ''");
		tvPage.selectCountryDropdown("Uganda");
		
		log.info("Verify purchase Product-Step 04: Input state/province textbox");
		tvPage.inputStateTextbox("New York");
		
		log.info("Verify purchase Product-Step 04: Input zip textbox");
		tvPage.inputToZiptextbox("543432");
		
		log.info("Verify purchase Product-Step 05:Click ESTIMATE link ");
		tvPage.clickToEstimatelink();
		
		log.info("Verify purchase Product-Step 05:Click ESTIMATE link ");
		tvPage.clickToProcessToCheckoutButton();
		
		log.info("Verify purchase Product-Step 06:Verify flat displayed ");
		tvPage.verifyFlatDisplayed("");
		
		log.info("Verify purchase Product-Step 07:Input Company name textbox ");
		tvPage.inputTocompanyTextbox("Samsung");
		
		log.info("Verify purchase Product-Step 08:Input Address textbox ");
		tvPage.inputToAddressTextbox("123 New York USA");
		
		log.info("Verify purchase Product-Step 09:Input Street Address 2 textbox ");
		tvPage.inputToStreetAddressTextbox("12 Hung Vuong");
		
		log.info("Verify purchase Product-Step 10:Input City textbox ");
		tvPage.inputToCityTextbox("Ha Noi");
		
		log.info("Verify purchase Product-Step 11:Select state/province dropdown ");
		tvPage.selectStateDropdowninBilling("New York");
		
		log.info("Verify purchase Product-Step 12:Input zip textbox ");
		tvPage.inputToZiptextboxInBilling("543432");
		
		log.info("Verify purchase Product-Step 13:Select country dropdown ");
		tvPage.selectCountryDropdowninBilling("United States");
		
		log.info("Verify purchase Product-Step 14:Input to telephone textbox ");
		tvPage.inputToTelephonetexbox("012345678");
		
		log.info("Verify purchase Product-Step 15:Input fax textbox ");
		tvPage.inputToFaxTextbox("1234");
		
		log.info("Verify purchase Product-Step 16:Click continue button in billing");
		tvPage.clickToContinueButtonBilling();
		
		log.info("Verify purchase Product-Step 17:Click continue button in Shipping Method");
		tvPage.clickToContinueButtonShippingMethod();
		
		log.info("Verify purchase Product-Step 18:Select Check/Money Order radio button ");
		tvPage.checkToMoneyOrderRadioButton();
		
		log.info("Verify purchase Product-Step 19:Click continue button in payment");
		tvPage.clickToContinueButtonInPayment();
		
		log.info("Verify purchase Product-Step 20:Click Place order button ");
		tvPage.clickToPlaceOrderButton();
		
		log.info("Verify purchase Product-Step 21:Verify Order generated ");
	
	}
	
	@Test
	public void TC_11_Search_Functionality() {
		log.info("Search functionality-Step 01: Click advanced search link");
		homePage = PageGeneratorManager.getHomePage(driver);
		homePage.clickToAdvancedSearchLink();
		
		log.info("Search functionality-Step 02: Input Price from textbox with value 0");
		homePage.inputToPriceFromTextbox("0");
		
		log.info("Search functionality-Step 03: Input Price to textbox with value 150");
		homePage.InputToPriceToTextbox("150");
		
		log.info("Search functionality-Step 04: ClickToSearchButton");
		homePage.clickToSearchButton();
		
		log.info("Search functionality-Step 05: Verify price Product display < 150 and >0");
		verifyTrue(homePage.getPriceProductName("Sony Xperia")<150);
		verifyTrue(homePage.getPriceProductName("Sony Xperia")>0);
		
		log.info("Search functionality-Step 06: Click advanced search link");
		homePage.clickToAdvancedSearchLink();
		
		log.info("Search functionality-Step 07: Input Price from textbox with value 151");
		homePage.inputToPriceFromTextbox("151");
		
		log.info("Search functionality-Step 08: Input Price to textbox with value 1000");
		homePage.InputToPriceToTextbox("1000");
		
		log.info("Search functionality-Step 09: ClickToSearchButton");
		homePage.clickToSearchButton();
		
		log.info("Search functionality-Step 10: Verify price Product display < 1000 and >151");
		verifyTrue(homePage.getPriceProductName("LG LCD")>150);
		verifyTrue(homePage.getPriceProductName("LG LCD")<1000);
	}
	@AfterClass
	public void AfterClasss() {
		closeBrowserAndDriver();
	}
}
