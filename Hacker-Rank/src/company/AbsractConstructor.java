package company;

public class AbsractConstructor {

	public static void main(String[] args) {

		// 1. Anonymous inner class extends class
		Abstract b = new Abstract() {
			@Override
			void print() {
				System.out.println("1 - Hii from Anonymous inner class extended class");
			}
		};
		b.print();

		// 2. Anonymous inner class implements the interface
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("2 - hi from Anonymous inner class implemnet the interface");
			}
		};
		Thread t = new Thread(r);
		t.start();

		// 3. Anonymous inner class defines inside the method
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("3 - Anonymous class inside the method");
			}
		});
		th.start();
	}
}

abstract class Abstract {
	Abstract() {
		System.out.println("Constructor from abstract class");
	}

	Abstract(int a) {
		System.out.println("Para constr " + a);
	}

	abstract void print();
}

class ChildAbstract extends Abstract {
	ChildAbstract(int s) {
		System.out.println("cont from child" + s);
	}

	@Override
	void print() {
		System.out.println("Method from child");
	}
}
