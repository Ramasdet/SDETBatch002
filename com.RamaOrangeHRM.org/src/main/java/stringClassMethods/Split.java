package stringClassMethods;

public class Split {

	public static void main(String[] args) {
		String str = "I Want to Become IAS";
		String[] val = str.split(" ");

		for (String single : val) {

			System.out.println(single);
		}
		

	}
}
