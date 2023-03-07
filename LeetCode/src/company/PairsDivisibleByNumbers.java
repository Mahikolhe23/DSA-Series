package company;

import java.util.List;

public class PairsDivisibleByNumbers {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
		int k = 5;
		System.out.println(findPairs(list, k));
	}
	//count pair with division by K and i<j
	public static int findPairs(List<Integer> arr, int k) {
		int c = 0;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {
				if ((arr.get(i) + arr.get(j)) % k == 0 && i < j)
					c++;
			}
		}
		return c;
	}
}
