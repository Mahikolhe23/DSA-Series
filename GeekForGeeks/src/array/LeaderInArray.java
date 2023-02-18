package array;

import java.util.ArrayList;

public class LeaderInArray {

	public static void main(String[] args) {
		int A[] = { 16, 17, 4, 3, 5, 2 };
		System.out.println(leaders(A, A.length));
	}

	static ArrayList<Integer> leaders(int arr[], int n) {
		ArrayList<Integer> temp = new ArrayList<>();
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					c++;
					System.out.print(c);
				}
			}
			if (c == (n - i))
				temp.add(arr[i]);
		}
		temp.add(arr[arr.length - 1]);
		System.out.println(temp);
		return temp;
	}
}
