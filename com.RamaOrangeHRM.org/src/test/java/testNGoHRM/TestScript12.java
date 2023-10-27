package testNGoHRM;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScript12 {

	@Test
	public void testMethod1() {

		int a = 10;
		int b = 20;

		Assert.assertEquals((a == b), true, "both values are mismatch");

		System.out.println("Hello Students");
		System.out.println("please execute me");

	}

}
