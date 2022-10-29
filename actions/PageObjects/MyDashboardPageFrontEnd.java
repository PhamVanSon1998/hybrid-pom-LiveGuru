package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUI.MyAccountPageFrontEndUI;
import PageUI.MyDashboardPageFrontEndUI;
import commons.AbstractPage;

public class MyDashboardPageFrontEnd extends AbstractPage{
	WebDriver driver;

	public MyDashboardPageFrontEnd(WebDriver driver) {
		this.driver = driver;
	}

	public String getHelloText() {
		waitToElementVisible(driver, MyDashboardPageFrontEndUI.HELLO_TEXT);
		return getElementText(driver, MyDashboardPageFrontEndUI.HELLO_TEXT);
	}

	public String getPageTitle() {
		waitToElementVisible(driver, MyDashboardPageFrontEndUI.PAGE_TITLE);
		return getElementText(driver, MyDashboardPageFrontEndUI.PAGE_TITLE);
	}

	
}
