class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st= new Stack<>();
        int n=nums.length;
        int[] res=new int[n];

        for(int i=0; i<n;i++){
            res[i]=-1;
        }

        for(int i=0;i<2*n;i++){
            int cur=nums[i%n];
            while(!st.isEmpty() && nums[st.peek()]<cur){
                                
                int index=st.pop();
                res[index]=cur;
            }
            if(i<n){
                st.push(i);    
            }
        }
        return res;

        
    }
}