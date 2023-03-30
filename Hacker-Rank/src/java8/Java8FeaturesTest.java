package java8;

public class Java8FeaturesTest implements TestingStatic {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>();
//		for (int i = 1; i <= 10; i++) {
//			list.add(i * 2);
//		}
//		System.out.println(list);
//		List<Integer> temp = new ArrayList<>();
//		temp = list.stream().filter(x -> x >= 10).collect(Collectors.toList());
//		System.out.println(temp);
//		temp = list.stream().map(x -> x * x).collect(Collectors.toList());
//		System.out.println(temp);

//		TestingStatic.display();
		TestingStatic t = new TestingStatic() {
		};
		t.display1();
	}

	public Java8FeaturesTest() {

	}
}

interface TestingStatic {
	static void display() {
		System.out.println("static method");
	}

	default void display1() {
		System.out.println("default method");
	}
}
