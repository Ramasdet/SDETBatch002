package orangehrmtestscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import orangehrmcommonutilities.Hrmloginutility;
import orangehrmcommonutilities.HrmlogoutUtilities;
import orangehrmpages.HrmLeavePage;
import orangehrmpages.Hrmadminpage;
import orangehrmpages.Hrmdashboardpage;

public class HrmLeaveModuleTestscript {

	public static void main(String[] args) throws Exception {

		WebDriver testscriptdriver = new ChromeDriver();

		Hrmloginutility lu = new Hrmloginutility(testscriptdriver);
		Hrmdashboardpage dp = new Hrmdashboardpage(testscriptdriver);
		HrmLeavePage lp = new HrmLeavePage(testscriptdriver);
		HrmlogoutUtilities logout = new HrmlogoutUtilities(testscriptdriver);

		testscriptdriver.manage().window().maximize();

		testscriptdriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		testscriptdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		testscriptdriver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		testscriptdriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		lu.enterusername();
		lu.enterpassword();
		lu.clickonloginbutton();
		if (dp.verifydashboard()) {
			System.out.println("login success");

			lp.clickOnLeaveModule();
			Thread.sleep(4000);
			lp.clickOnEntitleMentSubMod();
			Thread.sleep(4000);
			lp.clickOnAddEntitleMentSubMod();
			Thread.sleep(4000);
			lp.enterEmpNameInEntitlementPage();
			Thread.sleep(4000);
			lp.selectLeaveType();
			Thread.sleep(4000);
			lp.enterEntitlementNumber();
			Thread.sleep(4000);
			lp.clickOnSaveBtn();
		}
		else {
			System.out.println("login fail");
		}
		logout.teardown();

	}

}
