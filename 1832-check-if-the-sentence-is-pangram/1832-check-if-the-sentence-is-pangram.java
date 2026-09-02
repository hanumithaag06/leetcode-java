class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        for(char c : sentence.toCharArray()){
            alphabet[c-'a']=true;
        }
        for(boolean b : alphabet){
            if(b==false){
                return false;
            }
        }

        return true;
        
    }
}