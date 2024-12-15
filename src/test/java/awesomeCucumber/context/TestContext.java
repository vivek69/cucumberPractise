package awesomeCucumber.context;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import awesomeCucumber.domainObjects.BillingDetails;

public class TestContext {
	public String scenarioName;
	public WebDriver driver;
	public BillingDetails billingDetails;
	Map<String,String>setData;
	
	public TestContext() {
		setData=new HashMap<>();
	}
	
	public void setContext(String key, String value) {
		setData.put(key, value);
	}
	
	public String getContext(String key) {
		return setData.get(key);
	}

}
