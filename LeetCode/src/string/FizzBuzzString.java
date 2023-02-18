package string;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/fizz-buzz/
public class FizzBuzzString {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
	}

	public static List<String> fizzBuzz(int n) {
		String a = "Fizz";
		String b = "Buzz";
		String c = "FizzBuzz";
		List<String> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
				list.add(c);
			} else if ((i + 1) % 3 == 0) {
				list.add(a);
			} else if ((i + 1) % 5 == 0) {
				list.add(b);
			} else
				list.add(Integer.toString(i + 1));
		}
		return list;
	}
}
