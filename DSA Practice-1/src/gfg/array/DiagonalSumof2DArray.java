package gfg.array;

//https://leetcode.com/problems/matrix-diagonal-sum/
public class DiagonalSumof2DArray {

	public static void main(String[] args) {
		int[][] ans = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(diagonalSum(ans));
	}

	public static int diagonalSum(int[][] mat) {
		int ans = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (j == 0 || j == mat[j].length - 1) {
					if (mat[i] == mat[j]) {
						continue;
					}
					ans = ans + mat[i][j];
				}
			}
		}
		return ans;
	}
}
