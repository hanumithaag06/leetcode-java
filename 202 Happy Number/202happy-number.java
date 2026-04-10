class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set =new HashSet<>();
        while(n!=1){
           if(set.contains(n)){
            return false;
           }
           set.add(n);
           n=nsum(n);           
        }
        return true;
        
    }

    public int nsum(int n){
        int sum=0;        
        while(n>0){
            int i=n%10;
            sum+=(i*i);
            n=n/10;
        }
        return sum;
    }
}