package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUI.MyAccountPageUI;
import commons.AbstractPage;

public class MyAccountPage extends AbstractPage{
	WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToAccountInformationInMyAccountPage() {
		waitToElementClickable(driver, MyAccountPageUI.ACCOUNT_INFORMATION);
		clickToElement(driver, MyAccountPageUI.ACCOUNT_INFORMATION);
	}

	public String getFirstNameTextboxValue() {
		waitToElementVisible(driver, MyAccountPageUI.FIRSTNAME_TEXTBOX);
		return getElementAttribute(driver, MyAccountPageUI.FIRSTNAME_TEXTBOX, "value");
	}

	public String getMiddleNameTextboxValue() {
		waitToElementVisible(driver, MyAccountPageUI.MIDDLENAME_TEXTBOX);
		return getElementAttribute(driver, MyAccountPageUI.MIDDLENAME_TEXTBOX, "value");
	}

	public String getLastNameTextboxValue() {
		waitToElementVisible(driver, MyAccountPageUI.LASTNAME_TEXTBOX);
		return getElementAttribute(driver, MyAccountPageUI.LASTNAME_TEXTBOX, "value");
	}

	public String getEmailTextboxValue() {
		waitToElementVisible(driver, MyAccountPageUI.EMAIL_TEXTBOX);
		return getElementAttribute(driver, MyAccountPageUI.EMAIL_TEXTBOX, "value");
	}

}
