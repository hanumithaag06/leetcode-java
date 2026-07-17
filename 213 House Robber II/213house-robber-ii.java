class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        
        int c1 = helper(nums, 0, n-2);
        int c2 = helper(nums, 1, n-1);
        return Math.max(c1,c2);
        
    }

    public int helper(int[] nums, int s, int e){
        if (s == e){
            return nums[s];
        }

        int[] dp = new int[nums.length];
        dp[s] = nums[s];
        dp[s+1] = Math.max(nums[s],nums[s+1]);
         for(int i=s+2; i<=e; i++){
            int rob = nums[i]+dp[i-2];
            int skip = dp[i-1];
            dp[i] = Math.max(skip,rob);
        }
        return dp[e];
    }
        
    
}