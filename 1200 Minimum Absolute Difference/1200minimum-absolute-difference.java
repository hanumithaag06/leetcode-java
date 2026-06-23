class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {        
        int n=arr.length;
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            mindiff = Math.min(mindiff, arr[i] - arr[i - 1]);
        }
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1;i<n;i++){
            int diff=arr[i] - arr[i - 1];
            if(mindiff==diff){
                ans.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return ans;
        
    }
}