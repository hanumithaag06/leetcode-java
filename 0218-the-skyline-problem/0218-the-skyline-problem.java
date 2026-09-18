class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<int[]> events = new ArrayList<>();
        for (int[] building : buildings) {
            int left = building[0];
            int right = building[1];
            int height = building[2];

            events.add(new int[]{left, height, 1});
            events.add(new int[]{right, height, 0});
        }
        events.sort((a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> activeHeights = new PriorityQueue<>(Collections.reverseOrder());
        List<List<Integer>> skyline = new ArrayList<>();
        int previousMax = 0;
        int i = 0;

        while (i < events.size()) {
            int x = events.get(i)[0];
            while (i < events.size() && events.get(i)[0] == x) {
                int height = events.get(i)[1];
                boolean isStart = events.get(i)[2] == 1;
                if (isStart) {
                    activeHeights.offer(height);
                } else {
                    activeHeights.remove(height);
                }

                i++;
            }
            int currentMax = activeHeights.isEmpty() ? 0 : activeHeights.peek();
            if (currentMax != previousMax) {
                skyline.add(Arrays.asList(x, currentMax));
                previousMax = currentMax;
            }
        }
        return skyline;
    }
}