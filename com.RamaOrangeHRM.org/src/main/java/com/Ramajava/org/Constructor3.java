package com.Ramajava.org;

import org.testng.annotations.Test;

public class Constructor3 {
	String name;
	int rollno;
	long contactno;

	Constructor3(String str, int i, long l) {

		this.name = str;
		this.rollno = i;
		this.contactno = l;

	}

	@Test
	public void constructor(){
		
		Constructor3 con = new Constructor3("goutham", 12, 9564786521l);
		System.out.println(con.name);
		System.out.println(con.rollno);
		System.out.println(con.contactno);
		
		Constructor3 con1 = new Constructor3("surya", 13, 95647864567l);
		System.out.println(con1.name);
		System.out.println(con1.rollno);
		System.out.println(con1.contactno);
		}
}
