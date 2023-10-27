package testNGoHRM;

import org.testng.annotations.Test;

public class TestScript6 {

	@Test(groups = "Smoke")
	public void testMethod1() {
		System.out.println("TestMethod1");
	}

	@Test(groups = "Smoke")
	public void testMethod2() {
		System.out.println("TestMethod2");
	}

	@Test(groups = "Regression")
	public void testMethod3() {
		System.out.println("TestMethod3");
	}

}
