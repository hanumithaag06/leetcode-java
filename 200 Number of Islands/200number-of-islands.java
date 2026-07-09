class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;

        int[][] dir = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]=='1'){
                    count++;

                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i,j});
                    grid[i][j]=0;

                    while(!q.isEmpty()){
                        int[] cur = q.poll();

                        for(int[] d : dir){
                            int nr = cur[0]+d[0];
                            int nc = cur[1]+d[1];

                            if(nr>=0 && nr<row && nc>=0 && nc<col && grid[nr][nc] == '1'){
                                grid[nr][nc]='0';
                                q.offer(new int[]{nr,nc});
                            }
                        }
                    }

                }
            }
        }
        return count;

        
    }
}