package testNGMyPractice;

import org.testng.annotations.Test;

public class invocationCountArgument {
	@Test(invocationCount = 8)
	public void testmethod() {
		System.out.println("Krishna is my favourite charecter");
	}

}
