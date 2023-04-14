package day3.conditional_loops_intermidiate;

import java.util.Scanner;

public class P8_CalculateDepreciationOfValue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Cost of Asset");
		int Asset = in.nextInt();
		System.out.println("Salvage value of Asset");
		int Salvage = in.nextInt();
		System.out.println("Depreciation Rate per Year");
		int Rate = in.nextInt();
		System.out.println("Depreciation = " + depreciation(Asset, Salvage, Rate));
		in.close();
	}

	public static int depreciation(int Asset, int Salvage, int rate) {
		return (Asset - Salvage) / rate;
	}
}
