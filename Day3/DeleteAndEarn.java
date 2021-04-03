class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        
        int maxEl = Integer.MIN_VALUE;
        
        for(int num : nums) {
            maxEl = Math.max(num, maxEl);
        }
        
        int[] count = new int[maxEl + 1];
        
        for(int num : nums) {
            count[num] += num;
        }
        
        int[] dp = new int[count.length + 1];
        Arrays.fill(dp, -1);
        return rob(count, count.length, dp);
    }
    
    public int rob(int[] nums, int n, int[] dp) {
        
        //Base case
        
        if(n <= 0) {
            return 0;
        }
        
        if(dp[n] != -1) { //mere pass n ke liye exp hai
            return dp[n]; //aage no rec call
        }
        
        int choice1 = nums[n - 1] + rob(nums, n - 2, dp); //looto
        int choice2 = rob(nums, n - 1, dp);// mat looto
        
        return dp[n] = Math.max(choice1, choice2);
    }
}
