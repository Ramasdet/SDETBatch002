package orangehrmtestscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import orangehrmcommonutilities.Hrmloginutility;
import orangehrmcommonutilities.HrmlogoutUtilities;
import orangehrmpages.Hrmadminpage;
import orangehrmpages.Hrmdashboardpage;

public class Hrmadminmoduletestscript {

	public static void main(String[] args) throws Exception {

		WebDriver testscriptdriver = new ChromeDriver();

		Hrmloginutility lu = new Hrmloginutility(testscriptdriver);
		Hrmdashboardpage dp = new Hrmdashboardpage(testscriptdriver);
		Hrmadminpage ap = new Hrmadminpage(testscriptdriver);
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
			ap.clickonadmin();
			ap.clickonusermanagement();
			ap.enterusername();
			ap.selectuserrole();
			ap.selectemployname();
			ap.selectstatus();
			ap.clickonsearch();
			logout.clickonprofile();
			logout.clickonlogout();

		} else {
			System.out.println("login fail");
		}
		logout.teardown();

	}
}
