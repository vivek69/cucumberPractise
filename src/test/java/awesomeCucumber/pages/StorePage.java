package awesomeCucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage {

	@FindBy(xpath = "//a[@title='View cart']")private WebElement viewCart;
	public StorePage(WebDriver driver) {
		super(driver);
	}
	
	public void addToCart(String productName) {
		By addToCartButton=By.xpath("//a[@aria-label='Add �"+productName+"� to your cart']");
		wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(viewCart)).click();
	}

}
