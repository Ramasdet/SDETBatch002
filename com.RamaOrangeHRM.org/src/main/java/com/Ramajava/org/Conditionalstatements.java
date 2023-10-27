package com.Ramajava.org;

import org.testng.annotations.Test;

public class Conditionalstatements {

	@Test
	public void condition(){

		int a = 20;
		int b = 30;
		int c = 40;
		if (a < b && a < c) {
			System.out.println("a is small");
		}

		else if (b < a && b < c) {
			System.out.println("b is small");
		}

		else if (c < a && c < b) {
			System.out.println("c value is small");
		}

		else {
			System.out.println(" c value is big");

		}

	}

}
