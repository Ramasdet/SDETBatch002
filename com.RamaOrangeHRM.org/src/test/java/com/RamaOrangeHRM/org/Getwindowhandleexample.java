package com.RamaOrangeHRM.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandleexample {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(4000);
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(4000);
		Set<String> windowids = driver.getWindowHandles();

		System.out.println(windowids);
		Thread.sleep(4000);
		driver.quit();

	}

}
