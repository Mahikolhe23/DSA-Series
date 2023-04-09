package day2_java_programs;

import java.util.Scanner;

public class P9_ArmstrongNumberBetweenTwoNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		armstrong(1, 1000);
		in.close();
	}

	public static void armstrong(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isArmstrong(int i) {
		int count = 0;
		int n = i;
		int temp = i;
		while (n > 0) {
			count++;
			n /= 10;
		}
		int sum = 0;
		while (i > 0) {
			int r = i % 10;
			sum = (int) (sum + Math.pow(r, count));
			i /= 10;
		}
		if (sum == temp)
			return true;
		return false;
	}
}
