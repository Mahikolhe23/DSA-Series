package gfg.array;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseSubArray {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		reverseInGroups(arr, arr.size(), 3);
	}

	static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		Collections.reverse(arr.subList(0, k));
		Collections.reverse(arr.subList(k + 1, n - 1));
		System.out.println(arr);
	}
}
