package testNGMyPractice;

import org.testng.annotations.Test;

public class InvocationTimeout {
	@Test(invocationCount = 10000000, invocationTimeOut = 3000)
	public void success() {
		System.out.println("i want success because iam skillset person");
	}

}
