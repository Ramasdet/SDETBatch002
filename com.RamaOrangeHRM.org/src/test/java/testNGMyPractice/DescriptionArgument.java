package testNGMyPractice;

import org.testng.annotations.Test;

public class DescriptionArgument {
	@Test(description = "This is a success method which can display i want success")

	public void success() {
		System.out.println("I Want Success");
	}
}
