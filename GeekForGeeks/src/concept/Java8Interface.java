package concept;

interface Test {
	default void defaultShow() {
		System.out.println("hii from defaultShow");
	}

	static void staticShow() {
		System.out.println("hii from staticShow");
	}

	void showNormal();
}

public class Java8Interface implements Test {

	public static void main(String[] args) {
		Test.staticShow();
		Java8Interface m = new Java8Interface();
		m.defaultShow();
		Test obj = () -> {
			System.out.println("hello from normal");
		};
		obj.showNormal();
		m.show();
	}

	@Override
	public void defaultShow() {
		Test.super.defaultShow();
	}

	@Override
	public void showNormal() {
	}

	protected void show() {
		System.out.println("parent show");
	}
}
