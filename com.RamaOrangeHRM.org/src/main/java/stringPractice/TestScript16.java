package stringPractice;

public class TestScript16 {

	public static void main(String[] args) {

		String str1 = "I want a job in Google";

		String[] val = str1.split(" ");

		for (String single : val) {
			System.out.println(single);
		}

	}

}
