package assignment.sort;

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		String temp = S;
		StringBuilder SB = new StringBuilder();
		SB.append(S);
		SB.reverse();
		// System.out.println(SB);// for reverse
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			if (SB.charAt(0) == temp.charAt(0)) {
				count++;
			}
		}
		if (count == S.length()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		in.close();
	}
}
