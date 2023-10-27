package testNGoHRM;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScript4 {

	@Test
	public void loginMethod() {
		Assert.fail();
		System.out.println("This is Smoke");
	}

	@Test(dependsOnMethods = "login")
	public void leaveMethod() {
		System.out.println("This is Regression");
	}

}
