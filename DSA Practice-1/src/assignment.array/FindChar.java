package home.array;

public class FindChar {
	public static void main(String[] args) {
		char[] letters = { 'v', 'w', 'x' };
		char target = 's';
		char ans = floorofnum(letters, target);
		System.out.println(ans);
	}
	public static char floorofnum(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < letters[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return letters[start % letters.length];
	}
}