class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        return longestCommonSubsequence(A, B, A.length, B.length);
    }
    
    public int longestCommonSubsequence(int[] A, int[] B, int n, int m) {
        if(n == 0 || m == 0) {
            return 0;
        }
        
        int c1 = 0;
        int c2 = 0;
        if(A[n - 1] == B[m - 1]) {
            return 1 + longestCommonSubsequence(A, B, n - 1, m - 1);
        } else {
            c1 = longestCommonSubsequence(A, B, n - 1, m);
            c2 = longestCommonSubsequence(A, B, n, m - 1);
            
            return Math.max(c1, c2);
        }
    }
}
