package hackerearth.basic;

import java.util.Scanner;

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/is-zoo-f6f309e7/
public class Zoo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String arr = in.nextLine();
		int x = 0;
		int y = 0;
		for (int i = 0; i < arr.length(); i++) {
			if (arr.charAt(i) == 'z' || arr.charAt(i) == 'Z') {
				x++;
			}
			if (arr.charAt(i) == 'o' || arr.charAt(i) == 'O') {
				y++;
			}
		}
		int z = 2 * x;
		if (y == z && arr.length() < 21) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		in.close();
	}
}
