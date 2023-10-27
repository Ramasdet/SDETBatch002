package com.Ramajava.org;

public class Constructor1 {
	String name;
	int rollno;

	public static void main(String[] args) {
		Constructor1 con1 = new Constructor1();
		System.out.println(con1.name);
		System.out.println(con1.rollno);
		Constructor1 con2 = new Constructor1();

		System.out.println(con2.name);
		System.out.println(con2.rollno);

	}

}
