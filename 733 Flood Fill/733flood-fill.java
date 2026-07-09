class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;

        int[][] visited = new int[n][m];

        int initial = image[sr][sc];

        dfs(image, sr, sc, initial, color, visited);
        
        return image;
    }

    public void dfs(int[][] image, int i, int j, int initial, int color, int[][] visited) {
        if(i < 0 || j < 0 || i >= image.length || j >= image[0].length) return;

        if(image[i][j] != initial || visited[i][j] == 1) return;

        visited[i][j] = 1;
        image[i][j] = color;

        dfs(image, i+1, j, initial, color, visited);
        dfs(image, i-1, j, initial, color, visited);
        dfs(image, i, j+1, initial, color, visited);
        dfs(image, i, j-1, initial, color, visited);
    }
}