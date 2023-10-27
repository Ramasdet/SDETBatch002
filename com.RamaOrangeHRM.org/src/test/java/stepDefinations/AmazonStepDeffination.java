package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nobcommerceInBuiltPOMpages.AmazonInBuiltStartingPage;
import nobcommerceInBuiltPOMpages.AmazonMainPage;

public class AmazonStepDeffination {

	WebDriver driver = new ChromeDriver();

	@Given("^launch Amazon page in chrome browser$")
	public void launch_Amazon_page_in_chrome_browser() throws Exception{
		AmazonInBuiltStartingPage ap = new AmazonInBuiltStartingPage(driver);
		ap.syncMethod();

		ap.launchAmazonSite();
		System.out.println("launch Amazon page in chrome browser");
		Thread.sleep(4000);

	}

	@When("^in the dropdown select watches$")

	public void in_the_dropdown_select_watches() throws Exception {
		System.out.println("in the dropdown select watches");
		AmazonMainPage mp = new AmazonMainPage(driver);
		mp.SelectTagmethod();
		Thread.sleep(4000);

	}

	@When("^enter watches in text box$")
	public void enter_watches_in_text_box() throws Exception{
		AmazonMainPage mp = new AmazonMainPage(driver);
		mp.entertextbox();
		Thread.sleep(4000);
		System.out.println("enter watches in text box");
	}

	@When("^click on search$")
	public void click_on_search()throws Exception {
		AmazonMainPage mp = new AmazonMainPage(driver);
		mp.clickOnSearch();
		Thread.sleep(4000);

		System.out.println("click on search");
	}

	@When("^click on signin button$")
	public void click_on_signin_button()throws Exception {

		AmazonMainPage mp = new AmazonMainPage(driver);
		mp.clickOnAll();
		mp.clickOnSigninButton();
		Thread.sleep(4000);

		System.out.println("click on exit");

	}

	@Then("^vertify new page open or not$")
	public void vertify_new_page_open_or_not()throws Exception {
		Thread.sleep(4000);

		System.out.println("vertify exit done properly");
	}

}
