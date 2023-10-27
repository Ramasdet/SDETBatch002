package com.Ramajava.org;

public class Logicaloperators {

	public static void main(String[] args) {
		int property1 = 50000;
		int property2 = 65000;
		int property3 = 85000;
		if (property1 > property2 && property1 > property3) {
			System.out.println("property1 is a bigger property");
		}

		else if (property2 > property1 && property2 > property3) {
			System.out.println("property2 is a bigger property");

		}
		System.out.println("property3 is a bigger property");

	}

}
