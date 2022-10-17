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

	public void clickToSamsungLCDLink() {
		waitToElementClickable(driver, TVPageUI.SAMSUNG_LCD);
		clickToElement(driver, TVPageUI.SAMSUNG_LCD);
	}

	public void clickToAddToReviewLink() {
		waitToElementClickable(driver, TVPageUI.ADD_TO_REVIEW_LINK);
		clickToElement(driver, TVPageUI.ADD_TO_REVIEW_LINK);
	}

	public void clickToSubmitReview() {
		waitToElementClickable(driver, TVPageUI.SUBMIT_BUTTON);
		clickToElement(driver, TVPageUI.SUBMIT_BUTTON);
	}

	public String getMessageInFieldName(String valueFiled) {
		waitToElementVisible(driver, TVPageUI.MESSAGE_EMPTY_WITH_FIELD_NAME, valueFiled);
		return getElementText(driver, TVPageUI.MESSAGE_EMPTY_WITH_FIELD_NAME, valueFiled);
	}

	public void selectToQuality2Star() {
		waitToElementVisible(driver, TVPageUI.QUALITY_RADIO);
		checkToCheckBox(driver, TVPageUI.QUALITY_RADIO);
	}

	public void inputToThoughtsTextarea(String valueThought) {
		waitToElementVisible(driver, TVPageUI.THOUGHTS_TEXTAREA);
		senkeysToElement(driver, TVPageUI.THOUGHTS_TEXTAREA, valueThought);
	}

	public void inputToSummaryTextbox(String valueSummary) {
		waitToElementVisible(driver, TVPageUI.SUMMARY_TEXTBOX);
		senkeysToElement(driver, TVPageUI.SUMMARY_TEXTBOX, valueSummary);
	}

	public void inputToNickNameTextbox(String valueNickname) {
		waitToElementVisible(driver, TVPageUI.NICKNAME_TEXTBOX);
		senkeysToElement(driver, TVPageUI.NICKNAME_TEXTBOX, valueNickname);
	}

	public String getMessageAddToReviewSuccess() {
		waitToElementVisible(driver, TVPageUI.MESSAGE_ADD_TO_REVIEW_SUCCESS);
		return getElementText(driver, TVPageUI.MESSAGE_ADD_TO_REVIEW_SUCCESS);
	}

}
