package rama.automation.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.CDATASection;

public class Selectclass1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(4000);
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(4000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);

		driver.findElement(By.id("Password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
		 
		 
		Thread.sleep(2000);

		WebElement category = driver.findElement(By.id("SearchCategoryId"));

		Thread.sleep(2000);

		Select selection = new Select(category);

		selection.selectByVisibleText("Electronics");

		Thread.sleep(3000);

		selection.selectByValue("12");

		Thread.sleep(3000);
		selection.selectByIndex(1);
		Thread.sleep(3000);

		List<WebElement> options = selection.getOptions();

		int count = options.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String val = options.get(i).getText();
			System.out.println(val);

		}
		Thread.sleep(6000);
		driver.quit();

	}

}
