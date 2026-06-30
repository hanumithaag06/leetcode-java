class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int cursum=0;
        int max=0;
        for(int i=0; i<n; i++){
            cursum+=gain[i];
            max=Math.max(max,cursum);

        }
        return max;
        
    }
}