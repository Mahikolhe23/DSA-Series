package gfg.array;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1?page=1&category[]=Arrays&curated[]=1&curated[]=8&sortBy=submissions
public class MinMaxInArray {
	public static void main(String[] args) {

	}

	static pair getMinMax(long a[], long n) {
		Arrays.sort(a);
		long min = a[0];
		long max = a[a.length - 1];
		return new pair(min, max);
	}
}

//class pair {
//	long first, second;
//
//	public pair(long first, long second) {
//		this.first = first;
//		this.second = second;
//	}
//}
