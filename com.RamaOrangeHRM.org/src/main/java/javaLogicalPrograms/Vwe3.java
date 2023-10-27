package javaLogicalPrograms;

public class Vwe3 {

	public static void main(String[] args) {
		// java program for vowel,consonants
		// for ,if condition
		// a,e,i,o,u
		// consonant
		String str = "Ram pothineni";
		char[] str2 = str.toCharArray();
		String vowel = "";
		String consonant = "";
		for (int i = 0; i < str2.length; i++) {
			if (str2[i] == 'a' || str2[i] == 'e' || str2[i] == 'i' || str2[i] == 'o' || str2[i] == 'u') {
				vowel = vowel + str2[i];

			} else {
				consonant = consonant + str2[i];

			}

		}
		System.out.println("These are vowels in given string:" + vowel);

		System.out.println("These are consonats in given string:" + consonant);

	}

}
