package javaLogicalPrograms;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {

		// Leap year
		// condition
		// (year%4==0&&year%100!=0)||(year%400==0))
		// Scanner class ???
		// nextInt()

		// java.util package
		// nextInt()
		int year;
		System.out.println("Enter the year");
		Scanner sc = new Scanner(System.in);

		year = sc.nextInt();

		// condition
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("this year is a leap year");

		} else {
			System.out.println("This is not a leap year");
		}

	}

}
