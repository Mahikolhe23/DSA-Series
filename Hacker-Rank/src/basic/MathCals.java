package basic;

public class MathCals {

	public static void main(String[] args) {
		System.out.println(lcm(72, 120));
		System.out.println(lcm2(72, 120));
		System.out.println(gcd(72, 120));
	}

	public static int lcm(int n1, int n2) {
		int gcd = 1;
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}
		return (n1 * n2) / gcd;
	}

	public static int lcm2(int n1, int n2) {
		int lcm = (n1 > n2) ? n1 : n2;
		int ans = 0;
		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				ans = lcm;
				break;
			}
			lcm++;
		}
		return ans;
	}
	public static int gcd(int n1,int n2) {
		int gcd = 1;
		for (int i = 1; i <= n1 || i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}
		return gcd;
	}
}
