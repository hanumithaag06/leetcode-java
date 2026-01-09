class Solution {
    public int thirdMax(int[] nums) {
             
        Long max = null;
        Long secmax = null;
        Long thmax = null;
        
        for (int num : nums) {

            long val=num;
                               
            
            if((max!=null && val==max)||
             (secmax!=null && val==secmax) ||
              (thmax!=null && val==thmax)){
                
                continue;
            }
            
                
            if(max==null||val>max){
                thmax=secmax;
                secmax=max;
                max=val;
                
            }
            else if(secmax==null||val>secmax){
                thmax=secmax;
                secmax=val;
                

            }
            else if(thmax==null||val>thmax){
                thmax=val;

            }
        }
            
        return (thmax==null) ? max.intValue() : thmax.intValue();
            

        
        
    }
}
