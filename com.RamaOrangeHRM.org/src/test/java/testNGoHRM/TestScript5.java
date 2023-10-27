package testNGoHRM;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScript5 {

	@Test(groups = "Smoke")
	public void testMethod1() {
		Assert.fail();
		System.out.println("This is TestMethod1");
	}

	@Test(groups = "Regression", dependsOnGroups = "Smoke")
	public void testMethod2() {
		System.out.println("This is TestMethod2");
	}

}
