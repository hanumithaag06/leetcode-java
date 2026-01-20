class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;

        for(int i=0; i<n; i++){
          count+= isPalindrome(s,i,i);
          count+= isPalindrome(s,i,i+1);        
        }
        return count;
    }

    public int isPalindrome(String s, int st, int e){

        int count=0;
        while(st>=0 && e<s.length() && s.charAt(st)==s.charAt(e)){
            count++;
            st--;
            e++;
        }

        return count;
        
    }
}