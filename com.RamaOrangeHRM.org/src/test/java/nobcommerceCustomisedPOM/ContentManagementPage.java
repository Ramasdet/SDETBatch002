package nobcommerceCustomisedPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContentManagementPage {
	WebDriver driver;

	public ContentManagementPage(WebDriver d) {
		this.driver = d;
	}

	By contentmanagement = By.xpath("(//li[@class='nav-item has-treeview'])[5]/following::p[1]");

	By newsitems = By.xpath("//p[text()=' News items']");
	By title = By.id("SearchTitle");

	By search = By.xpath("(//button)[3]");
	By table = By.xpath("//div[@class='dataTables_scroll']/div[2]//tr[@class='odd']");
	By colum = By.xpath("//div[@class='dataTables_scroll']/div[2]//tr[@class='odd']/td");

	public void clickonContentmanagement() {

		driver.findElement(contentmanagement).click();
	}

	public void clickonNewsitems() {
		driver.findElement(newsitems).click();
	}

	public void enterTitle() {
		driver.findElement(title).sendKeys("news online store is open");
	}

	public void clickonSearch() {
		driver.findElement(search).click();
	}

	public void searchingRowcount() {
		List<WebElement> allrows = driver.findElements(table);
		int rcount = allrows.size();
		System.out.println("total rows count is:" + rcount);

		List<WebElement> allcolumns = driver.findElements(colum);
		int ccount = allcolumns.size();
		System.out.println("total column count is:" + ccount);
		for (int i = 1; i <= rcount; i++) {
			for (int j = 1; j <= ccount; j++) {
				String val = driver
						.findElement(By.xpath(
								"//div[@class='dataTables_scroll']/div[2]//tr[@class='odd'][" + i + "]/td[" + j + "]"))
						.getText();

				System.out.println(val);
			}
		}

	}
}
