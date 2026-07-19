class Solution {
    public String smallestSubsequence(String s) {

        int[] freq = new int[26];
        boolean[] visited = new boolean[26];
        Stack<Character> st = new Stack<>();

        // Count frequencies
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }

        // Process characters
        for(char c : s.toCharArray()){

            freq[c-'a']--;

            if(visited[c-'a']){
                continue;
            }

            while(!st.isEmpty()
                    && c < st.peek()
                    && freq[st.peek()-'a'] > 0){

                visited[st.pop()-'a'] = false;
            }

            st.push(c);
            visited[c-'a'] = true;
        }

        // Build answer
        StringBuilder ans = new StringBuilder();

        for(char c : st){
            ans.append(c);
        }

        return ans.toString();
    }
}