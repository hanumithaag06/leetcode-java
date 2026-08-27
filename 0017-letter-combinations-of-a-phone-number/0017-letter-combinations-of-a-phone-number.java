class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits==null || digits.length()==0) return res;
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(digits,0,new StringBuilder(),res,mapping);
        return res;        
    }

    private void backtrack(String digits, int idx, StringBuilder comb, List<String> res, String[] mapping){
        if(idx==digits.length()){
            res.add(comb.toString());
            return;
        }
        String letters = mapping[digits.charAt(idx)-'0'];
        for(char letter : letters.toCharArray()){
            comb.append(letter);
            backtrack(digits,idx+1,comb,res,mapping);
            comb.deleteCharAt(comb.length()-1);
        }

    }
}