package nobCommerceSalesModuleTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import nobcommerceCustomisedPOM.ContentManagementPage;
import nobcommerceCustomisedPOM.nobLoginPage;

public class ContentmnagementTestscript {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		nobLoginPage login = new nobLoginPage(driver);
		ContentManagementPage cmp = new ContentManagementPage(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		login.clikonlogin();
		Thread.sleep(3000);
		cmp.clickonContentmanagement();
		Thread.sleep(3000);
		cmp.clickonNewsitems();
		Thread.sleep(3000);
		cmp.enterTitle();
		Thread.sleep(3000);
		cmp.clickonSearch();
		Thread.sleep(3000);
		cmp.searchingRowcount();
		Thread.sleep(5000);

		driver.quit();
	}

}