package day2_java_programs;

import java.util.Scanner;

public class P3_FindSimpleInterest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Principle Amount");
		int principle = in.nextInt();
		System.out.println("Enter the time in years");
		int time = in.nextInt();
		System.out.println("Enter the rate of interest");
		int rate = in.nextInt();
		System.out.println("Simple Interest = " + simpleInterest(principle, time, rate));
		in.close();
	}

	public static int simpleInterest(int p, int t, int r) {
		return (p * t * r) / 100;
	}
}
