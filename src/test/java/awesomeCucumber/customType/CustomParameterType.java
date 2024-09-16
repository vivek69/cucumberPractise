package awesomeCucumber.customType;


import awesomeCucumber.objects.ProductName;
import io.cucumber.java.ParameterType;

public class CustomParameterType {
	
	
	@ParameterType(".*")
	public ProductName product(String name) {
		return new ProductName(name.replace("\"", ""));
	}

}
