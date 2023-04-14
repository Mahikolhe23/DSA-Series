package day3.conditional_loops_intermidiate;

import java.util.Scanner;

public class P3_CalculateAverageOfNNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array");
		int[] temp = new int[in.nextInt()];
		System.out.println("Enter the element of array");
		for (int i = 0; i < temp.length; i++) {
			temp[i] = in.nextInt();
		}
		System.out.println("Avg of array is = " + avg(temp));
		in.close();
	}

	public static int avg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}
}
