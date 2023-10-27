package rama.automation.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitleexample {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(4000);

		String title = driver.getTitle();

		System.out.println(title);
		Thread.sleep(4000);
		String cul = driver.getCurrentUrl();

		System.out.println(cul);
		Thread.sleep(4000);
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		Thread.sleep(4000);
		driver.quit();

	}

}
