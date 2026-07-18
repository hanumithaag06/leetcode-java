class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];
        int gcd = 1;
        for(int i=0; i<n; i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }

        for(int i =2; i<=max; i++){
            if(min%i==0 && max%i==0){
                gcd=i;
            }
        }
        return gcd;
        
    }
}