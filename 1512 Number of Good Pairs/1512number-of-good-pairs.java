class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int sum=0;

        for(int key:map.keySet()){
            int val=map.get(key);
            if(val>1){
                sum+=(val*(val-1)/2);
            }
        }
        return sum;


        
    }
}