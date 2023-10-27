package nobCommerceSalesModuleTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import nobcommerceCustomisedPOM.NobcommerseSalesmodulepage;
import nobcommerceCustomisedPOM.nobLoginPage;

public class NobCommerceTestScript {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		nobLoginPage nlp = new nobLoginPage(driver);
		NobcommerseSalesmodulepage nsp = new NobcommerseSalesmodulepage(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		nlp.clikonlogin();
		Thread.sleep(5000);
		nsp.clickonsalesmodule();
		Thread.sleep(3000);
		nsp.clickonshipments();
		nsp.enterstartdate();
		Thread.sleep(3000);
		nsp.enterenddate();
		Thread.sleep(3000);
		nsp.entertrackingnum();
		Thread.sleep(4000);
		nsp.selectwarehouse();
		nsp.clickoncheckbox();
		Thread.sleep(3000);
		nsp.selectCountryName();
		Thread.sleep(4000);
		nsp.enterstate();
		Thread.sleep(4000);
		nsp.enterregion();
		Thread.sleep(3000);
		nsp.entercity();
		Thread.sleep(2000);
		nsp.clickonshiped();
		Thread.sleep(2000);
		nsp.clickonpickup();
		Thread.sleep(4000);
		nsp.clickonsearch();

		Thread.sleep(5000);
		driver.quit();

	}

}
