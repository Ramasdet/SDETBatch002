package javaLogicalPrograms;

public class Palindrome {

	public static void main(String[] args) {

//		int temp = 222;
//		int n = 222;
//
//		int sum = 0;
//		
//		while (n > 0) {
//			int r = n%10;
//			sum = (sum*10)+r;
//			n = n / 10;
//		}
//		System.out.println("reverse num:" + sum);
//		if (temp == sum) {
//			System.out.println("this is palindrome");
//		} 
//		else {
//			System.out.println("this is not a palindrome");
//		}
//
//	}
//
//}
		String str = "krishna";
		String rev = "";
		char[] str2 = str.toCharArray();
		for (int i =str2.length-1; i>=0; i--) {
			rev = rev + str2[i];
		}
		System.out.println(rev);
		if (str.equals(rev)) {
			System.out.println("it is a palindrome ");
		} else {
			System.out.println("it is not a palindrome");
		}

	}
}
