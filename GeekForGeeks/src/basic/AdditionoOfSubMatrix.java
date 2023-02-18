package basic;

public class AdditionoOfSubMatrix {

	public static void main(String[] args) {
		int Arr[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 } };
		int X1 = 3, Y1 = 4, X2 = 4, Y2 = 5;
		System.out.println(subMatrixSum(Arr, X1, Y1, X2, Y2));
	}

	public static long subMatrixSum(int arr[][], int x1, int y1, int x2, int y2) {
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == x1 && j == y1) {
					sum = sum + arr[i][j];
				}

			}
		}
		return 0;
	}
}
