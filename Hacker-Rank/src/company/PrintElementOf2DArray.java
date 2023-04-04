package company;
//cumulas hitachi
public class PrintElementOf2DArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, 
						{ 5, 6, 7, 8 }, 
						{ 9, 10, 11, 12 }, 
						{ 13, 14, 15, 16 } };
		print(arr, 0, 3);
	}

	public static void print(int[][] arr, int i, int j) {
		int n = arr.length;
		int m = arr[0].length;
		if (isValid(i - 1, j - 1, n, m)) {
			System.out.print(arr[i - 1][j - 1]);
		}
		if (isValid(i - 1, j, n, m)) {
			System.out.print(arr[i - 1][j]);
		}
		if (isValid(i - 1, j + 1, n, m)) {
			System.out.print(arr[i - 1][j + 1]);
		}
		if (isValid(i, j - 1, n, m)) {
			System.out.print(arr[i][j - 1]);
		}
		if (isValid(i, j, n, m)) {
//			System.out.print(arr[i][j]);
		}
		if (isValid(i, j + 1, n, m)) {
			System.out.print(arr[i][j + 1]);
		}
		if (isValid(i + 1, j - 1, n, m)) {
			System.out.print(arr[i + 1][j - 1]);
		}
		if (isValid(i + 1, j, n, m)) {
			System.out.print(arr[i + 1][j]);
		}
		if (isValid(i + 1, j + 1, n, m)) {
			System.out.print(arr[i + 1][j + 1]);
		}
	}

	public static boolean isValid(int i, int j, int n, int m) {
		if (i < 0 || j < 0 || i > n - 1 || j > m - 1)
			return false;
		return true;
	}
}
