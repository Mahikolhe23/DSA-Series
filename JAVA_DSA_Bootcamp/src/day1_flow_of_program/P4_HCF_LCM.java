package day1_flow_of_program;

import java.util.Scanner;

public class P4_HCF_LCM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two number");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		System.out.println("HCF of this number is = " + hcf(n1, n2));
		System.out.println("LCM of this number is = " + lcm(n1, n2));
		in.close();
	}

	public static int hcf(int n1, int n2) {
		for (int i = n1; i >= 2; i--) {
			if (n1 % i == 0 && n2 % i == 0) {
				return i;
			}
		}
		return -1;
	}

	public static int lcm(int n1, int n2) {
		int min = Math.min(n1, n2);
		int max = Math.max(n1, n2);
		for (int i = max;; i += max) {
			if (i % min == 0) {
				return i;
			}
		}
	}
}
