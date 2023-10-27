package rama.automation.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeModuleEndToEndFlow {
	String un = "Admin";
	String pws = "admin123";

	public static void main(String[] args) {
		TimeModuleEndToEndFlow time = new TimeModuleEndToEndFlow();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(time.un);
		driver.findElement(By.name("password")).sendKeys(time.pws);
		driver.findElement(By.tagName("button")).click();
		if (driver.findElement(By.tagName("input")).isDisplayed()) {

			System.out.println("login is done");
			driver.findElement(By.xpath("(//*[text()='Time'])[1]")).click();
			driver.findElement(By.xpath("//*[text()='Project Info ']")).click();
			driver.findElement(By.xpath("(//*[text()='Customers'])[1]")).click();
			List<WebElement> allrows = driver
					.findElements(By.xpath("//div[@class='oxd-table']/div[2]//div[@class='oxd-table-card']"));

			System.out.println(allrows.size());
			List<WebElement> allcoloumns = driver
					.findElements(By.xpath("//div[@class='oxd-table']/div[2]/div[1]//div[@role='cell']"));

			System.out.println(allcoloumns.size());
			for (int i = 1; i <= allrows.size(); i++) {
				for (int j = 1; j <= allcoloumns.size(); j++) {
					String val = driver.findElement(By.xpath(
							"//div[@class='oxd-table']/div[2]//div[@class='oxd-table-card'][" + i + "]/div[" + j + "]"))
							.getText();
					System.out.print(" "+val);

				}

			}

		}

	}

}
