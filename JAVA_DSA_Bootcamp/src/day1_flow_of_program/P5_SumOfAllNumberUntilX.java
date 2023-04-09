package day1_flow_of_program;

import java.util.Scanner;

public class P5_SumOfAllNumberUntilX {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		while (num != -1) {
			System.out.println("Enter the number ");
			num = in.nextInt();
			sum += num;
		}
		System.out.println("sum of all Number = " + (sum - num));
		in.close();
	}
}
