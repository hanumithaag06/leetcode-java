class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        
        boolean[] num=new boolean[n];
        for(int i=0; i<n; i++){
            num[i]=true;
        }
        num[0]=false;
        num[1]=false;

        for(int i=0; i*i<n; i++){
            if(num[i]){
                for(int j=i*i; j<n; j+=i){
                    num[j]=false;
                }
            }

        }

        int count=0;
        for(int i=2; i<n; i++){
            if(num[i]==true){
                count++;
            }
        }
        return count;
            
       

}
    

}