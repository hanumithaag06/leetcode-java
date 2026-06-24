class Solution {
    public int buyChoco(int[] prices, int money) {
        
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;

        for(int i : prices){
            if(i<min){
                smin=min;
                min=i;
            }
            else if( i<smin){
                smin=i;
            }

        }
        int exp=money-min-smin;
        if(exp>=0){
            return exp;
        }
        return money;
    }
}