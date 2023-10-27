package testNGMyPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertion {
	@Test
	public void testmethod1() {

		int a = 10;
		int b = 30;
		Assert.assertEquals((a == b), true, "both values are mismatch");
		System.out.println("hello krishna");
		System.out.println("plese find me");

	}

}
