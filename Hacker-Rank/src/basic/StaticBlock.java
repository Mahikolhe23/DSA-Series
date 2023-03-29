package basic;

final class StaticBlock {
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
//		StaticBlock s = new StaticBlock();
//		s.method();
	}

	public StaticBlock() {
		System.out.println("Constructor");
	}

	public static void method() {
		System.out.println("method");
	}
}
