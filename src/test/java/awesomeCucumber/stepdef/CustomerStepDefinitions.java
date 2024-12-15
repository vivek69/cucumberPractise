package awesomeCucumber.stepdef;

import org.openqa.selenium.WebDriver;

import awesomeCucumber.constants.EndPoint;
import awesomeCucumber.context.TestContext;
import awesomeCucumber.domainObjects.BillingDetails;
import awesomeCucumber.pages.StorePage;
import io.cucumber.java.en.Given;

public class CustomerStepDefinitions {
private final WebDriver driver;
private TestContext context;

public CustomerStepDefinitions(TestContext context) {
    driver=context.driver;
    this.context=context;
}

@Given("My billing details are")
public void my_billing_details_are(BillingDetails billingDetails) {
			context.billingDetails=billingDetails;  
}

@Given("I'm a guest customer")
public void i_m_a_guest_customer() {
	new StorePage(driver).load(EndPoint.STORE.url);
}


}
