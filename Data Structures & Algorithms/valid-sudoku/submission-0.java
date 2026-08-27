class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        
        for(int i = 0;i<9;i++){
            for(int j =0;j<9;j++){
                char numb = board[i][j];

                if(numb != '.'){

                    if(!seen.add(numb + "in_row" + i) ||
                       !seen.add(numb + "in_col" + j) ||
                       !seen.add(numb + "in_box" + (i/3) + "-" + (j/3))){
                        return false;
                       }

                }
            }
        }

        return true;
        
    }
}
