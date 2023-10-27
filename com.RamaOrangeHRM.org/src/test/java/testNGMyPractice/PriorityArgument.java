package testNGMyPractice;

import org.testng.annotations.Test;

public class PriorityArgument {
	@Test(priority = 1)
	public void rama() {
		System.out.println("Rama");
	}

	@Test(priority = 0)
	public void mokshitha() {
		System.out.println("Mokshitha");
	}

	@Test(priority = 2)
	public void subbarao() {
		System.out.println("Subbarao");
	}

}
