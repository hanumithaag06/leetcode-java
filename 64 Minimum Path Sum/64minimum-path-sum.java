class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int min=Integer.MAX_VALUE;
        int sum=0;

        int[][] nm = new int[m][n];
        nm[0][0]=grid[0][0];

        for(int i=1; i<m; i++){ 
            nm[i][0]=nm[i-1][0]+grid[i][0];
        }

         for(int j=1; j<n; j++){
           nm[0][j]=grid[0][j]+nm[0][j-1]; 
         }

          for(int i=1;i<m;i++){
            for(int j=1; j<n; j++){
                nm[i][j]=(Math.min(nm[i-1][j],nm[i][j-1]))+grid[i][j];

            }
          }
        return nm[m-1][n-1];
        
    }
}