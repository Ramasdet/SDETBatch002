package nobcommerceInBuiltPOMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NobCommerceInbuiltLoginPage {
	WebDriver driver;
	public NobCommerceInbuiltLoginPage(WebDriver d) {
	this.driver=d;
	
	PageFactory.initElements(driver,this);
	
	}
	@FindBy(how=How.TAG_NAME, using="button")
	WebElement loginbtn;
	
	public void clickonlogin() {
		loginbtn.click();
	}
}
