package array;

//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class FinalOperationOnArray {

	public static void main(String[] args) {
		String[] operations = { "--X", "X++", "X++" };
		System.out.println(finalValueAfterOperations(operations));
	}

	public static int finalValueAfterOperations(String[] operations) {
		int sum = 0;
		for (int i = 0; i < operations.length; i++) {
			if (operations[i].charAt(0) == '+' || (operations[i].charAt(0) == 'X' && operations[i].charAt(1) == '+'))
				sum++;
			else
				sum--;
		}
		return sum;
	}
}
