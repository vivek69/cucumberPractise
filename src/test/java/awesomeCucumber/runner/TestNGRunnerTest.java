
  package awesomeCucumber.runner;
  
  import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests; 
  import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
  
  @CucumberOptions(
		  plugin = {"pretty"},
		  snippets = SnippetType.CAMELCASE,
		  monochrome = true,
		 tags="@prod",
		  glue = {"awesomeCucumber.stepdef","awesomeCucumber.hooks","awesomeCucumber.types"},
		  features="src/test/resources/awesomecucumber"
		  )
  public class TestNGRunnerTest extends AbstractTestNGCucumberTests {
	  
	  
	  @BeforeClass
	  public  void beforeClass() {
		  System.out.println("\n In before class \n");
	  }
	  
	  @AfterClass
	  public  void afterClass() {
		  System.out.println("\n In after class \n");
	  }
	  
  }
  
 