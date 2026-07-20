class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r = grid.length;
        int c = grid[0].length;
        k%=(r*c);
        int[][] ans = new int[r][c];

        for(int i=0; i<r; i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0; j<c; j++){
                int index = i*c + j;
                index = (index+k)%(r*c);

                int nr = index / c;
                int nc = index % c;
                ans[nr][nc]=grid[i][j];
                

            }
        }
        
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < c; j++) {
                row.add(ans[i][j]);
            }
            res.add(row);
        }

        return res;
        }
        
    }
