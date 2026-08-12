class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder[] sb = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        int idx = 0;
        int n = s.length();

        while (idx < n) {
            
            for (int i = 0; i < numRows && idx < n; i++) {
                sb[i].append(s.charAt(idx));
                idx++;
            }

            for (int i = numRows - 2; i >= 1 && idx < n; i--) {
                sb[i].append(s.charAt(idx));
                idx++;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            result.append(sb[i]);
        }

        return result.toString();
    }
}