class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        if(amount == 0) { //5 -> 3 -> 1 -> 0, yes tareeka mil hi gya
			return 1;
		}
		
		if(n == 0) {
			return 0;
		}
        
        return coinIter(coins, n, amount);
    }
    
    private static int coinIter(int[] coins, int n, int amount) {
		// TODO Auto-generated method stub
		int[][] dp = new int[n + 1][amount + 1];

		// Base cases ko change
		for (int row = 0; row <= n; row++) { // amount = 0 , ans = 1
			dp[row][0] = 1;
		}

		for (int col = 1; col <= amount; col++) {
			dp[0][col] = 0;
		}

		for (int row = 1; row <= n; row++) { //n <-> row
			for (int col = 1; col <= amount; col++) { //amount <-> col
				int inc = 0, exc = 0;
				if (col >= coins[row - 1]) {
					inc = dp[row][col - coins[row - 1]];
				}
				
				exc = dp[row - 1][col];
				
				int meraAns = inc + exc;
				dp[row][col] = meraAns;
			}
		}
		return dp[n][amount];
	}
    
    private static int ways(int[] coins, int amount, int n, int[][] dp) {
		// TODO Auto-generated method stub
		
		if(amount == 0) { //5 -> 3 -> 1 -> 0, yes tareeka mil hi gya
			return 1;
		}
		
		if(n == 0) {
			return 0;
		}
		
		if(dp[n][amount] != -1) {
			return dp[n][amount];
		}
		
		int inc = 0, exc = 0;
		
		if(amount >= coins[n - 1]) {
			inc = ways(coins, amount - coins[n - 1], n, dp);
		}
		
		exc = ways(coins, amount, n - 1, dp);
		
		int meraAns = inc + exc; //pehla experience
		dp[n][amount] = meraAns; //experience yadd rahega
		return  meraAns;
	}
}
