
  package awesomeCucumber.runner;
  
  import org.testng.annotations.AfterClass;
  import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests; 
  import io.cucumber.testng.CucumberOptions; 
  import io.cucumber.testng.CucumberOptions.SnippetType;
  
  @CucumberOptions( plugin = {"pretty","rerun:target/failed.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, snippets = SnippetType.CAMELCASE,monochrome = true, // tags="@prod",
		  glue ={"awesomeCucumber.stepdef","awesomeCucumber.hooks","awesomeCucumber.types"
  ,"awesomeCucumber.customType"},
		  tags="not @Skip",
  features="src/test/resources/awesomecucumber" )
  
  public class TestNGRunnerTest extends AbstractTestNGCucumberTests {
	  @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
  
  @BeforeClass 
  public void beforeClass() {
  System.out.println("\n In before class \n"); }
  
  @AfterClass 
  public void afterClass() {
  System.out.println("\n In after class \n"); }
  
  }
  
 