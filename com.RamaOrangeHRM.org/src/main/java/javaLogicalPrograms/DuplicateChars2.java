package javaLogicalPrograms;

import java.util.HashSet;

public class DuplicateChars2 {

	public static void main(String[] args) {
//Dupicate charactars
		// HashSet class,chid class of set interfase,collection
		// duplicate data not allowed
		// hetrogeneous
		// search
		// instance
		HashSet hs = new HashSet();

		String str = "naturalstar nani";
		char[] val = str.toCharArray();

		String unique = "";
		String duplicate = "";
		for (int i = 0; i < val.length; i++) {

			if (hs.add(val[i])) {
				unique = unique + val[i];

			} else {
				duplicate = duplicate + val[i];
			}
		}

		System.out.println("These are unique characters:" + unique);

		System.out.println("These are  duplicate characters:" + duplicate);

	}

}
