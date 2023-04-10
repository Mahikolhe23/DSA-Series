package day3.conditional_loops_basic;

import java.util.Scanner;

public class P15_VolumeOfPrism {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter base");
		int b = in.nextInt();
		System.out.println("Enter height");
		int h = in.nextInt();
		System.out.println("Enter length");
		int l = in.nextInt();
		System.out.println("Volume = " + volumeOfTriangularPrism(b, h, l));
		in.close();
	}

	public static double volumeOfTriangularPrism(int b, int h, int l) {
		return 0.5 * b * h * l;
	}

	public static double volumeOfrectangularPrism(int b, int h, int l) {
		return b * h * l;
	}
}
