package com.RamaOrangeHRM.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LeaveEndToEndFlow {

	String un = "Admin";
	String pws = "admin123";

	public static void main(String[] args) throws Exception {

		String fd = "2023-08-30";
		String td = "2023-09-2";

		LeaveEndToEndFlow leef = new LeaveEndToEndFlow();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys(leef.un);
		driver.findElement(By.name("password")).sendKeys(leef.pws);
		driver.findElement(By.tagName("button")).click();

		if (driver.findElement(By.xpath("//button[@role='none']")).isDisplayed()) {

			System.out.println("Login done successfully");

			driver.findElement(By.xpath("(//*[text()='Leave'])[1]")).click();
			driver.findElement(By.xpath("(//*[text()='My Leave'])[1]")).click();
			driver.findElement(By.xpath("(//*[@placeholder='yyyy-mm-dd'])[1]")).sendKeys(fd);
			driver.findElement(By.xpath("(//*[@placeholder='yyyy-mm-dd'])[2]")).sendKeys(td);
			driver.navigate().refresh();
			WebElement select = driver.findElement(By.xpath("(//*[@class='oxd-select-text-input'])[1]"));
			
			
			driver.findElement(By.xpath("(//*[@class='oxd-icon bi-x --clear'])[1]")).click();
			driver.findElement(By.xpath("(//*[@class='oxd-icon bi-x --clear'])[2]")).click();
			driver.findElement(By.xpath("(//*[@class='oxd-icon bi-x --clear'])[3]")).click();
			//driver.findElement(By.xpath("(//*[@class='oxd-icon bi-x --clear'])[4]")).click();
			//driver.findElement(By.xpath("(//*[@class='oxd-icon bi-x --clear'])[5]")).click();
			
			//if(driver.findElement(By.xpath("//span[text()='Required']")).isDisplayed()) {
				
			//System.out.println("Required is display successfully");
			
			select.click();
			Thread.sleep(3000);
			select.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			select.click();
			Thread.sleep(3000);
			select.sendKeys(Keys.DOWN);
			Thread.sleep(3000);
			select.sendKeys(Keys.DOWN);
			Thread.sleep(3000);
			select.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			}

		}
	}

