package javaLogicalPrograms;

public class olyndrome3 {

	public static void main(String[] args) {
//reverce integer,chck that int is polyndrome or not
		// first we will do reverse after one if condition for polyndrome
		// what is polyndrome
		// reverse num we have 3 conditions
		// 1.r=n%10;2.sum=(sum*10)+r;3.n=n/10
		// 1st step
		// int n=123;
		// r=123%10==10)123(12
		// 120==3
		// sum=0*10+3=3
		// n=123/10=12
		// 2nd step
		// r=12%10=10)12(1
		// 10==2
		// sum=3*10+2=32;

		// n=12/10==1
		// 3rd step
		// r=1%10==1
		// sum=32*10+1==320+1=321
		// n=1/10=0
		int n = 254;
		int tem = 254;
		int sum = 0;

		while (n != 0) {
			int r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;

		}
		System.out.println("Reverse number is:" + sum);
		if (sum == tem) {
			System.out.println("This is a polyndrome");

		} else {
			System.out.println("This is not a polyndrome");
		}
	}
}