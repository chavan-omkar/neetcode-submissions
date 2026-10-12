class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        int maxArea = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int[] cnt = new int[1];
                    dfs(grid, i, j, cnt,visited);
                    maxArea = Math.max(maxArea, cnt[0]);
                }
            }
        }
        return maxArea;
    }

    private void dfs(int[][] grid, int m, int n, int[] cnt, boolean[][] visited) {
        if (m >= grid.length || m < 0 || n >= grid[0].length || n < 0 || grid[m][n] == 0) {
            return;
        }

        if (grid[m][n] == 1) {
            grid[m][n] = 0;
            cnt[0] = cnt[0] + 1;
            visited[m][n] = true;
        }

        dfs(grid, m - 1, n, cnt,visited);
        dfs(grid, m + 1, n, cnt,visited);
        dfs(grid, m, n - 1, cnt,visited);
        dfs(grid, m, n + 1, cnt,visited);

        return;
    }
}
