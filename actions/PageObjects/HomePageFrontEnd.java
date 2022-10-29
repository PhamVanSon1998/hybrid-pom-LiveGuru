package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUI.HomePageFrontEndUI;
import commons.AbstractPage;

public class HomePageFrontEnd extends AbstractPage {
	WebDriver driver;

	public HomePageFrontEnd(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToAccountMenu() {
		waitToElementClickable(driver, HomePageFrontEndUI.ACCOUNT_MENU);
		clickToElement(driver, HomePageFrontEndUI.ACCOUNT_MENU);

	}

	public void clickToRegisterLinkInAccountMenu() {
		waitToElementClickable(driver, HomePageFrontEndUI.REGISTER_LINK);
		clickToElement(driver, HomePageFrontEndUI.REGISTER_LINK);

	}

	public void inputToFirstNameTextbox(String firstName) {
		waitToElementVisible(driver, HomePageFrontEndUI.FIRSTNAME_TEXTBOX);
		senkeysToElement(driver, HomePageFrontEndUI.FIRSTNAME_TEXTBOX, firstName);

	}

	public void inputToMiddleNameTextbox(String middleName) {
		waitToElementVisible(driver, HomePageFrontEndUI.MIDDLENAME_TEXTBOX);
		senkeysToElement(driver, HomePageFrontEndUI.MIDDLENAME_TEXTBOX, middleName);
	}

	public void inputToLastNameTextbox(String lastName) {
		waitToElementVisible(driver, HomePageFrontEndUI.LASTNAME_TEXTBOX);
		senkeysToElement(driver, HomePageFrontEndUI.LASTNAME_TEXTBOX, lastName);
	}

	public void inputToEmailTextbox(String email) {
		waitToElementVisible(driver, HomePageFrontEndUI.EMAIL_TEXTBOX);
		senkeysToElement(driver, HomePageFrontEndUI.EMAIL_TEXTBOX, email);
	}

	public void inputToPasswordTextbox(String password) {
		waitToElementVisible(driver, HomePageFrontEndUI.PASSWORD_TEXTBOX);
		senkeysToElement(driver, HomePageFrontEndUI.PASSWORD_TEXTBOX, password);
	}

	public void inputToConfirmPasswordTextbox(String password) {

		waitToElementVisible(driver, HomePageFrontEndUI.CONFIRM_PASSWORD_TEXTBOX);
		senkeysToElement(driver, HomePageFrontEndUI.CONFIRM_PASSWORD_TEXTBOX, password);
	}
	
	public void checkToNewleterCheckbox() {
		waitToElementVisible(driver, HomePageFrontEndUI.NEWLSLETTER_CHECKBOX);
		checkToCheckBox(driver, HomePageFrontEndUI.NEWLSLETTER_CHECKBOX);
	}

	public void clickToregisterButton() {
		waitToElementClickable(driver, HomePageFrontEndUI.REGISTER_BUTTON);
		clickToElement(driver, HomePageFrontEndUI.REGISTER_BUTTON);

	}

	public String getMessageSuccess() {
		waitToElementVisible(driver, HomePageFrontEndUI.MESSAGE_SUCCESS);
		return getElementText(driver, HomePageFrontEndUI.MESSAGE_SUCCESS);
	}

	public MyAccountPageFrontEnd clickToMyAccountLink() {
		waitToElementClickable(driver, HomePageFrontEndUI.MYACOUNT_LINK);
		clickToElement(driver, HomePageFrontEndUI.MYACOUNT_LINK);
		return PageGeneratorManager.getLMyAccountPage(driver);
	}

	public void clickToLogoutLinkInAccountMenu() {
		waitToElementClickable(driver, HomePageFrontEndUI.LOGOUT_LINK);
		clickToElement(driver, HomePageFrontEndUI.LOGOUT_LINK);
	}

	public void clickToLoginLink() {
		waitToElementClickable(driver, HomePageFrontEndUI.LOGIN_LINK);
		clickToElement(driver, HomePageFrontEndUI.LOGIN_LINK);
	}

	public void clickToMobileLink() {
		waitToElementClickable(driver, HomePageFrontEndUI.MOBILE_LINK);
		clickToElement(driver, HomePageFrontEndUI.MOBILE_LINK);
		
	}

	public void clickToTVLink() {
		waitToElementClickable(driver, HomePageFrontEndUI.TV_LINK);
		clickToElement(driver, HomePageFrontEndUI.TV_LINK);
	}

	public void clickToAdvancedSearchLink() {
		waitToElementClickable(driver, HomePageFrontEndUI.ADVACED_SEARCH_LINK);
		clickToElement(driver, HomePageFrontEndUI.ADVACED_SEARCH_LINK);
		clickToElement(driver, HomePageFrontEndUI.ADVACED_SEARCH_LINK);
	}

	public void inputToPriceFromTextbox(String priceFromTextbox) {
		waitToElementVisible(driver, HomePageFrontEndUI.PRICE_FROM);
		senkeysToElement(driver, HomePageFrontEndUI.PRICE_FROM, priceFromTextbox);
	}

	public void InputToPriceToTextbox(String priceToTextbox) {
		waitToElementVisible(driver, HomePageFrontEndUI.PRICE_FROM);
		senkeysToElement(driver, HomePageFrontEndUI.PRICE_TO, priceToTextbox);
	}

	public void clickToSearchButton() {
		waitToElementClickable(driver, HomePageFrontEndUI.SEARCH_BUTTON);
		clickToElement(driver, HomePageFrontEndUI.SEARCH_BUTTON);
	}

	public int getPriceProductName(String productName) {
		waitToElementVisible(driver, HomePageFrontEndUI.PRICE_PRODUCT_WITH_NAME,productName);
		return Integer.parseInt(getElementText(driver, HomePageFrontEndUI.PRICE_PRODUCT_WITH_NAME, productName).replace("$", "").replace(".00", ""));
	}
}
