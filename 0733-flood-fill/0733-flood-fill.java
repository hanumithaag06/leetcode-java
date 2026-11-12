class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       
       int start = image[sr][sc];
       if(start==color){
        return image;
       }

       image[sr][sc]=color;
       dfs(image,start,sr,sc,color);
       return image;

    }
    private void dfs(int[][] image, int start, int sr,int sc, int color){
        int r = image.length;
        int c = image[0].length;
        
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] dir : directions){
            int new_x = sr+dir[0];
            int new_y = sc+dir[1];

            if(new_x<0 || new_x>=r || new_y<0 || new_y>=c){
                continue;
            }

            else if(image[new_x][new_y]!=start){
                continue;
            }

            else{
                image[new_x][new_y]=color;
                dfs(image,start,new_x,new_y,color);
            }
        }

    }
}