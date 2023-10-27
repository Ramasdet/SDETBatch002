package rama.automation.com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args)throws Exception {
		
	WebDriver driver=new ChromeDriver();	
		
	driver.manage().window().maximize();

	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
	Thread.sleep(5000);
	
driver.navigate().back();

		Thread.sleep(3000);

	driver.navigate().forward();
	
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	
	Thread.sleep(2000);
	
	driver.quit();
	
	}

}
