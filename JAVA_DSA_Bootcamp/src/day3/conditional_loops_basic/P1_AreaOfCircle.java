package day3.conditional_loops_basic;

import java.util.Scanner;

public class P1_AreaOfCircle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int rad = in.nextInt();
		System.out.println("Area of Circle is " + areaOfCircle(rad));
		in.close();
	}

	public static double areaOfCircle(int r) {
		return Math.round(r * r * Math.PI * 100.0) / 100.0;
	}
}
