class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        if (source == destination) return true;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]); // undirected graph
        }

        boolean[] visited = new boolean[n];
        return dfs(source, destination, visited, adj);
    }

    private boolean dfs(int node, int destination, boolean[] visited, List<List<Integer>> adj) {
        
        if (node == destination) return true;
        visited[node] = true;
        for (int nei : adj.get(node)) {
            if (!visited[nei]) {
                if (dfs(nei, destination, visited, adj)) {
                    return true;
                }
            }
        }

        return false;
        
        
    }
}