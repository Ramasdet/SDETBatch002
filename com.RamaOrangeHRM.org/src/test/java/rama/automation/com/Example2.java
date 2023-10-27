package rama.automation.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws Exception {
		
	WebDriver driver=new ChromeDriver();
	
		 driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		Thread.sleep(2000);
		
	WebElement un=	driver.findElement(By.name("username"));
	
		un.sendKeys("Admin");
		
		Thread.sleep(2000);
		
		WebElement pwd=driver.findElement(By.name("password"));
		
		pwd.sendKeys("admin123");
		
		Thread.sleep(2000);
		WebElement log=driver.findElement(By.tagName("button"));
		log.click();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
		
		Thread.sleep(3000);
		
		driver.quit();	
		
	}

}
