package com.Ramajava.org;

public class StringBufferDotequals1 {

	public static void main(String[] args) {

		StringBuffer a = new StringBuffer("Rama");
		StringBuffer b = new StringBuffer("Mokshitha");
		StringBuffer c = new StringBuffer("subbarao");
		StringBuffer d = new StringBuffer("Mokshitha");
		System.out.println(b.equals(d));// false
		System.out.println(a.equals(c));// false

	}

}
