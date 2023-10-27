package com.RamaOrangeHRM.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v112.page.model.PrerenderFinalStatus;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionsclasswithiframe {

//	private static PrerenderFinalStatus String = null;

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Actions action = new Actions(driver);
		driver.get("https://www.globalsqa.com/demo-site/sorting/#Portlets");
		WebElement ee=driver.findElement(By.xpath("(//iframe)[4]"));
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1"))));
		driver.switchTo().frame(ee);
		Thread.sleep(4000);
		//driver.findElement(By.xpath("(//*[@class='ui-icon ui-icon-minusthick portlet-toggle'])[1]")).click();
		WebElement source = driver.findElement(By.xpath("//span[text()='Shopping']"));
		WebElement target = driver.findElement(By.xpath("//span[text()='Feeds']"));

		Thread.sleep(4000);
		action.clickAndHold(source).perform();
		Thread.sleep(4000);
	//	action.
		action.release(target).perform();

		action.dragAndDrop(source, target).perform();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.quit();

	}

}
