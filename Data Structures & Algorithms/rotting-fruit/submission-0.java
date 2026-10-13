class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int freshOrangeCount = 0;
        int cnt = 0;
        Queue<int[]> q = new ArrayDeque<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    freshOrangeCount++;
                } else if (grid[i][j] == 2) {
                    q.offer(new int[] {i, j});
                }
            }
        }

        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!q.isEmpty() && freshOrangeCount > 0) {
            cnt++;
            int k = q.size();
            for (int i = 0; i < k; i++) {
                int[] curr = q.poll();

                for (int[] dir : dirs) {
                    int row = curr[0] + dir[0];
                    int col = curr[1] + dir[1];

                    if (row < m && row >= 0 && col < n && col >= 0 && grid[row][col] == 1) {
                        freshOrangeCount--;

                        grid[row][col] = 2;
                        q.offer(new int[] {row, col});
                    }
                }
            }
        }

        return freshOrangeCount > 0 ? -1 : cnt;
    }
}
