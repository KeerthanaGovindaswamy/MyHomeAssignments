package runner;
//this is to execute the test steps using testNG
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseclassforDriverObject;
//to execute all the test cases give package name feature


//when we use testNG annotations @BeforeMethod it is executed before each test case after making some changes

@CucumberOptions(features="src/main/java/features",glue="steps",monochrome=true,publish=true,tags="@Regression or @Sanity") //mention the path name of feature file and the package name of test steps
public class CucumberRunner extends BaseclassforDriverObject {

}

//when we use hooks it will check for @Before which has to be executed before each scenario
/*@CucumberOptions(features="src/main/java/features/Login.feature",glue="steps",monochrome=true,publish=true) //mention the path name of feature file and the package name of test steps
public class CucumberRunner extends AbstractTestNGCucumberTests {

}*/
