package javaPractice;

public abstract class AbstractExample9 {

	public void ae9Method1() {
		System.out.println("ae9Method1");
	}

	public abstract void ae9Method2();

	public abstract void ae9Method3();

}

abstract class AbstractExample10 extends AbstractExample9 {

	@Override
	public void ae9Method2() {
		System.out.println("ae9Method2");
	}
}

class AbstractExample11 extends AbstractExample10 {

	@Override
	public void ae9Method3() {
		System.out.println("ae9Method3");
	}

	public void ae11Method1() {
		System.out.println("ae11Method1");
	}

}
