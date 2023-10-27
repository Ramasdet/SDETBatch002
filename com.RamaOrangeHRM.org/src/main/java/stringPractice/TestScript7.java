package stringPractice;

public class TestScript7 {

	public static void main(String[] args) {

		String str1 = "SHAREEF";
		String str2 = "shareef";

		int val = str1.compareTo(str2);
		
		System.out.println(val); // negative output
		
		System.out.println(str1.compareToIgnoreCase(str2)); // 0 is output

	}

}
