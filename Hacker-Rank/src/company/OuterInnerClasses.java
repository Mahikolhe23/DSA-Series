package company;

public class OuterInnerClasses {

	public static void main(String[] args) {
		// static nested class
		Outerclass.NestedStaticClass n = new Outerclass.NestedStaticClass();
		n.m2();
		// inner class
		Outerclass o = new Outerclass();
		Outerclass.Innerclass oi = o.new Innerclass();
		oi.m1();
	}
}

class Outerclass {
	class Innerclass {
		// non-static inner class OR known by Inner class
		void m1() {
			System.out.println("I am from Innerclass");
		}
	}

	static class NestedStaticClass {
		// static nested class OR known by Nested Class
		void m2() {
			System.out.println("I am from NestedStaticClass");
		}
	}
}
