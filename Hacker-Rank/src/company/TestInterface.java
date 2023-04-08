package company;

interface A {
	default void print() {
		System.out.println("Interface A");
	}
}

interface B {
	default void print() {
		System.out.println("Interface B");
	}
}

public class TestInterface implements A, B {
	public static void main(String[] args) {
		TestInterface t = new TestInterface();
		t.print();
	}

	@Override
	public void print() {
		A.super.print();
		B.super.print();
	}
}
