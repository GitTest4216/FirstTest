import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:test-output/Reports/KETU.html", "json:target/test-output/Reports",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 	
				//features = {"./Test"}
features = {"./Features"}
,tags = "@PositiveFlow"
		)

public class cucumberRunner {
 
}