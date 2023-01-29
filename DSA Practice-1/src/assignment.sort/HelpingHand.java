package home.sorting;

// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cartag-948c2b02/
import java.util.Scanner;

public class HelpingHand {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		int count = 0;
		int ind = 0;
		if ((name.charAt(0) + name.charAt(1)) % 2 == 0 && (name.charAt(3) + name.charAt(4)) % 2 == 0
				&& (name.charAt(4) + name.charAt(5)) % 2 == 0 && (name.charAt(7) + name.charAt(8)) % 2 == 0) {
			count++;
		}
		if (name.charAt(2) == 'A' || name.charAt(2) == 'E' || name.charAt(2) == 'I' || name.charAt(2) == 'O'
				|| name.charAt(2) == 'U' || name.charAt(2) == 'Y') {
			ind++;
		}
		if (count == 1 && ind == 0) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
}