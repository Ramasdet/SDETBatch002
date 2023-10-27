package stringClassMethods;

public class Contains1 {

	public static void main(String[] args) {
		String str1 = "Soundarya";
		boolean val1 = str1.contains("rya");
		boolean val2 = str1.contains("s");
		System.out.println(val1);// true
		System.out.println(val2);// false
	}
}
