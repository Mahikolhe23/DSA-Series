package sort;

import java.util.Scanner;

public class BinaryPalindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		int[] arr = new int[cases];
		for (int i = 0; i < arr.length; i++) {
			arr[0] = in.nextInt();
		}
		int original = arr[0];
		int rev = 0, rem;
		for (int i = 0; i < arr.length; i++) {
			while (arr[0] != 0) {
				rem = arr[0] % 10;
				rev = rev * 10 + rem;
				arr[0] = arr[0] / 10;
			}
			if (rev == original) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}
		in.close();
	}
}
//String ans = Integer.toBinaryString(num);