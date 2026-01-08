class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n=s.length();
       
        HashSet<String> pair=new HashSet<>();
        HashSet<String> dup=new HashSet<>();
        for(int i=0; i<=n-10; i++){
            String sb = s.substring(i,i+10);
            if(!(pair.add(sb))){
                dup.add(sb);
            }
            
        }
        List<String> li = new ArrayList<>(dup);
        return li;
        
    }
}