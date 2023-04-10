package day3.conditional_loops_basic;

import java.util.Scanner;

public class P17_VolumeOfSphere {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter rad");
		int r = in.nextInt();
		System.out.println("volume = " + volume(r));
		in.close();
	}

	private static double volume(int r) {
		return Math.PI * 4 * r * r * r / 3;
	}
}
