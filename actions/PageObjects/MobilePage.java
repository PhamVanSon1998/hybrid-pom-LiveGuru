package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUI.HomePageUI;
import PageUI.MobilePageUI;
import commons.AbstractPage;

public class MobilePage extends AbstractPage {
	WebDriver driver;

	public MobilePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getCostMobileName(String mobileNameCost) {
		waitToElementVisible(driver, MobilePageUI.MOBILE_NAME_COST, mobileNameCost);
		return getElementText(driver, MobilePageUI.MOBILE_NAME_COST, mobileNameCost);
	}

	public void clickTogMobileName(String mobileName) {
		waitToElementClickable(driver, MobilePageUI.MOBILE_NAME, mobileName);
		clickToElement(driver, MobilePageUI.MOBILE_NAME, mobileName);
	}

	public String getCostMobileNameInMobileNameDetail(String mobileNameCostDetail) {
		waitToElementVisible(driver, MobilePageUI.MOBILE_NAME_COST_DETAIL, mobileNameCostDetail);
		return getElementText(driver, MobilePageUI.MOBILE_NAME_COST_DETAIL, mobileNameCostDetail);
	}

	public void clickAddToCartMobileName() {
		waitToElementClickable(driver, MobilePageUI.ADD_TO_CART_MOBILE_NAME_BUTTON);
		clickToElement(driver, MobilePageUI.ADD_TO_CART_MOBILE_NAME_BUTTON);
	}

	public String getTextAddToCartMobileNameSuccess(String addToCartMobileNameSuccess) {
		waitToElementVisible(driver, MobilePageUI.ADD_TO_CART_MOBILE_NAME_MESSAGE_SUCCESS, addToCartMobileNameSuccess);
		return getElementText(driver, MobilePageUI.ADD_TO_CART_MOBILE_NAME_MESSAGE_SUCCESS, addToCartMobileNameSuccess);
	}

	public void inputToDiscountCodeTextbox(String discountCodeTextbox) {
		waitToElementVisible(driver, MobilePageUI.DISCOUNT_CODE_TEXTBOX);
		senkeysToElement(driver, MobilePageUI.DISCOUNT_CODE_TEXTBOX, discountCodeTextbox);
	}

	public void clickToApplyLink() {
		waitToElementClickable(driver, MobilePageUI.APPLY_LINK);
		clickToElement(driver, MobilePageUI.APPLY_LINK);
	}

	public String getDiscountGenerate() {
		waitToElementVisible(driver, MobilePageUI.DISCOUT_COST_MONEY);
		return getElementText(driver, MobilePageUI.DISCOUT_COST_MONEY);
	}

	public void inPutToQtyTextbox(String qtyTextbox) {
		waitToElementVisible(driver, MobilePageUI.QTY_TEXTBOX);
		senkeysToElement(driver, MobilePageUI.QTY_TEXTBOX, qtyTextbox);
	}

	public void clickToUpdateButton() {
		waitToElementClickable(driver, MobilePageUI.UPDATE_BUTTON);
		clickToElement(driver, MobilePageUI.UPDATE_BUTTON);

	}

	public String getMessageUpdateText() {
		waitToElementVisible(driver, MobilePageUI.MESSAGE_UPDATE_ERROR);
		return getElementText(driver, MobilePageUI.MESSAGE_UPDATE_ERROR);
	}

	public void clickToEmptyLink() {
		waitToElementClickable(driver, MobilePageUI.EMPY_CART_LINK);
		clickToElement(driver, MobilePageUI.EMPY_CART_LINK);
	}

	public boolean verifyShoppingCartEmpty() {
		waitToElementVisible(driver, MobilePageUI.SHOPPING_CART_EMPY_TEXT);
		return isElementDisplayed(driver, MobilePageUI.SHOPPING_CART_EMPY_TEXT);
	}

	public void clickAddToCartSonyXperia() {
		waitToElementClickable(driver, MobilePageUI.ADD_TO_COMPARE_SONY_XPERIA);
		clickToElement(driver, MobilePageUI.ADD_TO_COMPARE_SONY_XPERIA);
	}

	public void clickAddToCartIphone() {
		waitToElementClickable(driver, MobilePageUI.ADD_TO_COMPARE_IPHONE);
		clickToElement(driver, MobilePageUI.ADD_TO_COMPARE_IPHONE);
	}

	public String getMessageAddToCompareMobileNameSuccess() {
		waitToElementVisible(driver, MobilePageUI.ADD_TO_CART_MOBILE_NAME_MESSAGE_SUCCESS);
		return getElementText(driver, MobilePageUI.ADD_TO_CART_MOBILE_NAME_MESSAGE_SUCCESS);
	}

	public void clickCompareButton() {
		waitToElementClickable(driver, MobilePageUI.COMPARE_BUTTON);
		clickToElement(driver, MobilePageUI.COMPARE_BUTTON);
	}

	public boolean verifyPopupDisplayed(String parentId) {
		swithToWindownHandleByID(driver, parentId);
		return isElementDisplayed(driver, MobilePageUI.COMPARE_PRODUCT);
	}

	public boolean isMobileNameAddToCompareDisplay(String MobileName) {
		return isElementDisplayed(driver, MobilePageUI.MOBILE_NAME_IN_COMPARE_PRODUCT, MobileName);
	}

	public boolean verifyPopupUnDisplayed() {
		swithToDefaultContent(driver);
		return isElementUndisplayed(driver, MobilePageUI.COMPARE_PRODUCT);
	}

	
	

}
