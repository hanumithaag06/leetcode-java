class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        for(int i=0; i<m; i++){
            int left = 0;
            int right = n-1;
            while(left<=right){
                int temp = image[i][left]^1;
                image[i][left] = image[i][right]^1;
                image[i][right]=temp;
                left++;
                right--;
            }
        }
        return image;
        
    }
}