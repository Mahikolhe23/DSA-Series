package concept;

public class ExceptionHandling {
	static int val = 10;

	public static void main(String[] args) throws ClassNotFoundException {
//		System.out.println("main");
		System.out.println(get());
//		List<Integer> list = new ArrayList<Integer>();
//		list.set(index, element)
//		Class clas = Class.forName("mahi");
	}

	@SuppressWarnings("finally")
	public static int get() {
//		System.out.println("get");
		try {
//			int p = val / 0;
			System.out.println("try");
			return val;
		} catch (Exception e) {
			val += 10;
			System.out.println("catch");
			throw new RuntimeException();
//			return val;
		} finally {
			val += 10;
			System.out.println("finally");
			return val;
		}
//		return val;
//		throw new RuntimeException();
	}
}
