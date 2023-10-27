package stringPractice;

public class TestScript10 {
	
	public static void main(String[] args) {
		
		String str1 = "sruthiHasan";
		String str2 = "SRUTHIHASAN";
		
		System.out.println(str1.equals(str2)); // false
		
		System.out.println(str1.equalsIgnoreCase(str2)); //true
		
	}

}
