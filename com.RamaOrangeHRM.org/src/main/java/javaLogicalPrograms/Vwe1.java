package javaLogicalPrograms;

public class Vwe1 {

	public static void main(String[] args) {
		String str = "Rama";
		
		String vowel = "";
		String consonant = "";
		
		char[] str2 = str.toCharArray();
		for (int i = 0; i < str2.length; i++) {
			if (str2[i] == 'a' || str2[i] == 'e' || str2[i] == 'i' || str2[i] == 'o' || str2[i] == 'u') {
				vowel = vowel+str2[i];
			}
			else {
				consonant = consonant+str2[i];
			}
		}
		
			System.out.println("Given String is Vowel and exist Vowel are : "+vowel);
			System.out.println("Given String is consonant and exist consonant are : "+consonant);

	}

}
