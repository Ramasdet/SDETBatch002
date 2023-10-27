package com.Ramajava.org;

import org.testng.annotations.Test;

public class Assignmentoperators {

	@Test
	public void assignment(){

		int a = 53;
		int b = 26;
		int c = 12;
		int d = 15;
		int e = 16;
		a += 6;// a+6=59
		System.out.println(a);
		b -= 8;// b-8=18
		System.out.println(b);
		c *= 5;// c*5=60
		System.out.println(c);
		d %= 2;// d%2=1
		System.out.println(d);
		e /= 4;// e/4=4
		System.out.println(e);

	}

}
