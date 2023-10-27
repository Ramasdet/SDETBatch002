package nobcommerceCustomisedPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class nobLoginPage {
	WebDriver driver;
	public nobLoginPage(WebDriver e) {
		this.driver=e;
	}
	By login=By.xpath("//button");
	
	public void clikonlogin() {
		driver.findElement(login).click();
	}	
}
