class Solution {
    public String removeDuplicateLetters(String s) {
        char[]ch=s.toCharArray();
        int n= s.length();

        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int[] freq=new int[26];
        boolean[] visited = new boolean[26];

        for(int i=0; i<n; i++){
            freq[ch[i]-'a']++;
        }

        for(int i=0; i<n; i++){
            char c=ch[i];
            freq[c-'a']--;
            if(visited[c-'a']){
                continue;
            }

            while(!st.empty() && freq[st.peek()-'a']>0 && st.peek()>c){
                visited[st.pop()-'a']=false;
            }
            st.push(c);
            visited[c-'a']=true;           

        }
        for(char ss: st ){
            sb.append(ss);
        }


    return sb.toString();      
    }
}