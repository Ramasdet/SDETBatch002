package testNGMyPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataprovoderIntegrateTest {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setup() {

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(dataProviderClass = DataproviderEx1.class, dataProvider = "ramaData")
	public void oHRMLogin(String a, String b) {
		driver.findElement(By.name("username")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);
		driver.findElement(By.tagName("button")).click();
	}

	@AfterTest(alwaysRun=true)
	public boolean verifyDashboard() throws Exception {
		WebElement val = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		boolean result = val.isDisplayed();
		return result;

	}
}