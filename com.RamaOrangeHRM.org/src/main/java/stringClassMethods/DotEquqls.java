package stringClassMethods;

public class DotEquqls {

	public static void main(String[] args) {
		String str = "Anushka ";
		String str1 = "NityaMenon";
		String str2 = "anushka";
		String result = str2.concat("gattamaneni");
		char str3 = str1.charAt(3);
		boolean val = str1.contains("anu");
		System.out.println(str1.equals(str2));//false
		System.out.println(val);// false
		System.out.println(result);// Anushaka gattamaneni
		System.out.println(str3);// y

	}

}
