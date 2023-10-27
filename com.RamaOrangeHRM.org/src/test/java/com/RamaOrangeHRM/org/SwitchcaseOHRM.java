package com.RamaOrangeHRM.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchcaseOHRM {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement un = driver.findElement(By.name("username"));
		un.sendKeys("Admin");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("admin123");
		WebElement lgn = driver.findElement(By.xpath("//button"));
		lgn.click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Dashboard']"))));

		int a = 1;
		switch (a) {
		case 1:
			driver.findElement(By.xpath("//span[text()='Admin']")).click();
			driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Rama");
			driver.findElement(By.xpath("(//*[text()='Paul Collings'])[1]")).click();
			Thread.sleep(3000);

		}

	}

}
