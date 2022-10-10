package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUI.HomePageUI;
import PageUI.MobilePageUI;
import PageUI.TVPageUI;
import commons.AbstractPage;

public class TVPage extends AbstractPage {
	WebDriver driver;

	public TVPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToAddTVNameToWishlist() {
		waitToElementClickable(driver, TVPageUI.ADD_TO_WISHLIST_TV_NAME);
		clickToElement(driver, TVPageUI.ADD_TO_WISHLIST_TV_NAME);
	}

	public String getMessageAddToWishlistSuccess() {
		waitToElementVisible(driver, TVPageUI.MESSAGE_ADD_TO_WISHLIST_SUCCESS);
		return getElementText(driver, TVPageUI.MESSAGE_ADD_TO_WISHLIST_SUCCESS);
	}

	public void clickToShareWishlistButton() {
		waitToElementClickable(driver, TVPageUI.SHARE_WISLIST_BUTTON);
		clickToElement(driver, TVPageUI.SHARE_WISLIST_BUTTON);
	}

	public void inputToEmailTextArea(String email) {
		waitToElementVisible(driver, TVPageUI.EMAIL_ADDRESS_TEXTAREA);
		senkeysToElement(driver, TVPageUI.EMAIL_ADDRESS_TEXTAREA, email);
	}

	public void inputToMessageTextArrea(String message) {
		waitToElementVisible(driver, TVPageUI.MESSAGE_TEXTAREA);
		senkeysToElement(driver, TVPageUI.MESSAGE_TEXTAREA, message);
	}

	public void clickShareButtonInShareYourWishlistPage() {
		waitToElementClickable(driver, TVPageUI.SHARE_WISLIST_BUTTON);
		clickToElement(driver, TVPageUI.SHARE_WISLIST_BUTTON);
	}

	public String getMessageShareWishlistSuccess() {
		waitToElementVisible(driver, TVPageUI.MESSAGE_SHARE_WISHLIST_SUCCESS);
		return getElementText(driver, TVPageUI.MESSAGE_SHARE_WISHLIST_SUCCESS);
	}

	public boolean isTVAddShareWishlishInMyWishlistDisplayed() {
		return isElementDisplayed(driver, TVPageUI.TV_NAME_IN_MY_WISHLIST);
	}

	public String isQtyTVAddShareWishlishInMyWishlist() {
		waitToElementVisible(driver, TVPageUI.QTY_VALUE);
		return getElementAttribute(driver, TVPageUI.QTY_VALUE,"value");
	}

}
