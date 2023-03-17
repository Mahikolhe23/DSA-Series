package array;

import java.util.List;

//https://www.hackerrank.com/contests/marathi-coders-coding-round/challenges/divisible-sum-pairs/submissions/code/1358155703
public class DivisibleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int c = 0;
		for (int i = 0; i < ar.size(); i++) {
			for (int j = 0; j < ar.size(); j++) {
				if (i < j && (ar.get(i) + ar.get(j)) % k == 0)
					c++;
			}
		}
		return c;
	}

}
