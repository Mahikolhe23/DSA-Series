package leetcode.array;

import java.util.Arrays;

public class ArrayOfSubString {
	public static void main(String[] args) {
		long[] a = { 8, 4, 3, 4, 5, 1, 1, 1, 1, 2, 3, 1 };
		long[] b = { 1, 2, 3, 1 };
		System.out.println(isSubset(a, b, a.length, b.length));
	}

	public static String isSubset(long a1[], long a2[], long n, long m) {
		Arrays.sort(a1);
		Arrays.sort(a2);
		int p = 0;
		for (int i = 0; i < n; i++) {
			if (a1[i] == a2[p]) {
				p++;
			}
			if (p == m) {
				break;
			}
		}
		if (p == m)
			return "Yes";
		return "No";
	}
}
