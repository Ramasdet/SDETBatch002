package stringClassMethods;

public class Trim2 {

	public static void main(String[] args) {
		String str = "  hello world  ";
		String str2 = str.trim();
		System.out.println(str2);
		String[] str3 = str2.split(" ");
		System.out.println(str3.length);

	}

}
