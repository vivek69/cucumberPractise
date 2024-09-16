package awesomeCucumber.hooks;
/*
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class CucumberHooks {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("\n In Before all \n");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("\n In after all \n");
	}
	
	@Before("@scenarioD")
	public static void before(Scenario scenario) {
		System.out.println("\n In before hook \n");
		System.out.println("Scenario Name = "+scenario.getName());
		System.out.println("Scenario Line = "+scenario.getLine());
		System.out.println("Scenario Tags = "+scenario.getSourceTagNames());
		System.out.println("Scenario Status= "+scenario.getStatus());
		System.out.println("Scenario URI = "+scenario.getUri());
		System.out.println("Scenario failed = "+scenario.isFailed() + "\n");
		
	}
	/*
	@BeforeStep
	public static void beforeStep() {
		System.out.println("this is before step");
	}
	
	@AfterStep
	public static void AfterStep() {
		System.out.println("this is After step");
	}
	
	@After
	public static void After() {
		System.out.println("\n In After hook \n");
	}
}
*/