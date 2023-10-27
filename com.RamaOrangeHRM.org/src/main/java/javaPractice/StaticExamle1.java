package javaPractice;

import org.openqa.selenium.WebDriver;

public class StaticExamle1 {

	
	static int a = 10;

	public static void method1() {
		System.out.println("Hello");
	}

	public void method2() {
		System.out.println("Bye");
	}

	public static void main(String[] args) {

		System.out.println(StaticExamle1.a);

		StaticExamle1.method1();

		StaticExamle1 se = new StaticExamle1();
		se.method2();

	}

}
