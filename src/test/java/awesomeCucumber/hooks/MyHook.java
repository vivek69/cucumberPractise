package awesomeCucumber.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import awesomeCucumber.context.TestContext;
import awesomeCucumber.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class MyHook {
private WebDriver driver;
private final TestContext context;

public MyHook(TestContext context) {
	this.context=context;
	
}

@Before(order=0)
public void skip_scenario(Scenario scenario) {
	System.out.println("Skip scenario is :: "+scenario.getName());
	
}

@Before(order=1)
public void before(Scenario scenario)
{
	System.out.println("Before Thread id : "+Thread.currentThread().getId()+"  ,"+
       "Scenario name ;"+scenario.getName());
	driver=DriverFactory.initializeDriver(System.getProperty("browser","chrome"));
	context.driver=driver;
}

@After
public void after(Scenario scenario) {
	System.out.println("After Thread id : "+Thread.currentThread().getId()+"  ,"+
		       "Scenario name ;"+scenario.getName());
	driver.quit();
}

@AfterStep
public void addScreenshot(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

scenario.attach(screenshot, "image/png", scenario.getName());

}


}
