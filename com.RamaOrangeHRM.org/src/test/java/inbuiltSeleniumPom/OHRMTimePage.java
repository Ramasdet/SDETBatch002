package inbuiltSeleniumPom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHRMTimePage {
	WebDriver driver;
	public OHRMTimePage(WebDriver d) {
	this.driver=d;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Time']")
	WebElement time;
	 
	@FindBy(xpath="//*[text()='Timesheets ']")
	WebElement timesheets;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement empname;
	@FindBy(xpath="//button[@type='submit']")
	WebElement view;
	
	public void clickontimemodule() {
		time.click();
	}
	public void clickontimesheets() {
		timesheets.click();
	}
	public void enterempname() {
		
		empname.sendKeys("Anthony Nolan");
		empname.sendKeys(Keys.DOWN);
		empname.sendKeys(Keys.ENTER);
	}
	
	public void clickonview() {
		view.click();
	}
	
	
	
}
