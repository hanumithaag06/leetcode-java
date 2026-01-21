class Solution {
    public String decodeString(String s) {
        Stack <Character> st=new Stack<>();
        char[] ch=s.toCharArray();

    
        for(char c:ch){
            if(c!=']'){
                st.push(c);
            }
            else{
                StringBuilder sb=new StringBuilder();
                StringBuilder num=new StringBuilder();

                while(!st.isEmpty() && st.peek()!='['){
                    sb.insert(0, st.pop());
                }
               
                st.pop();               
            
            
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    num.insert(0, st.pop());
                }

            int count=Integer.parseInt(num.toString());
            String rep= sb.toString().repeat(count);

            for(char cc : rep.toCharArray()){
                st.push(cc);
            }


            }
        }

         StringBuilder res= new StringBuilder();
         while(!st.isEmpty()){
            res.insert(0, st.pop());
        }

            return res.toString();

            }
        


                
    }
