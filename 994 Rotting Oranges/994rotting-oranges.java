class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int fresh = 0;
        Queue<int[]> q  = new LinkedList<>();

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        if (fresh == 0) {
            return 0;
        }

        int min = 0;
        int[][] directions={
            {-1,0},
            {1,0},
            {0,1},
            {0,-1}
        };

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int[] cur = q.poll();
                int r = cur[0];
                int c = cur[1];

                for(int[] d : directions){
                    int rnum = r+d[0];
                    int cnum = c+d[1];

                    if(rnum >= 0 && rnum < row && cnum >= 0 && cnum < col && grid[rnum][cnum] == 1){
                        grid[rnum][cnum]=2;
                        fresh--; 
                        q.offer(new int[]{rnum, cnum});
                    }
                    
                }


            }
            if (!q.isEmpty()) {
                min++;
            }

        }
     
         return fresh == 0 ? min : -1;

        


         
    }
} 