package day3.conditional_loops_intermidiate;

import java.util.Scanner;

public class P4_CalculateDiscountOfProduct {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the price of product");
		int price = in.nextInt();
		System.out.println("Enter the discount for product");
		int discount = in.nextInt();
		System.out.println("Total cost after discount = " + discount(price, discount));
		in.close();
	}

	public static int discount(int price, int discount) {
		return price - price * discount / 100;
	}
}
