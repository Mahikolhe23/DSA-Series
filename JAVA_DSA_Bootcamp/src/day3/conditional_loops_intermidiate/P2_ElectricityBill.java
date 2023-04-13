package day3.conditional_loops_intermidiate;

import java.util.Scanner;

public class P2_ElectricityBill {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Unit Rate");
		int rate = in.nextInt();
		System.out.println("Enter the Consumeption");
		int consume = in.nextInt();
		System.out.println("Electric Bill sum = " + electricity(rate, consume));
		in.close();
	}

	public static int electricity(int rate, int consume) {
		return rate * consume;
	}
}
