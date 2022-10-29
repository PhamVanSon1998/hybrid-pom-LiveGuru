package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUI.MyAccountPageFrontEndUI;
import commons.AbstractPage;

public class MyAccountPageFrontEnd extends AbstractPage{
	WebDriver driver;

	public MyAccountPageFrontEnd(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToAccountInformationInMyAccountPage() {
		waitToElementClickable(driver, MyAccountPageFrontEndUI.ACCOUNT_INFORMATION);
		clickToElement(driver, MyAccountPageFrontEndUI.ACCOUNT_INFORMATION);
	}

	public String getFirstNameTextboxValue() {
		waitToElementVisible(driver, MyAccountPageFrontEndUI.FIRSTNAME_TEXTBOX);
		return getElementAttribute(driver, MyAccountPageFrontEndUI.FIRSTNAME_TEXTBOX, "value");
	}

	public String getMiddleNameTextboxValue() {
		waitToElementVisible(driver, MyAccountPageFrontEndUI.MIDDLENAME_TEXTBOX);
		return getElementAttribute(driver, MyAccountPageFrontEndUI.MIDDLENAME_TEXTBOX, "value");
	}

	public String getLastNameTextboxValue() {
		waitToElementVisible(driver, MyAccountPageFrontEndUI.LASTNAME_TEXTBOX);
		return getElementAttribute(driver, MyAccountPageFrontEndUI.LASTNAME_TEXTBOX, "value");
	}

	public String getEmailTextboxValue() {
		waitToElementVisible(driver, MyAccountPageFrontEndUI.EMAIL_TEXTBOX);
		return getElementAttribute(driver, MyAccountPageFrontEndUI.EMAIL_TEXTBOX, "value");
	}

}
