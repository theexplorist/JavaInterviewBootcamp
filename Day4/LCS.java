class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
		int[][] dp = new int[text1.length() + 1][text2.length() + 1];
		
		for(int[] row : dp) {
			Arrays.fill(row, -1);
		}
		
		return lCS(text1, text2, text1.length(), text2.length(), dp);
		
	}
	
	private int lCS(String text1, String text2, int n, int m, int[][] dp) {
		// TODO Auto-generated method stub
		
		if(n == 0 || m == 0) {
			return 0;
		}
		
		if(dp[n][m] != -1) {
			return dp[n][m];
		}
		
		int c1 = 0, c2 = 0;
		if(text1.charAt(n - 1) == text2.charAt(m - 1)) {
			return dp[n][m] =  1 + lCS(text1, text2, n - 1, m - 1, dp);
		} else {
			c1 = lCS(text1, text2, n - 1, m, dp);
			c2 = lCS(text1, text2, n, m - 1, dp);
			return dp[n][m] = Math.max(c1, c2);
		}
	}
}
