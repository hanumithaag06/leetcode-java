class Solution {
    public int countLargestGroup(int n) {

        int[] group = new int[40];

        for (int i = 1; i <= n; i++) {

            int num = i;
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            group[sum]++;
        }

        int maxSize = 0;

        for (int x : group) {
            maxSize = Math.max(maxSize, x);
        }

        int count = 0;

        for (int x : group) {
            if (x == maxSize)
                count++;
        }

        return count;
    }
}