package basics;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumberOfStepsToReduceToZero {

	public static void main(String[] args) {
		System.out.println(numberOfSteps(8));
	}

	public static int numberOfSteps(int num) {
		int c1 = 0;
		int c2 = 0;
		while (num != 0) {
			if (num % 2 == 0) {
				num /= 2;
				c1++;
			} else {
				num -= 1;
				c2++;
			}
		}
		return (c1 + c2);
	}
}
