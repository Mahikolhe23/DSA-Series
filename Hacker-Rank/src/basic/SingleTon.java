package basic;

public class SingleTon {

	public static void main(String[] args) {
		Single s = Single.getInstance();
		System.out.println(s);
	}
}

class Single {
	private static Single s;

	private Single() {
		System.out.println("Calling single");
	}

	public static Single getInstance() {
		if (s == null)
			s = new Single();
		return s;
	}
}
