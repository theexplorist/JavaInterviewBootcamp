package Stair1;

public class WordSearch {

	static boolean ans;

	public static void sol(char[][] board, int sx, int sy, String word, int ci, boolean[][] vis) {
		

		if (sx < 0 || sy < 0 || sx >= board.length || sy >= board[0].length || word.charAt(ci) != board[sx][sy] || vis[sx][sy]) {
			return;
		}

		if (ci == word.length() - 1) {
			System.out.print("found");
			ans = true;
			return;
		}
		
		vis[sx][sy] = true;

		sol(board, sx + 1, sy, word, ci + 1, vis);
		sol(board, sx - 1, sy, word, ci + 1, vis);
		sol(board, sx, sy + 1, word, ci + 1, vis);
		sol(board, sx, sy - 1, word, ci + 1, vis);
		
		vis[sx][sy] = false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ans = false;
		char[][] board  = {{'A', 'B', 'C', 'E'},
				           {'S', 'F', 'C', 'S'},
				           {'A', 'D', 'E', 'E'}
		};
		
		String word = "SES";
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				if(board[i][j] == word.charAt(0))
				sol(board, i, j, "SES", 0, new boolean[board.length][board[0].length]);
			}
		}
		
		System.out.println(ans);
	}

}
