package rama.automation.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.RamaOrangeHRM.org.AdminendtoendFlow;

public class PimmoduleEndToEndFlow {
	String un = "Admin";
	String pws = "admin123";

	public static void main(String[] args) throws Exception {

		String Data = "Admin";
		PimmoduleEndToEndFlow pmf = new PimmoduleEndToEndFlow();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys(pmf.un);
		driver.findElement(By.name("password")).sendKeys(pmf.pws);
		driver.findElement(By.tagName("button")).click();
		if (driver.findElement(By.tagName("input")).isDisplayed()) {

			System.out.println("login is done");
			driver.findElement(By.xpath("//span[text()='PIM']")).click();
			driver.findElement(By.xpath("//a[text()='Reports']")).click();
			Thread.sleep(3000);
//			driver.findElement(By.xpath("//div[@class='--toggle']/descendant::i")).click();
			List<WebElement> allrows = driver.findElements(By.xpath("//*[@role='table']/div[2]//div[@role='row']"));
			System.out.println(allrows.size());

			List<WebElement> allcolumns = driver
					.findElements(By.xpath("//div[@role='table']/div[2]/descendant::div[@role='row'][1]/div"));

			

			System.out.println(allcolumns.size());

			for (int i = 1; i <= allrows.size(); i++) {
				for (int j = 1; j <= allcolumns.size(); j++) {
					String val = driver.findElement(By.xpath(
							"//div[@role='table']/div[2]/descendant::div[@role='row'][" + i + "]/div[" + j + "]"))
							.getText();

					System.out.print(val + "  ");
				}
			}

			Thread.sleep(5000);
			driver.quit();
		} else {
			System.out.println("login not success try again");
		}
	}
}
