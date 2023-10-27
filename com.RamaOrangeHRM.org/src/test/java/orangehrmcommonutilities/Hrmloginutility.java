package orangehrmcommonutilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hrmloginutility {
  WebDriver logindriver;
	
  public Hrmloginutility(WebDriver d){
	  this.logindriver=d;
  }
	
  By un = By.name("username");

	By pws = By.name("password");

	By loginBtn = By.tagName("button");
	
	public void enterusername() {
		logindriver.findElement(un).sendKeys("Admin");
		
	}
	public void enterpassword() {
		logindriver.findElement(pws).sendKeys("admin123");
	}
	public void clickonloginbutton() {
		logindriver.findElement(loginBtn).click();
	}
	
		
}
