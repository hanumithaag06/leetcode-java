class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        int n = operations.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            if(operations[i].equals("C")){
                s.pop();
            }
            else if(operations[i].equals("D")){
                s.push(2*s.peek());
            }

            else if(operations[i].equals("+")){
                int val = s.pop();
                int next = val+s.peek();
                s.push(val);
                s.push(next);

            }
            else{
                int val = Integer.parseInt(operations[i]);
                s.push(val);
            }
        }

        for(int m : s){
            ans+=m;

        }

        return ans;

        
    }
}