package javaLogicalPrograms;

public class Example2 {

	public static void main(String[] args) {

		// How many upper case letters ,lowercase lettrs,digits,special symbols in given
		// string
		// what is the percentage of above values
		// 2 approaches
		// 1=using inbuit classes and methods
		// 2=without using any inbuilt class or method
		// ascii value
		// A=65,Z=90==65+25=90
		// a=97+25=122
		// 0=48,48+9=57
		String str = "@Java is 55 super!!!";
		char[] charecters = str.toCharArray();
		int upper = 0;
		int lower = 0;
		int digits = 0;
		int spcialsym = 0;

		// single value
		for (char c : charecters) {
			if (c >= 65 && c <= 90) {
				upper++;
			} else if (c >= 97 && c <= 122) {
				lower++;
			} else if (c >= 48 && c <= 57) {
				digits++;
			} else {
				spcialsym++;
			}
		}
		System.out.println("upperletters :" + upper);
		System.out.println("lowerletters :" + lower);

		System.out.println("digits :" + digits);

		System.out.println("special symbols :" + spcialsym);

		// percentage formula
		// int upperpercentage=upper*100/str.length();
		int len = str.length();
		System.out.println("length:" + len);
		double upperp = upper * 100 / len;
		System.out.println("upper letters percentage: " + upperp);
		double lp = lower * 100 / len;
		System.out.println("lower letters percentage: " + lp);
		double dp = digits * 100 / len;
		System.out.println("digits percentage: " + dp);

		double sp = spcialsym * 100 / len;
		System.out.println("spcial symbols percentage: " + sp);

	}

}
