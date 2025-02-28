package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//100% cucumber execution using static parameters
@CucumberOptions(features="src/main/java/feature",glue="steps",monochrome=true,publish=true)
public class RunnerClass extends AbstractTestNGCucumberTests {

}
