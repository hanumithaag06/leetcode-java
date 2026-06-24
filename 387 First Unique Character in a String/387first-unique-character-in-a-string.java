class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character, Integer> freq=new HashMap<>();
        int n =s.length();
        char[] ch=s.toCharArray();
        
        for(int i=0; i<n; i++){
            freq.put(ch[i],freq.getOrDefault(ch[i],0)+1);
        }

        
        for(int i=0; i<n; i++){
            if(freq.get(ch[i])==1){
                return i;
            }
        }
        return -1;       

        
    }
}