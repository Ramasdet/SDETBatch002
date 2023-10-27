package testNGMyPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {
	@Test(groups = "smoke")

	public void testMethod1() {
		Assert.fail();
		System.out.println("This is testmethod1");
	}

	@Test(groups = "Regression", dependsOnGroups = "smoke")
	public void testMethod2() {
		System.out.println("This is testmethod2");
	}
}
