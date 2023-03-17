package array;

import java.util.ArrayList;
//https://www.hackerrank.com/contests/marathi-coders-coding-round/challenges/breaking-best-and-worst-records/submissions/code/1358156497
import java.util.List;

public class BreakingRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<Integer> breakingRecords(List<Integer> scores) {
		List<Integer> list = new ArrayList<>();
		int minCount = 0;
		int maxCount = 0;
		int min = scores.get(0);
		int max = scores.get(0);
		for (int i = 1; i < scores.size(); i++) {
			if (min > scores.get(i)) {
				min = scores.get(i);
				minCount++;
			}
			if (max < scores.get(i)) {
				max = scores.get(i);
				maxCount++;
			}

		}
		list.add(maxCount);
		list.add(minCount);
		return list;
	}
}
