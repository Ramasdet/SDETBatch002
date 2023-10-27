package com.RamaOrangeHRM.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionsclassexaple1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("username"))));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Dashboard']"))));
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		WebElement ele = driver.findElement(By.xpath("//*[text()='Reports']"));
		Actions action = new Actions(driver);
		Thread.sleep(6000);
		action.moveToElement(ele).perform();
		Thread.sleep(6000);
		action.doubleClick(driver.findElement(By.xpath("//*[@class='oxd-topbar-header-userarea']"))).perform();
		Thread.sleep(10000);
		driver.quit();

	}

}
