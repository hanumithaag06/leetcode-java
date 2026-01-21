class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[] zeror=new boolean[m];
        boolean[] zeroc=new boolean[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
            
                if(matrix[i][j]==0){
                   zeror[i]=true;
                   zeroc[j]=true;
                }
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                if(zeror[i]||zeroc[j]){
                    matrix[i][j]=0;
                }
            }
            
        }
        

        
    }
}