package awesomeCucumber.stepdef;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import awesomeCucumber.domainObjects.BillingDetails;
import awesomeCucumber.factory.DriverFactory;
import awesomeCucumber.objects.ProductName;
import awesomeCucumber.pages.CartPage;
import awesomeCucumber.pages.CheckOutPage;
import awesomeCucumber.pages.StorePage;
import awesomeCucumber.customType.CustomParameterType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Product;

public class MyStepDefinitions {
private WebDriver driver;
private BillingDetails billingDetails;


@ParameterType(".*")
public ProductName product(String name) {
	return new ProductName(name.replace("\"", ""));
}
	

@Given("I am on store page")
public void i_am_on_store_page() {
	driver=DriverFactory.getDriver();
	new StorePage(driver).load("https://askomdch.com/store/");
	driver.manage().window().maximize();

}

@When("I add a {product} to the cart")
public void i_add_a_blue_shoes_to_the_cart(ProductName productName){
new StorePage(driver).addToCart(productName.getName());
}

@Then("I should see {int} {product} in the cart")
public void i_should_see_in_the_cart(int quantity, ProductName productn) {
    	CartPage cartPage=new CartPage(driver);
    	
    	Assert.assertEquals(cartPage.getProductName(), productn.getName());
    	Assert.assertEquals(cartPage.getProductQuantity(), quantity);
}


@Given("I'm a guest customer")
public void i_m_a_guest_customer() {
	driver=DriverFactory.getDriver();
	new StorePage(driver).load("https://askomdch.com/store/");
}

@Given("My billing details are")
public void my_billing_details_are(BillingDetails billingDetails) {
			this.billingDetails=billingDetails;  
}

@Given("I have a product in the cart")
public void i_have_a_product_in_the_cart() throws InterruptedException {
	new StorePage(driver).addToCart("Blue Shoes");
}

@Given("I'm on checkout page")
public void i_m_on_checkout_page() {
 new CartPage(driver).checkOut();
}

@When("I provide billing details")
public void i_provide_billing_details() {
CheckOutPage checkOutPage=new CheckOutPage(driver);
checkOutPage.setBillingDetails(billingDetails);
}

@When("I place an order")
public void i_place_an_order() throws InterruptedException {
	new CheckOutPage(driver).placeOrder();
}

@Then("The order should be placed successfully")
public void the_order_should_be_placed_successfully() {
String actualNotice=new CheckOutPage(driver).getNotice();
Assert.assertEquals("Thank you. Your order has been received.", actualNotice);

}

}
