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

	public void clickToGotoWishlistLink() {
		waitToElementClickable(driver, TVPageUI.GO_TO_WISHLIST_LINK);
		clickToElement(driver, TVPageUI.GO_TO_WISHLIST_LINK);
	}

	public void clickAddToCartLink() {
		waitToElementClickable(driver, TVPageUI.ADD_TO_CART_BUTTON);
		clickToElement(driver, TVPageUI.ADD_TO_CART_BUTTON);
	}

	public void selectCountryDropdown(String countryName) {
		waitToElementVisible(driver, TVPageUI.COUNTRY_DROPDOWN);
		selectItemInDropdow(driver, TVPageUI.COUNTRY_DROPDOWN, countryName);
	}

	public void inputStateTextbox(String stateName) {
		waitToElementVisible(driver, TVPageUI.STATE_DROPDOW);
		senkeysToElement(driver, TVPageUI.STATE_DROPDOW, stateName);
	}
	
	public void inputToZiptextbox(String zipTextbox) {
		waitToElementVisible(driver, TVPageUI.ZIP_TEXTBOX);
		senkeysToElement(driver, TVPageUI.ZIP_TEXTBOX,zipTextbox);
	}

	public void clickToEstimatelink() {
		waitToElementClickable(driver, TVPageUI.ESTIMATE_BUTTON);
		clickToElement(driver, TVPageUI.ESTIMATE_BUTTON);
	}


	public void clickToProcessToCheckoutButton() {
		waitToElementClickable(driver, TVPageUI.PROCESSED_TO_CHECKOUT);
		clickToElement(driver, TVPageUI.PROCESSED_TO_CHECKOUT);
	}
	
	public void verifyFlatDisplayed(String string) {
		
		
	}

	public void inputTocompanyTextbox(String companyTextbox) {
		waitToElementVisible(driver, TVPageUI.COMPANY_TEXTBOX);
		senkeysToElement(driver, TVPageUI.COMPANY_TEXTBOX,companyTextbox);
	}

	public void inputToAddressTextbox(String addressTextbox) {
		waitToElementVisible(driver, TVPageUI.ADDRESS_TEXTBOX);
		senkeysToElement(driver, TVPageUI.ADDRESS_TEXTBOX,addressTextbox);
	}

	public void inputToStreetAddressTextbox(String streetAddress) {
		waitToElementVisible(driver, TVPageUI.STREET_ADDRESS2_TEXTBOX);
		senkeysToElement(driver, TVPageUI.STREET_ADDRESS2_TEXTBOX,streetAddress);
	}

	public void inputToCityTextbox(String cityTextbox) {
		waitToElementVisible(driver, TVPageUI.CITY_TEXTBOX);
		senkeysToElement(driver, TVPageUI.CITY_TEXTBOX,cityTextbox);
	}

	public void selectStateDropdowninBilling(String stateBilling) {
		waitToElementVisible(driver, TVPageUI.STATE_DROPDOWN_IN_BILLING);
		selectItemInDropdow(driver, TVPageUI.STATE_DROPDOWN_IN_BILLING, stateBilling);
	}

	public void inputToZiptextboxInBilling(String zipTextbox) {
		waitToElementVisible(driver, TVPageUI.ZIP_TEXTBOX_IN_BILLING);
		senkeysToElement(driver, TVPageUI.ZIP_TEXTBOX_IN_BILLING,zipTextbox);
	}

	public void selectCountryDropdowninBilling(String countryDropdown) {
		waitToElementVisible(driver, TVPageUI.COUNTRY_TEXTBOX_IN_BILLING);
		selectItemInDropdow(driver, TVPageUI.COUNTRY_TEXTBOX_IN_BILLING, countryDropdown);
	}

	public void inputToTelephonetexbox(String telephoneTextbox) {
		waitToElementVisible(driver, TVPageUI.TELEPHONE_TEXTBOX);
		senkeysToElement(driver, TVPageUI.TELEPHONE_TEXTBOX,telephoneTextbox);
	}

	public void inputToFaxTextbox(String faxTextbox) {
		waitToElementVisible(driver, TVPageUI.FAX_TEXTBOX);
		senkeysToElement(driver, TVPageUI.FAX_TEXTBOX,faxTextbox);
	}

	public void clickToContinueButtonBilling() {
		waitToElementClickable(driver, TVPageUI.CONTINUE_BUTTON_IN_BILLING);
		clickToElement(driver, TVPageUI.CONTINUE_BUTTON_IN_BILLING);
	}
	
	public void clickToContinueButtonShippingMethod() {
		waitToElementClickable(driver, TVPageUI.CONTINUE_BUTTON_IN_SHIPPING_METHOD);
		clickToElement(driver, TVPageUI.CONTINUE_BUTTON_IN_SHIPPING_METHOD);
	}

	public void checkToMoneyOrderRadioButton() {
		waitToElementVisible(driver, TVPageUI.CHECK_MONEY_ORDER);
		checkToCheckBox(driver, TVPageUI.CHECK_MONEY_ORDER);
	}

	public void clickToContinueButtonInPayment() {
		waitToElementClickable(driver, TVPageUI.CONTINUE_BUTTON_IN_PAYMENT);
		clickToElement(driver, TVPageUI.CONTINUE_BUTTON_IN_PAYMENT);
	}
	
	public void clickToPlaceOrderButton() {
		waitToElementClickable(driver, TVPageUI.PLACE_ORDER);
		clickToElement(driver, TVPageUI.PLACE_ORDER);
	}




}
