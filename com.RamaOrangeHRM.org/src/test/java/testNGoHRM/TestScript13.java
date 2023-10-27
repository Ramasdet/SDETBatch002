package testNGoHRM;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScript13 {

	@Test
	public void testMethod() {

		SoftAssert sa = new SoftAssert();

		int a = 10;
		int b = 20;

		sa.assertEquals((a == b), true);

		System.out.println("Hello Darling");

		System.out.println("Yes What Darling");

		String str1 = "SDET";
		String str2 = "Automation";

		sa.assertEquals(str1.equals(str2), false);

		System.out.println("str1 and str2 have different values");
		
		sa.assertAll();
	}

}
