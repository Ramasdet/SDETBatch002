package com.Ramajava.org;

public class StringImmutable1 {

	public static void main(String[] args) {

		String a = new String("mokshitha ");

		String b = a.concat("jadda");
		System.out.println(a);// mokshith
		System.out.println(b);// mokshitha jadda

	}

}
