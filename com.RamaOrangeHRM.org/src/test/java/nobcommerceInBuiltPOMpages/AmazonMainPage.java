package nobcommerceInBuiltPOMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonMainPage {
	WebDriver driver;

	public AmazonMainPage(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "searchDropdownBox")
	WebElement select;

	@FindBy(xpath= "//*[@type='text']")
	WebElement textbox;
	@FindBy(id = "nav-search-submit-button")
	WebElement search;
	@FindBy(className = "hm-icon-label")
	WebElement all;
	@FindBy(className = "hmenu-item")
	WebElement signin;

	public void SelectTagmethod() throws Exception {
		//WebElement val = select;
		Select selection = new Select(select);
		Thread.sleep(4000);
		selection.selectByValue("search-alias=watches");
		Thread.sleep(3000);

	}

	public void entertextbox() {
		textbox.sendKeys("watches for women");

	}

	public void clickOnSearch() {
		search.click();
	}

	public void clickOnAll() {
		all.click();
	}

	public void clickOnSigninButton()throws Exception {
	WebElement	ele=signin;
		Actions action=new Actions(driver);
		Thread.sleep(4000);
		action.moveToElement(ele).perform();
	}

}
