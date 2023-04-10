package day3.conditional_loops_basic;

import java.util.Scanner;

public class P18_VolumeOfPyramid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length");
		int l = in.nextInt();
		System.out.println("Enter height");
		int h = in.nextInt();
		System.out.println("Enter width");
		int w = in.nextInt();
		System.out.println("volume = " + volume(l, h, w));
		in.close();
	}

	private static double volume(int l, int h, int w) {
		return l * w * h / 3;
	}
}
