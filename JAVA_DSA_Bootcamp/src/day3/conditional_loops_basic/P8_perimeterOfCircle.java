package day3.conditional_loops_basic;

import java.util.Scanner;

public class P8_perimeterOfCircle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int rad = in.nextInt();
		System.out.println("Perimeter = " + perimeter(rad));
		in.close();
	}

	public static int perimeter(int rad) {
		return (int) Math.PI * 2 * rad;
	}
}
