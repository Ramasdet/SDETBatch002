package nobcommerceInBuiltPOMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NobCommerceInBuiltPromotionsPage {
	WebDriver driver;
	
	
	public NobCommerceInBuiltPromotionsPage(WebDriver d) {
	this.driver=d;
	
	
	PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH, using="//i[@class='nav-icon fas fa-tags']")
	
	WebElement promotions;
	
	@FindBy(how=How.XPATH,using="//*[text()=' Newsletter subscribers']")
	
	WebElement newslettersubscriber;
	
	@FindBy(how=How.ID, using="SearchEmail")
	WebElement email;
	
	@FindBy(how=How.ID, using="StartDate")
	WebElement startdate;
	
	@FindBy(how=How.ID, using="EndDate")
	WebElement enddate;
	
	//@FindBy(how=How.ID, using="WarehouseId")
	//WebElement warehouse;
	
	//@FindBy(how=How.ID, using="search-product-name")
	//WebElement productname;
	
	@FindBy(how=How.ID, using="ActiveId")
	WebElement active;
	@FindBy(how=How.XPATH, using="((//div[@class='col-md-8'])[6]/child::select")
	WebElement customerrole;
	@FindBy(how=How.ID, using="search-subscriptions")
	WebElement search;
	 
	public void clickonpromotionssubmod() {
		promotions.click();
	}
	public void clickonnewslettrsubscriber() {
		newslettersubscriber.click();
	}
	public void enterEmail() {
		email.sendKeys("raamu555@gmail.com");
	}
	public void enterstartdate() {
		startdate.sendKeys("9/5/2023");
	}
	public void enterenddate() {
		enddate.sendKeys("9/7/2023");
	}
	public void selectactive() {
		Select selection=new Select(active);
		selection.selectByValue("1");
		
	}
	public void selecCustomerRole() {
	
		Select selection=new Select(customerrole);
		selection.selectByValue("6");
	}
	public void clickonSearch() {
		search.click();
	}
	
}
