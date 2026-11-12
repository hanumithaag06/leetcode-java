class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       
       int start = image[sr][sc];
       int r = image.length;
       int c = image[0].length;
       if(start==color){
        return image;
       }

       image[sr][sc]=color;
       Queue<int[]> q = new LinkedList<>();
       q.offer(new int[] {sr,sc});
       image[sr][sc]=color;

       int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

       while(!q.isEmpty()){
        int[] cur = q.poll();
        for(int[] dir : directions){
            int new_x = cur[0]+dir[0];
            int new_y = cur[1]+dir[1];

            // base 1 : boundary
            if(new_x<0 || new_x>=r || new_y<0 || new_y>=c){
                continue;
            }

            // base 2 : if it is not equal to starting
            else if(image[new_x][new_y]!=start){
                continue;
            }           

            //base 3: change cell = color
            else{
                image[new_x][new_y]=color;
                q.offer(new int[] {new_x,new_y});
                
            }

        }

       }
       return image;

    }
    
}