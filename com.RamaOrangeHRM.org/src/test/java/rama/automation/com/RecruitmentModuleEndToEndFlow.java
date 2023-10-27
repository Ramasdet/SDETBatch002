package rama.automation.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecruitmentModuleEndToEndFlow {
	String un = "Admin";
	String pws = "admin123";

	public static void main(String[] args) throws Exception {

		RecruitmentModuleEndToEndFlow reef = new RecruitmentModuleEndToEndFlow();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(reef.un);
		driver.findElement(By.name("password")).sendKeys(reef.pws);
		driver.findElement(By.tagName("button")).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("input")))).click();

		System.out.println("login is done");

		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		driver.findElement(By.xpath("//a[text()='Vacancies']")).click();
		
		driver.navigate().refresh();

		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		Actions action =new Actions(driver);
		Thread.sleep(3000);

		action.click().perform();

		dropdown.sendKeys(Keys.DOWN);
		dropdown.sendKeys(Keys.ENTER);

	}

}
