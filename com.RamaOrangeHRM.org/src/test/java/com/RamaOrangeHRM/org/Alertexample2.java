package com.RamaOrangeHRM.org;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertexample2 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		driver.get("https://nxtgenaiacademy.com/alertandpopup/");

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("alertbox"))));

		driver.findElement(By.name("alertbox")).click();

		wait.until(ExpectedConditions.alertIsPresent());

		Alert popup = driver.switchTo().alert();

		Thread.sleep(4000);
		popup.accept();

		Thread.sleep(4000);

	}

}
