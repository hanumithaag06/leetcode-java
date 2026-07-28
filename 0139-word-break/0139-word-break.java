class Solution {
    class TrieNode{
        TrieNode[] child = new TrieNode[26];
        boolean isEnd;
    }
    TrieNode root = new TrieNode();
    public boolean wordBreak(String s, List<String> wordDict) {

        for(String word : wordDict){
            insert(word);
        }
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i=0; i<n; i++){
            if(!dp[i])
                continue;
            TrieNode curr = root;
            for(int j=i; j<n; j++){
                int idx = s.charAt(j) -'a';
                if(curr.child[idx] == null)
                    break;
                curr = curr.child[idx];
                if(curr.isEnd){
                    dp[j+1]=true;
                }
            }
        }
        return dp[n];

    }
    private void insert(String word){
        TrieNode curr = root;
        for(char ch : word.toCharArray()){
            int idx = ch -'a';
            if(curr.child[idx] == null){
                curr.child[idx] = new TrieNode();
            }
            curr = curr.child[idx];            
        }
        curr.isEnd = true;
    }


}