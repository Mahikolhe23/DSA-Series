package array;

import java.util.Scanner;

public class FindKthElement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[in.nextInt()];
		System.out.println("Enter array element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Enter Number to find in array");
		int a = in.nextInt();
		int ans = findK((arr), a);
		System.out.println(ans != -1 ? ans : -1);
		in.close();
	}

	public static int findK(int[] arr, int a) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a)
				return i;
		}
		return -1;
	}
}
