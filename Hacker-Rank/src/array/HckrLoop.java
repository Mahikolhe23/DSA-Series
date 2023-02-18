package array;

//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
import java.util.Scanner;

public class HckrLoop {

	public static void main(String[] args) {
		Scanner mm = new Scanner(System.in);
		int N = mm.nextInt();
		for (int i = 0; i < N; i++) {
			int a = mm.nextInt();
			int b = mm.nextInt();
			int n = mm.nextInt();
			int result = a + (int) Math.pow(2, 0) * b;
			System.out.print(result + " ");
			for (int j = 1; j < n; j++) {
				result += (int) Math.pow(2, j) * b;
				System.out.print(result + " ");
			}
			System.out.println();
		}
		mm.close();
	}
}
