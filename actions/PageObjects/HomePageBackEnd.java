package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUI.HomePageBackEndUI;
import commons.AbstractPage;

public class HomePageBackEnd extends AbstractPage{
	WebDriver driver;

	public HomePageBackEnd(WebDriver driver) {
		this.driver = driver;
	}

	public void getLiveguruAdminPage() {
		driver.get("http://live.techpanda.org/index.php/backendlogin");
	}

	public void inputToUserNameBackEndTextbox(String userName) {
		waitToElementVisible(driver, HomePageBackEndUI.USER_NAME_BACKEND_TEXTBOX);
		senkeysToElement(driver, HomePageBackEndUI.USER_NAME_BACKEND_TEXTBOX, userName);
	}

	public void inputToPasswordBackEndTextbox(String passwordBackEnd) {
		waitToElementVisible(driver, HomePageBackEndUI.PASSWORD_BACKEND_TEXTBOX);
		senkeysToElement(driver, HomePageBackEndUI.PASSWORD_BACKEND_TEXTBOX, passwordBackEnd);
	}

	public void clickToLoginButton() {
		waitToElementClickable(driver, HomePageBackEndUI.LONGIN_BACKEND_BUTTON);
		clickToElement(driver, HomePageBackEndUI.LONGIN_BACKEND_BUTTON);
	}

}
