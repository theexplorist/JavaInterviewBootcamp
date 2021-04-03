class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        return rob(nums, nums.length, dp);
    }
    
    public int rob(int[] nums, int n, int[] dp) { //n = 4
        
        //Base case
        
        if(n <= 0) {
            return 0;
        }
        
        if(dp[n] != -1) { //mere pass n ke liye exp hai
            return dp[n]; //aage no rec call
        }
        
        int choice1 = nums[n - 1] + rob(nums, n - 2, dp); //looto
        int choice2 = rob(nums, n - 1, dp);// mat looto
        
        return dp[n] = Math.max(choice1, choice2); //exp store kia
    }
}
