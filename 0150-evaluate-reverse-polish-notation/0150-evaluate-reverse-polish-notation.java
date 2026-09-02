class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st=new Stack<>();
        
        
        for(String s:tokens){
            if("+-*/".contains(s)){
                int b=st.pop();
                int a=st.pop();
                int res=0;

                switch(s){
                    case"+":
                      res=a+b;
                      break;

                    case"-":
                      res=a-b;
                      break;

                    case"*":
                      res=a*b;
                      break;

                    case"/":
                      res=a/b;
                      break;
                }
                st.push(res);
                
                
            }
            else{
                st.push(Integer.parseInt(s));
                                
            }
        }
        
    return st.pop();  
    }
}