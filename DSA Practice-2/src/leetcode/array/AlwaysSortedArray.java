package leetcode.array;

import java.util.Scanner;

public class AlwaysSortedArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, n, num, pos = 0;
		int arr[] = new int[100];
		System.out.println("Enter the size of array : ");
		n = scanner.nextInt();
		System.out.println("Enter the elements of the array : ");
		for (i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the element to be entered : ");
		num = scanner.nextInt();
		for (i = 0; i < n; i++) {
			if (arr[i] < num) {
				pos++;
			} else {
				break;
			}
		}
		for (i = n - 1; i >= pos; i--) {
			arr[i + 1] = arr[i];
		}
		arr[pos] = num;
		System.out.println("\nThe new array is : ");
		for (i = 0; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		scanner.close();
	}
}
