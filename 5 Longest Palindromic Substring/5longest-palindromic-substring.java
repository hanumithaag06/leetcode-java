class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
       
        int st=0;
        int e=0;
      
        for(int i=0; i<n;i++){
         int len1=ispalindrome(s,i,i);
         int len2=ispalindrome(s,i,i+1);

         int max=Math.max(len1,len2);
         if(max>=(e-st+1)){
            st=i-((max-1)/2);
            e=i+(max/2);
         }
        }
        return s.substring(st,e+1);

        
    }
    public int ispalindrome(String s, int st, int e){
        while(st>=0 && e<s.length() && s.charAt(st)==s.charAt(e)){
            st--;
            e++;
        }
        return e-st-1;
    }
}