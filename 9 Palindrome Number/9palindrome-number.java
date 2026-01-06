class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int y = x;
        int temp = 0;
        if(x<0) return false;
        while (x>0){
            temp = x%10;
            x = x/10;
            rev = rev*10 + temp;
        }
        if (y!=rev){
            return false;
        } 
        return true;
    }
}