package awesomeCucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import awesomeCucumber.domainObjects.BillingDetails;

public class CheckOutPage extends BasePage {
@FindBy(id="billing_first_name")private WebElement firstName;
@FindBy(id="billing_last_name")private WebElement lastName;
@FindBy(id="billing_address_1")private WebElement address;
@FindBy(id="billing_city")private WebElement city;
@FindBy(id="billing_postcode")private WebElement zipCode;
@FindBy(id="billing_email")private WebElement email;
@FindBy(id="place_order")private WebElement placeOrder;
@FindBy(xpath ="//p[normalize-space(text())='Thank you. Your order has been received.']")private WebElement noticeText;

	public CheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public CheckOutPage enterBillingFirstName(String billingFirstName) {
		WebElement e=wait.until(ExpectedConditions.visibilityOf(firstName));
		e.clear();
		e.sendKeys(billingFirstName);
		return this;
	}
	
	public CheckOutPage enterBillingLastName(String billingLastName) {
		WebElement e=wait.until(ExpectedConditions.visibilityOf(lastName));
		e.clear();
		e.sendKeys(billingLastName);
		return this;
	}
	

	public CheckOutPage enterBillingAddress(String billingAddress) {
		WebElement e=wait.until(ExpectedConditions.visibilityOf(address));
		e.clear();
		e.sendKeys(billingAddress);
		return this;
	}
	public CheckOutPage enterBillingCity(String billingCity) {
		WebElement e=wait.until(ExpectedConditions.visibilityOf(city));
		e.clear();
		e.sendKeys(billingCity);
		return this;
	}
	

	public CheckOutPage enterBillingZipCode(String billingZipCode) {
		WebElement e=wait.until(ExpectedConditions.visibilityOf(zipCode));
		e.clear();
		e.sendKeys(billingZipCode);
		return this;
	}
	public CheckOutPage enterBillingEmail(String billingEmail) {
		WebElement e=wait.until(ExpectedConditions.visibilityOf(email));
		e.clear();
		e.sendKeys(billingEmail);
		return this;
	}

	
	public CheckOutPage setBillingDetails(BillingDetails billingDetails) {
	return 	enterBillingFirstName(billingDetails.getBillingFirstName()).
			enterBillingLastName(billingDetails.getBillingLastName()).
			enterBillingAddress(billingDetails.getBillingAddress()).
			enterBillingCity(billingDetails.getBillingCity()).
			enterBillingZipCode(billingDetails.getBillingZip()).
			enterBillingEmail(billingDetails.getBillingEmail());
	}
	
	public CheckOutPage placeOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(placeOrder)).click();;
		return this;
	}
	public String getNotice() {
		return wait.until(ExpectedConditions.visibilityOf(noticeText)).getText();
	}

	public void verifyAddedProduc(String productName) {
		//Assert.assertTrue(false);
		WebElement ele=driver.findElement(By.xpath("//*[@id='order_review']//table//td[contains(text(),'"+productName+"')]"));
		Assert.assertTrue(ele.isDisplayed(), "Product name is not display");
	}
}
