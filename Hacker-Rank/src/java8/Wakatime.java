package java8;

public class Wakatime extends Java8FeaturesTest {

	public static void main(String[] args) {
		int[] temp = { 5 };
		System.out.println("before " + temp[0]);
		display(temp);
		System.out.println("after " + temp[0]);
	}

	public static void display(int[] arr) {
		arr[0] = arr[0] + 10;
		System.out.println("change " + arr[0]);
	}

}
