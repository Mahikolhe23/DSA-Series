package day3.conditional_loops_intermidiate;

import java.util.Scanner;

public class P9_CalculateBattingAverage {

	public static void main(String[] args) {
		int[] arr = new int[11];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Each score team player");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		System.out.println("Avg Score of Team = " + avg(arr));
	}

	public static double avg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}
}
