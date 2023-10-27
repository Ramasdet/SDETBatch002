package stepDefinations;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangehrmcommonutilities.Hrmloginutility;

public class DataTable2 {

	WebDriver driver = new ChromeDriver();

//@Given("^launch hrm login page in any browser$")
//	public void launch_hrm_login_page_in_any_browser() {	
//	System.out.println("Hello Launch");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//}
//@When ("^enter valid username and password as credentials$")	
//	public void When_enter_valid_username_and_password_as_credentials(DataTable table)throws Exception	{
//	
//	List<List<String>>	data=table.asLists();
//	String un=data.get(0).get(0);
//	String pws=data.get(0).get(1);
//	
//	String un2=data.get(1).get(0);
//	String pws2=data.get(1).get(1);
//	
//	String un3=data.get(2).get(0);
//	String pws3=data.get(2).get(1);
//	
//	System.out.println(un);
//	System.out.println(pws);
//		
//	Thread.sleep(7000);
//	
//	System.out.println("enter un and pws");
//	driver.findElement(By.name("username")).sendKeys(un);
//	driver.findElement(By.name("password")).sendKeys(pws);	
//	}
//@When ("^click on login button$")
//public void  click_on_login_button() {
//	System.out.println("click on login button");
//	driver.findElement(By.tagName("button")).click();
//}
//@Then ("^verify login success$")
//public void verify_login_success() throws Exception {
//	Thread.sleep(7000);
//	System.out.println("verfication of login");
//	boolean val = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
//}
//@When("^click on Admin main module$")
//public void click_on_Admin_main_module() throws Exception{
//	System.out.println("click on Admin module");
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("//span[text()='Admin']")).click();
//}
//@When("^click on user management sub module$")
//public void click_on_user_management_sub_module()throws Exception {
//
//System.out.println("click on user management sub module");
//Thread.sleep(4000);
//
//driver.findElement(By.xpath("//span[text()='User Management ']")).click();
//}
//@When("^click on users sub sub module$")
//public void click_on_users_sub_sub_module()throws Exception {
//System.out.println("click on users sub sub module");
//
//Thread.sleep(4000);
//driver.findElement(By.xpath("//a[text()='Users']")).click();
//}
//@When("^enter UN and EMPNAME inside username field$")
//public void enter_UN_and_EMPNAME_inside_username_field(DataTable table) throws Exception{
//	List<Map<String, String>> value = table.asMaps();
//	String username=value.get(0).get("UN");
//	Thread.sleep(4000);
//	String empname=value.get(0).get("EMPName");
//	Thread.sleep(4000);
//	String username2=value.get(1).get("UN");
//	Thread.sleep(4000);
//	String empname2=value.get(1).get("EMPName");
//	Thread.sleep(4000);
//	String username3=value.get(2).get("UN");
//	Thread.sleep(4000);
//	String empname3=value.get(2).get("EMPName");
//	Thread.sleep(4000);
//	
//	System.out.println("enter un and empname  inside username field");
//	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(username);
//
//	driver.findElement(By.xpath("//div[@class='oxd-autocomplete-wrapper']/descendant::input")).sendKeys(empname);
//
//}
//@When("^click on search button$")
//public void click_on_search_button() throws Exception{
//System.out.println("Search button");
//Thread.sleep(4000);
//driver.findElement(By.xpath("//button[@type='submit']")).click();
//}
//@Then("^quit the entire browser$")
//public void quit_the_entire_browser()throws Exception {
//Thread.sleep(4000);
//driver.quit();
//}	
//}	
	@Given("^open hrm login page as precondition$")
	public void open_hrm_login_page_as_precondition() {
		Hrmloginutility lu = new Hrmloginutility(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lu.enterusername();
		lu.enterpassword();

		System.out.println("Login");

	}

	@When("^click on login$")

	public void click_on_login() {

		Hrmloginutility lu = new Hrmloginutility(driver);

		lu.clickonloginbutton();

	}

	@Before
	public void setup() {
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

	}

	@After
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

	@When("^click on Directory module$")
	public void click_on_Directory_module() throws Exception {
		Thread.sleep(4000);

		driver.findElement(By.xpath("//span[text()='Directory']")).click();
	}

	@When("^enter validname in employname field$")

	public void enter_in_employname_field() throws Exception {
		// Thread.sleep(4000);
		// driver.findElement(By.xpath("//*[@placeholder='Type forhints...']")).click();
		Thread.sleep(4000);
		System.out.println("enter \"<emp name>\" in employname field");
		driver.findElement(By.xpath("//*[@placeholder='Type for hints...']")).sendKeys("Orange");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='Type for hints...']")).sendKeys(Keys.DOWN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='Type for hints...']")).sendKeys(Keys.ENTER);

	}

	@When("^enter JobTitle in job Title field$")
	public void enter_JobTitle_in_job_Title_field() throws Exception {
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]")).sendKeys(Keys.DOWN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		// driver.findElement(By.xpath("(//div[text()='-- Select
		// --'])[1]")).sendKeys(b);
	}

	@When("^enter Location in location field$")
	public void enter_Location_in_location_field() throws Exception {

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]")).sendKeys(Keys.DOWN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		// driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]")).sendKeys(c);
		System.out.println("enter \"<location>\" in location field");
	}

	@When("^click on search button$")
	public void click_on_search_button() throws Exception {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Before(order = 2)
	public void setUps() {
		System.out.println("SetUp1");
	}

	@After(order = 2)
	public void tearDowns() {
		System.out.println("Quit1");
	}

	@Before(order = 1)
	public void setUp() {
		System.out.println("SetUp2");
	}

	@After(order = 1)
	public void tearDown() {
		System.out.println("Quit2");
	}

	@Then("^verify any records are appearing or not$")

	public void verify_any_records_are_appearing_or_not() {

		System.out.println("verify any records are appearing or not");

	}

//	@BeforeStep
//	public void bStep() {
//		System.out.println("BeforeStep");
//	}
//
//	@AfterStep
//	public void aStep() {
//		System.out.println("AfterStep");
//	}

}
