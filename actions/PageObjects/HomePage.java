package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUI.HomePageUI;
import commons.AbstractPage;

public class HomePage extends AbstractPage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToAccountMenu() {
		waitToElementClickable(driver, HomePageUI.ACCOUNT_MENU);
		clickToElement(driver, HomePageUI.ACCOUNT_MENU);

	}

	public void clickToRegisterLinkInAccountMenu() {
		waitToElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);

	}

	public void inputToFirstNameTextbox(String firstName) {
		waitToElementVisible(driver, HomePageUI.FIRSTNAME_TEXTBOX);
		senkeysToElement(driver, HomePageUI.FIRSTNAME_TEXTBOX, firstName);

	}

	public void inputToMiddleNameTextbox(String middleName) {
		waitToElementVisible(driver, HomePageUI.MIDDLENAME_TEXTBOX);
		senkeysToElement(driver, HomePageUI.MIDDLENAME_TEXTBOX, middleName);
	}

	public void inputToLastNameTextbox(String lastName) {
		waitToElementVisible(driver, HomePageUI.LASTNAME_TEXTBOX);
		senkeysToElement(driver, HomePageUI.LASTNAME_TEXTBOX, lastName);
	}

	public void inputToEmailTextbox(String email) {
		waitToElementVisible(driver, HomePageUI.EMAIL_TEXTBOX);
		senkeysToElement(driver, HomePageUI.EMAIL_TEXTBOX, email);
	}

	public void inputToPasswordTextbox(String password) {
		waitToElementVisible(driver, HomePageUI.PASSWORD_TEXTBOX);
		senkeysToElement(driver, HomePageUI.PASSWORD_TEXTBOX, password);
	}

	public void inputToConfirmPasswordTextbox(String password) {

		waitToElementVisible(driver, HomePageUI.CONFIRM_PASSWORD_TEXTBOX);
		senkeysToElement(driver, HomePageUI.CONFIRM_PASSWORD_TEXTBOX, password);
	}
	
	public void checkToNewleterCheckbox() {
		waitToElementVisible(driver, HomePageUI.NEWLSLETTER_CHECKBOX);
		checkToCheckBox(driver, HomePageUI.NEWLSLETTER_CHECKBOX);
	}

	public void clickToregisterButton() {
		waitToElementClickable(driver, HomePageUI.REGISTER_BUTTON);
		clickToElement(driver, HomePageUI.REGISTER_BUTTON);

	}

	public String getMessageSuccess() {
		waitToElementVisible(driver, HomePageUI.MESSAGE_SUCCESS);
		return getElementText(driver, HomePageUI.MESSAGE_SUCCESS);
	}

	public MyAccountPage clickToMyAccountLink() {
		waitToElementClickable(driver, HomePageUI.MYACOUNT_LINK);
		clickToElement(driver, HomePageUI.MYACOUNT_LINK);
		return PageGeneratorManager.getLMyAccountPage(driver);
	}

	public void clickToLogoutLinkInAccountMenu() {
		waitToElementClickable(driver, HomePageUI.LOGOUT_LINK);
		clickToElement(driver, HomePageUI.LOGOUT_LINK);
	}

}