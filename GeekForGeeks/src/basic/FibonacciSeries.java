package basic;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println(nthFibonacci(656));
	}

	public static long nthFibonacci(long n) {
		long f = 0;
		long s = 1;
		long t = 0;
		for (int i = 2; i <= n; i++) {
			t = (f + s) % 1000000007;
			f = s;
			s = t;
		}
		return t;
	}
}
