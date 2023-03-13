package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class DuplicateInArray {
	public static void main(String[] args) {
		int a[] = { 13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14 };
		System.out.println(duplicates(a, a.length));
	}

	public static ArrayList<Integer> duplicates(int arr[], int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == arr[i]) {
				set.add(arr[i]);
			}
		}
		if (set.isEmpty())
			set.add(-1);
		// System.out.println(set);
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		return list;
	}
}
