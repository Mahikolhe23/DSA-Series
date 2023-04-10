package day3.conditional_loops_basic;

import java.util.Scanner;

public class P5_AreaOfParralellogram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter base ");
		int b = in.nextInt();
		System.out.println("Enter height");
		int h = in.nextInt();
		System.out.println("Area = " + area(h, b));
		in.close();
	}

	public static double area(int h, int b) {
		return b * h;
	}
}
