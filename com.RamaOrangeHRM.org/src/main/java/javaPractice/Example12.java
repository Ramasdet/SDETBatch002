package javaPractice;

public class Example12 {

	protected int a = 10;

	protected void method1() {
		System.out.println("Hello Protected");
	}

	public static void main(String[] args) {
		int r, sum = 0, n;
		n = 112;
		while (n > 0) {

			r = n % 10;
			sum = (sum * 10) + r ;
			n = n / 10;

		}
		
		System.out.println(sum);
	}

}
