class Solution {
    public int addDigits(int num) {
      while(num>0){
        if((num>=0) && (num<=9)){
            return num;
        }
        while(num>=10){
           int sum=0;
           while(num>0){
           int temp= num%10;
           sum= sum+temp;
           num=num/10;
        }
        num=sum;
        }
        
       }
       return num; 
}
}