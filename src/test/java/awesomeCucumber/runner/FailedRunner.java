
  package awesomeCucumber.runner;
  
  import org.testng.annotations.AfterClass;
  import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests; 
  import io.cucumber.testng.CucumberOptions; 
  import io.cucumber.testng.CucumberOptions.SnippetType;
  
  @CucumberOptions( plugin = {"pretty"}, snippets = SnippetType.CAMELCASE,monochrome = true, // tags="@prod",
		  glue ={"awesomeCucumber.stepdef","awesomeCucumber.hooks","awesomeCucumber.types"
  ,"awesomeCucumber.customType"},
  features="@target/failed.txt" )
  
  public class FailedRunner extends AbstractTestNGCucumberTests {
	    }
   
  
  
 