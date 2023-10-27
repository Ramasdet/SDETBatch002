package com.Ramajava.org;

import org.testng.annotations.Test;

public class Constructor2 {
	String name;
	int rollno;
	long contactno;

	Constructor2(String str, int i, long l) {
		this.name = str;
		this.rollno = i;
		this.contactno = l;
	}

	@Test
	public void consructor(){

		Constructor2 con = new Constructor2("krishna", 10, 9647521892l);

		System.out.println(con.name);
		System.out.println(con.rollno);
		System.out.println(con.contactno);

		Constructor2 con1 = new Constructor2("Arjun", 12, 96475218567l);

		System.out.println(con1.name);
		System.out.println(con1.rollno);
		System.out.println(con1.contactno);

	}

}
