package com.RamaOrangeHRM.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownSendKeys1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[text()='Directory']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='Type for hints...']")).sendKeys("orange");
		Thread.sleep(4000);
		WebElement en = driver.findElement(By.xpath("//*[@placeholder='Type for hints...']"));
		en.sendKeys(Keys.DOWN, Keys.ENTER, Keys.TAB);
		WebElement ur = driver.findElement(By.xpath("(//*[@class='oxd-select-text-input'])[1]"));
		ur.click();
		ur.sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
		Thread.sleep(4000);
	WebElement	location=driver.findElement(By.xpath("(//*[@class='oxd-select-text-input'])[2]"));
	
	location.click();
	location.sendKeys(Keys.DOWN,Keys.ENTER);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(3000);
	driver.quit();
	}

}
