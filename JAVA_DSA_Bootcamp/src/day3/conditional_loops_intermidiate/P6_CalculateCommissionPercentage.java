package day3.conditional_loops_intermidiate;

import java.util.Scanner;

public class P6_CalculateCommissionPercentage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter cost and commission");
		int sell = in.nextInt();
		int cost = in.nextInt();
		System.out.println("commission = " + commission(cost, sell));
		in.close();
	}

	private static int commission(int cost, int sell) {
		int profit = sell - cost;
		return (profit / cost) / 100;
	}
}
