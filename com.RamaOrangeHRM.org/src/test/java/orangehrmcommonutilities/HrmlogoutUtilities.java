package orangehrmcommonutilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HrmlogoutUtilities {
  WebDriver logoututilitydriver;
	public HrmlogoutUtilities(WebDriver d) {
		this.logoututilitydriver=d;
	}
	By profile = By.className("oxd-userdropdown-tab");

	By logout = By.xpath("//a[text()='Logout']");
	
	public void clickonprofile() {
		logoututilitydriver.findElement(profile).click();
		
	}
	public void clickonlogout() {
		logoututilitydriver.findElement(logout).click();
		
	}
	public void teardown() {
		logoututilitydriver.quit();
	}
	
	
	
	
}
