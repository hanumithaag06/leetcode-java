class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans={-1,-1};
        for(int i=0;i<n;i++){
            int cur=nums[i];
            int com=target-cur;
            
            if(map.containsKey(com)){
                ans[0]=map.get(com);
                ans[1]=i;
                
            }
            map.put(cur, i);

        }
        return ans;
        
    }
}