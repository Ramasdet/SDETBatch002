  package stringClassMethods;

public class ToCharArray {

	public static void main(String[] args) {
		String str = "sdet professional";
		char[] val = str.toCharArray();
		// for (char single : val) {
		// System.out.println(single);

		// }
		// for (int i=val.length-1; i>=0; i--) {
		// System.out.println(val[i]);

		// }
		int i = val.length - 1;
		while (i >= 0) {
			System.out.print(val[i]);
			i--;
		}

	}
}
