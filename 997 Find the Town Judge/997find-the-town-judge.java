class Solution {
    public int findJudge(int n, int[][] trust) {
        int outdeg[]=new int[n+1];
        int indeg[]=new int[n+1];
        for(int[] person: trust){
            int a=person[0];
            int b=person[1];
            outdeg[a]++;
            indeg[b]++;
        }
        if(n==1) return 1;

        for(int i=0;i<n+1;i++){
            if(indeg[i]==n-1 && outdeg[i]==0){
                return i;
            }
        }
        return -1;
        
    }
}