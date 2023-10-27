package com.RamaOrangeHRM.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionsclassexample3 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://demo.openmrs.org/openmrs/referenceapplication/login.page");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='w-auto']"))));

		WebElement un = driver.findElement(By.name("username"));

		Actions action = new Actions(driver);
		Thread.sleep(4000);
		action.sendKeys(un, "rama").perform();
		Thread.sleep(4000);

		WebElement pwd = driver.findElement(By.name("password"));
		Thread.sleep(4000);
		action.sendKeys(pwd, "123").perform();
		Thread.sleep(4000);
		WebElement lab = driver.findElement(By.id("Laboratory"));
		Thread.sleep(2000);
		action.click(lab).perform();
		Thread.sleep(4000);
		
		WebElement lgn=driver.findElement(By.id("loginButton"));
		Thread.sleep(2000);
		action.click(lgn).perform();
		Thread.sleep(4000);

	}

}
