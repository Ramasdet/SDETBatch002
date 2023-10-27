package testNGMyPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void loginMethod() {
		Assert.fail();
		System.out.println("This is smoke");
	}

	@Test(dependsOnMethods = "loginMethod")
	public void leaveMethod() {
		System.out.println("This is Regression");
	}
}
