package javaLogicalPrograms;

public class Polyndrome2 {

	public static void main(String[] args) {
		// given string is polyndrome or not
		// for this we can use scanner class and also directly assign

		// the value to the variable
		// scanner class check previous videos
		// using toCharArray()
		// for loop
		// string class .equals();
		String str = "Radha";

		String rev = "";
		char[] str2 = str.toCharArray();
		// for loop for reverse charecters
		for (int i = str2.length - 1; i>= 0; i--) {
			rev = rev + str2[i];

		}
		System.out.println("reverse value: " +rev);
		// if conditon for comparing
		if (str.equals(rev)) {
			System.out.println("given string is polyndrome");

		} else {
			System.out.println("given string is not a polyndrome");

		}

	}

}
