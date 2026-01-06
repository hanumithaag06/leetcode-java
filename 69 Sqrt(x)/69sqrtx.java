class Solution {
    public int mySqrt(int x) {
       
        if (x<0) return 0;
        if (x==1) return 1;
        int s = 0;
        int f = x/2;
        int ans = 0;
        while(s<=f){
         int mid = (s+f)/2;
         long sqr = (long)mid * (long)mid;
         if(sqr==x){
            return mid;
         }
         else if(sqr<x){
            ans = mid;
            s= mid+1;
         }
         else if(sqr>x){
            f=mid-1;
         }
         }
         return ans;
    }
}