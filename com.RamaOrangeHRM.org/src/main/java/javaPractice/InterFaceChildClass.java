package javaPractice;

public class InterFaceChildClass implements InterExamle1 {

	@Override
	public void hello() {
		System.out.println("Hello");
	}

	@Override
	public void hi() {
		System.out.println("Hi");
	}

	@Override
	public void bye() {
		System.out.println("Bye");
	}

	@Override
	public void darling() {
		System.out.println("Darling");
	}

	@Override
	public void dummy() {
		System.out.println("Dummy");
	}

}
