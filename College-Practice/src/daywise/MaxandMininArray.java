package daywise;

import java.util.Scanner;

public class MaxandMininArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many Element you want to enter in Array: ");
		int No = in.nextInt();
		int[] arr = new int[No];
		System.out.println("Enter the element of Array");
		for (int i = 0; i < No; i++) {
			arr[i] = in.nextInt();
		}
		int max = 0, min = 0;
		for (int i = 0; i < No; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Maximum =" + max + "\nMinimum = " + min);
		in.close();
	}
}
