package assignment.sort;

import java.util.Scanner;

class ProductOfArray {
	public static void main(String args[]) throws Exception {
		Scanner sc1 = new Scanner(System.in);
		long modNum = (power(10, 9) + 7);
		int n = sc1.nextInt();
		long[] arr1 = new long[n];
		long answer = 1;
		for (int i = 0; i < n; i++) {
			arr1[i] = sc1.nextLong();
		}
		for (int j = 0; j < arr1.length; j++) {
			answer = (answer * arr1[j]) % modNum;
		}
		System.out.println(answer);
		sc1.close();
	}

	public static long power(long base, long power) {
		long result = 1;
		for (int i = 0; i < power; i++) {
			result = result * base;
		}
		return result;
	}

}
