package gfg.array;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateInArray {
	public static void main(String[] args) {
		int a[] = { 13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14 };
		System.out.println(duplicates(a, a.length));
	}

	public static ArrayList<Integer> duplicates(int arr[], int n) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		Arrays.sort(arr);// 1,2,2,3,3
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					temp.add(arr[i]);
			}
		}
		if (temp.isEmpty())
			temp.add(-1);
		return temp;
	}
}
