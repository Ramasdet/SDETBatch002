package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(		
		features = "C:\\Users\\jsrao\\eclipse-workspace\\com.RamaOrangeHRM.org\\src\\test\\resources\\Features\\Datatable3.feature",
		glue = "stepDefinations",
		stepNotifications = true,
		plugin = {"pretty", "html:target/cucumberreports.html"},
		dryRun = false,
		tags = ("@Smoke , @Regression")
		)


public class Runner {

}
