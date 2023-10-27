package testNGMyPractice;

import org.testng.annotations.Test;

public class EnableArgument {
	@Test(enabled = false)
	public void sruthi() {
		System.out.println("sruthi");
	}

	@Test
	public void rama() {
		System.out.println("Rama");
	}
	@Test
	public void mokshi() {
		System.out.println("Mokshi");
	}

}
