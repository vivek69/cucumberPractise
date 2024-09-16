
package awesomeCucumber.stepdef;

import awesomeCucumber.objects.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDef{
	
	
	@Given("I am vivek")
	public void iAmVivek() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("I am vivek");
	}
	@When("I add a product")
	public void iAddAProduct() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I add a producct!!");
	}
	@Then("I see product")
	public void iSeeProduct() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I see a prduct in the cart");
	}

@Given("I am on the store/product page")
public void iAmOnTheStorePage() {
    // Write code here that turns the phrase above into concrete actions
System.out.println("I am on store page");   
}
/*
@When("I add a {string} to the cart")
public void iAddAToTheCart(String string) {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("I add a "+string+" to the cart");
}
*/

@When("I add a {product} to the cart")
public void iAddAToTheCart(Product product) {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Product Name  "+product.getName());
   
}
@Then("I see {int} {product} in the cart")
public void iSeeInTheCart(Integer int1, Product product) {
	  System.out.println("I see "+int1+" "+product.getName()+" to the cart");
}

//optional text
@Then("I see {int} product(s) in my cart")
public void iSeeProductInMyCart(Integer int1) {
	System.out.println("I see "+int1+" product(s) in the cart");
}


}