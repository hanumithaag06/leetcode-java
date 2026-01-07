class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li=new ArrayList<>();
        int n = numRows;
        for(int i=0; i<n; i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    int val= li.get(i-1).get(j) + li.get(i-1).get(j-1);
                    row.add(val);
                }
            }
            li.add(row);
        }
        return li;

    }
}