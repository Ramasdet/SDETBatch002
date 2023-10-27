package testNgGroupDiscussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg2 {

	WebDriver driver = new ChromeDriver();

	@BeforeClass(alwaysRun = true)
	public void setup() {

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
	}

	@AfterClass
	public void teardwn() throws Exception {

		Thread.sleep(4000);
		driver.quit();
	}

	@Test
	public void Recruitment() throws Exception {
		driver.findElement(By.xpath("(//*[text()='Recruitment'])[1]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//*[text()='Vacancies'])[1]")).click();
		Thread.sleep(4000);
		WebElement title = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		title.click();
		Thread.sleep(3000);
		title.sendKeys(Keys.DOWN);
		title.sendKeys(Keys.ENTER);
		title.sendKeys(Keys.TAB,Keys.DOWN,Keys.ENTER,Keys.TAB,Keys.DOWN,Keys.ENTER,Keys.TAB,Keys.DOWN,Keys.ENTER);
		Thread.sleep(4000);
		//WebElement vacancy = driver.findElement(By.xpath("(//div[text()='-- Select --'])[2]"));
		//vacancy.click();
		//Thread.sleep(3000);
		//vacancy.sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER);
		//vacancy.sendKeys(Keys.ENTER);
		//Thread.sleep(4000);
		//WebElement hm = driver.findElement(By.xpath("(//div[text()='-- Select --'])[3]"));
		//hm.click();
		//Thread.sleep(4000);
		//hm.sendKeys(Keys.DOWN);
		//hm.sendKeys(Keys.ENTER);
		//hm.sendKeys(Keys.TAB,Keys.DOWN,Keys.ENTER);
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
	}
}

