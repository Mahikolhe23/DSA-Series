package company;
//FYNDNA
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingKElement {

	public static void main(String[] args) {
		Integer[] arr = { 4, 2, 5, 3, 1 };// 0 1 2 3 4
		int k = 3;
		System.out.println(Arrays.toString(sort(arr, k)));
	}

	public static Integer[] sort(Integer[] arr, int k) {
		Integer[] temp = new Integer[k];
//		Arrays.sort(arr);
//		int j = 0;
//		for (int i = arr.length - 1; i >= (arr.length - k); i--) {
//			temp[j++] = arr[i];
//		}
//		return temp;

		List<Integer> list = Arrays.asList(arr);
		List<Integer> list2 = list.stream().sorted((o1, o2) -> (o2 - o1)).limit(k).collect(Collectors.toList());
		temp = list2.toArray(temp);
		return temp;
	}

	public long maximumSum(int A[], int n) {
		// Code Here.
		Arrays.sort(A);
		int[] B = new int[n];
		for (int i = 0; i < n; i++) {
			B[i] = (i + 1) * A[i];
		}
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (long) B[i];
		}
		return sum;
	}
}
