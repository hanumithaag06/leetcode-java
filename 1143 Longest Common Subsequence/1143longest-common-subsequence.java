class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] res = new int[m+1][n+1];
        for(int i=0; i<m+1; i++){
            res[i][0]=0;
        }
        for(int j=0; j<n+1; j++){
            res[0][j]=0;
        }

        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    res[i][j] = 1 + res[i-1][j-1];
                }
                else{
                    res[i][j] = Math.max(res[i][j-1], res[i-1][j]);
                }
            }

        }
        return res[m][n];
        
    }
}