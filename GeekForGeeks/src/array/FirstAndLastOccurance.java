package array;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1?page=1&category[]=Arrays&category[]=Strings&curated[]=1&curated[]=8&curated[]=7&curated[]=2&sortBy=submissions
public class FirstAndLastOccurance {

	public static void main(String[] args) {
		long arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
		System.out.println(find(arr, arr.length, 5));
	}

	public static ArrayList<Long> find(long arr[], int n, int x) {
		ArrayList<Long> temp = new ArrayList<>();
		ArrayList<Long> temp1 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				temp.add((long) i);
			}
		}
		temp1.add(0, temp.get(0));
		temp1.add(1, temp.get(temp.size() - 1));
		return temp1;
	}
}
