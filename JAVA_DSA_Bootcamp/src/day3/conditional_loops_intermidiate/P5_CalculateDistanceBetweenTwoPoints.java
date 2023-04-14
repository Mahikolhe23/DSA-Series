package day3.conditional_loops_intermidiate;

import java.util.Scanner;

public class P5_CalculateDistanceBetweenTwoPoints {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter p1 and p");
		int p1 = in.nextInt();
		int p2 = in.nextInt();
		System.out.println("Distance = " + distance(p1, p2));
		in.close();
	}

	public static int distance(int p1, int p2) {
		return p2 - p1;
	}
}
