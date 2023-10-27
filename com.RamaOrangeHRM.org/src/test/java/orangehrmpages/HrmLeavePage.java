package orangehrmpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HrmLeavePage {

	WebDriver leavePageClassDriver;

	public HrmLeavePage(WebDriver d) {
		
		this.leavePageClassDriver = d;
	}

	By leave = By.xpath("//span[text()='Leave']");

	By entitlement = By.xpath("//span[text()='Entitlements ']");

	By addEntitlement = By.xpath("//a[text()='Add Entitlements']");

	By empName = By.xpath("(//*[@class='oxd-form-row'])[2]/descendant::input");

	By leaveType = By.xpath("(//*[@class='oxd-select-wrapper'])[1]/div");

	By entitlementNumber = By.xpath("(//hr[@role='separator'])[last()]/preceding::input[1]");

	By leaveSaveBtn = By.xpath("//button[@type = 'submit']");

	public void clickOnLeaveModule() {
		leavePageClassDriver.findElement(leave).click();
	}

	public void clickOnEntitleMentSubMod() {
		leavePageClassDriver.findElement(entitlement).click();
	}

	public void clickOnAddEntitleMentSubMod() {
		leavePageClassDriver.findElement(addEntitlement).click();
	}

	public void enterEmpNameInEntitlementPage()throws Exception {
		leavePageClassDriver.findElement(empName).sendKeys("Orange Test");
		Thread.sleep(3000);
		leavePageClassDriver.findElement(empName).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		leavePageClassDriver.findElement(empName).sendKeys(Keys.ENTER);
		
	}

	public void selectLeaveType() throws Exception {
		leavePageClassDriver.findElement(leaveType).click();
		Thread.sleep(3000);
		leavePageClassDriver.findElement(leaveType).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		leavePageClassDriver.findElement(leaveType).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	public void enterEntitlementNumber() {
		leavePageClassDriver.findElement(entitlementNumber).sendKeys("10.50");
	}

	public void clickOnSaveBtn() {
		leavePageClassDriver.findElement(leaveSaveBtn).click();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
