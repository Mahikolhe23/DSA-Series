package array;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPairGivenSum {

	public static void main(String[] args) {
		long A[] = { 1, 2, 4, 5, 7 };
		long B[] = { 5, 6, 3, 4, 8 };
		long X = 9;
		System.out.println(allPairs(A, B, A.length, B.length, X));
	}

	public static pair[] allPairs(long A[], long B[], long N, long M, long X) {
		Arrays.sort(A);
		Arrays.sort(B);
		ArrayList<pair> b = new ArrayList<pair>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (A[i] + B[j] == X) {
					b.add(new pair(A[i], B[j]));
				}
			}
		}
		pair[] p = new pair[b.size()];
		b.toArray(p);
		return p;
	}
}

class pair {
	long first, second;

	public pair(long first, long second) {
		this.first = first;
		this.second = second;
	}
}
