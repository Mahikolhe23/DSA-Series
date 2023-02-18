package basic;

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/count-divisors/
import java.util.Scanner;

public class CountDivisors {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int r = in.nextInt();
		int k = in.nextInt();
		int count = 0;
		for (int i = l; i <= r; i++) {
			if (i % k == 0) {
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}
}
