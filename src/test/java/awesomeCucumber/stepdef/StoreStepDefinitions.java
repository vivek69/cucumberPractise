package awesomeCucumber.stepdef;

import org.openqa.selenium.WebDriver;

import awesomeCucumber.constants.EndPoint;
import awesomeCucumber.context.TestContext;
import awesomeCucumber.objects.Product;
import awesomeCucumber.pages.StorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StoreStepDefinitions {
	private final WebDriver driver;
	private TestContext context;
	public  StoreStepDefinitions(TestContext context) {
		driver=context.driver;
		this.context=context;
		
	}

	@Given("I am on store page")
	public void i_am_on_store_page() {
		new StorePage(driver).load(EndPoint.STORE.url);
		driver.manage().window().maximize();

	}

	@When("I add a {product} to the cart")
	public void i_add_a_blue_shoes_to_the_cart(Product product){
	new StorePage(driver).addToCart(product.getName());
	}

	@Given("I have a product in the cart")
	public void i_have_a_product_in_the_cart() throws InterruptedException {
		new StorePage(driver).addToCart("Blue Shoes");
		context.setContext("itemName", "Blue Shoes");
	}

}
