package awesomeCucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {
@FindBy(xpath = "//td[@class='product-name']//a")private WebElement productNameFild;
@FindBy(xpath = "//input[@type='number']")private WebElement productQunatity;
@FindBy(xpath = "//a[normalize-space(text())='Proceed to checkout']")private WebElement proceedToCheckOutButton;

	
	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	public String getProductName() {
		return wait.until(ExpectedConditions.visibilityOf(productNameFild)).getText();
	}
	
	public int getProductQuantity() {
		return Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(productQunatity))
				.getAttribute("value"));
	}
	
	public void checkOut() {
		wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckOutButton)).click();
	}

}
