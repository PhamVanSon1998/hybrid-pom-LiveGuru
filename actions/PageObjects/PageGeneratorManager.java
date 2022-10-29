package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public static HomePageFrontEnd  getHomePage(WebDriver driver) {
		return new HomePageFrontEnd(driver);
	}
	
	public static RegisterPageFrontEnd  getRegisterPage(WebDriver driver) {
		return new RegisterPageFrontEnd(driver);
	}
	
	public static LoginPageFrontEnd  getLoginPage(WebDriver driver) {
		return new LoginPageFrontEnd(driver);
	}
	
	public static MyAccountPageFrontEnd  getLMyAccountPage(WebDriver driver) {
		return new MyAccountPageFrontEnd(driver);
	}
	
	public static MyDashboardPageFrontEnd  getLMyDashboardPage(WebDriver driver) {
		return new MyDashboardPageFrontEnd(driver);
	}
	
	public static MobilePageFrontEnd  getLMobilePage(WebDriver driver) {
		return new MobilePageFrontEnd(driver);
	}
	
	public static TVPageFrontEnd  getTVPage(WebDriver driver) {
		return new TVPageFrontEnd(driver);
	}
	
	public static HomePageBackEnd  getHomePageBackEnd(WebDriver driver) {
		return new HomePageBackEnd(driver);
	}
}
