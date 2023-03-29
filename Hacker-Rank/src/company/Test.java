package company;

public class Test {

	static int MAX = 5;

	public static void main(String... args) {
		Printer print = new Printer();
		Thread t1 = new Thread(new TaskEvenOdd(print, MAX, false));
		Thread t2 = new Thread(new TaskEvenOdd(print, MAX, true));
		t1.start();
		t2.start();
//		StaticBlock st = new StaticBlock();

	}

}
