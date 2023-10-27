package stepDefinations;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OHRMStepDefination {

//	WebDriver driver = new ChromeDriver();
//
////	@Given("^launch hrm login page in any browser$")
////	public void launch_hrm_login_page_in_any_browser() {
////		System.out.println("Launch");
////	}
////
////	@When("^enter un and pws$")
////	public void enter_un_and_pws() {
////		System.out.println("Login");
////	}
////
////	@When("^click on login button$")
////	public void click_on_login_button() {
////		System.out.println("Click on Login Button");
////	}
//
////	@Then("^verify login success$")
////	public void verify_login_success() {
////		System.out.println("Verify Login");
////	}
//
//	@Given("click on profile")
//	public void click_on_profile() throws Exception {
//
//		if (driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed()) {
//			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
//		}
//
//	}
//
//	@When("click on logout button")
//	public void click_on_logout_button() {
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
//	}
//
//	@Then("verify logout success")
//	public void verify_logout_success() {
//
//		if (driver.findElement(By.name("username")).isDisplayed()) {
//			System.out.println("Logout success");
//		}
//
//	}
//
//	@Given("launch hrm login page in any browser")
//	public void launch_hrm_login_page_in_any_browser() {
//		System.out.println("Hello Launch");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//
//	@When("enter un and pws")
//	public void enter_un_and_pws() {
//		System.out.println("enter un and pws");
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//	}
//
//	@When("click on login button")
//	public void click_on_login_button() {
//		System.out.println("click on login button");
//		driver.findElement(By.tagName("button")).click();
//	}
//
//	@Then("verify login success")
//	public boolean verify_login_success() throws Exception {
//
//		Thread.sleep(7000);
//		System.out.println("verfication of login");
//		boolean val = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
//		return val;
//	}
//
////	@When("enter {string} and {string}")
////	public void enter_and(String un, String pws) {
////		System.out.println("enter un and pws");
////		driver.findElement(By.name("username")).sendKeys(un);
////		driver.findElement(By.name("password")).sendKeys(pws);
////	}
//
//	@When("^enter \"(.*)\" and \"(.*)\"$")
//	public void enter_and(String un, String pws) {
//
//		driver.findElement(By.name("username")).sendKeys(un);
//		driver.findElement(By.name("password")).sendKeys(pws);
//
//	}
//
//	@Then("^quit the entire browser$")
//	public void quit_the_entire_browser() throws Exception {
//		Thread.sleep(5000);
//		driver.quit();
//	}
//
//	@Given("open the ohrm login page in chrome browser")
//	public void open_the_ohrm_login_page_in_chrome_browser() {
//		System.out.println("Hello Launch");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//
//	@When("click on login button in login page")
//	public void click_on_login_button_in_login_page() {
//		System.out.println("click on login button");
//		driver.findElement(By.tagName("button")).click();
//	}
//
//	@Then("verify dashboard is appearing")
//	public void verify_dashboard_is_appearing() throws Exception {
//		Thread.sleep(7000);
//		System.out.println("verfication of login");
//		boolean val = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
//
//	}
//
//	@When("^enter valid username and password as credentials$")
//	public void enter_valid_username_and_password_as_credentials(DataTable table) {
//
//		List<List<String>> data = table.asLists();
//
//		String un = data.get(0).get(0);
//		String pws = data.get(0).get(1);
//		String UN = data.get(0).get(2);
//		String empname = data.get(0).get(3);
//
//		String un2 = data.get(1).get(0);
//		String pws2 = data.get(1).get(1);
//		String UN2 = data.get(1).get(2);
//		String empname2 = data.get(1).get(3);
//
//		String un3 = data.get(2).get(0);
//		String pws3 = data.get(2).get(1);
//		String UN3 = data.get(2).get(2);
//		String empname3 = data.get(2).get(3);
//
//		// List<Map<String, String>> data = table.asMaps();
//		// String un = data.get(0).get("UserName");
//		// String pws = data.get(0).get("Password");
//
//		System.out.println("enter un and pws");
//		driver.findElement(By.name("username")).sendKeys(un);
//		driver.findElement(By.name("password")).sendKeys(pws);
//
//	}
//
//	@When("^click on Admin main module$")
//	public void click_on_Admin_main_module() {
//		System.out.println("click on Admin module");
//		driver.findElement(By.xpath("//span[text()='Admin']")).click();
//
//	}
//
//	@When("^click on user management sub module$")
//	public void click_on_user_management_sub_module() {
//		System.out.println("click on user management sub module");
//		driver.findElement(By.xpath("//span[text()='User Management ']")).click();
//	}
//
//	@When("^click on users sub sub module$")
//	public void click_on_users_sub_sub_module() {
//		System.out.println("click on users sub sub module");
//		driver.findElement(By.xpath("//a[text()='Users']")).click();
//
//	}
//
//	@When("^enter \"(.*)\" inside username field$")
//	public void enter_inside_username_field(String a) {
//		System.out.println("enter \"<UN>\" inside username field");
//		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(a);
//
//	}
//
//	@When("^enter \"(.*)\" inside employeename field$")
//	public void enter_inside_employeename_field(String b) {
//		System.out.println("enter \"<EmpName>\" inside employeename field");
//		driver.findElement(By.xpath("//div[@class='oxd-autocomplete-wrapper']/descendant::input")).sendKeys(b);
//
//	}
//
//	@When("^click on search button$")
//	public void click_on_search_button() {
//		System.out.println("click on search button");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	}

	@Given("^open the hrm login page as precondition$")
	public void open_the_hrm_login_page_as_precondition() {
		System.out.println("Hello");
	}

	@When("^do login$")
	public void do_login() {
//		List<List<String>> data = table.asLists();
//
//		String un = data.get(0).get(0);
//		String pws = data.get(0).get(1);
//
//		System.out.println(un);
//		System.out.println(pws);

		System.out.println("Do login");

//		List<Map<String, String>> data = table.asMaps();
//		String un = data.get(0).get("UserName");
//		String pws = data.get(0).get("Password");
//		
//		String sun = data.get(1).get("UserName");
//		String spws = data.get(1).get("Password");
//		
//		System.out.println(un);
//		System.out.println(pws);
//		
//		System.out.println(sun);
//		System.out.println(spws);

	}

	@Then("^verify dashboard page$")
	public void verify_dashboard_page() {
		System.out.println("dashboard");
	}

	@Then("^verify profile button is appearing or not$")
	public void verify_profile_button_is_appearing_or_not() {
		System.out.println("Logout");
	}

	@Then("^verify login success or not$")
	public void verify_login_success_or_not() {
		System.out.println("Success");
	}
}

// @When("^clik on Recruitment module$")

// public void clik_on_Recruitment_module() {
// System.out.println("clik on Recruitment module");
// driver.findElement(By.xpath("//*[text()='Recruitment']")).click();
