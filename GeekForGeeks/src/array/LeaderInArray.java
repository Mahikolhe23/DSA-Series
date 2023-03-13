package array;

import java.util.ArrayList;
import java.util.Collections;

//https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&difficulty[]=0&sortBy=submissions
public class LeaderInArray {

	public static void main(String[] args) {
		int A[] = { 16, 17, 4, 3, 5, 2 };
		System.out.println(leaders(A, A.length));
	}

	static ArrayList<Integer> leaders(int arr[], int n) {
		ArrayList<Integer> temp = new ArrayList<>();
		// last element is always leader
		int c = arr[n - 1];
		temp.add(c);
		// iterate from second last element
		for (int i = n - 2; i >= 0; i--) {
			if (c <= arr[i]) {
				c = arr[i];
				temp.add(c);
			}
		}
		Collections.reverse(temp);
		return temp;
	}
}
