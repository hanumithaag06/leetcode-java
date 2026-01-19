class Solution {
    public int countSegments(String s) {
        char[] str=s.toCharArray();
        int count=0;
        boolean flag=false;

        for( char ss: str){
            if((ss!=' ')&& !flag){
                count++;
                flag=true;
            }
            else if(ss==' '){
                flag=false;
            }
        }
        return count;
    }
}