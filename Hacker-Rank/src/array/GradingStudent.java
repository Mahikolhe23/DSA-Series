package array;

//https://www.hackerrank.com/contests/marathi-coders-coding-round/challenges/grading/submissions/code/1358155484
import java.util.ArrayList;
import java.util.List;

public class GradingStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < grades.size(); i++) {
			int num = grades.get(i);
			int r = num % 10;
			int n = num / 10;
			if (num < 38) {
				list.add(num);
			} else if (r == 3 || r == 4) {
				int val = n * 10 + 5;
				list.add(val);
			} else if (r == 8 || r == 9) {
				int val = n * 10 + 10;
				list.add(val);
			} else
				list.add(num);
		}
		return list;
	}

}
