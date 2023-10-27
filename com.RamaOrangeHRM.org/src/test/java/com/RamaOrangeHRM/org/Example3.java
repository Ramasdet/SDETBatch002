package com.RamaOrangeHRM.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static  void main(String[] args)throws Exception {
		
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		WebElement un = driver.findElement(By.name("username"));
		
		un.sendKeys("Admin");
		
		Thread.sleep(3000);
		
		WebElement xyz=driver.findElement(By.name("password"));
		
		xyz.sendKeys("admin123");
		
		Thread.sleep(2000);
		
		WebElement log = driver.findElement(By.tagName("button"));
		
		log.click();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]")).sendKeys("mokshi");
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
