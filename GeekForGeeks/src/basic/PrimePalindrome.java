package basic;

public class PrimePalindrome {

	public static void main(String[] args) {
		System.out.println(isPrimePalidrome(313));
	}

	public static boolean isPrimePalidrome(int n) {
		if (isPrime(n)) {
			int temp = n;
			int sum = 0;
			while (temp > 0) {
				int r = temp % 10;
				sum = sum * 10 + r;
				temp /= 10;
			}
			return (sum == n);
		}
		return false;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
