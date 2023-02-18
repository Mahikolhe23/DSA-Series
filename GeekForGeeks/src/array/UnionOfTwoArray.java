package array;

import java.util.ArrayList;

public class UnionOfTwoArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 3 };
		int n = 5, m = 3;
		System.out.println(findUnion(arr1, arr2, n, m));
	}

	public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr1[i] == arr2[j]) {
					list.add(arr1[i]);
				}
			}
		}
		return list;
	}
}
