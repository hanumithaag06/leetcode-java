class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] rows : matrix){
            for(int n : rows){
                pq.offer(n);
            }
        }

        while(pq.size()>k){
            pq.poll();
        }

        return pq.peek();
        
    }
}