package stringClassMethods;

public class Count {

	public static void main(String[] args) {

		String str = "JavA5is&Su6p%eR";
		char[] charecters = str.toCharArray();
		int upper = 0, lower = 0, numbers = 0, others = 0;

		for (char c : charecters) {
//			if (c >= 65 && c <= 90) {
//				upper++;
//
//			} else if (c >= 97 && c <= 122) {
//
//				lower++;
//			} else if (c >= 48 && c <= 57) {
//				numbers++;
//			} else {
//				others++;
//
//			}
//
//		}
			if (Character.isUpperCase(c)) {
				upper++;
			} else if (Character.isLowerCase(c)) {
				lower++;

			} else if (Character.isDigit(c)) {
				numbers++;
			} else {
				others++;
			}
		}

		System.out.println("uppercase lettrs:" + upper * 100 / str.length());
		System.out.println("lowercase lettrs:" + lower * 100 / str.length());
		System.out.println("numbers lettrs:" + numbers * 100 / str.length());
		System.out.println("other lettrs:" + others * 100 / str.length());

	}

}
