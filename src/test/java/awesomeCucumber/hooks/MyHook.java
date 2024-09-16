package awesomeCucumber.hooks;

import org.openqa.selenium.WebDriver;

import awesomeCucumber.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHook {
private WebDriver driver;


@Before
public void before()
{
	driver=DriverFactory.initializeDriver();
}

@After
public void after() {
	driver.quit();
}

}
