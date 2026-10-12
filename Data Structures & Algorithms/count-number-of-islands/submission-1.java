class Solution {
    public int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int cnt = 0;
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]=='1'){
traverse(grid,i,j);
cnt++;
                }
                        
            }
        }

        return cnt;
        
    }

    private void traverse(char[][] grid,int m, int n){

        if(m>=grid.length || m<0 || n>=grid[0].length || n < 0 || grid[m][n] == '0'){
            return ;
        }

        
            grid[m][n] = '0';

       traverse(grid,m-1,n) ;
        traverse(grid,m+1,n);
        traverse(grid,m,n-1);
        traverse(grid,m,n+1);

    }
}
