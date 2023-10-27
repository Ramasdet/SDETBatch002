package javaLogicalPrograms;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// odd/even
		// 3 approaches
		// (i)using loops
		// (ii)Scanner
		// (iii)directly initializing the value to the variable

		// number%2==0

		// loop
		// 1-20 numerics
//		for (int i = 1; i <= 20; i++) {
//			if (i % 2 == 0) {
//
//				System.out.println("This is an even number: " + i);
//
//			} else {
//				System.out.println("This is an odd number: " + i);
//			}
//		}
//
//	}
//
//}

		// using Scanner class
//		System.out.println("Enter any ineger");
//		Scanner sc = new Scanner(System.in);
//
//		int i = sc.nextInt();
//		if (i % 2 == 0) {
//			System.out.println("This is an Even number");
//		} else {
//			System.out.println("This is an odd number");
//		}
//
//	}
//
//}
		int i = 1236;
		if (i % 2 == 0) {
			System.out.println("This is an even number:" + i);
		} else {
			System.out.println("This is an odd number:" + i);
		}

	}
}
