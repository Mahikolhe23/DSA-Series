package string;

import java.util.Scanner;

public class StringConvert {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String to convert");
		System.out.println(convert(in.next()));
		in.close();
	}

	public static String convert(String a) {
		String ans = "";
		for (int i = 0; i < a.length(); i++) {
			if (Character.isAlphabetic(a.charAt(i))) {
				ans += Character.toString(a.charAt(i) + 1);
			} else
				ans += a.charAt(i);
		}
		return ans;
	}
}
