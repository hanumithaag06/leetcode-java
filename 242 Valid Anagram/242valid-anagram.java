class Solution {
    public boolean isAnagram(String s, String t) {
        int ls=s.length();
        int lt=t.length();
        if(ls!=lt){
            return false;
        }
        int[] count=new int[26];
        for(int i=0;i<ls;i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int val: count){
            if(val!=0){
                return false;
            }
        }
        return true;
        
    }
}