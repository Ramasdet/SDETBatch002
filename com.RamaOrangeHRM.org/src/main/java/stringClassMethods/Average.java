package stringClassMethods;

public class Average {

	public static void main(String[] args) {
		// input
		int[] a = { 1, 2, 3, 4, 5 };

		int total = 0;

		// find out count of the total given numbers
		for (int i = 0; i <= a.length - 1; i++) {
			total = total + a[i];

		}
		System.out.println("count of total given numbers : " + total);

		// length of the given numbers from array
		int l = a.length;
		System.out.println("length of the array : " + l);

		// Average formula
		int avarageval = total / l;

		System.out.println("Avarage value is from given values : " + avarageval);
		
		
		
		
		
		
		
		
		
		
		

		// find out average value from given numerics

		// formula : count of total given number {1, 2, 3, 4, 5} ==> 1+2+3+4+5 ==>15
		// : length of the given numbers from array ==> 5
		// : count of total numbers / length of the given numbers from array
		// : 15 / 5 ==> 3;
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		double[] a = { 5, 6, 7.5, 65 };
//		double b = 0;
//		for (int i = 0; i <= a.length - 1; i++) {
//			b = b + a[i];
//
//		}
//
//		double avarage = b / a.length;
//		System.out.println(avarage);
	}
}