class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        // boolean[][] visited = new boolean[m][n];
        // left and right borders
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O')
                dfs(board, i, 0);
            if (board[i][n - 1] == 'O')
                dfs(board, i, n - 1);
        }

        // top and bottom borders
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O')
                dfs(board, 0, j);
            if (board[m - 1][j] == 'O')
                dfs(board, m - 1, j);
        }

        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }else if(board[i][j]=='#'){
                    board[i][j] = 'O';
                }
            }
        }


    }

    private void dfs(char[][] board, int m, int n) {
        if (m >= board.length || m < 0 || n >= board[0].length || n <0 ) {
            return;
        }

        if(board[m][n] != 'O'){
            return;
        }

        
            board[m][n] = '#';
           
  

        dfs(board, m + 1, n);
        dfs(board, m - 1, n);
        dfs(board, m, n + 1);
        dfs(board, m, n - 1);
    }
}
