class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return helper(nums,n-1,dp);
        
    }
    private int helper(int[] nums, int i, int[] dp){
        if(i<0){
            return 0;
        }

        if(i==0){
            return nums[0];
        }
        if(dp[i]!= -1){
            return dp[i];
        }
        int taken = nums[i] + helper(nums,i-2,dp);
        int not = 0 + helper(nums,i-1,dp);
        return dp[i] = Math.max(taken,not);

    }
}