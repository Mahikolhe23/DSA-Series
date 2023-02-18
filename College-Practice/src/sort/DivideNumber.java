package sort;

import java.util.Scanner;

public class DivideNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
			int a = arr[i] / 4;
			int b = arr[i] / 4;
			int c = arr[i] / 4;
			int d = arr[i] / 4;
			int ans = a * b * c * d;
			System.out.println(ans);
		}
		in.close();
	}
}
