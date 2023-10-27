package inBuiltPOMTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import inbuiltSeleniumPom.OHRMDashBoardPage;
import inbuiltSeleniumPom.OHRMLoginPage;
import inbuiltSeleniumPom.OHRMTimePage;
import orangehrmcommonutilities.HrmlogoutUtilities;

public class InBuiltPomTimemoduletestscript {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		OHRMLoginPage olp = new OHRMLoginPage(driver);
		OHRMDashBoardPage odp = new OHRMDashBoardPage(driver);
		OHRMTimePage otp = new OHRMTimePage(driver);
		HrmlogoutUtilities hlo = new HrmlogoutUtilities(driver);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		
		
		olp.maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		olp.enterUserName();
		olp.enterPassword();
		olp.clickOnLoginBtn();
		if(odp.checkDashboardAppear()) {
			System.out.println("login success");
			otp.clickontimemodule();
			otp.clickontimesheets();
			Thread.sleep(4000);
			otp.enterempname();
			Thread.sleep(4000);
			otp.clickonview();
			Thread.sleep(4000);
		} 
		else {
			System.out.println("login failure");
		}
		hlo.clickonprofile();
		hlo.clickonlogout();
		Thread.sleep(4000);

	}

}
