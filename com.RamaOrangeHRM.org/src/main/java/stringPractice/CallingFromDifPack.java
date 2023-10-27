package stringPractice;

import javaPractice.Example12;
import javaPractice.Example5;

public class CallingFromDifPack extends Example12 {

	public static void main(String[] args) {

		CallingFromDifPack ex12 = new CallingFromDifPack();

		// Example12 ex12 = new Example12();
		System.out.println(ex12.a);
		ex12.method1();

	}

}
