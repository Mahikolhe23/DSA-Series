package day3.conditional_loops_intermidiate;

import java.util.Scanner;

public class P7_PowerInJava {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number and power");
		int num = in.nextInt();
		int power = in.nextInt();
		System.out.println("Power = " + power(num, power));
		in.close();
	}

	public static int power(int num, int power) {
		int sum = 1;
		for (int i = 1; i <= power; i++) {
			sum = sum * num;
		}
		return sum;
	}
}
