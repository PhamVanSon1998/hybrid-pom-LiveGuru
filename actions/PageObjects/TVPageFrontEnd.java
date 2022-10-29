package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUI.HomePageFrontEndUI;
import PageUI.MobilePageFrontEndUI;
import PageUI.TVPageFrontEndUI;
import commons.AbstractPage;

public class TVPageFrontEnd extends AbstractPage {
	WebDriver driver;

	public TVPageFrontEnd(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToAddTVNameToWishlist() {
		waitToElementClickable(driver, TVPageFrontEndUI.ADD_TO_WISHLIST_TV_NAME);
		clickToElement(driver, TVPageFrontEndUI.ADD_TO_WISHLIST_TV_NAME);
	}

	public String getMessageAddToWishlistSuccess() {
		waitToElementVisible(driver, TVPageFrontEndUI.MESSAGE_ADD_TO_WISHLIST_SUCCESS);
		return getElementText(driver, TVPageFrontEndUI.MESSAGE_ADD_TO_WISHLIST_SUCCESS);
	}

	public void clickToShareWishlistButton() {
		waitToElementClickable(driver, TVPageFrontEndUI.SHARE_WISLIST_BUTTON);
		clickToElement(driver, TVPageFrontEndUI.SHARE_WISLIST_BUTTON);
	}

	public void inputToEmailTextArea(String email) {
		waitToElementVisible(driver, TVPageFrontEndUI.EMAIL_ADDRESS_TEXTAREA);
		senkeysToElement(driver, TVPageFrontEndUI.EMAIL_ADDRESS_TEXTAREA, email);
	}

	public void inputToMessageTextArrea(String message) {
		waitToElementVisible(driver, TVPageFrontEndUI.MESSAGE_TEXTAREA);
		senkeysToElement(driver, TVPageFrontEndUI.MESSAGE_TEXTAREA, message);
	}

	public void clickShareButtonInShareYourWishlistPage() {
		waitToElementClickable(driver, TVPageFrontEndUI.SHARE_WISLIST_BUTTON);
		clickToElement(driver, TVPageFrontEndUI.SHARE_WISLIST_BUTTON);
	}

	public String getMessageShareWishlistSuccess() {
		waitToElementVisible(driver, TVPageFrontEndUI.MESSAGE_SHARE_WISHLIST_SUCCESS);
		return getElementText(driver, TVPageFrontEndUI.MESSAGE_SHARE_WISHLIST_SUCCESS);
	}

	public boolean isTVAddShareWishlishInMyWishlistDisplayed() {
		return isElementDisplayed(driver, TVPageFrontEndUI.TV_NAME_IN_MY_WISHLIST);
	}

	public String isQtyTVAddShareWishlishInMyWishlist() {
		waitToElementVisible(driver, TVPageFrontEndUI.QTY_VALUE);
		return getElementAttribute(driver, TVPageFrontEndUI.QTY_VALUE,"value");
	}

	public void clickToSamsungLCDLink() {
		waitToElementClickable(driver, TVPageFrontEndUI.SAMSUNG_LCD);
		clickToElement(driver, TVPageFrontEndUI.SAMSUNG_LCD);
	}

	public void clickToAddToReviewLink() {
		waitToElementClickable(driver, TVPageFrontEndUI.ADD_TO_REVIEW_LINK);
		clickToElement(driver, TVPageFrontEndUI.ADD_TO_REVIEW_LINK);
	}

	public void clickToSubmitReview() {
		waitToElementClickable(driver, TVPageFrontEndUI.SUBMIT_BUTTON);
		clickToElement(driver, TVPageFrontEndUI.SUBMIT_BUTTON);
	}

	public String getMessageInFieldName(String valueFiled) {
		waitToElementVisible(driver, TVPageFrontEndUI.MESSAGE_EMPTY_WITH_FIELD_NAME, valueFiled);
		return getElementText(driver, TVPageFrontEndUI.MESSAGE_EMPTY_WITH_FIELD_NAME, valueFiled);
	}

	public void selectToQuality2Star() {
		waitToElementVisible(driver, TVPageFrontEndUI.QUALITY_RADIO);
		checkToCheckBox(driver, TVPageFrontEndUI.QUALITY_RADIO);
	}

	public void inputToThoughtsTextarea(String valueThought) {
		waitToElementVisible(driver, TVPageFrontEndUI.THOUGHTS_TEXTAREA);
		senkeysToElement(driver, TVPageFrontEndUI.THOUGHTS_TEXTAREA, valueThought);
	}

	public void inputToSummaryTextbox(String valueSummary) {
		waitToElementVisible(driver, TVPageFrontEndUI.SUMMARY_TEXTBOX);
		senkeysToElement(driver, TVPageFrontEndUI.SUMMARY_TEXTBOX, valueSummary);
	}

	public void inputToNickNameTextbox(String valueNickname) {
		waitToElementVisible(driver, TVPageFrontEndUI.NICKNAME_TEXTBOX);
		senkeysToElement(driver, TVPageFrontEndUI.NICKNAME_TEXTBOX, valueNickname);
	}

	public String getMessageAddToReviewSuccess() {
		waitToElementVisible(driver, TVPageFrontEndUI.MESSAGE_ADD_TO_REVIEW_SUCCESS);
		return getElementText(driver, TVPageFrontEndUI.MESSAGE_ADD_TO_REVIEW_SUCCESS);
	}

	public void clickToGotoWishlistLink() {
		waitToElementClickable(driver, TVPageFrontEndUI.GO_TO_WISHLIST_LINK);
		clickToElement(driver, TVPageFrontEndUI.GO_TO_WISHLIST_LINK);
	}

	public void clickAddToCartLink() {
		waitToElementClickable(driver, TVPageFrontEndUI.ADD_TO_CART_BUTTON);
		clickToElement(driver, TVPageFrontEndUI.ADD_TO_CART_BUTTON);
	}

	public void selectCountryDropdown(String countryName) {
		waitToElementVisible(driver, TVPageFrontEndUI.COUNTRY_DROPDOWN);
		selectItemInDropdow(driver, TVPageFrontEndUI.COUNTRY_DROPDOWN, countryName);
	}

	public void inputStateTextbox(String stateName) {
		waitToElementVisible(driver, TVPageFrontEndUI.STATE_DROPDOW);
		senkeysToElement(driver, TVPageFrontEndUI.STATE_DROPDOW, stateName);
	}
	
	public void inputToZiptextbox(String zipTextbox) {
		waitToElementVisible(driver, TVPageFrontEndUI.ZIP_TEXTBOX);
		senkeysToElement(driver, TVPageFrontEndUI.ZIP_TEXTBOX,zipTextbox);
	}

	public void clickToEstimatelink() {
		waitToElementClickable(driver, TVPageFrontEndUI.ESTIMATE_BUTTON);
		clickToElement(driver, TVPageFrontEndUI.ESTIMATE_BUTTON);
	}


	public void clickToProcessToCheckoutButton() {
		waitToElementClickable(driver, TVPageFrontEndUI.PROCESSED_TO_CHECKOUT);
		clickToElement(driver, TVPageFrontEndUI.PROCESSED_TO_CHECKOUT);
	}
	
	public void verifyFlatDisplayed(String string) {
		
		
	}

	public void inputTocompanyTextbox(String companyTextbox) {
		waitToElementVisible(driver, TVPageFrontEndUI.COMPANY_TEXTBOX);
		senkeysToElement(driver, TVPageFrontEndUI.COMPANY_TEXTBOX,companyTextbox);
	}

	public void inputToAddressTextbox(String addressTextbox) {
		waitToElementVisible(driver, TVPageFrontEndUI.ADDRESS_TEXTBOX);
		senkeysToElement(driver, TVPageFrontEndUI.ADDRESS_TEXTBOX,addressTextbox);
	}

	public void inputToStreetAddressTextbox(String streetAddress) {
		waitToElementVisible(driver, TVPageFrontEndUI.STREET_ADDRESS2_TEXTBOX);
		senkeysToElement(driver, TVPageFrontEndUI.STREET_ADDRESS2_TEXTBOX,streetAddress);
	}

	public void inputToCityTextbox(String cityTextbox) {
		waitToElementVisible(driver, TVPageFrontEndUI.CITY_TEXTBOX);
		senkeysToElement(driver, TVPageFrontEndUI.CITY_TEXTBOX,cityTextbox);
	}

	public void selectStateDropdowninBilling(String stateBilling) {
		waitToElementVisible(driver, TVPageFrontEndUI.STATE_DROPDOWN_IN_BILLING);
		selectItemInDropdow(driver, TVPageFrontEndUI.STATE_DROPDOWN_IN_BILLING, stateBilling);
	}

	public void inputToZiptextboxInBilling(String zipTextbox) {
		waitToElementVisible(driver, TVPageFrontEndUI.ZIP_TEXTBOX_IN_BILLING);
		senkeysToElement(driver, TVPageFrontEndUI.ZIP_TEXTBOX_IN_BILLING,zipTextbox);
	}

	public void selectCountryDropdowninBilling(String countryDropdown) {
		waitToElementVisible(driver, TVPageFrontEndUI.COUNTRY_TEXTBOX_IN_BILLING);
		selectItemInDropdow(driver, TVPageFrontEndUI.COUNTRY_TEXTBOX_IN_BILLING, countryDropdown);
	}

	public void inputToTelephonetexbox(String telephoneTextbox) {
		waitToElementVisible(driver, TVPageFrontEndUI.TELEPHONE_TEXTBOX);
		senkeysToElement(driver, TVPageFrontEndUI.TELEPHONE_TEXTBOX,telephoneTextbox);
	}

	public void inputToFaxTextbox(String faxTextbox) {
		waitToElementVisible(driver, TVPageFrontEndUI.FAX_TEXTBOX);
		senkeysToElement(driver, TVPageFrontEndUI.FAX_TEXTBOX,faxTextbox);
	}

	public void clickToContinueButtonBilling() {
		waitToElementClickable(driver, TVPageFrontEndUI.CONTINUE_BUTTON_IN_BILLING);
		clickToElement(driver, TVPageFrontEndUI.CONTINUE_BUTTON_IN_BILLING);
	}
	
	public void clickToContinueButtonShippingMethod() {
		waitToElementClickable(driver, TVPageFrontEndUI.CONTINUE_BUTTON_IN_SHIPPING_METHOD);
		clickToElement(driver, TVPageFrontEndUI.CONTINUE_BUTTON_IN_SHIPPING_METHOD);
	}

	public void checkToMoneyOrderRadioButton() {
		waitToElementVisible(driver, TVPageFrontEndUI.CHECK_MONEY_ORDER);
		checkToCheckBox(driver, TVPageFrontEndUI.CHECK_MONEY_ORDER);
	}

	public void clickToContinueButtonInPayment() {
		waitToElementClickable(driver, TVPageFrontEndUI.CONTINUE_BUTTON_IN_PAYMENT);
		clickToElement(driver, TVPageFrontEndUI.CONTINUE_BUTTON_IN_PAYMENT);
	}
	
	public void clickToPlaceOrderButton() {
		waitToElementClickable(driver, TVPageFrontEndUI.PLACE_ORDER);
		clickToElement(driver, TVPageFrontEndUI.PLACE_ORDER);
	}




}
