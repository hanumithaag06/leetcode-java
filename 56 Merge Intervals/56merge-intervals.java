class Solution {
    public int[][] merge(int[][] intervals) {
        int r = intervals.length;
        List<int[]> l = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        int s = intervals[0][0];
        int e = intervals[0][1];
        for(int i=1; i<r; i++){
            if(intervals[i][0]<=e){
                e = Math.max(e, intervals[i][1]);
            }
            else{
                l.add(new int[] {s,e});
                s = intervals[i][0];
                e = intervals[i][1];
            }
            
        }
        l.add(new int[]{s, e});
        return l.toArray(new int[l.size()][]);
        
    }
}