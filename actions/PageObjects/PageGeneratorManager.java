package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public static HomePage  getHomePage(WebDriver driver) {
		return new HomePage(driver);
	}
	
	public static RegisterPage  getRegisterPage(WebDriver driver) {
		return new RegisterPage(driver);
	}
	
	public static LoginPage  getLoginPage(WebDriver driver) {
		return new LoginPage(driver);
	}
	
	public static MyAccountPage  getLMyAccountPage(WebDriver driver) {
		return new MyAccountPage(driver);
	}
}
