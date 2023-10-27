package nobcommerceCustomisedPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NobcommerseSalesmodulepage {
	WebDriver driver;

	public NobcommerseSalesmodulepage(WebDriver d) {
		this.driver = d;
	}

	By sales = By.xpath("(//nav[@class='mt-2']//a[@class='nav-link'])[11]");
	By shipments = By.xpath(" //*[text()=' Shipments']");
	By startdate = By.xpath(" //*[@id='StartDate']");
	By enddate = By.xpath(" //*[@id='EndDate']");
	By Trackingnum = By.xpath(" //*[@id='TrackingNumber']");
	By selecttag = By.xpath("//*[@id='WarehouseId']");
	By checkbox = By.xpath("//*[@class='check-box']");
	By countryselecttag = By.xpath("//*[@name='CountryId']");
	By enterstate = By.xpath("//*[@id='StateProvinceId']");
	By enterregion = By.xpath("//*[@id='County']");
	By entercity = By.xpath("//*[@id='City']");
	By shipped=By.xpath("(//input[@class='check-box'])[2]");
	By pickup=By.xpath("(//input[@class='check-box'])[3]");
	By search = By.xpath("//*[@id='search-shipments']");

	public void clickonsalesmodule() {
		driver.findElement(sales).click();
	}

	public void clickonshipments() {
		driver.findElement(shipments).click();
	}

	public void enterstartdate() {
		driver.findElement(startdate).sendKeys("9/4/2023");
	}

	public void enterenddate() {
		driver.findElement(enddate).sendKeys("9/6/2023");
	}

	public void entertrackingnum() {
		driver.findElement(Trackingnum).sendKeys("9618361132");
	}

	public void selectwarehouse() throws Exception {
		WebElement tag = driver.findElement(selecttag);
		Select selection = new Select(tag);
		Thread.sleep(4000);
		selection.selectByValue("1");
		Thread.sleep(3000);

	}

	public void clickoncheckbox() {
		driver.findElement(checkbox).click();
	}

	public void selectCountryName() throws Exception {
		WebElement CN = driver.findElement(countryselecttag);
		Select selection = new Select(CN);
		Thread.sleep(4000);
		selection.selectByValue("42");
		Thread.sleep(3000);
	}

	public void enterstate() {
		driver.findElement(enterstate).sendKeys("Andhra");
	}

	public void enterregion() {
		driver.findElement(enterregion).sendKeys("Amaravathi");
	}

	public void entercity() {
		driver.findElement(entercity).sendKeys("Guntur");

	}
	public void clickonshiped() {
		driver.findElement(shipped).click();
	}
	public void clickonpickup() {
		driver.findElement(pickup).click();
	}
	

	public void clickonsearch() {
		driver.findElement(search).click();
	}
}
