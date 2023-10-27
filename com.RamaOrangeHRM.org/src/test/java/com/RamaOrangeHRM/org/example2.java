package com.RamaOrangeHRM.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {

	public static void main(String[] args) throws Exception { 
		
		ChromeDriver driver = new ChromeDriver();		
		
		
	Thread.sleep(2000);
		
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
		
	driver.get(("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
		
		Thread.sleep(6000);
	
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 
		 Thread.sleep(1000);
		 
			driver.findElement(By.name("password")).sendKeys("admin123");
			
			Thread.sleep(2000);
			
			driver.findElement(By.tagName("button")).click();
			
			Thread.sleep(7000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("mokshi");
			
			Thread.sleep(3000);
			
			driver.findElement(By.tagName("BUTTON")).click();
			
			Thread.sleep(3000);
			
			driver.quit();
	}
		
	}
		
	


