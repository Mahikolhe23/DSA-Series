package day3.conditional_loops_basic;

import java.util.Scanner;

public class P14_VolumeOfCone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter rad");
		int r = in.nextInt();
		System.out.println("Enter height");
		int h = in.nextInt();
		System.out.println("Volume = " + volume(r, h));
		in.close();
	}

	private static double volume(int r, int h) {
		return Math.PI * r * r * h / 3;
	}
}
