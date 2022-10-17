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
	
}
