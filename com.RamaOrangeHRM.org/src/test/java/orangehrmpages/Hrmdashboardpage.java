package orangehrmpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hrmdashboardpage {
	
	WebDriver dashboardpagedriver;
	
	public Hrmdashboardpage(WebDriver d){
		this.dashboardpagedriver=d;
		
	}
	By dashboard = By.xpath("//h6[text()='Dashboard']");

	public boolean verifydashboard() {

		boolean val = dashboardpagedriver.findElement(dashboard).isDisplayed();

		return val;
	
	}
}
