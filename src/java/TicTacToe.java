public class TicTacToe {

    /** Initialize your data structure here. */
    int[][] board;
    public TicTacToe(int n) {
        board = new int[n][n];
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
        //move is a win if the cell is part of the winning row/col/diagonal
        //make the move
        board[row][col]=player;
        int i=0;
        //check if the entire row is marked by the player
        for(i=0; i<board[row].length;i++){
            if(board[row][i]!=player){
                break;
            }
        }
        if(i==board[row].length){
            return player;
        }
        for(i=0;i<board[row].length;i++){
            if(board[i][col]!=player){
                break;
            }
        }
        if(i==board[row].length){
            return player;
        }
        if(row==col){
            for(i=0;i<board[row].length;i++){
                if(board[i][i]!=player){
                    break;
                }
            }
            if(i==board[row].length){
                return player;
            }
        }
        if(row+col==board[row].length-1){
            for(i=0;i<board[row].length;i++){
                if(board[i][board[row].length-1-i]!=player){
                    break;
                }
            }
            if(i==board[row].length){
                return player;
            }
        }
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */