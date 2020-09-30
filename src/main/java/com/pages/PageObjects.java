package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects extends BasePage {

	public PageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;

	@FindBy(css = "li[class^='ajax_block_product']")
	public

	List<WebElement> itemsList;

	@FindBy(css = "span[class='continue btn btn-default button exclusive-medium']>span")
	public

	WebElement continueShopping;

	@FindBy(css = "a[title='Proceed to checkout']")
	public WebElement proceedToCheckout;

	@FindBy(css = "p[class^='cart_navigation']>a")
	public

	WebElement proceedToCheckoutSummaryPage;

	@FindBy(name = "processAddress")
	public WebElement proceedToCheckoutAddressPage;

	@FindBy(name = "processCarrier")
	public WebElement proceedToCheckoutShippingPage;

	@FindBy(css = "input[type='checkbox']")
	public WebElement agreeToTerms;

	@FindBy(css = "a[title='Pay by check.']")
	public WebElement payByCheck;

	@FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
	public WebElement confirmOrder;

	@FindBy(xpath = "//p[contains(text(),'Your order on My Store is complete.')]")
	public WebElement orderSuccess;

	@FindBy(id = "email")
	public WebElement emailObj;

	@FindBy(id = "passwd")
	public WebElement passwordObj;

	@FindBy(id = "SubmitLogin")
	public WebElement signInBtn;

	@FindBy(className = "login")
	public WebElement loginLink;

	@FindBy(id = "contact-link")
	public WebElement contactUs;

	@FindBy(css = "textarea[class='form-control']")
	public WebElement textArea;

	@FindBy(id = "submitMessage")
	public WebElement submitBtn;

	@FindBy(linkText = "Log In")
	public WebElement LogInLinkTest;

	@FindBy(name = "cardNumber")
	public WebElement cardNumber;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(xpath = "//span[contains(text(),'                     Login >                 ')]")
	public WebElement loginButton;

	@FindBy(xpath = "//a[contains(text(),'Manage booking')]")
	public WebElement manageBooking;

	@FindBy(id = "changeTimeButton_label")
	public WebElement changeTime;

	@FindBy(linkText = "Find the earliest available timeslot")
	public WebElement findEarliest;

	@FindBy(xpath = "//a[@class='available'][contains(text(),'9:') or contains(text(),'10:') or contains(text(),'11:') or contains(text(),'12:') or contains(text(),'1:')]/parent::td")
	public List<WebElement> availableSlots;

	@FindBy(id = "prevWeekButton_label")
	public WebElement prevWeekButton_label;

	@FindBy(id = "nextWeekButton_label")
	public WebElement nextWeekButton_label;

	@FindBy(css = "span[class='title']")
	public WebElement weekStarting;
	@FindBy(linkText = "Log Out")
	public WebElement LogOut;
	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	public WebElement clickYes;

}
