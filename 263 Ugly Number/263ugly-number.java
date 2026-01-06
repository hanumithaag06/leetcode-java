class Solution {
    public boolean isUgly(int n) {        
        int [] ug = {2,3,5};
        if (n<=0) return false;
        for(int i : ug){
           while(n%i==0){
            n=n/i;                    
           }
             
        }
        return n==1;
              
    }
}