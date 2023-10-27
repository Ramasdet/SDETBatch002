package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\jsrao\\eclipse-workspace\\com.RamaOrangeHRM.org\\src\\test\\resources\\Features\\EndToEndCucumber.feature",
		glue = {"stepDefinations"},
		stepNotifications = true,
		plugin = {"pretty","html:cucumber-reports"},
		dryRun = false,
		tags = ("@Flow or @Real")

)

public class Runner2 {

}
