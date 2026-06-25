class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low; i<=high; i++){
            String s = String.valueOf(i);

            if(s.length()%2 !=0){
                continue;
            }

            int mid=s.length()/2;
            int lsum=0;
            int rsum=0;

            int j=0;
            while(j<mid){
                lsum+=s.charAt(j)-'0';
                j++;
            }

            j=mid;
            while(j<s.length()){
                rsum+=s.charAt(j)-'0';
                j++;
            }

            if(lsum==rsum){
                count++;
            }

        }
        return count;
        
    }
}