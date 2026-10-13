class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Integer INF = 2147483647;
        Queue<int[]>q = new ArrayDeque<>();

        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]== 0){
                    q.offer(new int[]{i,j});
                }
            }
        }
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        
        while(!q.isEmpty()){
            int[] curr = q.poll();

            for(int[] dir : dirs){
                int row = curr[0] + dir[0];
                int col = curr[1] + dir[1];

                if(row >= m || row <0 || col >=n || col < 0 || grid[row][col] != INF){
                    continue;
                }else{
                    grid[row][col] = grid[curr[0]][curr[1]]+1;
                    q.offer(new int[]{row,col});
                }

            }


        }
        
    }

    
}
