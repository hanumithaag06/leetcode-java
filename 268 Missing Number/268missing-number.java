class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int tot=0;

        int sum=(n* (n+1))/2;

        for(int i =0; i<n; i++){
           tot= tot+nums[i];
        }

        int miss=sum-tot;
        return miss;
        
    }
}