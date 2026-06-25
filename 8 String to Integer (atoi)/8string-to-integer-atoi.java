class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int sign = 1;
        long res = 0;
        
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length()) {
            if (s.charAt(i) == '+') {
                i++;
            } else if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            }
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            if (sign == 1 &&
                (res > Integer.MAX_VALUE / 10 ||
                 (res == Integer.MAX_VALUE / 10 && digit > 7))) {
                return Integer.MAX_VALUE;
            }

            if (sign == -1 &&
                (res > Integer.MAX_VALUE / 10 ||
                 (res == Integer.MAX_VALUE / 10 && digit > 8))) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + digit;
            i++;
        }

        return (int) (sign * res);
    }
}