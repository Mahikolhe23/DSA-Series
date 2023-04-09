package day2_java_programs;

import java.util.Scanner;

public class P6_INRtoUSD {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Rupees");
		int inr = in.nextInt();
		System.out.println("USD = " + inrTOusd(inr));
		in.close();
	}

	public static int inrTOusd(int inr) {
		return inr / 82;
	}
}
