package javaLogicalPrograms;

public class Example3 {

	public static void main(String[] args) {
//how to write java program using inbuilt classes or methods
		// Charecter class which is came from java.lang package
		// In java some packages, which are using multiple times ,for that packages we
		// don't
		// need to write import statement,one of that one is java.lang package
		// in Charecter class we have isuppercas(),isLowercase(),isDigit()

		String str = "Java55Is&&super!!";

		char[] charecters = str.toCharArray();
		int upper = 0;
		int lower = 0;
		int digits = 0;
		int special = 0;

		for (char single : charecters) {
			if (Character.isUpperCase(single)) {
				upper++;

			} else if (Character.isLowerCase(single)) {
				lower++;
			} else if (Character.isDigit(single)) {
				digits++;
			} else {
				special++;
			}
		}

		System.out.println("Uppercase letters:" + upper);
		System.out.println("Lower letters:" + lower);
		System.out.println("digits :" + digits);
		System.out.println("Spcial symbols :" + special);
		//int count=upper.length;
	}

}
