class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        int s=0;
        int n= nums.length;

        for(int i=0; i<n; i++){
            sum=sum+nums[i];
            while(sum>=target){
                int len = (i-s)+1;
                min=Math.min(len,min);
                sum=sum-nums[s];
                s++; 

            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
        
    }
}