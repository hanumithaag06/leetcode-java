class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int maxarea=0;
        int area=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    area=dfs(i,j,grid);
                    maxarea=Math.max(area,maxarea);
                }
            }
        }
        return maxarea;
    }

    public int dfs(int i, int j, int[][] grid){
        int row=grid.length;
        int col=grid[0].length;
        if(i<0 || j<0 || i>=row || j>=col){
            return 0;
        }
        if(grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        int area=1;
        area+=dfs(i+1,j,grid);
        area+=dfs(i-1,j,grid);
        area+=dfs(i,j+1,grid);
        area+=dfs(i,j-1,grid);

        return area;
        
    }
}