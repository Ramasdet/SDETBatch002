package testNGoHRM;

import org.testng.annotations.Test;

public class TestScript9 {

	@Test(invocationCount = 1000000000, invocationTimeOut = 5000)
	public void success() {
		System.out.println("I Want Success because I am SkillSet Person");
	}

}
