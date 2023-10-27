package hybridFrameWork;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import orangehrmcommonutilities.Hrmloginutility;
import orangehrmcommonutilities.HrmlogoutUtilities;
import orangehrmpages.HrmLeavePage;
import orangehrmpages.Hrmdashboardpage;

public class LeaveModule {
	@Test
	public void leaveMethod() throws Exception {
		WebDriver driver = new ChromeDriver();
		Hrmloginutility lu = new Hrmloginutility(driver);
		Hrmdashboardpage dp = new Hrmdashboardpage(driver);
		HrmLeavePage lp = new HrmLeavePage(driver);
		HrmlogoutUtilities logout = new HrmlogoutUtilities(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		lu.enterusername();

		lu.enterpassword();
		lu.clickonloginbutton();
		if (dp.verifydashboard()) {
			System.out.println("login success");

			lp.clickOnLeaveModule();
			Thread.sleep(3000);
			lp.clickOnEntitleMentSubMod();
			Thread.sleep(3000);
			lp.clickOnAddEntitleMentSubMod();
			Thread.sleep(3000);
			lp.enterEmpNameInEntitlementPage();
			Thread.sleep(3000);
			lp.selectLeaveType();
			Thread.sleep(3000);

			lp.enterEntitlementNumber();
			Thread.sleep(3000);
			lp.clickOnSaveBtn();
			Thread.sleep(3000);
		}
		else {
			System.out.println("login fail");
		}
		logout.teardown();

	}

}
