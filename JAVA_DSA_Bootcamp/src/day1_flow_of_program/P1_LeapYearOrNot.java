package day1_flow_of_program;

import java.util.Scanner;

public class P1_LeapYearOrNot {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Year to check leap year or not");
		int year = in.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println("This is not leap year");
		}
		in.close();
	}
}
