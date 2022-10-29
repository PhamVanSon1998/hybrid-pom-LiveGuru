package PageUI;

public class HomePageBackEndUI {
	public static final String USER_NAME_BACKEND_TEXTBOX ="//input[@name='login[username]']";
	public static final String PASSWORD_BACKEND_TEXTBOX ="//input[@name='login[password]']";
	public static final String LONGIN_BACKEND_BUTTON ="//input[@title='Login']";
	
	public static final String CLOSE_POPUP ="//a[@title='close']";
	public static final String EMAIL_IN_BACKEND ="//td[contains(text(),'%s')]";
	
	public static final String CHECKBOX_WITH_EMAIL ="//td[contains(text(),'%s')]/preceding::td/input[@class='massaction-checkbox']";
	public static final String DELETE_DROPDOWN ="//select[@id='customerGrid_massaction-select']";
	public static final String SUBMIT_BUTTON ="//span[text()='Submit']";
}
