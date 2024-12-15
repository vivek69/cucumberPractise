package awesomeCucumber.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import awesomeCucumber.context.TestContext;
import awesomeCucumber.domainObjects.BillingDetails;
import awesomeCucumber.pages.CartPage;
import awesomeCucumber.pages.CheckOutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutStepDefinitions {
   private final WebDriver driver;
   private TestContext context;
   
   public CheckOutStepDefinitions(TestContext context) {
	   this.context=context;   
	   driver=context.driver;
         
   }


@Given("I'm on checkout page")
public void i_m_on_checkout_page() {
 new CartPage(driver).checkOut();
}

@When("I provide billing details")
public void i_provide_billing_details() {
CheckOutPage checkOutPage=new CheckOutPage(driver);
checkOutPage.setBillingDetails(context.billingDetails);
}

@When("I verify the added product")
public void I_verify_the_added_product() {
	String productName=context.getContext("itemName");
	////*[@id='order_review']//table//td[contains(text(),'Blue Shoes')]
CheckOutPage checkOutPage=new CheckOutPage(driver);
checkOutPage.verifyAddedProduc(productName);

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
