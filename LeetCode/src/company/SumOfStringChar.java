package company;

public class SumOfStringChar {
	// if A=0 , B=1, C=B+A,D=C+B so on cal sum of given string
	public static void main(String[] args) {
		System.out.println(sumString("MAN"));
	}

	public static int sumString(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += calFib(s.charAt(i) - 65);
		}
		return sum;
	}

	public static int calFib(int n) {
		if (n == 0 || n == 1)
			return n;
		return calFib(n - 1) + calFib(n - 2);
	}
}
