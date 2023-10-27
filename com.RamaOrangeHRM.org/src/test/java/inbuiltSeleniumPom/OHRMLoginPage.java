package inbuiltSeleniumPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHRMLoginPage {

	WebDriver driver;

	public OHRMLoginPage(WebDriver d) {
		this.driver = d;
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name = "username")
	WebElement un;

	@FindBy(name = "password")
	WebElement pws;
	@FindBy(tagName = "button")
	WebElement loginBtn;

	public void enterUserName() {
		un.sendKeys("Admin");
	}

	public void enterPassword() {
		pws.sendKeys("admin123");
	}

	public void clickOnLoginBtn() {
		loginBtn.click();
	}	
	
	
	
	public void maximize() {
		driver.manage().window().maximize();	
	}
	
	}

