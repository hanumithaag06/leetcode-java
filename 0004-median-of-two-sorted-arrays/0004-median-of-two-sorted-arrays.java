class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // int m = nums1.length;
        // int n = nums2.length;
        // int sum = 0;
        
        // return sum/2;
        ArrayList<Integer> l = new ArrayList<>();
        for(int mn : nums1){
            l.add(mn);
        }
        for(int nn : nums2){
            l.add(nn);
        }
        int n = l.size();
        Collections.sort(l);
        if(n%2!=0){
            return (double) l.get(n/2);
        }
        else{
            return (double) (l.get(n/2 -1)+l.get(n/2))/2;
        }

    }
}