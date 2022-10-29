package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUI.HomePageFrontEndUI;
import PageUI.MobilePageFrontEndUI;
import commons.AbstractPage;

public class MobilePageFrontEnd extends AbstractPage {
	WebDriver driver;

	public MobilePageFrontEnd(WebDriver driver) {
		this.driver = driver;
	}

	public String getCostMobileName(String mobileNameCost) {
		waitToElementVisible(driver, MobilePageFrontEndUI.MOBILE_NAME_COST, mobileNameCost);
		return getElementText(driver, MobilePageFrontEndUI.MOBILE_NAME_COST, mobileNameCost);
	}

	public void clickTogMobileName(String mobileName) {
		waitToElementClickable(driver, MobilePageFrontEndUI.MOBILE_NAME, mobileName);
		clickToElement(driver, MobilePageFrontEndUI.MOBILE_NAME, mobileName);
	}

	public String getCostMobileNameInMobileNameDetail(String mobileNameCostDetail) {
		waitToElementVisible(driver, MobilePageFrontEndUI.MOBILE_NAME_COST_DETAIL, mobileNameCostDetail);
		return getElementText(driver, MobilePageFrontEndUI.MOBILE_NAME_COST_DETAIL, mobileNameCostDetail);
	}

	public void clickAddToCartMobileName() {
		waitToElementClickable(driver, MobilePageFrontEndUI.ADD_TO_CART_MOBILE_NAME_BUTTON);
		clickToElement(driver, MobilePageFrontEndUI.ADD_TO_CART_MOBILE_NAME_BUTTON);
	}

	public String getTextAddToCartMobileNameSuccess(String addToCartMobileNameSuccess) {
		waitToElementVisible(driver, MobilePageFrontEndUI.ADD_TO_CART_MOBILE_NAME_MESSAGE_SUCCESS, addToCartMobileNameSuccess);
		return getElementText(driver, MobilePageFrontEndUI.ADD_TO_CART_MOBILE_NAME_MESSAGE_SUCCESS, addToCartMobileNameSuccess);
	}

	public void inputToDiscountCodeTextbox(String discountCodeTextbox) {
		waitToElementVisible(driver, MobilePageFrontEndUI.DISCOUNT_CODE_TEXTBOX);
		senkeysToElement(driver, MobilePageFrontEndUI.DISCOUNT_CODE_TEXTBOX, discountCodeTextbox);
	}

	public void clickToApplyLink() {
		waitToElementClickable(driver, MobilePageFrontEndUI.APPLY_LINK);
		clickToElement(driver, MobilePageFrontEndUI.APPLY_LINK);
	}

	public String getDiscountGenerate() {
		waitToElementVisible(driver, MobilePageFrontEndUI.DISCOUT_COST_MONEY);
		return getElementText(driver, MobilePageFrontEndUI.DISCOUT_COST_MONEY);
	}

	public void inPutToQtyTextbox(String qtyTextbox) {
		waitToElementVisible(driver, MobilePageFrontEndUI.QTY_TEXTBOX);
		senkeysToElement(driver, MobilePageFrontEndUI.QTY_TEXTBOX, qtyTextbox);
	}

	public void clickToUpdateButton() {
		waitToElementClickable(driver, MobilePageFrontEndUI.UPDATE_BUTTON);
		clickToElement(driver, MobilePageFrontEndUI.UPDATE_BUTTON);

	}

	public String getMessageUpdateText() {
		waitToElementVisible(driver, MobilePageFrontEndUI.MESSAGE_UPDATE_ERROR);
		return getElementText(driver, MobilePageFrontEndUI.MESSAGE_UPDATE_ERROR);
	}

	public void clickToEmptyLink() {
		waitToElementClickable(driver, MobilePageFrontEndUI.EMPY_CART_LINK);
		clickToElement(driver, MobilePageFrontEndUI.EMPY_CART_LINK);
	}

	public boolean verifyShoppingCartEmpty() {
		waitToElementVisible(driver, MobilePageFrontEndUI.SHOPPING_CART_EMPY_TEXT);
		return isElementDisplayed(driver, MobilePageFrontEndUI.SHOPPING_CART_EMPY_TEXT);
	}

	public void clickAddToCartSonyXperia() {
		waitToElementClickable(driver, MobilePageFrontEndUI.ADD_TO_COMPARE_SONY_XPERIA);
		clickToElement(driver, MobilePageFrontEndUI.ADD_TO_COMPARE_SONY_XPERIA);
	}

	public void clickAddToCartIphone() {
		waitToElementClickable(driver, MobilePageFrontEndUI.ADD_TO_COMPARE_IPHONE);
		clickToElement(driver, MobilePageFrontEndUI.ADD_TO_COMPARE_IPHONE);
	}

	public String getMessageAddToCompareMobileNameSuccess() {
		waitToElementVisible(driver, MobilePageFrontEndUI.ADD_TO_CART_MOBILE_NAME_MESSAGE_SUCCESS);
		return getElementText(driver, MobilePageFrontEndUI.ADD_TO_CART_MOBILE_NAME_MESSAGE_SUCCESS);
	}

	public void clickCompareButton() {
		waitToElementClickable(driver, MobilePageFrontEndUI.COMPARE_BUTTON);
		clickToElement(driver, MobilePageFrontEndUI.COMPARE_BUTTON);
	}

	public boolean verifyPopupDisplayed(String parentId) {
		swithToWindownHandleByID(driver, parentId);
		return isElementDisplayed(driver, MobilePageFrontEndUI.COMPARE_PRODUCT);
	}

	public boolean isMobileNameAddToCompareDisplay(String MobileName) {
		return isElementDisplayed(driver, MobilePageFrontEndUI.MOBILE_NAME_IN_COMPARE_PRODUCT, MobileName);
	}

	public boolean verifyPopupUnDisplayed() {
		swithToDefaultContent(driver);
		return isElementUndisplayed(driver, MobilePageFrontEndUI.COMPARE_PRODUCT);
	}

	
	

}
