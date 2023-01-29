package assignment.pattern;

public class ReversePyramid {

	public static void main(String[] args) {
		pattern(5);
	}

	static void pattern(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
