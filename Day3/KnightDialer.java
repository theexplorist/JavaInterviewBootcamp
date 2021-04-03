class Solution {
    
    int[] dirx = {-2, -2, -1, -1, 1, 1, 2, 2};
    int[] diry = {-1, 1, -2, 2, -2, 2, -1, 1};
    public int knightDialer(int n) {
        
        int moves = 0;
                Map<String, Integer> dp = new HashMap<>();
        for(int r = 0; r < 4; r++) {
            for(int c = 0; c < 3; c++) {
                moves = (moves + knightDialer(n - 1, r, c, dp)) % 1000000007;
            }
        }
        
        return moves;
        
    }
    
    public String keyGenerator(int k, int r, int c) {
        
        StringBuilder sb = new StringBuilder();
        sb.append(k);
        sb.append("|");
        sb.append(r);
        sb.append("|");
        sb.append(c);
        
        return sb.toString();
    }
    
    private int knightDialer(int n, int i, int j, Map<String, Integer> dp) {
        if(i < 0 || j < 0 || (i == 3 && j == 0) || (i == 3 && j == 2) || i > 3 || j > 2) {
            return 0;
        }
        
        if(n == 0) {
            return 1;
        }
        
        String key = keyGenerator(n, i, j);
        if(dp.containsKey(key)) {
            return dp.get(key);
        }
        
        int moves = 0;
        for(int l = 0; l < 8; l++) {
            moves = (moves + knightDialer(n - 1, i + dirx[l], j + diry[l], dp)) % 1000000007;
        }
        
        dp.put(key, moves);
        return moves;
    }
}
