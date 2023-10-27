package com.Ramajava.org;

public class Unaryoperators {

	public static void main(String[] args) {

		int a = 20;
		System.out.println("a value initialy"+a);//20
		
		int b = ++a;
		System.out.println("b value before increment "+b);//21
		
		int c = b++;
		System.out.println("c value before b increment "+c);//21
		System.out.println("b value after final increment "+b);//22
		
		int d = --c;
		System.out.println("d value before decrement "+d);//20
		
		int e = d--;
		System.out.println("e value after decrement "+e);//20
		System.out.println("d value after final decrement" +d);//19

	}

}
