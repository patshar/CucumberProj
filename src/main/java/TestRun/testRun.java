package TestRun;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\Pratima Sharma\\eclipse-workspace\\cucumberProj\\src\\main\\java\\features\\login.feature",
		glue = {"stepDefinition"},
        format= {"pretty","html:Testout.html","junit:junit_report/test.xml","json:json_output/test.json"},
        monochrome=true,  //display the console output in proper readable format
        strict=true,
        dryRun=false)
		

public class testRun {

}
