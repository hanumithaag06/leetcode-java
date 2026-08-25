class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums, 0, 0, target);        
    }

    private int backtrack(int[] nums, int index, int currentSum, int target){
        if(index==nums.length){
            if(currentSum==target){
                return 1;
            }
            return 0;
        }
        int add = backtrack(nums, index +1, currentSum+nums[index], target);
        int sub = backtrack(nums, index+1, currentSum-nums[index], target);
        return add+sub;
    }
}