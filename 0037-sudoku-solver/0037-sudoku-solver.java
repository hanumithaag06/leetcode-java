class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board);        
    }

    private boolean backtrack(char[][]board){
        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                if(board[r][c]=='.'){
                    for(char digit='1'; digit<='9'; digit++){
                        if(isSafe(board,r,c,digit)){
                            board[r][c]=digit;
                            if(backtrack(board)) return true;
                            board[r][c]='.';
                        }
                    }
                    return false;
                }

            }
        }
        return true;
    }

    private boolean isSafe(char[][] board, int row, int col, char digit){
        for(int i=0; i<9; i++){
            if(board[row][i]==digit) return false;
            if(board[i][col]==digit) return false;
        }
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;

        for(int r=startRow; r<startRow+3; r++){
            for(int c=startCol; c<startCol+3; c++){
                if(board[r][c]==digit) return false;
            }
        }
        return true;
    }
}