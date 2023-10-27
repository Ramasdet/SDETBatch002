package testNGMyPractice;

import org.testng.annotations.Test;

public class GroupsArgument {
	@Test(groups = "smoke")
	public void testMethod1() {
		System.out.println("this is testmethod1");
	}

	@Test(groups = "regression")
	public void testmethod2() {
		System.out.println("this is testmethod2");
	}

}
