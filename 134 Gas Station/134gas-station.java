class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n= gas.length;
        int gsum=0;
        int csum=0;
        int tank=0;
        int start=0;

        for(int i=0;i<n;i++){

          gsum+=gas[i];
          csum+=cost[i];
          tank+=(gas[i]-cost[i]);

          if(tank<0){
            tank=0;
            start=i+1;
          }

        }

        if(gsum>=csum){
            return start;
        }           
                    
        return -1;

    }
}