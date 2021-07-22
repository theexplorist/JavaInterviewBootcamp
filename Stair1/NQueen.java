package Stair1;

public class NQueen {

	private static boolean canPlace(int[][] arr, int cr, int cc, int n) {
		// TODO Auto-generated method stub

		for (int row = 0; row < cr; row++) {
			if (arr[row][cc] == 1) {
				return false;
			}
		}

		int row = cr;
		int col = cc;

		while (row >= 0 && col >= 0) {
			if (arr[row][col] == 1) {
				return false;
			}
			row--;
			col--;
		}

		row = cr;
		col = cc;

		while (row >= 0 && col < n) {
			if (arr[row][col] == 1) {
				return false;
			}
			row--;
			col++;
		}

		return true;
	}

	public static void place(int[][] arr, int cr, int n) {

		
		if (cr == n) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("----------------");
			return;
		}

		for (int cc = 0; cc < n; cc++) {
			if (canPlace(arr, cr, cc, n)) {
				arr[cr][cc] = 1;
				place(arr, cr + 1, n);
				arr[cr][cc] = 0;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int[][] arr = new int[n][n];
		place(arr, 0, n);
	}

}
