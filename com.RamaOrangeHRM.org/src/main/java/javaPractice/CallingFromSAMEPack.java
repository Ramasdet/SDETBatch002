package javaPractice;

public class CallingFromSAMEPack {

	public static void main(String[] args) {
		
		Example6 ex6 = new Example6();
		System.out.println(ex6.a);
		System.out.println(ex6.str);
		ex6.method1();
		
		Example12 ex12 = new Example12();
		System.out.println(ex12.a);
		ex12.method1();

	}

}
