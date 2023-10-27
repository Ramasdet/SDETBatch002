package javaLogicalPrograms;

import java.util.HashSet;

public class DupicateChars {

	public static void main(String[] args) {
		HashSet hs = new HashSet();

		String str = "naturalstarnani";
		char[] str2 = str.toCharArray();
		String unique = "";
		String duplicate = "";
		for (int i = 0; i < str2.length; i++) {

			if (hs.add(str2[i])) {

				unique = unique + str2[i];
			} 
			else {
				duplicate = duplicate + str2[i];
			}
		}
		System.out.println("These are unique characters: " + unique);
		System.out.println("These are duplicate characters: " + duplicate);

	}

}
