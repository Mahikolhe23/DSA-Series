package basic;

//https://practice.geeksforgeeks.org/problems/factorial5739/1?category%5B%5D=Mathematical&category%5B%5D=Mathematical&page=3&query=category%5B%5DMathematicalpage3category%5B%5DMathematical
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(factorial(in.nextInt()));
		in.close();
	}

	static long factorial(int N) {
		if (N == 1 && N == 0) {
			return 1;
		}
		long sum = 1;
		for (int i = 1; i < N; i++) {
			sum = sum + sum * i;
		}
		return sum;
	}
}
