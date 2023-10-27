package orangehrmpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Hrmadminpage {
	WebDriver adminpagedriver;
	public Hrmadminpage(WebDriver a){
	this.adminpagedriver=a;
	}
	By admin=By.xpath("//span[text()='Admin']");
	By usermanagement=By.xpath("//span[text()='User Management ']");
	By username=By.xpath("(//input) [2]");
	By userrole= By.xpath("(//div[text()='-- Select --'])[1]");
	By employname=By.xpath("//input[@placeholder='Type for hints...']");
	By status=By.xpath("(//div[@class='oxd-select-text-input'])[2]");
	By search=By.xpath("//button[@type='submit']");
	
	
	public void clickonadmin() {
		adminpagedriver.findElement(admin).click();
	}
	
	public void clickonusermanagement() {
		adminpagedriver.findElement(usermanagement).click();
		
	}
	
	public void enterusername() {
		adminpagedriver.findElement(username).sendKeys("Admin");
	}
	public void selectuserrole()throws Exception {
		adminpagedriver.findElement(userrole).click();
		Thread.sleep(4000);
		adminpagedriver.findElement(userrole).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		adminpagedriver.findElement(userrole).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
	}
	public void selectemployname() {
		adminpagedriver.findElement(employname).sendKeys("paul Collings");
							
	}
	public void selectstatus() throws Exception{
		adminpagedriver.findElement(status).click();
		Thread.sleep(4000);
		adminpagedriver.findElement(status).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		adminpagedriver.findElement(status).sendKeys(Keys.ENTER);
		
	}
	public void clickonsearch() {
		adminpagedriver.findElement(search).click();
	}

	
	}

