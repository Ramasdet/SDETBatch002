package stringPractice;

public class TestScript19 {

	public static void main(String[] args) {

		String str1 = new String("shareef");
		String str2 = str1.toLowerCase();

		System.out.println(str1 == str2); //true

		String str3 = str1.toUpperCase();

		System.out.println(str1 == str3); //false

	}

}
