package inbuiltSeleniumPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHRMDashBoardPage {
	WebDriver driver;

	public  OHRMDashBoardPage(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement db;

	public boolean checkDashboardAppear() {

		boolean val = db.isDisplayed();
	
		return val;
	}

	
	}	

