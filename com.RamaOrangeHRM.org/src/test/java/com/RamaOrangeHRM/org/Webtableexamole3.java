package com.RamaOrangeHRM.org;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webtableexamole3 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");
		Thread.sleep(4000);
		List<WebElement> allRows = driver.findElements(By.xpath("//table/tbody/tr"));

		int rcount = allRows.size();
		List<WebElement> allColumns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		int ccount = allColumns.size();

		System.out.println("Total Rowscount is:" + rcount);
		System.out.println("Total Columnscount is:" + ccount);
		for (int i = 1; i <= rcount; i++) {

			for (int j = 1; j <= ccount; j++) {
				String val = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + j + "]")).getText();

				System.out.print(" " + val);

			}
			System.out.println();
		}
	
		
		Thread.sleep(5000);
		driver.quit();

	}

}
