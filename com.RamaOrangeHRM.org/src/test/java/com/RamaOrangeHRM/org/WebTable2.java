package com.RamaOrangeHRM.org;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(60));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FOrder%2FList");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[text()=' Dashboard']/following::p)[11]")).click();
		Thread.sleep(4000);

		//driver.findElement(By.xpath("//p[text()=' Orders']")).click();

		Thread.sleep(4000);
		List<WebElement> allrows = driver.findElements(By.xpath("//div[@class='col-md-12']//div[2]//tr"));
		List<WebElement> allcolumns = driver
				.findElements(By.xpath("//div[@class='dataTables_scroll']/div[2]//tr[2]/td"));

		int rcount = allrows.size();
		int ccount = allcolumns.size();
		System.out.println("all Row count:" + rcount);
		System.out.println("all column count:" + ccount);
		for (int i =1; i <= rcount; i++) {
			for (int j =1; j <= ccount; j++) {
				String val = driver.findElement(By.xpath("//div[@class='dataTables_scroll']/div[2]//tr[" + i + "]/td[" + j + "]")).getText();

				System.out.print("  " + val);
			}
		
		System.out.println();
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
