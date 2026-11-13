class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[][] dist = new int[r][c];
        boolean[][] visited = new boolean[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(mat[i][j]==0){
                    visited[i][j] = true;
                    q.offer(new int[] {i,j});
                }
            }
        }

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int[] dir : directions){
                int new_x = dir[0]+cur[0];
                int new_y = dir[1]+cur[1];

                if(new_x>=0 && new_x<r && new_y>=0 && new_y<c && !visited[new_x][new_y]){
                    visited[new_x][new_y] = true;
                    q.offer(new int[] {new_x, new_y});
                    dist[new_x][new_y] = dist[cur[0]][cur[1]]+1;
                }

            }
            

        }
        return dist;
        
        
    }
}