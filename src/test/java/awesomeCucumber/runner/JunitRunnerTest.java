
  package awesomeCucumber.runner;
  
  import io.cucumber.junit.Cucumber;
  import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.AfterClass; 
  import org.junit.BeforeClass; 
  import org.junit.runner.RunWith;
  
  @RunWith(Cucumber.class)
  
  @CucumberOptions(
		  plugin = {"pretty", "html:target/cucumber.html"},
		  snippets = CAMELCASE
		  
		  )
  public class JunitRunnerTest{
  
  @BeforeClass 
  public static void beforeClass() {
  System.out.println("\n In Before class \n"); }
  
  @AfterClass
  public static void afterClass() {
  System.out.println("\n In after calss \n"); } }
 