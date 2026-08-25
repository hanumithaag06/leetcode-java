class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        for(char[] row : board){
            Arrays.fill(row,'.');
        }
        backTrack(0, board, n);
        return count;
        
    }
    public void backTrack(int row, char[][] board, int n){
        if(row==n){
            count++;
            return;
        }
        for(int col=0; col<n; col++){
            if(isSafe(row,col,board,n)){
                board[row][col]='Q';
                backTrack(row+1, board, n);
                board[row][col]='.';

            }
        }
    }
    private boolean isSafe(int row, int col, char[][] board, int n){
        // column
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // top left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // top right
        for(int i=row-1, j=col+1; i>=0 && j<n; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}