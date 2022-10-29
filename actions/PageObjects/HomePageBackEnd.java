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

	public void clickClosePopup() {
		waitToElementClickable(driver, HomePageBackEndUI.CLOSE_POPUP);
		clickToElement(driver, HomePageBackEndUI.CLOSE_POPUP);
	}

	public boolean isEmailDisplayedInBackEnd(String email) {
		waitToElementVisible(driver, HomePageBackEndUI.EMAIL_IN_BACKEND,email);
		return isElementDisplayed(driver, HomePageBackEndUI.EMAIL_IN_BACKEND,email);
	}

	public void checkToCheckboxwithEmailRegister(String email) {
		waitToElementVisible(driver, HomePageBackEndUI.CHECKBOX_WITH_EMAIL,email);
		checkToCheckBox(driver,  HomePageBackEndUI.CHECKBOX_WITH_EMAIL,email);
	}

	public void selectItemInActions(String actionsItem) {
		waitToElementVisible(driver, HomePageBackEndUI.DELETE_DROPDOWN);
		selectItemInDropdow(driver, HomePageBackEndUI.DELETE_DROPDOWN, actionsItem);
	}

	public void clickToSubmitButton() {
		waitToElementClickable(driver, HomePageBackEndUI.SUBMIT_BUTTON);
		clickToElement(driver, HomePageBackEndUI.SUBMIT_BUTTON);
	}

	public boolean isEmailUnDisplayedInBackEnd(String email) {
		return isElementUndisplayed(driver, HomePageBackEndUI.EMAIL_IN_BACKEND,email);
	}

}
