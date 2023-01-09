package gfg.array;

import java.util.Arrays;
import java.util.LinkedHashSet;

//https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1?page=1&category[]=Mathematical&sortBy=submissions
public class UnionArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3 };
		System.out.println(doUnion(a, a.length, b, b.length));
	}

	public static int doUnion(int a[], int n, int b[], int m) {
		Arrays.sort(a);
		Arrays.sort(b);
		LinkedHashSet<Integer> L = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			L.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			L.add(b[i]);
		}
		return L.size();
	}
}
