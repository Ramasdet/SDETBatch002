package javaLogicalPrograms;

public class Example1 {

	public static void main(String[] args) {

//1,2,3,4,5
		// avarage formula is=total count of the given numerics /length of the given
		// array

		// total=1+2+3+4+5==15
		// length=5
		// avarage=15/5=3
		int[] a = { 1, 2, 3, 4, 5 };
		int total = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			total = total + a[i];

		}
		System.out.println("toatal count:" + total);
		// length of the given array
		int l = a.length;
		System.out.println("length of the given array:" + l);

		// average formula
		int avarageval = total / l;
		System.out.println("avarage value: " + avarageval);

	}

}
