class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Queue<Integer> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] indeg = new int[numCourses];
        // Create adjacency list
        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        // Build graph
        for(int[] pre : prerequisites) {
            adj.get(pre[0]).add(pre[1]);
            indeg[pre[1]]++;
        }
        // Add zero indegree 
        for(int i = 0; i < numCourses; i++) {
            if(indeg[i] == 0) {
                q.offer(i);
            }
        }

        // BFS
        int count = 0;
        while(!q.isEmpty()) {
            int node = q.poll();
            count++;
            for(int neigh : adj.get(node)) {
                indeg[neigh]--;
                if(indeg[neigh] == 0) {
                    q.offer(neigh);
                }
            }
        }

        return count == numCourses;
    }
}