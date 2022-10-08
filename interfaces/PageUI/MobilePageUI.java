package PageUI;

public class MobilePageUI {
	public static final String MOBILE_NAME_COST ="//a[text()='%s']/parent::h2[@class='product-name']/following-sibling::div//span[@class='price']";
	public static final String MOBILE_NAME="//h2[@class='product-name']/a[text()='Sony Xperia']";
	public static final String MOBILE_NAME_COST_DETAIL="//span[text()='%s']/parent::div[@class='product-name']/following-sibling::div[@class='price-info']//span[@class='price']";

	public static final String ADD_TO_CART_MOBILE_NAME_BUTTON = "//a[text()='Sony Xperia']/parent::h2[@class='product-name']/following-sibling::div[@class='actions']/button";
	public static final String ADD_TO_CART_MOBILE_NAME_MESSAGE_SUCCESS = "//li[@class='success-msg']//span";
	public static final String DISCOUNT_CODE_TEXTBOX = "//input[@id='coupon_code']";
	public static final String APPLY_LINK = "//button[@title='Apply']";
	public static final String DISCOUT_COST_MONEY = "//td[contains(text(),'Discount (GURU50)')]/following-sibling::td/span";
	
	public static final String QTY_TEXTBOX = "//input[@title='Qty']";
	public static final String UPDATE_BUTTON = "//td[@class='product-cart-actions']//button[@value='update_qty']";
	public static final String MESSAGE_UPDATE_ERROR = "//li[@class='error-msg']//span";
	public static final String EMPY_CART_LINK = "//button[@title='Empty Cart']";
	public static final String SHOPPING_CART_EMPY_TEXT = "//div[@class='page-title']//h1[text()='Shopping Cart is Empty']";
}
