package nobCommerceinBuiltPomTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import nobcommerceInBuiltPOMpages.NobCommerceInBuiltPromotionsPage;
import nobcommerceInBuiltPOMpages.NobCommerceInbuiltLoginPage;

public class NobcommerceInbuiltPompromotionsTestscript {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		NobCommerceInbuiltLoginPage login = new NobCommerceInbuiltLoginPage(driver);
		NobCommerceInBuiltPromotionsPage promotion = new NobCommerceInBuiltPromotionsPage(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		login.clickonlogin();
		promotion.clickonpromotionssubmod();
		Thread.sleep(4000);
		promotion.clickonnewslettrsubscriber();
		Thread.sleep(4000);
		promotion.enterEmail();
		Thread.sleep(4000);
		promotion.enterstartdate();
		Thread.sleep(4000);
		
		promotion.enterenddate();
		Thread.sleep(4000);
		promotion.selectactive();
		Thread.sleep(4000);
		promotion.selecCustomerRole();
		Thread.sleep(4000);
		promotion.clickonSearch();
		Thread.sleep(5000);
		driver.quit();

	}

}
