package awesomeCucumber.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import awesomeCucumber.context.TestContext;
import awesomeCucumber.objects.Product;
import awesomeCucumber.pages.CartPage;
import io.cucumber.java.en.Then;

public class CartStepDefinitions {
	private final WebDriver driver;
	
	public  CartStepDefinitions(TestContext context) {
      driver=context.driver;
	}

	@Then("I should see {int} {product} in the cart")
	public void i_should_see_in_the_cart(int quantity, Product productn) {
	    	CartPage cartPage=new CartPage(driver);
	    	
	    	Assert.assertEquals(cartPage.getProductName(), productn.getName());
	    	Assert.assertEquals(cartPage.getProductQuantity(), quantity);
	}

}
