package testNGMyPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderEx1 {
	

	@DataProvider
	public Object[][] ramaData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "admin";
		data[0][1] = "admin123";

		data[1][0] = "mokshi";
		data[1][1] = "mokshi123";
		return data;
	}
@Test(dataProvider="ramaData")
public void testMethod1(String a, String b) {

	System.out.println(a);
	System.out.println(b);
}
}


