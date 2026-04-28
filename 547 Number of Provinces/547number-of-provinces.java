class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int provinces=0;

        for(int i=0;i<n;i++){
            if(visited[i]==false){
                provinces=provinces+1;
                dfs(i, visited, isConnected,n);
            }
        }
        
        return provinces;
    }

    public void dfs(int city, boolean[] visited, int[][] isConnected, int n){
        visited[city]=true;
        for(int j=0;j<n;j++){
            if(isConnected[city][j]==1 && visited[j]==false){
                dfs(j,visited,isConnected,n);
            }
        }
    }
}