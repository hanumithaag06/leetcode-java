class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            right[i]=s.isEmpty() ? n : s.peek();
            s.push(i);
        }
        s.clear();

        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            left[i]=s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        int max = 0;
        for(int i=0; i<n; i++){
            int area = heights[i] *(right[i]-left[i]-1);
            max=Math.max(max,area);
        }

        return max;
        
    }
}