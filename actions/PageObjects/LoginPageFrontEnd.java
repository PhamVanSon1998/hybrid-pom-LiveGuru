package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUI.LoginPageFrontEndUI;
import commons.AbstractPage;

public class LoginPageFrontEnd extends AbstractPage{
	WebDriver driver;

	public LoginPageFrontEnd(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToEmailTextbox(String email) {
		waitToElementVisible(driver, LoginPageFrontEndUI.EMAIL_TEXTBOX);
		senkeysToElement(driver, LoginPageFrontEndUI.EMAIL_TEXTBOX, email);
	}

	public void inputToPasswordTextbox(String password) {
		waitToElementVisible(driver, LoginPageFrontEndUI.PASSWORD_TEXTBOX);
		senkeysToElement(driver, LoginPageFrontEndUI.PASSWORD_TEXTBOX, password);
	}

	public void clickToLoginButton() {
		waitToElementClickable(driver, LoginPageFrontEndUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageFrontEndUI.LOGIN_BUTTON);
	}

}
