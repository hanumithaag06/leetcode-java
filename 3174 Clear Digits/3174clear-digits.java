class Solution {
    public String clearDigits(String s) {
        Stack <Character> ch=new Stack<>();
        int n=s.length();
        char[] st=s.toCharArray();
        
        for(char c : st){
            if(!Character.isDigit(c)){
                ch.push(c);
            }
            else{
                ch.pop();
            }                    
        }

        StringBuilder sb = new StringBuilder();
        for(char chh : ch){
            sb.append(chh);
        }
        return sb.toString();

        
    }
}