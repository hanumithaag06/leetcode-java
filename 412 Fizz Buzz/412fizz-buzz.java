class Solution {
    public List<String> fizzBuzz(int n) {
        List <String> li= new ArrayList<>();
        for(int i=0; i<n; i++){
             int num=i+1;          
            if(num%3==0 && num%5==0){
                li.add("FizzBuzz");
            }
            else if(num%5==0){
                li.add("Buzz");
            }
            else if(num%3==0){
                li.add("Fizz");
            }
            else{
                li.add(String.valueOf(num));
            }
        }
        return li;
        
    }
}