class Solution {
    public String removeOuterParentheses(String s) {
        char[] ch=s.toCharArray();
        int n=ch.length;
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i =0; i<n; i++){
            if(ch[i]=='('){
                if(!st.isEmpty()){
                  sb.append(ch[i]);
                  
                }
                st.push(ch[i]);                
              
            }

            else{
                st.pop();
                  if(!st.isEmpty()){
                    sb.append(ch[i]);
                  }

                }


            }
        
    return sb.toString();
        
    }
}