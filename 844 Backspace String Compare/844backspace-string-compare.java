class Solution {
    public boolean backspaceCompare(String s, String t) {
        if(compareTo(s).equals(compareTo(t))){
            return true;
        }
        return false;
        
    }

    public String compareTo(String s) {
        Stack<Character> st=new Stack<>(); 
               
        for(char c : s.toCharArray()){
            if(c!='#'){
                st.push(c);
            }
            else{
                if(!st.isEmpty()){
                 st.pop();
                }
                
            }
            
        }
        return st.toString();
        
    }
}