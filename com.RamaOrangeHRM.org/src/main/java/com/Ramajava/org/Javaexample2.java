package com.Ramajava.org;

public class Javaexample2 {
	int a = 20;
	String str = "Mokshi";
	float b = 11.3f;

	public static void main(String[] args) {
		Javaexample2 je = new Javaexample2();
		System.out.println(je.a);
		System.out.println(je.str);
		System.out.println(je.b);
		je.testmethod1();
	}

	public void testmethod1() {

		Javaexample2 je = new Javaexample2();

		System.out.println(je.a);
		System.out.println(je.b);

	}

}
