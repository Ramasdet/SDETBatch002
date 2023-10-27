package testNGMyPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertion {
	@Test
	public void testmethod() {
		int a = 20;
		int b = 30;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals((a == b), true);
		System.out.println("SDET");
		System.out.println("Batch002");
		String str1 = "Rama";
		String str2 = "mokshi";

		sa.assertEquals(str1.equals(str2), false);
		System.out.println("str1 and str2 have different values");
		sa.assertAll();

	}

}
