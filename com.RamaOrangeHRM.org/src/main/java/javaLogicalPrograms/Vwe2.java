package javaLogicalPrograms;

public class Vwe2 {

	public static void main(String[] args) {
		String str = "Manasa";
		char[] str2 = str.toCharArray();
		String vowel = "";

		String consonant = "";
		for (int i = 0; i < str.length(); i++) {

			if (str2[i] == 'a' || str2[i] == 'e' || str2[i] == 'i' || str2[i] == 'o' || str2[i] == 'u') {
				vowel = vowel + str2[i];
			} else {
				consonant = consonant + str2[i];
			}
		}

		System.out.println("these are vowels in given string: " + vowel);

		System.out.println("these are consonants in given string: " + consonant);

	}

}
