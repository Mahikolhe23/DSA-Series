package company;

public class ExceptionHandling {
	static int val = 10;

	public static void main(String[] args) {
		System.out.println("main");
		System.out.println(get());
//		List<Integer> list = new ArrayList<Integer>();
//		list.set(index, element)
	}

	@SuppressWarnings("finally")
	public static int get() {
		try {
//			int p = val / 0;
			System.out.println("try");
			return val;
		} catch (Exception e) {
			val += 10;
			System.out.println("catch");
			return val;
		} finally {
			val += 10;
			System.out.println("finally");
			return val;
		}
//		return val;
	}
}
