package rama.automation.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitlepagesourcecurrenturl {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(4000);

		driver.findElement(By.tagName("button")).click();

		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		
		String code = driver.getPageSource();

		System.out.println(code);

		Thread.sleep(2000);

		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		Thread.sleep(2000);
	}

}
