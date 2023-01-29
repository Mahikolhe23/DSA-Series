package home.sorting;

import java.util.Scanner;

//https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/calculate-the-power/
public class CalculatePower {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int power = in.nextInt();
		int ans = 1;
		for (int i = 0; i < power; i++) {
			ans = ans * num;
		}
		ans = ans % ((int) (Math.pow(10, 9) + 7));
		System.out.println(ans);
	}
}
