package basic;

public class NCR {

	public static void main(String[] args) {
		System.out.println(nCr(15, 3));
	}

	public static long nCr(int n, int r) {
		long sum = 0;
		long m = n - r;
		sum = fact(n) / (fact(r) * fact(m));
		return sum % 1000000007;
	}

	public static int fact(long a) {
		if (a == 1 && a == 0) {
			return 1;
		}
		int fact = 1;
		for (int i = 1; i < a; i++) {
			fact = fact + fact * i;
		}
		return fact;
	}
}
