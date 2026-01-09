class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=1;
        int curr=1;

        if(n==0){
            return 0;
        }

        for(int i=1; i<n; i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            else if(nums[i-1]+1==nums[i]){
                count++;
            }
            else{
                count=1;
           }
           curr=Math.max(count,curr);
        
    }
    return curr;
}
}