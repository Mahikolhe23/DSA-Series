package gfg.string;

//https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1?page=1&category[]=Arrays&category[]=Strings&curated[]=1&curated[]=8&curated[]=7&curated[]=2&sortBy=submissions
import java.util.ArrayList;

public class ValueEqualToIndex {

	public static void main(String[] args) {
		int[] Arr = { 1 };
		System.out.println(valueEqualToIndex(Arr, Arr.length));
	}

	public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == i + 1) {
				temp.add(arr[i]);
			}
		}
		return temp;
	}
}
