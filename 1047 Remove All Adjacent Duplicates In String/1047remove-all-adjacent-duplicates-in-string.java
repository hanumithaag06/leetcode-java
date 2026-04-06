class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st =new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek()==c){
                st.pop();
            }
            else{
                st.push(c);
            }
            
            
        }
        
        StringBuilder r = new StringBuilder();
        for(char b : st){
            r.append(b);
        }
        return r.toString();
        
    }
}