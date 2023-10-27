package rama.automation.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Paisasetting1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://paisa.darwinbox.in/");
		driver.findElement(By.name("UserLogin[username]")).sendKeys("VIP1234");
		driver.findElement(By.name(("UserLogin[password]"))).sendKeys("012345678");
		driver.findElement(By.name("login-submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[starts-with(text(),'Task Box')])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='directory-avatar'])[3]")).click();
		driver.findElement(By.xpath("(//*[starts-with(text(),'Switch to Admin')])[2]")).click();

		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("(//p[text()='Settings'])[2]"))));

		WebElement val = driver.findElement(By.xpath("(//p[text()='Settings'])[2]"));
		
//		val.click();
		
		Actions action = new Actions(driver);

		Thread.sleep(4000);

		action.moveToElement(val).perform();
		
		Thread.sleep(4000);
		
		action.click().perform();

	}

}
