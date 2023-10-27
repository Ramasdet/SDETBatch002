package com.RamaOrangeHRM.org;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertexample1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.get("https://demoqa.com/alerts");
		wait.until(
				ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("(//*[text()='Alerts'])[1]"))));
		driver.findElement(By.id("alertButton")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert popup = driver.switchTo().alert();

		Thread.sleep(5000);
		String val = popup.getText();
		System.out.println(val);
		Thread.sleep(5000);

		popup.accept();
		Thread.sleep(5000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(5000);
		Alert confirm = driver.switchTo().alert();
		confirm.dismiss();
		Thread.sleep(5000);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(5000);
		Alert data = driver.switchTo().alert();
		Thread.sleep(5000);
		data.sendKeys("RAMA");
		Thread.sleep(5000);
		driver.quit();

	}

}
