class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n==0) return false;
        // if((n & (n-1)) == 0){
        //     return true;
        // }
        // return false;

        if(n==1) return true;
        if(n <= 0 || n % 2 != 0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}