class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int size=flowerbed.length;

        for(int i=0;i<size;i++){
            if(flowerbed[i]==0){
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == size - 1) || (flowerbed[i + 1] == 0);

                if(leftEmpty & rightEmpty){
                    flowerbed[i]=1;
                    count=count+1;
                }
            }
            if(count>=n){
                return true;
            }
        }
        return count>=n;
        
    }
}