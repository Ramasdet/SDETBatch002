package testNGMyPractice;

import org.testng.annotations.Test;

public class AlwaysrunArgument {
	@Test(alwaysRun = true)
	public void setup() {
		System.out.println("Program setup method");
	}

}
