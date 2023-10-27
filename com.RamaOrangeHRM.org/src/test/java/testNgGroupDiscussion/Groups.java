package testNgGroupDiscussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Groups {

	WebDriver driver = new ChromeDriver();

	@Test(priority=0,groups="pim")
	
		
	
	public void ohrmLogin() throws Exception {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//*[text()=' Add ']")).click();
		
		}
	//	@Parameters({"fn","mn","ln"})
		@Test(priority=2)
		public void click1() {
		driver.findElement(By.name("firstName")).sendKeys("shareef");
		
		driver.findElement(By.name("middleName")).sendKeys("sdet");
		driver.findElement(By.name("lastName")).sendKeys("batch");
		WebElement val = driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]"));
		val.clear();
		val.sendKeys("122");
		}
		
		@Test(priority=1)
		public void click() throws Exception {
		driver.findElement(By.xpath("//*[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
		Thread.sleep(3000);

	}
	//@Parameters({"un" ,"pws"})
	@BeforeTest(alwaysRun=true)
	public void setup() {

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();

	}
}
