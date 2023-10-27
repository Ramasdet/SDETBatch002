package javaLogicalPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// reverse each letter of given string
		// 2 approaches
		// for loop
		// while loop
		// loop means repeatation
		String str = "Java is Super";
		char[] result = str.toCharArray();
		// loop
//		for (int i = 13 - 1; i >= 0; i--) {
//			System.out.println(result[i]);
//
//		}
//
//	}
//
//}

		int i = result.length - 1;
		while (i >= 0) {
			System.out.println(result[i]);

			i--;
		}
	}
}
