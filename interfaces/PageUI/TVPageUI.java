package PageUI;

public class TVPageUI {
	public static final String LG_LCD_NAME = "//h2[@class='product-name']/a[text()='LG LCD']";
	public static final String ADD_TO_WISHLIST_TV_NAME = "//a[text()='LG LCD']/parent::h2/following-sibling::div[@class='actions']//a[text()='Add to Wishlist']";
	public static final String MESSAGE_ADD_TO_WISHLIST_SUCCESS = "//li[@class='success-msg']//span";
	public static final String SHARE_WISLIST_BUTTON = "//button[@title='Share Wishlist']";
	public static final String EMAIL_ADDRESS_TEXTAREA = "//textarea[@id='email_address']";
	public static final String MESSAGE_TEXTAREA = "//textarea[@id='message']";
	public static final String MESSAGE_SHARE_WISHLIST_SUCCESS = "//li[@class='success-msg']//span";
	public static final String TV_NAME_IN_MY_WISHLIST = "//h3[@class='product-name']/a[@title='LG LCD']";
	public static final String QTY_VALUE = "//input[contains(@class,'qty')]";
	
	public static final String SAMSUNG_LCD = "//h2[@class='product-name']/a[@title='Samsung LCD']";
	public static final String ADD_TO_REVIEW_LINK = "//p[@class='rating-links']/a[text()='Add Your Review']";
	public static final String SUBMIT_BUTTON = "//button[@title='Submit Review']";
	public static final String MESSAGE_EMPTY_WITH_FIELD_NAME = "//div[@class='validation-advice' and contains(@id,'%s')]";
	public static final String QUALITY_RADIO = "//input[@id='Quality 1_2']";
	public static final String THOUGHTS_TEXTAREA = "//textarea[@id='review_field']";
	public static final String SUMMARY_TEXTBOX = "//input[@id='summary_field']";
	public static final String NICKNAME_TEXTBOX = "//input[@id='nickname_field']";
	public static final String MESSAGE_ADD_TO_REVIEW_SUCCESS = "//li[@class='success-msg']//span";
	
	public static final String GO_TO_WISHLIST_LINK ="//div[@class='actions']/a[text()='Go to Wishlist']";
	public static final String ADD_TO_CART_BUTTON ="//button[@title='Add to Cart']";
	public static final String COUNTRY_DROPDOWN ="//select[@id='country']";
	public static final String STATE_DROPDOW ="//input[@id='region']";
	public static final String ZIP_TEXTBOX ="//input[@id='postcode']";
	public static final String ESTIMATE_BUTTON ="//button[@title='Estimate']";
	public static final String FLAT_RATE ="//dt[text()='Flat Rate']";
	public static final String PROCESSED_TO_CHECKOUT ="//ul[@class='checkout-types top']//button[@title='Proceed to Checkout']";
	public static final String COMPANY_TEXTBOX ="//input[@id='billing:company']";
	public static final String ADDRESS_TEXTBOX ="//input[@id='billing:street1']";
	public static final String STREET_ADDRESS2_TEXTBOX ="//input[@id='billing:street2']";
	public static final String CITY_TEXTBOX ="//input[@id='billing:city']";
	public static final String STATE_DROPDOWN_IN_BILLING ="//select[@id='billing:region_id']";
	public static final String ZIP_TEXTBOX_IN_BILLING ="//input[@id='billing:postcode']";
	public static final String COUNTRY_TEXTBOX_IN_BILLING ="//select[@id='billing:country_id']";
	public static final String TELEPHONE_TEXTBOX ="//input[@id='billing:telephone']";
	public static final String FAX_TEXTBOX ="//input[@id='billing:fax']";
	public static final String CONTINUE_BUTTON_IN_BILLING ="//button[@onclick='billing.save()']";
	public static final String CONTINUE_BUTTON_IN_SHIPPING ="//button[@onclick='shipping.save()']";
	public static final String CONTINUE_BUTTON_IN_SHIPPING_METHOD ="//button[@onclick='shippingMethod.save()']";
	public static final String CONTINUE_BUTTON_IN_PAYMENT ="//button[@onclick='payment.save()']";
	public static final String PLACE_ORDER ="//button[@onclick='review.save();']";
	public static final String CHECK_MONEY_ORDER ="//input[@value='checkmo']";
	
	
	
}
