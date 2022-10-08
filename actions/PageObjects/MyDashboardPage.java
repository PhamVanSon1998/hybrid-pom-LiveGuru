package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUI.MyAccountPageUI;
import PageUI.MyDashboardPageUI;
import commons.AbstractPage;

public class MyDashboardPage extends AbstractPage{
	WebDriver driver;

	public MyDashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getHelloText() {
		waitToElementVisible(driver, MyDashboardPageUI.HELLO_TEXT);
		return getElementText(driver, MyDashboardPageUI.HELLO_TEXT);
	}

	public String getPageTitle() {
		waitToElementVisible(driver, MyDashboardPageUI.PAGE_TITLE);
		return getElementText(driver, MyDashboardPageUI.PAGE_TITLE);
	}

	
}
