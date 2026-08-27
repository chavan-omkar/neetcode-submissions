class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] grid = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int numb = board[i][j] - '1';
                    int box = (i / 3) * 3 + (j / 3);

                    if(row[i][numb] || col[j][numb] || grid[box][numb]){
                        return false;
                    }

                    row[i][numb] = true;
                    col[j][numb] = true;
                    grid[box][numb] = true;

                    // if(numb != '.'){

                    //     if(!seen.add(numb + "in_row" + i) ||
                    //        !seen.add(numb + "in_col" + j) ||
                    //        !seen.add(numb + "in_box" + (i/3) + "-" + (j/3))){
                    //         return false;
                    //        }

                    // }
                }
            }

            // return true;
        }
        return true;
    }
}
