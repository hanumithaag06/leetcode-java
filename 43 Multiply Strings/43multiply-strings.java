class Solution {
    public String multiply(String num1, String num2) {
        int n1= num1.length();
        int n2=num2.length();
        int[] arr = new int[n1+n2];
        
        if(num1.equals("0") ||num2.equals("0")) return "0";
        

        for(int i=n2-1; i>=0; i--){
            int a=num2.charAt(i)-'0';
            for(int j=n1-1; j>=0; j--){
                int b=num1.charAt(j)-'0';
                int index= i+j+1;
                int mul = a*b;


                int car=mul+arr[index];
                arr[index]= car%10;
                arr[index-1]+=car/10;
                
            
            }
            

        }

        StringBuilder sb= new StringBuilder();
        int ind=arr[0]==0? 1:0;
      
        for(int i=ind; i<arr.length; i++){
               sb.append(arr[i]);
            } 
        
        
        return sb.length() == 0 ? "0" : sb.toString();

        

    

        

        
        
    }
}