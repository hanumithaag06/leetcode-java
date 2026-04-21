class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gn=g.length;
        int sn=s.length;

        Arrays.sort(g);
        Arrays.sort(s);

        int i=0;
        int j=0;
        int count=0;

        while(i<gn && j<sn){
            if(g[i]<=s[j]){
                i++;
                j++;
                count=count+1;

            }
            else{
                j++;
            }
        }
        return count;
        
    }
}