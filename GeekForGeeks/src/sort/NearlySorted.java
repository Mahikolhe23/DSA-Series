package sort;

//https://practice.geeksforgeeks.org/problems/nearly-sorted-1587115620/1?page=1&category[]=Arrays&sortBy=accuracy
import java.util.ArrayList;
import java.util.PriorityQueue;

public class NearlySorted {

	public static void main(String[] args) {
		int n = 7;
		int k = 3;
		Integer arr[] = { 6, 5, 3, 2, 8, 10, 9 };
		System.out.println(nearlySorted(arr, n, k));
	}

	static ArrayList<Integer> nearlySorted(Integer arr[], int num, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		PriorityQueue<Integer> qu = new PriorityQueue<Integer>();
		for (int i = 0; i <= k; i++) {
			qu.offer(arr[i]);
		}
		for (int i = k + 1; i < arr.length; i++) {
			list.add(qu.poll());
			qu.add(arr[i]);
		}
		while (!qu.isEmpty()) {
			list.add(qu.poll());
		}
		return list;
	}
}
