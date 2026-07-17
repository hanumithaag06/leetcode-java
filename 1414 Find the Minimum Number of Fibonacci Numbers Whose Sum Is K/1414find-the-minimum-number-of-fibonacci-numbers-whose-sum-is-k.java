class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> fib = new ArrayList<>();
        fib.add(1);
        fib.add(1);

        while(true){
            int n = fib.size();
            int val = fib.get(n-1) + fib.get(n-2);

            if(val>k){
                break;
            }
            fib.add(val);
        }

        int count = 0;
        int i = fib.size()-1;

        while(k>0){
            if(fib.get(i)<=k){
                k-=fib.get(i);
                count++;
            }
            else{
                i--;
            }
            
        }
        return count;

        
    }
}

    