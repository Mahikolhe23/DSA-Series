package array;
//https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&category[]=Arrays&category[]=Strings&curated[]=1&curated[]=8&curated[]=7&curated[]=2&sortBy=submissions
public class PalindromicArray {

	public static void main(String[] args) {
		int[] arr = { 121, 131, 222, 333 };
		System.out.println(palinArray(arr, arr.length));
	}

	public static int palinArray(int[] a, int n) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (isPalindrome(a[i])) {
				count++;
			}
		}
		if (count == n)
			return 1;
		return 0;
	}

	private static boolean isPalindrome(int a) {
		int temp = a;
		int sum = 0;
		while (a > 0) {
			int r = a % 10;
			sum = sum * 10 + r;
			a = a / 10;
		}
		if (sum == temp)
			return true;
		else
			return false;
	}
}
