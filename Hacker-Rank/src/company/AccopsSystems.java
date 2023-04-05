package company;

import java.util.Arrays;

public class AccopsSystems {
	int a = 10;

	public static void main(String[] args) {
//		System.out.println(diff(213));
//		System.out.println(check("GOOD BOY", "ABCd mkl"));
		System.out.println(encrypt("xyzA", 2));
	}

	// 1 return difference between min and max of given number
	public static int diff(int num) {
		int max = 0;
		int min = 0;
		char[] arr = Integer.toString(num).toCharArray();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			min = min * 10 + arr[i];
			int j = arr.length - i - 1;
			max = max * 10 + arr[j];
		}
		return max - min;
	}

	// 2 check both substring of string equal or not
	public static boolean check(String s1, String s2) {
		String[] a = s1.split(" ");
		String[] b = s2.split(" ");
		if ((s1.length() != s2.length()) || (a.length != b.length)) {
			return false;
		}
		for (int i = 0; i < b.length; i++) {
			if (a[i].length() != b[i].length()) {
				return false;
			}
		}
		return true;
	}

	// 3 Encrypt the given string by given number
	public static String encrypt(String s, int n) {
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				int num = (s.charAt(i) - 'a' + n) % 26;
				temp += (char) (num + 'a');
			} else {
				int num = (s.charAt(i) - 'A' + n) % 26;
				temp += (char) (num + 'A');
			}
		}
		return temp;
	}
}
