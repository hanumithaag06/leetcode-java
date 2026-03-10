class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        int carry=1;

        if(n==0 && digits[0]<9){
            digits[0]+=1;
            return digits;
        }
        for(int i=n; i>=0; i--){
            int sum=digits[i]+carry;
            carry=sum/10;
            digits[i]=sum%10;

            if(carry==0){
                return digits;
            }

        }

        int res[]=new int[n+2];
        res[0]=1;
        return res;
    }
}