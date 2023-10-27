package stringClassMethods;

public class RverseLetters {

	public static void main(String[] args) {
		String str = "java is super";
		char[] result = str.toCharArray();

//		for (int i= 13 - 1; i >= 0; i-- ) {
//			System.out.println(result[i]);
//		}
//
//	}
//
//}
		int i = result.length - 1;
		while (i >= 0) {
			System.out.println(result[i]);
			i--;
		}
	}
}
