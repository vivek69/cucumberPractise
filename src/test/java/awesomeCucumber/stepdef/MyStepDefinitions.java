package awesomeCucumber.stepdef;

import org.openqa.selenium.WebDriver;


import org.testng.Assert;
//import org.junit.Assert;

import awesomeCucumber.constants.EndPoint;
import awesomeCucumber.context.TestContext;
import awesomeCucumber.domainObjects.BillingDetails;
import awesomeCucumber.factory.DriverFactory;
import awesomeCucumber.objects.Product;
import awesomeCucumber.pages.CartPage;
import awesomeCucumber.pages.CheckOutPage;
import awesomeCucumber.pages.StorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepDefinitions {
private final WebDriver driver;
private BillingDetails billingDetails;

/*
@ParameterType(".*")
public ProductName product(String name) {
	return new ProductName(name.replace("\"", ""));
}*/
	
public MyStepDefinitions(TestContext context) {
driver=context.driver;	
}





}
